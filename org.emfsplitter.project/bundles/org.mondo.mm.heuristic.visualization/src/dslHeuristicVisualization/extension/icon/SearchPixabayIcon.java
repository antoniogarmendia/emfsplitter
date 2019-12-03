package dslHeuristicVisualization.extension.icon;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.ListIterator;

import org.json.simple.JSONObject;

import graphic_representation.IconElement;
import graphic_representation.Node;
import graphic_representation.impl.Graphic_representationFactoryImpl;
import graphic_representation.rest.Search;
import graphic_representation.rest.impl.RestFactoryImpl;

public class SearchPixabayIcon implements ICustomiseIcon{
	
	public final String EXTENSION_ID = "Pixabay Icons";
	
	@Override
	public void setNodeIcon(Node node, String folderPath, String platformPath) {
		
		IconElement iconElement = Graphic_representationFactoryImpl.eINSTANCE.createIconElement();
		
		PixabayServer pixaServer = new PixabayServer();
		pixaServer.addQueyParameter(getSearchString(node.getAnEClass().getName()));
		pixaServer.makeQueryParameters();
		
		//add object customize search
		Search pixabaySearch = RestFactoryImpl.eINSTANCE.createSearch();
		pixabaySearch.setExtensionName(EXTENSION_ID);
		pixabaySearch.getParameters().addAll(pixaServer.getListOfParameters());
		pixabaySearch.setFolderPath(folderPath);
		pixabaySearch.setPlatformPath(platformPath);
		iconElement.setFigureSearch(pixabaySearch);	
		
		pixaServer.addKeyParameter();
				
		JSONObject result = pixaServer.getRestImages();
		
		List<String> urlList = PixabayServer.getUrlFromItems(result);
			
		File rootDirectory = new File(folderPath + "//" + "pixabay-icons/");
		if (! rootDirectory.exists()){
			rootDirectory.mkdir();	        
	    }		
		
		File directory = new File(folderPath + "//" + "pixabay-icons/" + node.getAnEClass().getName());
		if (! directory.exists()){
	        directory.mkdir();	        
	    }		
		
		ListIterator<String> listItUrls = urlList.listIterator();
		while (listItUrls.hasNext()) {			
			int indexUrl = listItUrls.nextIndex();
			String urlImage = (String) listItUrls.next();
			String iconPath = directory.getPath() + "\\" + node.getAnEClass().getName() + indexUrl + ".gif";
			try {
				saveStream(urlImage, iconPath);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}			
			if (indexUrl == 0)
				iconElement.setFilepath(platformPath + "/" + "pixabay-icons" + "/" + node.getAnEClass().getName() + "/" + node.getAnEClass().getName() + indexUrl + ".gif");
			else 
				iconElement.getFigureSearch().getCandidateImages().add(platformPath + "/" + "pixabay-icons" + "/" + node.getAnEClass().getName() + "/" + node.getAnEClass().getName() + indexUrl + ".gif");			
		}
		node.setNode_shape(iconElement);
	}

	@Override
	public void newSearchIcons(IconElement iconElement) {
		
		String folderPath = iconElement.getFigureSearch().getFolderPath(); 
		String platformPath = iconElement.getFigureSearch().getPlatformPath();
				
		Node node = null;
		if (iconElement.eContainer() instanceof Node) {
			node = (Node) iconElement.eContainer();
		}		
		
		PixabayServer pixaServer = new PixabayServer();
		pixaServer.setListOfParameters(iconElement.getFigureSearch().getParameters());
		pixaServer.addKeyParameter();
				
		JSONObject result = pixaServer.getRestImages();
		
		List<String> urlList = PixabayServer.getUrlFromItems(result);
		
		iconElement.getFigureSearch().getCandidateImages().clear();
		ListIterator<String> listItUrls = urlList.listIterator();
		File directory = new File(folderPath + "//" + "pixabay-icons/" + node.getAnEClass().getName());
		boolean selectedImage = false;
		while (listItUrls.hasNext()) {	
			int indexUrl = listItUrls.nextIndex() + (selectedImage==true?1:0);
			String urlImage = (String) listItUrls.next();
			String iconPath = directory.getPath() + "\\" + node.getAnEClass().getName() + indexUrl + ".gif";
			String iconPlatformPath = platformPath + "/" + "pixabay-icons" + "/" + node.getAnEClass().getName() + "/" + node.getAnEClass().getName() + indexUrl + ".gif";
			if (iconPlatformPath.equals(iconElement.getFilepath())) {
				selectedImage = true;
				indexUrl++;
				iconPath = directory.getPath() + "\\" + node.getAnEClass().getName() + indexUrl + ".gif";
			}
			
			try {
				saveStream(urlImage, iconPath);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}	
			iconElement.getFigureSearch().getCandidateImages().add(platformPath + "/" + "pixabay-icons" + "/" + node.getAnEClass().getName() + "/" + node.getAnEClass().getName() + indexUrl + ".gif");
		}		
		pixaServer.deleteKeyParameter();
	}
	
	public String getSearchString(String name) {
		if (name.length() >= 1) {
			String result = name.charAt(0) + "";
			for (int i = 1; i < name.length(); i++) {
				char c = name.charAt(i); 
				if (Character.isUpperCase(c) == true) {
					result = result + " " + c;
				} else {
					result = result + c;
				}
			}
			return result;
		}		
		return name;
	}
	
	public void saveStream(String mURL, String ofile ) throws Exception {
	    InputStream in = null;
	    FileOutputStream out = null;
	    try {
	        URL url = new URL(mURL);
	        URLConnection urlConn = url.openConnection();
	        urlConn.setRequestProperty
				("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
	        in = urlConn.getInputStream();
	        out = new FileOutputStream(ofile);
	        int c;
	        byte[] b = new byte[1024];
	        while ((c = in.read(b)) != -1)
	            out.write(b, 0, c);
	    } finally {
	        if (in != null)
	            in.close();
	        if (out != null)
	            out.close();
	    }
	}

}

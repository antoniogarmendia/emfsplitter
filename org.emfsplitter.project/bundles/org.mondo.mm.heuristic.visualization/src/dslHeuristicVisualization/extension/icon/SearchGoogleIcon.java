package dslHeuristicVisualization.extension.icon;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ListIterator;

import javax.imageio.ImageIO;

import org.json.simple.JSONObject;

import dslHeuristicVisualization.icon.rest.google.GoogleImageServer;
import graphic_representation.IconElement;
import graphic_representation.Node;
import graphic_representation.impl.Graphic_representationFactoryImpl;
import graphic_representation.rest.Search;
import graphic_representation.rest.impl.RestFactoryImpl;

public class SearchGoogleIcon implements ICustomiseIcon {

	public final String EXTENSION_ID = "Google Images";
	
	public SearchGoogleIcon() {
		// Do nothing
	}

	@Override
	public void setNodeIcon(Node node, String folderPath, String platformPath) {
		
		IconElement iconElement = Graphic_representationFactoryImpl.eINSTANCE.createIconElement();
				
		GoogleImageServer imageServer = new GoogleImageServer();
		imageServer.addQueyParameter(getSearchString(node.getAnEClass().getName()));
		imageServer.makeQueryParameters();
		JSONObject result = imageServer.getRestImages();
		
		if (result !=null) {
		
			List<String> listOfUrls = GoogleImageServer.getUrlFromItems(result);
			Image image = null;	
			
			File rootDirectory = new File(folderPath + "//" + "google-icons/");
			if (! rootDirectory.exists()){
				rootDirectory.mkdir();	        
		    }		
			
			File directory = new File(folderPath + "//" + "google-icons/" + node.getAnEClass().getName());
			if (! directory.exists()){
		        directory.mkdir();	        
		    }
			
			//add object customize search
			Search googleSearch = RestFactoryImpl.eINSTANCE.createSearch();
			googleSearch.setExtensionName(EXTENSION_ID);
			googleSearch.getParameters().addAll(imageServer.getListOfParameters());
			googleSearch.setFolderPath(folderPath);
			googleSearch.setPlatformPath(platformPath);
			iconElement.setFigureSearch(googleSearch);	
					
			ListIterator<String> listItUrls = listOfUrls.listIterator();
			while (listItUrls.hasNext()) {
				int indexUrl = listItUrls.nextIndex();
				String urlImage = (String) listItUrls.next();
				String iconPath = directory.getPath() + "//" + node.getAnEClass().getName() + indexUrl + ".gif";
				try {
					URL url = new URL(urlImage);
					image = ImageIO.read(url);			
					ImageIO.write((RenderedImage) image, "gif",new File(iconPath));
					
				} catch (IOException e) {
					
					e.printStackTrace();
				}	
				if (indexUrl == 0)
					iconElement.setFilepath(platformPath + "/" + "google-icons" + "/" + node.getAnEClass().getName() + "/" + node.getAnEClass().getName() + indexUrl + ".gif");
				else 
					iconElement.getFigureSearch().getCandidateImages().add(platformPath + "/" + "google-icons" + "/" + node.getAnEClass().getName() + "/" + node.getAnEClass().getName() + indexUrl + ".gif");
			}		
		}
		node.setNode_shape(iconElement);		
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

	@Override
	public void newSearchIcons(IconElement iconElement) {
		
		String folderPath = iconElement.getFigureSearch().getFolderPath(); 
		String platformPath = iconElement.getFigureSearch().getPlatformPath();
				
		Node node = null;
		if (iconElement.eContainer() instanceof Node) {
			node = (Node) iconElement.eContainer();
		}
		
		GoogleImageServer imageServer = new GoogleImageServer();
		imageServer.setListOfParameters(iconElement.getFigureSearch().getParameters());
		
		JSONObject result = imageServer.getRestImages();
		
		List<String> urlList = GoogleImageServer.getUrlFromItems(result);
		iconElement.getFigureSearch().getCandidateImages().clear();
		File directory = new File(folderPath + "//" + "google-icons/" + node.getAnEClass().getName());
		boolean selectedImage = false;
		ListIterator<String> listItUrls = urlList.listIterator();
		
		while (listItUrls.hasNext()) {	
			int indexUrl = listItUrls.nextIndex() + (selectedImage==true?1:0);
			String urlImage = (String) listItUrls.next();
			String iconPath = directory.getPath() + "\\" + node.getAnEClass().getName() + indexUrl + ".gif";
			String iconPlatformPath = platformPath + "/" + "google-icons" + "/" + node.getAnEClass().getName() + "/" + node.getAnEClass().getName() + indexUrl + ".gif";
			if (iconPlatformPath.equals(iconElement.getFilepath())) {
				selectedImage = true;
				indexUrl++;
				iconPath = directory.getPath() + "\\" + node.getAnEClass().getName() + indexUrl + ".gif";
			}			
			try {				
				URL url = new URL(urlImage);
				Image image = ImageIO.read(url);			
				ImageIO.write((RenderedImage) image, "gif",new File(iconPath));				
			} catch (Exception e) {
				
				e.printStackTrace();
			}	
			iconElement.getFigureSearch().getCandidateImages().add(platformPath + "/" + "google-icons" + "/" + node.getAnEClass().getName() + "/" + node.getAnEClass().getName() + indexUrl + ".gif");						
		}	
		
		System.out.println("New search");		
	}	

}

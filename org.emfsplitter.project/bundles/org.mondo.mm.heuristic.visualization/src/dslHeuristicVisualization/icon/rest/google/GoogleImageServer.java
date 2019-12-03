package dslHeuristicVisualization.icon.rest.google;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.glassfish.jersey.client.ClientConfig;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import graphic_representation.rest.Parameter;
import graphic_representation.rest.impl.RestFactoryImpl;

public class GoogleImageServer {
	
	public static String CUSTOM_PATH = "customsearch/v1";
	public EList<Parameter> listOfParameters;
	
	//Google Key
	public static String PARAMETER_KEY = "key";
	public static String GOOGLE_API_KEY = "AIzaSyB0pHwS24QJXyiqVvITenIx-UZ8KN5Fxa8"; // api key
	// Id Searcher (Google Custom Search)
	public static String CX_KEY = "cx";
	public static String GOOGLE_CX = "009327322615305133704:sb2qxbprrac";// id searcher
	
	public static String PARAMETER_QUERY = "q";
	public static String PARAMETER_SEARCH_TYPE = "searchType";//default image
	public static String PARAMETER_RIGHTS = "rights";
	public static String PARAMETER_IMG_SIZE = "imgSize";
	public static String PARAMETER_NUM = "num";
	public static String PARAMETER_IMAGE_TYPE = "imgType";
	
	public static String DEFAULT_VALUE_SEARCH_TYPE = "image";
	public static String DEFAULT_VALUE_IMG_SIZE = "xxlarge";
	public static String DEFAULT_VALUE_NUM = "10";
	public static String DEFAULT_VALUE_IMAGE_TYPE = "clipart";
	
	public GoogleImageServer() {
		listOfParameters = new BasicEList<Parameter>();		
	}
		
	private URI getBaseURI(){
		return UriBuilder.fromUri("https://www.googleapis.com/").build();		
	}
	
	
	public JSONObject getRestImages() {
		
		JSONObject result = null;
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		WebTarget target = client.target(getBaseURI());
		
		WebTarget webTarget = target.path(CUSTOM_PATH);
		
		Iterator<Parameter> itParameters = this.listOfParameters.iterator();
		while (itParameters.hasNext()) {
			Parameter parameter = (Parameter) itParameters.next();
			webTarget = webTarget.queryParam(parameter.getParameterName(), parameter.getParameterValue());			
		}
		
		// add aditional parameters
		// key parameter
		webTarget = webTarget.queryParam(PARAMETER_KEY, GOOGLE_API_KEY);
		// cx custom search
		webTarget = webTarget.queryParam(CX_KEY, GOOGLE_CX);
		// search type 
		webTarget = webTarget.queryParam(PARAMETER_SEARCH_TYPE, DEFAULT_VALUE_SEARCH_TYPE);
		// license
		webTarget = webTarget.queryParam("rights", "cc_publicdomain");
		
		Response response = webTarget.request().
							accept(MediaType.TEXT_PLAIN).
			     			get(Response.class);
		
		if(response.getStatus() == 200)
		{
			String stringResponse =  response.readEntity(String.class);
			try {
				 result = (JSONObject) new JSONParser().parse(stringResponse);	
				 client.close();
				 System.out.println("Icons");
				 	
				 return result;
			} catch (ParseException e) {
				
				e.printStackTrace();
			}			
		}
		else
			System.out.println(response.toString());
		
		return result;
	}	
	
	public static List<String> getUrlFromItems(JSONObject jsonObject) {
		
		
		List<String> listOfUrls = new ArrayList<String>();
		Iterator<?> itObjects = jsonObject.keySet().iterator();
		
		while (itObjects.hasNext()) {
			Object key = (Object) itObjects.next();
			Object value = jsonObject.get(key);
			if (key instanceof String) {
				String tag = (String) key;
				if (tag.equals("items")) {
					if (value instanceof JSONArray) {
						JSONArray itemsArray = (JSONArray)value;
						Iterator<?> itemsIterator = itemsArray.iterator();
						while (itemsIterator.hasNext()) {
							Object itemObject = (Object) itemsIterator.next();
							if (itemObject instanceof JSONObject) {
								JSONObject itemJson = (JSONObject) itemObject;
								Object objImage = itemJson.get("image");
								if (objImage instanceof JSONObject) {
									JSONObject jsonImage = (JSONObject) objImage;
									Object objThumbnailLink = jsonImage.get("thumbnailLink");
									if (objThumbnailLink instanceof String) {
										String urlImage = (String) objThumbnailLink; 
										listOfUrls.add(urlImage);										
									}									
								}						
							}							
						}
					}					
				}				
			}
		}
		
		return listOfUrls;
	} 
	
	public void makeQueryParameters() {
		
		Parameter param = RestFactoryImpl.eINSTANCE.createParameter();
		// Image Size
		param.setParameterName(PARAMETER_IMG_SIZE);
		param.setParameterValue(DEFAULT_VALUE_IMG_SIZE);
		param.getAcceptedValues().addAll(new BasicEList<String>(Arrays.asList("huge","icon","large","medium","small","xlarge","xxlarge")));
		param.setName("Image Size");
		//this.listOfParameters.add(param);
		
		// Number of downloaded figures
		param = RestFactoryImpl.eINSTANCE.createParameter();
		param.setParameterName(PARAMETER_NUM); 
		param.setParameterValue(DEFAULT_VALUE_NUM);
		param.setName("Number of Returned Images");
		this.listOfParameters.add(param);
		
		// Image Type
		param = RestFactoryImpl.eINSTANCE.createParameter();
		param.setParameterName(PARAMETER_IMAGE_TYPE); 
		param.setParameterValue(DEFAULT_VALUE_IMAGE_TYPE);
		param.getAcceptedValues().addAll(new BasicEList<String>(Arrays.asList("clipart","face",
				"lineart","news","photo")));
		param.setName("Image Type");
		this.listOfParameters.add(param);
	}
	
	public void addQueyParameter(String query) {
		
		// Query to search the image
		Parameter param = RestFactoryImpl.eINSTANCE.createParameter();
		param.setParameterName(PARAMETER_QUERY);
		param.setParameterValue(query);
		param.setName("Query");
		this.listOfParameters.add(param);	
	}
	
	public EList<Parameter> getListOfParameters() {
		return listOfParameters;
	}
	
	public void setListOfParameters(EList<Parameter> listOfParameters) {
		this.listOfParameters = listOfParameters;
	}
}

package dslHeuristicVisualization.extension.icon;

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
import org.glassfish.jersey.client.ClientConfig;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import graphic_representation.rest.Parameter;
import graphic_representation.rest.impl.RestFactoryImpl;

public class PixabayServer {
	
	//Pixabay Key
	public static String PARAMETER_KEY = "key";
	public static String PIXABAY_API_KEY = "12166124-f7b73cd93d9a46fd545fb4ded"; 	
	//Query Parameter
	public static String PARAMETER_QUERY = "q";
	
	public static String CUSTOM_PATH = "api/";
	public EList<Parameter> listOfParameters;
	
	public Parameter keyParameter;
	
	public PixabayServer() {
		listOfParameters = new BasicEList<Parameter>();		
		keyParameter = null;
	}
	
	private URI getBaseURI(){
		return UriBuilder.fromUri("https://pixabay.com/").build();		
	}
	
	public JSONObject getRestImages() {
		
		JSONObject result = null;
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(/*config*/);
		WebTarget target = client.target(getBaseURI());
		
		WebTarget webTarget = target.path(CUSTOM_PATH);
		
		Iterator<Parameter> itParameters = this.listOfParameters.iterator();
		while (itParameters.hasNext()) {
			Parameter parameter = (Parameter) itParameters.next();
			webTarget = webTarget.queryParam(parameter.getParameterName(), parameter.getParameterValue());			
		}
		
		Response response = webTarget.request().
							accept(MediaType.TEXT_PLAIN).
			     			get(Response.class);	
		
		if(response.getStatus() == 200)
		{
			String stringResponse =  response.readEntity(String.class);
			try {
				 result = (JSONObject) new JSONParser().parse(stringResponse);	
				 client.close();
				 System.out.println("Pixabay Icons");
				 	
				 return result;
			} catch (ParseException e) {
				
				e.printStackTrace();
			}			
		}
		else
			System.out.println(response.toString());
		
		return result;
	}
	
	
	public void addQueyParameter(String query) {
		
		// Query to search the image
		Parameter param = RestFactoryImpl.eINSTANCE.createParameter();
		param.setParameterName(PARAMETER_QUERY);
		param.setParameterValue(query);
		param.setName("Query");
		this.listOfParameters.add(param);		
	}
	
	
	public void addKeyParameter() {
		
		// Key to search the image
	    Parameter param = RestFactoryImpl.eINSTANCE.createParameter();
	    param.setParameterName(PARAMETER_KEY);
	    param.setParameterValue(PIXABAY_API_KEY);
		param.setName("Key");
		this.listOfParameters.add(param);	
		this.keyParameter = param;
	}
	
	public void deleteKeyParameter() {
		if (this.keyParameter != null)
			this.listOfParameters.remove(this.keyParameter);
	}
	
	public static List<String> getUrlFromItems(JSONObject jsonObject) {
				
		List<String> urlItems = new ArrayList<String>();
		Iterator<?> itObjects = jsonObject.keySet().iterator();
		
		while (itObjects.hasNext()) {
			Object key = (Object) itObjects.next();
			Object value = jsonObject.get(key);
			if (value instanceof JSONArray) {
				JSONArray itemsArray = (JSONArray)value;
				Iterator<?> itemsIterator = itemsArray.iterator();
				while (itemsIterator.hasNext()) {
					Object itemObject = (Object) itemsIterator.next();
					if (itemObject instanceof JSONObject) {
						JSONObject itemJson = (JSONObject) itemObject;
						Object objImage = itemJson.get("webformatURL");
						if (objImage instanceof String) {
							String urlImage = (String) objImage; 
							urlItems.add(urlImage);
						}		
					}					
				}
			}			
		}
		
		return urlItems;
	}

	public EList<Parameter> getListOfParameters() {
		return listOfParameters;
	}
	
	public void setListOfParameters(EList<Parameter> listOfParameters) {
		this.listOfParameters = listOfParameters;
	}
	
	public void makeQueryParameters() {
		
		Parameter param = RestFactoryImpl.eINSTANCE.createParameter();
		param.setParameterName("category");
		param.setParameterValue("all");
		param.getAcceptedValues().addAll(new BasicEList<String>(Arrays.asList("all","fashion","nature","backgrounds",
				"science","education","people","feelings","religion","health","places","animals","industry","food",
				"computer","sports","transportation","travel","buildings","business","music")));
		param.setName("Category");
		this.listOfParameters.add(param);
		
		// safe search
		param = RestFactoryImpl.eINSTANCE.createParameter();
		param.setParameterName("safesearch"); 
		param.setParameterValue("true");
		param.getAcceptedValues().addAll(new BasicEList<String>(Arrays.asList("true","false")));	
		param.setName("Safe Search");
		this.listOfParameters.add(param);
	}
}

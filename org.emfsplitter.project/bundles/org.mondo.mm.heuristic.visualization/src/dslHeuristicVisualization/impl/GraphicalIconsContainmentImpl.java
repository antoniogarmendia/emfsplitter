/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.GraphicalIconsContainment;
import dslHeuristicVisualization.icon.rest.google.GoogleImageServer;
import graphic_representation.IconElement;
import graphic_representation.Node;
import graphic_representation.Shape;
import graphic_representation.impl.Graphic_representationFactoryImpl;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

import javax.imageio.ImageIO;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.json.simple.JSONObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Icons Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GraphicalIconsContainmentImpl extends MinimalEObjectImpl.Container implements GraphicalIconsContainment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicalIconsContainmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.GRAPHICAL_ICONS_CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Shape getNodeShape(Node node, String folderPath, String platformPath) {
		
		IconElement iconElement = Graphic_representationFactoryImpl.eINSTANCE.createIconElement();
		
		GoogleImageServer imageServer = new GoogleImageServer();
		JSONObject result = imageServer.getRestImages();//not working getSearchString(node.getAnEClass().getName())
		
		String urlImage = GoogleImageServer.getUrlFromItems(result).get(0);
		Image image = null;	
		
		File directory = new File(folderPath + "//" + "google-icons");
		if (! directory.exists()){
	        directory.mkdir();	        
	    }
		String iconPath = directory.getPath() + "//" + node.getAnEClass().getName() + ".png";		
		try {
			URL url = new URL(urlImage);
			image = ImageIO.read(url);			
			ImageIO.write((RenderedImage) image, "png",new File(iconPath));//D://borrowed_image.png
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		iconElement.setFilepath(platformPath + "/" + "google-icons" + "/" + node.getAnEClass().getName() + ".png");
		return iconElement;
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.GRAPHICAL_ICONS_CONTAINMENT___GET_SEARCH_STRING__STRING:
				return getSearchString((String)arguments.get(0));
			case DslHeuristicVisualizationPackage.GRAPHICAL_ICONS_CONTAINMENT___GET_NODE_SHAPE__NODE_STRING_STRING:
				return getNodeShape((Node)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphicalIconsContainmentImpl

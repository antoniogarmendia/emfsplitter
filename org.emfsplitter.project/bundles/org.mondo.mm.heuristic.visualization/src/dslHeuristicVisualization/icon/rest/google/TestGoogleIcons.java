package dslHeuristicVisualization.icon.rest.google;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.json.simple.JSONObject;

public class TestGoogleIcons {

	public static void main(String[] args) {
		
		GoogleImageServer imageServer = new GoogleImageServer();
		JSONObject result = imageServer.getRestImages();//not working with last change
		
		String urlImage = GoogleImageServer.getUrlFromItems(result).get(0);
		Image image = null;	
		try {
			URL url = new URL(urlImage);
			image = ImageIO.read(url);
			ImageIO.write((RenderedImage) image, "png",new File("D://borrowed_image.png"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

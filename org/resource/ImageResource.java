package org.resource;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.graphics.Renderer;

import com.jogamp.opengl.util.texture.Texture;
import com.jogamp.opengl.util.texture.awt.AWTTextureIO;

public class ImageResource {
	
	// The OpenGL texture object
	private Texture texture = null;
	
	// The bufferedimage of this image
	private BufferedImage image = null;
	
	public ImageResource (String path) {
		URL url = ImageResource.class.getResource(path);
		
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (image != null) {
			image.flush();
		}
	}
	
	public Texture getTexture () {
		if (image == null) {
			return null;
		}
		
		if (texture == null) {
			texture = AWTTextureIO.newTexture(Renderer.getProfile(), image, true);
		}
		
		return texture;
	}
	
}
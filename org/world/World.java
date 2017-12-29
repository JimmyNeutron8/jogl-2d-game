package org.world;

import java.util.ArrayList;


public class World {
	
	private static ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();
	
	public static void update () {
		
		// Go through all objects and update them
		for (GameObject go : gameObjects) {
			go.update();
		}
		
	}
	
	public static void render () {
		
		// Render all the objects
		for (GameObject go : gameObjects) {
			go.render();
		}
		
	}
	
	public static void addObject (GameObject go) {
		gameObjects.add(go);
	}
	
}
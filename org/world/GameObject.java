package org.world;

public class GameObject {
	
	// The position of the object
	public float x = 0;
	public float y = 0;
	
	// The size of the object
	public float width = 1;
	public float height = 1;
	
	// The rotation
	public float rotation = 0;
	
	public void update () {
		// Implement in subclass
	}
	
	public void render () {
		// Implement in subclass
	}
	
}
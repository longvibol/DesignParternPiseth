package com.pisethjava.proxy.image;

public class HighResolutionImage implements Image {
	
	private final String filename;
	
	public HighResolutionImage(String filename) {
		this.filename = filename;
	}
	
	private void load() {
		System.out.println("Loading large image: " + filename);
	}

	@Override
	public void display() {
		System.out.println("Display image: " + filename);

	}

}

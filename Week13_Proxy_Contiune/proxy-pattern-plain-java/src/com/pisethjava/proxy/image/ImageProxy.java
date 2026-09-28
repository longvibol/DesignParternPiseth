package com.pisethjava.proxy.image;

public class ImageProxy implements Image {
	
	private final String filesname;
	private HighResolutionImage realImage;
	
	public ImageProxy(String filename) {
		this.filesname = filename;
	}

	@Override
	public void display() {
		if(realImage == null) {
			System.out.println("Create real image on first access");
			realImage = new HighResolutionImage(filesname);
		}
		
		realImage.display();

	}

}

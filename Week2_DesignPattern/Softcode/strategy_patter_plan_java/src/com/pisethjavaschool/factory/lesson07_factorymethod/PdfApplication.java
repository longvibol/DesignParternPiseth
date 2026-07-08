package com.pisethjavaschool.factory.lesson07_factorymethod;

public class PdfApplication extends DocumentApplication {

	@Override
	protected Document createDocument() {
	
		return new PdfDocument();
	}

}

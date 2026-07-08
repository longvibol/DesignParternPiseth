package com.pisethjavaschool.factory.lesson07_factorymethod;

public abstract class DocumentApplication {

	protected abstract Document createDocument();

	public void processDocument() {

		// it will create object base on the implement class
		Document document = createDocument();
		document.open();
	}

}

package com.pisethjava.proxy.document;

public class RealDocumentService implements DocumentService {

	@Override
	public String readDocument(String documentId) {
		System.out.println("Loading document from storage...");
		return "Sensitive content for " + documentId;
	}

}

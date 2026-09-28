package com.pisethjava.proxy.document;

public final class SecuredDocumentServiceProxy implements DocumentService {
	
	
	// its call reference interface called 
	private final DocumentService target;
	private final CurrentUser currentUser;
	
	public SecuredDocumentServiceProxy(DocumentService target,CurrentUser currentUser) {
		this.target = target;
		this.currentUser = currentUser;
	}

	@Override
	public String readDocument(String documentId) {
		if(!currentUser.permissions().contains("DOCUMENT_READ")) {
			throw new SecurityException(
					"DOCUMENT_READ permission required"
					);
		}
		
		// Pass the Security Check 
		
		System.out.println("Security check passed");
		return target.readDocument(documentId);
	}
}
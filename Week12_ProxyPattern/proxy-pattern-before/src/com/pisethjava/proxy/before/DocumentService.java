package com.pisethjava.proxy.before;

import java.util.HashMap;
import java.util.Map;

public class DocumentService {
	
	private final CurrentUser currentUser;
	private final Map<String, String> cache = new HashMap<>();
	
	public DocumentService(CurrentUser currentUser) {
		this.currentUser = currentUser;
	}
	
	
	// main funciton 
	public String readDocument(String documentId) {
		checkPermission();
		
		if(cache.containsKey(documentId)) {
			System.out.println("Return document from cache");
			return cache.get(documentId);
		}
		
		System.out.println("Loading document from storage...");
		
		// add content to the cache
		
		String content = "Sensitive content fro " + documentId;
		
		// add to the map 
		
		cache.put(documentId, content);
		audit(documentId);		
		
		return content;
	}
	
	public void checkPermission() {
		if(!currentUser.permissions().contains("DOCUMENT_READ")) {
			throw new SecurityException(
					"DOCUMENT_READ permission required"
					);
		}
	}
	
	private void audit(String docuemntId) {
		System.out.println(
				"Audit doucment "+ docuemntId + " by " + currentUser.userId()
				);
	}

}

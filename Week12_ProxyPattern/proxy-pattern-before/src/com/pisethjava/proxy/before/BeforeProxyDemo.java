package com.pisethjava.proxy.before;

import java.util.Set;

public class BeforeProxyDemo {

	public static void main(String[] args) {
	
		DocumentService service = new DocumentService(
					new CurrentUser(
							"USER-1", 
							Set.of("DOCUMENT_READ")
							)
				);
		service.readDocument("DOC-001"); // first read from data base 
		service.readDocument("DOC-001"); // read from cache (map)
		
		System.out.println(
				"Problem: storage, security, cache, and audit "
						+ "are mixed in one service."
				);

	}

}

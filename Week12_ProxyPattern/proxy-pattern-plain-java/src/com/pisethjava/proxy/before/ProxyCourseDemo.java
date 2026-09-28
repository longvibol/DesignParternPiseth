package com.pisethjava.proxy.before;

import java.util.Set;

import com.pisethjava.proxy.document.CurrentUser;
import com.pisethjava.proxy.document.DocumentService;
import com.pisethjava.proxy.document.RealDocumentService;
import com.pisethjava.proxy.document.SecuredDocumentServiceProxy;
import com.pisethjava.proxy.payment.PaymentRequest;
import com.pisethjava.proxy.payment.PaymentResult;
import com.pisethjava.proxy.payment.PaymentSecurityProxy;
import com.pisethjava.proxy.payment.PaymentService;
import com.pisethjava.proxy.payment.RealPaymentService;

public class ProxyCourseDemo {

	public static void main(String[] args) {
		
//		protectionProxy();
		protectionProxyPayment();
	}
	
	private static void protectionProxy(){
		System.out.println("\n==== PROTECTION PROXY ===");
		
		DocumentService service = new SecuredDocumentServiceProxy(
				new RealDocumentService(), 
				new CurrentUser(
						"USER-1", 
						Set.of("DOCUMENT_READ")));
		
		System.out.println(
				service.readDocument("DOC-001")
				);
	}
	
	private static void protectionProxyPayment(){
		
		System.out.println("\n === Payment PROXY ===");
	
		PaymentService service = new PaymentSecurityProxy(
				new RealPaymentService() , 
				new CurrentUser("USER-01", Set.of("PAYMENT_CREATE")));
		
		// 1. Create a payment request
	    PaymentRequest request = new PaymentRequest(250.00);
	    
	    // 2. Call the service and print the result
	    PaymentResult result = service.pay(request);
	    System.out.println("Result: " + result);
	}
}








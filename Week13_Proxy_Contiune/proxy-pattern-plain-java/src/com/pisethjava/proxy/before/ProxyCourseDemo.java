package com.pisethjava.proxy.before;

import java.math.BigDecimal;
import java.util.Set;

import com.pisethjava.proxy.composition.MetricsPaymentDecorator;
import com.pisethjava.proxy.document.CurrentUser;
import com.pisethjava.proxy.document.DocumentService;
import com.pisethjava.proxy.document.RealDocumentService;
import com.pisethjava.proxy.document.SecuredDocumentServiceProxy;
import com.pisethjava.proxy.image.Image;
import com.pisethjava.proxy.image.ImageProxy;
import com.pisethjava.proxy.integration.AbaPaymentAdapter;
import com.pisethjava.proxy.integration.AbaSdk;
import com.pisethjava.proxy.integration.PaymentGateway;
import com.pisethjava.proxy.integration.SecuredPaymentGatewayProxy;
import com.pisethjava.proxy.payment.PaymentRequest;
import com.pisethjava.proxy.payment.PaymentResult;
import com.pisethjava.proxy.payment.PaymentSecurityProxy;
import com.pisethjava.proxy.payment.PaymentService;
import com.pisethjava.proxy.payment.RealPaymentService;
import com.pisethjava.proxy.remote.RemoteUserClientProxy;
import com.pisethjava.proxy.remote.UserClient;

public class ProxyCourseDemo {

	public static void main(String[] args) {
		
//		protectionProxy();
//		protectionProxyPayment();		
//		virtualProxy();
//		remoteProxy();
		proxyAdapterDecorator();
	}
	
	private static void proxyAdapterDecorator() {
		System.out.println("\n=== PROXY + DECORATOR + ADAPTER ===");
		
		PaymentGateway gateway = 
				new SecuredPaymentGatewayProxy(
						new MetricsPaymentDecorator(
								new AbaPaymentAdapter(
										new AbaSdk())
								), 
						Set.of("PAYMENT_CREATE")
						);
		
		System.out.println(
				gateway.pay(
						new com.pisethjava.proxy.integration.PaymentRequest(
								new BigDecimal("100.00")
								)
				));
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

	private static void virtualProxy() {
		System.out.println("\n==== Virtual PROXY ===");
		
		Image image = new ImageProxy("hotel.jpg");
		System.out.println(
				"Proxy create; real image not laoded yet."
				);
		image.display();
		image.display();
	}
	
	private static void remoteProxy() {
		System.out.println("\n==== Remote PROXY ===");
		
		UserClient client = new RemoteUserClientProxy();
		
		System.out.println(client.getUser("USER-1"));
		
	}
}








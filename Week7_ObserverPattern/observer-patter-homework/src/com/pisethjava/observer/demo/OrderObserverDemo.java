package com.pisethjava.observer.demo;

import com.pisethjava.observer.classes.AuditObserver;
import com.pisethjava.observer.classes.EmailObserver;
import com.pisethjava.observer.classes.InventoryObserver;
import com.pisethjava.observer.classes.OrderPublisher;
import com.pisethjava.observer.classes.OrderService;
import com.pisethjava.observer.classes.ShippingObserver;
import com.pisethjava.observer.classes.SmsObserver;

public class OrderObserverDemo {

	public static void main(String[] args) {
		OrderPublisher publisher = new OrderPublisher();

		publisher.subscribe(new InventoryObserver());
        publisher.subscribe(new EmailObserver());
        publisher.subscribe(new AuditObserver());
        publisher.subscribe(new ShippingObserver());
        
     // Fifth observer added without changing OrderService.
        publisher.subscribe(new SmsObserver());
        
        OrderService orderService = new OrderService(publisher);
        
        orderService.createOrder(
                "ORD-1001",
                "customer@example.com",
                "Laptop",
                2
        );
	}

}

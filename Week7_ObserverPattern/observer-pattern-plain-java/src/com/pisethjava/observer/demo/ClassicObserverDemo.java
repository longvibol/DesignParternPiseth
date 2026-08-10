package com.pisethjava.observer.demo;

import com.pisethjava.observer.classic.AnalyticsObserver;
import com.pisethjava.observer.classic.AuditObserver;
import com.pisethjava.observer.classic.SmsObserver;
import com.pisethjava.observer.classic.UserEventPublisher;
import com.pisethjava.observer.classic.UserService;
import com.pisethjava.observer.classic.WelcomeEmailObserver;
import com.pisethjava.observer.domain.User;

public class ClassicObserverDemo {

	public static void main(String[] args) {
		UserEventPublisher publisher = new UserEventPublisher();
		
		SmsObserver smsObserver = new SmsObserver();
		
		publisher.subscribe(new WelcomeEmailObserver());
		publisher.subscribe(smsObserver);
//		publisher.subscribe(new AuditObserver());
		publisher.subscribe(new AnalyticsObserver());
		
		UserService service = new UserService(publisher);
		service.register(new User("vibol", "vibol@gmail.com", "0962245103"));
		
		System.out.println("\nRemove SMS observer and publish again:");
		publisher.unsubscribe(smsObserver);
		
		service.register(new User("steaven", "steven@gmail.com", "02993933"));
		
	}

}

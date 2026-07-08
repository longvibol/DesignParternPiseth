package com.pisethjavaschool;

import java.util.List;

import com.pisethjavaschool.bad.BadNotificationService;
import com.pisethjavaschool.good.EmailNoficationStrategy;
import com.pisethjavaschool.good.NotificationChannel;
import com.pisethjavaschool.good.NotificationService;
import com.pisethjavaschool.good.NotificationStrategy;
import com.pisethjavaschool.good.NotificationStrategyFactory;
import com.pisethjavaschool.good.SmsNoficationStrategy;
import com.pisethjavaschool.good.TelegramNoficationStrategy;
import com.pisethjavaschool.model.NotificationRequest;

public class Main {

    public static void main(String[] args) {
    	
        NotificationRequest request = new NotificationRequest(
                "student@example.com",
                "Welcome to Design Pattern class!");
        /*
        BadNotificationService badService = new BadNotificationService();
        var message = badService.send("TELEGRAM", request);        
        System.out.println(message);
        
        */
    	List<NotificationStrategy> strategies =  List.of(
    			new EmailNoficationStrategy(),
    			new SmsNoficationStrategy(),
    			new TelegramNoficationStrategy()
    	);
    	
    	NotificationStrategyFactory factory = new NotificationStrategyFactory(strategies);
    	NotificationService notificationService = new NotificationService(factory);
    	
    	System.out.println(notificationService.send(NotificationChannel.EMAIL, request));
    }

    
    
    
    
    
    
    

}
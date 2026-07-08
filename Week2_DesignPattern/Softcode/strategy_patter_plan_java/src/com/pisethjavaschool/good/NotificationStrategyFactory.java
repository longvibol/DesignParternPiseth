package com.pisethjavaschool.good;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class NotificationStrategyFactory {
	
	// Register strategies 
	private final Map<NotificationChannel, NotificationStrategy> strategies;
	
	// Add Stragety wit the May that have key and Value 
	
	public NotificationStrategyFactory(List<NotificationStrategy> strategyList) {
		
		// add Enum that we have create for type safe
		this.strategies = new EnumMap<>(NotificationChannel.class);
		
		for(NotificationStrategy strategy : strategyList) {
			// Put to the map
			strategies.put(strategy.channel(), strategy);
		}
	}
	
	public NotificationStrategy getStrategy(NotificationChannel channel) {
		NotificationStrategy strategy = strategies.get(channel);
		
		if(strategy==null) {
			throw new IllegalArgumentException("Unsupported notification channel: " + channel);
		}
		
		return strategy;
	}

}

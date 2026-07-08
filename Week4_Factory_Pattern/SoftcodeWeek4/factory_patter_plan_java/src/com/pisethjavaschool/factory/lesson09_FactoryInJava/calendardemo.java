package com.pisethjavaschool.factory.lesson09_FactoryInJava;

import java.util.Calendar;

public class calendardemo {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
	}

}

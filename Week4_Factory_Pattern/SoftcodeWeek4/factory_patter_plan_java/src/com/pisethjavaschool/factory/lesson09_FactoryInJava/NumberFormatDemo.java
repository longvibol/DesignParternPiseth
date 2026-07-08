package com.pisethjavaschool.factory.lesson09_FactoryInJava;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumberFormatDemo {

	public static void main(String[] args) {
		Locale cambodia = new Locale.Builder()
                .setLanguage("km")
                .setRegion("KH")
                .build();

        NumberFormat formatter = NumberFormat.getCurrencyInstance(cambodia);
        formatter.setCurrency(Currency.getInstance("KHR"));

        System.out.println(formatter.format(20));

	}

}

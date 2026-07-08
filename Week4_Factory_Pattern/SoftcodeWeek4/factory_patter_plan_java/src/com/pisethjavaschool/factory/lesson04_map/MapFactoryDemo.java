package com.pisethjavaschool.factory.lesson04_map;

public class MapFactoryDemo {

	public static void main(String[] args) {
		
		MapBaseReportFactory factory = new MapBaseReportFactory();
		
		factory.getReport("SALES").generate();

	}

}

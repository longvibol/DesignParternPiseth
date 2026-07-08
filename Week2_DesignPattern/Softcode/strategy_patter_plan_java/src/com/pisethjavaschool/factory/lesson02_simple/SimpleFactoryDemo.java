package com.pisethjavaschool.factory.lesson02_simple;

public class SimpleFactoryDemo {

	public static void main(String[] args) {
		
		ReportService serviceReport = new ReportService(new ReportFactory());
		serviceReport.generate("sales");
		serviceReport.generate("stock");
	}

}

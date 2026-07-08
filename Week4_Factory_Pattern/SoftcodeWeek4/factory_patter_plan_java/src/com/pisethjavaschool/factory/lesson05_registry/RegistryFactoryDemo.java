package com.pisethjavaschool.factory.lesson05_registry;

import com.pisethjavaschool.factory.comman.Report;

public class RegistryFactoryDemo {

	public static void main(String[] args) {

		RegistryReportFactory factory = new RegistryReportFactory();
		
		//Generate Sales report
		Report salesReport = factory.create("SALES");
		
		salesReport.generate();

	}

}

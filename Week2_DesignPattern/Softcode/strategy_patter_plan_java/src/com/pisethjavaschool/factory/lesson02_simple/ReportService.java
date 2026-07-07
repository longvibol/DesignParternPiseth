package com.pisethjavaschool.factory.lesson02_simple;

import com.pisethjavaschool.factory.comman.Report;

public class ReportService {
	
	private final ReportFactory factory;

	// constructor it create when run time
	public ReportService(ReportFactory factory) {
		this.factory = factory;
	}
	
	public void generate(String type) {
		Report report = factory.create(type);
		report.generate();
	}
	
	

}

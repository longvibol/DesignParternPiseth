package com.pisethjavaschool.factory.lesson01_problem;

import com.pisethjavaschool.factory.comman.Report;
import com.pisethjavaschool.factory.comman.SalesReport;
import com.pisethjavaschool.factory.comman.StockReport;

public class BadReportService {
	public void generate(String type) {
		
		Report report;
	
		if ("SALES".equals(type)) {
			report = new SalesReport();
		} else if ("STOCK".equals(type)) {
			report = new StockReport();
		} else {
			throw new IllegalArgumentException("Unsupported report type");
		}
		report.generate();
	}
}

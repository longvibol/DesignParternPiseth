package com.pisethjavaschool.factory.lesson04_map;

import java.util.HashMap;
import java.util.Map;

import com.pisethjavaschool.factory.comman.*;


public class MapBaseReportFactory {
	/*
	private final Map<String, Report> reports = new HashMap<>();
	
	public ReportFactory() {
		reports.put("SALES", new SalesReport());
		reports.put("STOCK", new StockReport());
		reports.put("CUSTOMER", new CustomeReport());
	}
	
	*/
	
	private final Map<String, Report> reports = Map.of(
			"SALES", new SalesReport(),
			"STOCK", new StockReport(),
			"CUSTOMER", new CustomerReport()
			);
	
	public Report getReport(String type) {
		Report report = reports.get(type);
		
		if(report ==null) {
			throw new IllegalArgumentException("Unsupport report type: " + type);
		}
		return report;
	}
	
	/*
	 * In that case, we may need Supplier, Registry Factory, or Spring Bean Factory
	 * Do not use Map Factory when each object needs different runtime data in the
		constructor.
	 * 
	 */

}

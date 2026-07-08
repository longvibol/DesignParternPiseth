package com.pisethjavaschool.factory.lesson05_registry;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.pisethjavaschool.factory.comman.CustomerReport;
import com.pisethjavaschool.factory.comman.Report;
import com.pisethjavaschool.factory.comman.SalesReport;
import com.pisethjavaschool.factory.comman.StockReport;

public class RegistryReportFactory {

	private final Map<String, Supplier<Report>> registry = new HashMap<>();

	public RegistryReportFactory() {
		registry.put("SALES", SalesReport::new);
		registry.put("STOCK", StockReport::new);
		registry.put("CUSTOMER", CustomerReport::new);
	}

	public Report create(String type) {
		Supplier<Report> supplier = registry.get(type);
		if (supplier == null) {
			throw new IllegalArgumentException("Unsupported report type: " + type);
		}
		return supplier.get();
	}

}

package com.pisethjavaschool.factory.lesson06_reflection;

import com.pisethjavaschool.factory.comman.Report;

public class ReflectionFactoryDemo {

	public static void main(String[] args) {

		ReflectionExportFactory factory = new ReflectionExportFactory();

        Report report = factory.create(
            "com.pisethjavaschool.factory.comman.StockReport"
        );

        report.generate();
    }
    

}

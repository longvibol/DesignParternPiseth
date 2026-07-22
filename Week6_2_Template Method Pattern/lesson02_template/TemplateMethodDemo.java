package com.pisethjavaschool.template.lesson02_template;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		System.out.println("=== GOOD CODE: Template Method ===");
		ReportExporter export = new JsonReportExporter();
		
		export.export();

	}

}

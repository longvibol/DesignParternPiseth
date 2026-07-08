package com.pisethjavaschool.factory.lesson06_homwork1_StrategyFactory;

public class CsvExportFile implements ExportFile {

	@Override
	public void export(String fileName) {
		System.out.println("Exporting " + fileName + " as CSV file");

	}

}

package com.pisethjavaschool.factory.lesson06_homwork1_StrategyFactory;

public class PdfExportFile implements ExportFile {

	@Override
	public void export(String fileName) {
		
		 System.out.println("Exporting " + fileName + " as PDF file");
	}

}

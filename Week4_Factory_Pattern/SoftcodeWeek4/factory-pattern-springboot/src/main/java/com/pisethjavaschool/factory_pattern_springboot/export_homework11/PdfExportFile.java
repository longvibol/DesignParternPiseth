package com.pisethjavaschool.factory_pattern_springboot.export_homework11;

import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfExportFile implements ExportFile {

	@Override
	public void export(String content) {
		System.out.println("Export PDF: " + content);

	}

}

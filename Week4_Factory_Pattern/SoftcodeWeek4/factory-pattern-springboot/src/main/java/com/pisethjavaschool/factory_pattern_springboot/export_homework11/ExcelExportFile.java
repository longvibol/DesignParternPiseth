package com.pisethjavaschool.factory_pattern_springboot.export_homework11;

import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelExportFile implements ExportFile {

	@Override
	public void export(String content) {
		System.out.println("Export Excel: " + content);

	}

}

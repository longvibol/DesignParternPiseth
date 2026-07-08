package com.pisethjavaschool.factory_pattern_springboot.export_homework11;

import org.springframework.stereotype.Component;

@Component("JSON")
public class JsonExportFile implements ExportFile {

	@Override
	public void export(String content) {
		System.out.println("Export JSON: " + content);

	}
}

package com.pisethjavaschool.factory_pattern_springboot.export_homework11;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExportService {

	private final ExportFileFactory factory;
	
	public void export(String type, String content) {
		
		ExportFile exportFile = factory.getExportFile(type);
		
		exportFile.export(content);
		
	}
}

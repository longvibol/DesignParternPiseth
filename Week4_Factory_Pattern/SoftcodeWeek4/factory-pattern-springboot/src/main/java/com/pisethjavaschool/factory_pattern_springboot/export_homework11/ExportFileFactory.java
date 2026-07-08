package com.pisethjavaschool.factory_pattern_springboot.export_homework11;

import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ExportFileFactory {

	private final Map<String, ExportFile> exportFiles;

	public ExportFile getExportFile(String type) {
		
		ExportFile exportFile = exportFiles.get(type);
		
		if (exportFile == null) {
			
			throw new IllegalArgumentException("Unsupported export type: " + type);
		}
		
		return exportFile;
	}
}

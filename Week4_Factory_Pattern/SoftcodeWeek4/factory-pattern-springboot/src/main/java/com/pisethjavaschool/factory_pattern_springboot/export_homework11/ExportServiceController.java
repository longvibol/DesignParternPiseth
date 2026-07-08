package com.pisethjavaschool.factory_pattern_springboot.export_homework11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ExportServiceController {
	
	private final ExportService exportService;

    @GetMapping("/export")
    public String pay(
            @RequestParam String type,
            @RequestParam String fileName
    ) {
    	exportService.export(type, fileName);
        return "Export success with file extension: " + type + ", FileName: " + fileName;
    }

}

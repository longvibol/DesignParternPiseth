package com.pisethjavaschool.factory.lesson06_homwork1_StrategyFactory;

public class ExportService {

    private final ExportFileFactory factory;

    public ExportService(ExportFileFactory factory) {
        this.factory = factory;
    }

    public void export(ExportType type, String fileName) {
        ExportFile exportFile = factory.getExport(type);
        exportFile.export(fileName);
    }
}
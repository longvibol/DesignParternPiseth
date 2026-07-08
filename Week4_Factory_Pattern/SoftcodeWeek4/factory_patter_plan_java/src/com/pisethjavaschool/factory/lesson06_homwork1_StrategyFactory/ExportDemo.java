package com.pisethjavaschool.factory.lesson06_homwork1_StrategyFactory;

public class ExportDemo {

    public static void main(String[] args) {

        ExportService exportService = new ExportService(new ExportFileFactory());

        exportService.export(ExportType.JSON, "Inventory");
    }
}
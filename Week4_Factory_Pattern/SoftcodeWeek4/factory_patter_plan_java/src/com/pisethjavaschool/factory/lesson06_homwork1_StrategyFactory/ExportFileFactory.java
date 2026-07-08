package com.pisethjavaschool.factory.lesson06_homwork1_StrategyFactory;

import java.util.Map;
import java.util.function.Supplier;

public class ExportFileFactory {

    private final Map<ExportType, Supplier<ExportFile>> exports = Map.of(
            ExportType.PDF, PdfExportFile::new,
            ExportType.EXCEL, ExcelExportFile::new,
            ExportType.CSV, CsvExportFile::new,
            ExportType.JSON, JsonExportFile::new
    );

    public ExportFile getExport(ExportType type) {
        Supplier<ExportFile> supplier = exports.get(type);

        if (supplier == null) {
            throw new IllegalArgumentException("Unsupported export type: " + type);
        }

        return supplier.get();
    }
}
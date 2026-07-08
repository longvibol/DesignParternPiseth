package com.pisethjavaschool.factory.lesson06_reflection;

import com.pisethjavaschool.factory.comman.Report;

public class ReflectionExportFactory {

	public Report create(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            return (Report) clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot create report", e);
        }
    }

}

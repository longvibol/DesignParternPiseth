package com.pisethjavaschool.template.lesson02_template;

public abstract class ReportExporter {
	
	public final void export() {
		validateRequest();
		loadData();
		formatData();
		generateFile();
		saveFile();
		returnResult();
	}
	
	// Create Method 
	private void validateRequest() {
		System.out.println("Validate request");
	}

	private void loadData() {
		System.out.println("Load report data");
	}

	// Create abstract class that the subclass can overight this method
	protected abstract void formatData();

	protected abstract void generateFile();

	private void saveFile() {
		System.out.println("Save file");
	}

	private void returnResult() {
		System.out.println("Return result");
	}

}

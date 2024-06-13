package org.sam;

import java.io.IOException;

public class DataDrivenclass extends BaseClass {
	public static void main(String[] args) throws IOException {
		createNewExcelFile(0, 0, "Selenium");
		createcell(0, 1, "Appium");
		
		createRow(1, 0, "Java");
		createcell(0, 1, "Cucumber");
		
		createRow(2, 0, "Data ");
		createcell(0, 1, "Junit");
		
		createRow(3, 0, "POM");
		createcell(0, 1, "TestNG");
			
	}
	
	
}
		
	

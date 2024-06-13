package org.sam;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		File F = new File("C:\\Users\\LENOVO\\eclipse-workspace\\MavenProject\\Excel\\newfile.xlsx");
		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet sheet = w.createSheet("Data");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Selenium");
		XSSFCell cell2 = row.createCell(1);
		cell2.setCellValue("Appium");
		XSSFRow row2 = sheet.createRow(1);
		XSSFCell cell3 = row2.createCell(0);
		cell3.setCellValue("Java");
		XSSFCell cell4 = row2.createCell(1);
		cell4.setCellValue("Cucumber");
		XSSFRow row3 = sheet.createRow(2);
		XSSFCell cell5 = row3.createCell(0);
		cell5.setCellValue("Data Driven");
		XSSFCell cell6 = row3.createCell(1);
		cell6.setCellValue("Junit");
		XSSFRow row4 = sheet.createRow(3);
		XSSFCell cell7 = row4.createCell(0);
		cell7.setCellValue("POM");
		XSSFCell cell8 = row4.createCell(1);
		cell8.setCellValue("TestNG");
		FileOutputStream fos = new FileOutputStream(F);
		w.write(fos);
	}

}

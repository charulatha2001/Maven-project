package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleExcel {
	public static <DataFormat> void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\MavenProject\\Excel\\SampleDatas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet("Datas");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				XSSFCell cell = row.getCell(j);
				int cellType = cell.getCellType();

				if (cellType == 1) {
					String value = cell.getStringCellValue();
					System.out.println(value);

				} else if (DateUtil.isCellInternalDateFormatted(cell)) {
					Date d = cell.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MM-yy");
					String format = s.format(d);
					System.out.println(format);

				} else {
					double num = cell.getNumericCellValue();
					long l = (long) num;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}

			}

		}

	}

}

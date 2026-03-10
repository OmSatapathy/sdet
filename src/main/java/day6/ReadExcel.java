package day6;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public void readingData() {

		File fs = new File("D:\\playwrightEnd2End\\playwrightE2E\\testdata\\manualdata.xlsx");

		try {
			Workbook wb = new XSSFWorkbook(fs);
			Sheet sheet = wb.getSheet("Sheet1");

			int rowCount = sheet.getLastRowNum();

			for (int i = 1; i <= rowCount; i++) {
				Row row = sheet.getRow(i);

				String username = row.getCell(0).getStringCellValue();
				String password = row.getCell(1).getStringCellValue();

				System.out.println(username + " " + password);
			}
			wb.close();

		} catch (InvalidFormatException | IOException e) {

			e.printStackTrace();
		}

	}

}

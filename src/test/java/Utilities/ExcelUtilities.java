package Utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	// excel reader methods

	public static void readExcelFile(String filePath, String sheetName) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook workbook = new XSSFWorkbook(fis);

			Sheet sheet = workbook.getSheet(sheetName);
			

			if (sheet == null) {
				System.out.println("Sheet " + sheetName + " does not exist. ");
			}

			for (Row row : sheet) {
				for (Cell cell : row) {

					switch (cell.getCellType()) {

					case BOOLEAN:
						System.out.println(cell.getBooleanCellValue() + "\t");
						break;
					case NUMERIC:
						System.out.println(cell.getNumericCellValue() + "\t");
						break;
					case STRING:
						System.out.println(cell.getStringCellValue() + "\t");
						break;
					case FORMULA:
						System.out.println(cell.getNumericCellValue() + "\t");
						break;
					}
				}
				System.out.println();
				workbook.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	//write to excel
	
	public static void writeValuesToEndOfRow(String filePath, String sheetName, String[] values) {
		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook workbook = new XSSFWorkbook(fis);

			Sheet sheet = workbook.getSheet(sheetName);
			

			if (sheet == null) {
				System.out.println("Sheet " + sheetName + " does not exist. ");
			}
			
			for(int i = 0; i < values.length; i++) {
				
				Row row = sheet.getRow(i + 1); // starting at row 2
				
				if(row == null) {
					row = sheet.createRow(i +1);
				}
				
				Cell cell = row.createCell(row.getLastCellNum() == -1 ? 0 : row.getLastCellNum());
				/// result = condition ? valueIfTrue : valueIfFalse;
				cell.setCellValue(values[i]);
			}
			
			try {
				FileOutputStream fos = new FileOutputStream(filePath);
				workbook.write(fos);
				
			}catch(IOException e){
				e.printStackTrace();
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

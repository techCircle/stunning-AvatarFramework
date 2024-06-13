package TestCases;

import org.testng.annotations.Test;

import Utilities.Constants;
import Utilities.ExcelUtilities;

public class ExcelWrite {
//	public static void main(String[] args) throws IOException {
//		
//		
//		//opening connection to file
//				FileInputStream fis = new FileInputStream(Constants.excelPath);
//				
//				
//				//connection to workbook
//				XSSFWorkbook wb = new XSSFWorkbook(fis);
//				//connect sheet
//				XSSFSheet sheet = wb.getSheetAt(0);
//		
////		
//				int lastRow = sheet.getLastRowNum();
//				System.out.println(lastRow);
//		
//				for(int i = 1; i <= lastRow; i++) {
//					
//					Row row = sheet.getRow(i);
//					
//					Cell cell = row.createCell(8);
//					cell.setCellValue("Cohort18");
//					
//					Cell cell2 = row.createCell(9);
//					cell2.setCellValue("TechCircle Team");
//				}
//				
//				  // Add the new group header
//	            Row headerRow = sheet.getRow(0);
//	            Cell newHeaderCell = headerRow.createCell(headerRow.getLastCellNum());
//	            newHeaderCell.setCellValue("groupI");
//
//	            // Add the countries for the new group
//	            String[] countries = {"Mongolia", "Eastern Turkistan", "China", "Korea"};
//	            for (int i = 0; i < countries.length; i++) {
//	                Row row = sheet.getRow(i + 1);
//	                if (row == null) {
//	                    row = sheet.createRow(i + 1);
//	                }
//	                Cell cell = row.createCell(newHeaderCell.getColumnIndex());
//	                cell.setCellValue(countries[i]);
//	            }		
//					
//				
//		FileOutputStream fos = new FileOutputStream(Constants.excelPath);
//		wb.write(fos);
//		fos.close();
//	}
	
	@Test
	public void writingIntoExcel() {
		
		ExcelUtilities.readExcelFile(Constants.excelPath, "Sheet1");
		
		System.out.println("----------------------------------------------------------------------");
		
		String[] values = {"Shafkat FC","SK FC","Flora FC","Khem FC"};
		
		ExcelUtilities.writeValuesToEndOfRow(Constants.excelPath, "Sheet1", values);
		
		System.out.println("----------------------------------------------------------------------");

		ExcelUtilities.readExcelFile(Constants.excelPath, "Sheet1");

		
	}

}

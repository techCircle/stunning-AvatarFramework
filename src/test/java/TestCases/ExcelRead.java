package TestCases;

import org.testng.annotations.Test;

import Utilities.Constants;
import Utilities.ExcelUtilities;

public class ExcelRead {
//	public static void main(String[] args) throws IOException {
//		
//		//opening connection to file
//		FileInputStream fis = new FileInputStream(Constants.excelPath);
//		
//		
//		//connection to workbook
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		//connect sheet
//		XSSFSheet sheet = wb.getSheet("Sheet1");
//		
//		
//		for(Row row : sheet) {
//			for(Cell cell : row) {	
//				
//				switch(cell.getCellType()) {
//				
//				case BOOLEAN:
//						System.out.println(cell.getBooleanCellValue() + "\t");
//						break;
//				case NUMERIC:
//						System.out.println(cell.getNumericCellValue()+ "\t");
//						break;
//				case STRING:
//						System.out.println(cell.getStringCellValue()+ "\t");
//						break;
//				case FORMULA: 
//						System.out.println(cell.getNumericCellValue()+ "\t");
//						break;
//				}
//			}
//			System.out.println();
//			wb.close();
//		}
//		
//	
//	}
	
	@Test
	public void readingExcelTest() {
		ExcelUtilities.readExcelFile(Constants.excelPath, "Sheet1");
	}
	
	
	
	
	
	

}

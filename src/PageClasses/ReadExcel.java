package PageClasses;

import java.io.FileInputStream;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static  XSSFCell Cell;
	private static String cellData ;
	// Location of the Excel file
	private static  String filePath = "/Users/likhesh/Documents/Selenium_Eclipse/Xero/src/Resources/AccountName.xlsx";
	private static  String sheetName = "Sheet1";
	
public static String getAccountName(){

	try {
		FileInputStream ExcelFile = new FileInputStream(filePath);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		
		Cell = ExcelWSheet.getRow(1).getCell(2);
		String cellData = Cell.getStringCellValue();
		System.out.println("Cell Data: " + cellData);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return cellData;
}


}

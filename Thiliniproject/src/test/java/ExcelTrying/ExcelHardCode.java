package ExcelTrying;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHardCode {

	public static void main(String[] args) {
		NumberOfRowCount();
		CellNumericData();
		CellStingDAta();
	}

	//count the number of rows - New method
	public static void NumberOfRowCount() {

		try {
			//1. Create a instance for wookbook
			String path = System.getProperty("user.dir");
			XSSFWorkbook wb=new XSSFWorkbook(path +"/excel/tryData.xlsx");
			//2.create a instance for sheet
			XSSFSheet ws=wb.getSheet("Sheet1");
			//3.define rows
			int rowCount =ws.getPhysicalNumberOfRows();
			System.out.println("The number of rows in the excel =  "+rowCount);
		}
		catch(Exception e){
			e.printStackTrace();
		}


	}
	//Cell data Numeric value
	public static void CellNumericData() {
try {
		String path =System.getProperty("user.dir");
		XSSFWorkbook wb=new XSSFWorkbook(path +"/excel/tryData.xlsx");
		XSSFSheet ws=wb.getSheet("Sheet1");
		double numericData = ws.getRow(1).getCell(1).getNumericCellValue();
		System.out.println("The numeric value is "+numericData);
}
	catch(Exception e) {
		e.getMessage();
	}
}
	
	
	
	//Cell data String value
	public static void CellStingDAta() {
		try {
			String path=System.getProperty("user.dir");
		XSSFWorkbook wb=new XSSFWorkbook(path +"/excel/tryData.xlsx");
		XSSFSheet ws=wb.getSheet("Sheet1");
		String cellValue =ws.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Sting cell value is "+cellValue);
	}
	catch(Exception e) {
		e.getCause();
	}
	}
	}








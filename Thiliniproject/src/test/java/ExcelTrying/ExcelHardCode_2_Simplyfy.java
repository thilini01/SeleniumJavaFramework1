package ExcelTrying;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHardCode_2_Simplyfy {
	
	//Call the methods ---4
	/*
	 * public static void main(String[] args) { NumberOfRowCount();
	 * CellNumericData(1,1); CellStingDAta(1,0); }
	 */
	 

	//Define global variables ---5
	static String path;
	static XSSFWorkbook wb;
	static XSSFSheet ws;

	//create a constructor ----8
	public ExcelHardCode_2_Simplyfy (String excelPath, String wooksheet) {
		try {
			path =System.getProperty("user.dir");
			wb=new XSSFWorkbook(path +"/excel/tryData.xlsx");
			ws=wb.getSheet("Sheet1");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}



	//count the number of rows - New method --1
	public static void NumberOfRowCount() {

		try {
			int rowCount =ws.getPhysicalNumberOfRows();
			System.out.println("The number of rows in the excel =  "+rowCount);
		}
		catch(Exception e){
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}


	//Cell data Numeric value ---2
	//Without hard-code get it from calling function ----6

	public static void CellNumericData(int row, int cell) {
		try {
			double numericData = ws.getRow(row).getCell(cell).getNumericCellValue();
			System.out.println("The numeric value is "+numericData);
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}



	//Cell data String value ---3
	//Without hard-code get it from calling function ----7
	public static void CellStingDAta(int row, int cell) {
		try {
			String cellValue =ws.getRow(row).getCell(cell).getStringCellValue();
			System.out.println("Sting cell value is "+cellValue);
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}
}








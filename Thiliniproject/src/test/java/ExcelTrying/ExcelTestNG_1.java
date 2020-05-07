package ExcelTrying;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestNG_1 {

	//Define global variables ---5
	static String path;
	static XSSFWorkbook wb;
	static XSSFSheet ws;


	//create a constructor ----8
	public ExcelTestNG_1 (String excelPath, String worksheet) {
		try {
			path =System.getProperty("user.dir");
			wb=new XSSFWorkbook(path +"/excel/tryData.xlsx");
			ws=wb.getSheet("Sheet1");
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}



	//count the number of rows - New method --1
	public static int NumberOfRowCount() {
		int rowCount=0;

		try {
			rowCount =ws.getPhysicalNumberOfRows();
			//System.out.println("The number of rows in the excel =  "+rowCount);
		}
		catch(Exception e){
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
		return rowCount;
	}



	//count the number of columns - New method --1
	public static int NumberOfColomnCount() {
		int columnCount=0;
		try {
			columnCount =ws.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("The number of columns in the excel =  "+columnCount);
		}
		catch(Exception e){
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
		return columnCount;
	}



	//Cell data Numeric value ---2
	//Without hard-code get it from calling function ----6


	public static void CellNumericData(int row, int cell) 
	{ 
		try
	{ 
		double  numericData = ws.getRow(row).getCell(cell).getNumericCellValue();
	System.out.println("The numeric value is "+numericData);
	} 
	catch(Exception e) 
	{
		e.printStackTrace();
		e.getCause();
		e.getMessage(); 
	} 
	}



	//Cell data String value ---3
	//Without hard-code get it from calling function ----7
	public static String  CellStingDAta(int row, int cell) {
		String cellValue=null;
		try {
			cellValue =ws.getRow(row).getCell(cell).getStringCellValue();
			//System.out.println("Sting cell value is "+cellValue);
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		
		}
		return cellValue;
	}
}








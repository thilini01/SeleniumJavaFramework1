// The first excel related test script (Hard code method)

package Utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	//Create global level variables so that we can use it everywhere. Should be static
	
	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public static void main(String[] args) {
		//ExcelRowCount();
		CellString();
		CellNumber();
	}
	
	
	//number of row count in excel
	public static void ExcelRowCount() {
		try {
		path=System.getProperty("user.dir");
		//creating reference to the workbook
		workbook=new XSSFWorkbook(path +"/excel/data.xlsx");
		//creating reference to the sheet 
		sheet=workbook.getSheet("Sheet1");
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("The number of rows are "+  rowCount);
		}
		
		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}	
		
	}
	
	
	//number of cell data count String 
	public static void CellString() {
		
		try {
		path=System.getProperty("user.dir");
		//creating reference to the workbook
		workbook=new XSSFWorkbook(path +"/excel/data.xlsx");
		sheet=workbook.getSheet("Sheet1");
		String path= System.getProperty("user.dir");
		XSSFWorkbook workbook=new XSSFWorkbook(path +"/excel/data.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		String getcell=sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println("The cell number is " +getcell);
		
		}
		
		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
			}
		}
	
	//number of cell data count Numeric  
	public static void CellNumber() {
		
		try {
		path=System.getProperty("user.dir");
		//creating reference to the workbook
		workbook=new XSSFWorkbook(path +"/excel/data.xlsx");
		sheet=workbook.getSheet("Sheet1");
		String path= System.getProperty("user.dir");
		XSSFWorkbook workbook=new XSSFWorkbook(path +"/excel/data.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		double getcell=sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println("The cell number is " +getcell);
		
		}
		
		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
			}
		}
		
	}


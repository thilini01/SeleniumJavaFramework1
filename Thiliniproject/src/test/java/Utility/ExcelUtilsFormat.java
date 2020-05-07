//Excel without hard code 

package Utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilsFormat {


	//Constructor 
	public ExcelUtilsFormat(String pathName, String sheetName) {

		try {
			path=System.getProperty("user.dir");
			//creating reference to the workbook
			workbook=new XSSFWorkbook(pathName);
			//creating reference to the sheet 
			sheet=workbook.getSheet(sheetName);
		}
		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
	}


	//Create global level variables so that we can use it everywhere. Should be static

	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;



	public static void main(String[] args) { 
		ExcelRowCount(); 
		CellString(0,1);
		CellNumber(1,1); 
		ExcelColCount(); }


	//function to get row count
	public static void ExcelRowCount() {
		try {

			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("The number of rows are "+  rowCount);
		}

		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}	

	}


	//function to get column count
	public static void ExcelColCount() {
		try {

			int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("The number of columns are "+  cellCount);
		}

		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}	

	}



	//getting values from calling function
	public static void CellString(int rowNum, int collNum) {

		try {

			String getcell=sheet.getRow(rowNum).getCell(collNum).getStringCellValue();
			System.out.println("The cell number is " +getcell);

		}

		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
	}


	//getting values from calling function
	public static void CellNumber(int rowNum, int collNum) {

		try {

			double getcell=sheet.getRow(rowNum).getCell(collNum).getNumericCellValue();
			System.out.println("The cell number is " +getcell);

		}

		catch(Exception exp) {
			exp.getMessage();
			exp.getCause();
			exp.printStackTrace();
		}
	}

}


package Utility;

public class MainClassForFormat {

	public static void main(String[] args) {
		
		String path=System.getProperty("user.dir");
		
		//Constructor for the ExcelUtilsFormat class
		//Passing the arguments
		ExcelUtilsFormat excel =new ExcelUtilsFormat(path+"/excel/data.xlsx", "Sheet1");
		excel.CellString(0, 0);
		excel.CellNumber(1, 1);
		excel.ExcelRowCount();
		excel.ExcelColCount();

	}

}

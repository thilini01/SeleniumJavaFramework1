package ExcelTrying;

public class TestNG_ExcelDataProvider {
	
	public static void main(String[] args) {
		
	
		String path = System.getProperty("user.dir");
		String excelPath = (path +"/excel/tryData.xlsx");
		TestData(excelPath, "Sheet1");
	}

	//creating a function for ExcelTestNG_1 class
	public static void TestData(String excelPath, String worksheet)  {

		//creating an object for ExcelTestNG_1 class
		ExcelTestNG_1 excel =new ExcelTestNG_1(excelPath,worksheet);
		
		//Store these values into integer -since  we are changing it to int we need to change function return type 
		int rowCount= excel.NumberOfRowCount();
		int columnCount= excel.NumberOfColomnCount();
		
		//run a loop to get all the data into an array
		
		for(int i=1; i<rowCount ;i++){
			for(int j=0; j<columnCount ; j++){
			
				String cellValue = excel.CellStingDAta(i, j);
				System.out.println("This is cell data "+cellValue);
			
			}
		}
	}
}
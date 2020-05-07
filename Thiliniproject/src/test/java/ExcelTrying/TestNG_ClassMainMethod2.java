package ExcelTrying;

public class TestNG_ClassMainMethod2 {
	
	public static void main(String[] args) {
		
		String excelPath =System.getProperty("user.dir");
		ExcelTestNG_1 newOb =new ExcelTestNG_1(excelPath +"/excel/tryData.xlsx", "Sheet1");
		newOb.NumberOfRowCount();
		newOb.CellNumericData(1, 1);
		newOb.CellStingDAta(1, 0);
		newOb.NumberOfColomnCount();
		
			
	}

}

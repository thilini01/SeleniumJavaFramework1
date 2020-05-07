package ExcelTrying;

public class ClassMainMethod {
	
	public static void main(String[] args) {
		
		String excelPath =System.getProperty("user.dir");
		ExcelHardCode_2_Simplyfy newOb =new ExcelHardCode_2_Simplyfy(excelPath +"/excel/tryData.xlsx", "Sheet1");
		newOb.NumberOfRowCount();
		newOb.CellNumericData(1, 1);
		newOb.CellStingDAta(1, 0);
			
	}

}

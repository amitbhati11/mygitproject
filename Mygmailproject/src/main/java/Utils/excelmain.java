package Utils;

public class excelmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		constructorexlutils excel=new constructorexlutils("C:/Users/Admin_SRV/Workspace1/Selenium_MVN/excel/data.xlsx","Sheet1");
	
		excel.elutl();
		
		excel.cell(1, 0);
		
		excel.cellnumeric(1, 1);
		
	}

}

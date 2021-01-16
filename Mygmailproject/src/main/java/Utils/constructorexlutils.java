package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class constructorexlutils {

	static XSSFWorkbook xfw;
	static XSSFSheet seet;
	
	public  constructorexlutils(String excelpath, String SheetName){
		try
		{	
		xfw=new XSSFWorkbook( excelpath);
		seet=xfw.getSheet(SheetName);
		}catch(Exception e){
			e.printStackTrace();
		}
			
		
	//	xfw=new XSSFWorkbook( "C:/Users/Admin_SRV/Workspace1/Selenium_MVN/excel/data.xlsx");
	//	seet=xfw.getSheet("Sheet1");
		
	}
	public static void main(String []xyz){

  elutl();
  
//  cell();
  
//  cellnumeric();
  
		 cell(1,0);
		 
		 cellnumeric (1,1);
		   
	}

	public static void elutl(){

		try
		{
			//	String projectpath=	System.getProperty("user.dir");
			
			int rowcount=seet.getPhysicalNumberOfRows();
			System.out.println("no of col: "+rowcount); 

		}catch(Exception e){	
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}

	}
	/*public static void cell(){
		try{
			xfw=new XSSFWorkbook( "C:/Users/Admin_SRV/Workspace1/Selenium_MVN/excel/data.xlsx");
			seet=xfw.getSheet("Sheet1");
			String celldata= seet.getRow(1).getCell(0).getStringCellValue();

			System.out.println(celldata);
		}
		catch(Exception e){
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	} 
	
	public static void cellnumeric(){
		try{
			xfw=new XSSFWorkbook( "C:/Users/Admin_SRV/Workspace1/Selenium_MVN/excel/data.xlsx");
			seet=xfw.getSheet("Sheet1");
			double numcelldata= seet.getRow(1).getCell(1).getNumericCellValue();

			System.out.println(numcelldata);
		}
		catch(Exception e){
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	} */
	public static void cell(int rowNum, int colNum){
		try{


			String celldata= seet.getRow(rowNum).getCell(colNum).getStringCellValue();

			System.out.println(celldata);
		}
		catch(Exception e){
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	} 
	
	public static void cellnumeric(int rowNum, int colNum){
		try{


			double numcelldata= seet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println(numcelldata);
		}
		catch(Exception e){
			e.getMessage();
			e.getCause();
			e.printStackTrace();
		}
	} 
}

 


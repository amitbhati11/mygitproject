package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exlfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		read();


	}

	public static void read(){

		try{


			XSSFWorkbook book=new XSSFWorkbook("C:/Users/Admin_SRV/Workspace1/Selenium_MVN/excel/data.xlsx");

			XSSFSheet seet=book.getSheet("Sheet1");

			double readcell=seet.getRow(1).getCell(1).getNumericCellValue();
			//for print te cell value in xl
			System.out.print(readcell);
		}catch(IOException e){
			e.printStackTrace();
		}

	}
}

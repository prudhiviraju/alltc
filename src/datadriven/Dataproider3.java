package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dataproider3 {

	
	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Users\\Admin\\Desktop\\Selenium\\Workspace\\testcases\\src\\data\\Datadriven.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheet("Sheet1");
		for(int rowindex =sheet.getFirstRowNum();rowindex<sheet.getLastRowNum();rowindex++) {
		XSSFRow row = sheet.getRow(rowindex);
		
		
		for(int colindex = row.getFirstCellNum();colindex<row.getLastCellNum();colindex++) {
			

			XSSFCell cell=sheet.getRow(rowindex).getCell(colindex);
			System.out.println(cell +"\t");
		}
		System.out.println();
		}	
		}
	
	
	
	
	
}

package readExcelDataLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelConfig(String excelpath )
	
	{
        File scr = new File(excelpath);
		
		try {
			FileInputStream fis = new FileInputStream(scr);
			
			 wb = new XSSFWorkbook(fis);
			
			 
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
	}
	
	public String getdata (int sheetnumber, int rowno,int colno )
	{
		sheet1 = wb.getSheetAt(sheetnumber);
		
		String data =sheet1.getRow(rowno).getCell(colno).getStringCellValue();
		
		return data;
	}
	
	

}

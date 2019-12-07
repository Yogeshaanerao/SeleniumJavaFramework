package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFile2 {
	@Test
	public void Fileread() throws Exception
	{
		File scr = new File("D:\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(scr);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		int rowcount =sheet1.getLastRowNum();
		
		System.out.println("Total Row ="+(rowcount+1));
		
		for (int i = 0; i < rowcount+1; i++) {
			
		 String data0 =	sheet1.getRow(i).getCell(0).getStringCellValue();
		 
		 System.out.println("Test data from Excel is ="+data0);
			
		}
		
		wb.close();
		
	}

}

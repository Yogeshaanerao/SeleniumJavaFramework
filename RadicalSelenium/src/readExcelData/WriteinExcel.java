package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteinExcel {
	@Test
	public void write() throws Exception
	{
		
        File scr = new File("D:\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(scr);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Pass");
		
		FileOutputStream fout = new FileOutputStream(scr);
		
		wb.write(fout);
		wb.close();
		
	}

}

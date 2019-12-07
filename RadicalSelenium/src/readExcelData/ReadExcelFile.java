package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFile {
	@Test
	public void Fileread() throws Exception
	{
		File scr = new File("D:\\ExcelData\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(scr);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data0 );
		
        String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(data1 );
		
		wb.close();
		
	}

}

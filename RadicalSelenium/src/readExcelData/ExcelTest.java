package readExcelData;

import org.testng.annotations.Test;

import readExcelDataLib.ExcelConfig;

public class ExcelTest {
	
	@Test
	public void FileTest(){
		
		ExcelConfig excel= new ExcelConfig("D:\\ExcelData\\TestData.xlsx");
		
		System.out.println(excel.getdata(1, 0, 1));
		
	}

}

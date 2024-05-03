package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelreader {

	public static void main(String[] args) throws IOException {
		 
		FileInputStream f = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\seleniumreader.xlsx");
		
		XSSFWorkbook  w = new XSSFWorkbook(f);
	//	XSSFSheet s = w.getSheetAt(0);
		XSSFSheet s = w.getSheet("Sheet1");
		String a = s.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(a);
		
		WebDriver driver = new ChromeDriver();
		driver.get(a);
		
	}

}

package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelreader2 {

	public static void main(String[] args) throws IOException {
		 
		FileInputStream f = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\rajesh.xlsx");
		
		XSSFWorkbook  w = new XSSFWorkbook(f);
	//	XSSFSheet s = w.getSheetAt(0);
		XSSFSheet s = w.getSheetAt(0);
		
		XSSFRow row = s.createRow(0);
		XSSFCell cel = row.createCell(0);
		
 		cel.setCellValue("Excelreader.java");
 		
 		FileOutputStream fi = new FileOutputStream("C:\\Users\\LENOVO\\OneDrive\\Documents\\rajesh.xlsx")	;
 		w.write(fi);
		
	}

}

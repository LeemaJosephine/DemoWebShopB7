package utils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

	public static WebDriver driver = new ChromeDriver();
	public static Properties prop;
	public static String filepath;
	
	public void browser(String url) {
		
		//driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void browserclose() {
		
		driver.close();
	}
	
	public static String getCellData(String filepath, String sheetName, int rowNum, int colNum) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook(filepath);
		XSSFSheet sheet = book.getSheet(sheetName);
		XSSFCell cell = sheet.getRow(rowNum).getCell(colNum);
		String data = cell.toString();
		return data;
		
	}
	
	public static void readFromPropFile(String filepath) throws IOException {
		
		FileReader file = new FileReader(filepath);
		prop = new Properties();
		prop.load(file);
	}
	
}

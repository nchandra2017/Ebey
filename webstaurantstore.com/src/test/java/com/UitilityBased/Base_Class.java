package com.UitilityBased;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Base_Class {
	
	public static Properties property;
	public static Properties GetData;
	public static WebDriver driver;
	public Base_Class() {
		
		property = new Properties();
			try {
				FileInputStream filesss = new FileInputStream (System.getProperty("user.dir") + "\\src\\test\\java\\com\\Config\\Config.Properties");
				property.load(filesss);
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
	        
	
	GetData = new Properties();
	
	}

	 public void readXecl() throws Exception {
		 String excelPath = "C:\\Users\\Nikhil Chandra\\git\\nikhil\\webstaurantstore.com\\Data\\UserData.xlsx";
		 String FileName = "UserData";
		 String sheetName = "UserID&Pass";
		 
		 
		 File file = new File (excelPath);
		 
		 FileInputStream getData = new FileInputStream(file);
		 XSSFWorkbook WBName = new XSSFWorkbook(getData);
		 XSSFSheet Sheets = WBName.getSheet(sheetName);
	 }
	 


		public void DeffBrowser() {
			
			String BrowserName = property.getProperty("Browser01");
			
			if(BrowserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			    
			}
			else if(BrowserName.equalsIgnoreCase("edge"));
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");
		  //  driver = new EdgeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestData.pageLoadTimeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestData.pageLoadTimeout, TimeUnit.SECONDS);

}
		
		public static void launchURL(String URL) {
			
			driver.get(property.getProperty("url11")); 
			
		    }
		
}

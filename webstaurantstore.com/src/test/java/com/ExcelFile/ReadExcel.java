package com.ExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.UitilityBased.Base_Class;

public class ReadExcel {
	public static Properties GetData;
	public ReadExcel() {
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
	 

}

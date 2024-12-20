package com.framework.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData(String workbook,String sheetName ){
		String [][] data =null;
		try {
			FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+workbook);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColoumns = sh.getRow(0).getPhysicalNumberOfCells();
			
			data = new String[totalRows-1][totalColoumns];
			
			for(int r=1;r<totalRows ; r++) {
				for(int c=0; c<totalColoumns; c++) {
					data[r-1][c] =sh.getRow(r).getCell(c).getStringCellValue();
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	private static XSSFWorkbook XSSFWorkbook(FileInputStream fis) {
		// TODO Auto-generated method stub
		return null;
	}
	public static List<Map<String, String>> readExcelData(String workbook, String sheetName){
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\"+workbook);
			XSSFWorkbook wb =new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColoumns = sh.getRow(0).getPhysicalNumberOfCells();
			
				
			for(int r=1;r<totalRows ; r++) {
				Map<String,String> rowData = new HashMap<String, String>();
				for(int c=0; c<totalColoumns; c++) {
					String key = sh.getRow(0).getCell(0).getStringCellValue();
					String value = sh.getRow(r).getCell(c).getStringCellValue();
					rowData.put(key, value);
				}
				data.add(rowData);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		return data;
	}
}

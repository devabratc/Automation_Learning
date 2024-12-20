package com.framework.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	public static Properties readData(String fileName){
		Properties prop = new Properties();
		//FileInputStream fis;
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\config\\"+fileName);
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
		
		}

}

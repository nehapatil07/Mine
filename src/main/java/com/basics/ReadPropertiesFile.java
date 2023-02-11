package com.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertiesFile {

	
	public static String readData(String key) {
		Properties prop = null;
		try {
			FileInputStream fis=new FileInputStream("E:\\MyWorkspace\\SeleniumStuff\\src\\main\\java\\com\\properties\\MyData.properties");
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
		
	}
	
	
	public static void main(String[] args) {
		String str=readData("brname");
		System.out.println(str);
	}
}

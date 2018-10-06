package com.qa.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
	
	 FileInputStream fis=null;
	 Properties prop = null;
	
	public PropReader() {
		
			File reader= new File("C:\\Users\\sony\\eclipse-workspace\\practise01\\src\\main\\java\\com\\qa\\properties\\config.properties");
			
			 try {
				fis=new FileInputStream(reader);
			} catch (FileNotFoundException e) {
				//Handling file not found exception
				e.printStackTrace();
			}
			
			 prop=new Properties();
			
			try {
				prop.load(fis);
			} catch (IOException e) {
				// Handling loading error
				e.printStackTrace();
			}
		
	}

	public String getKey(String key) {
		String value=prop.getProperty(key);
		if(value==null) {
			value="wrong key passed";
			return	value;	
		}else
		return value;
		}
}

	
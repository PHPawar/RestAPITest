package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	FileInputStream fis;
	public Properties prop;
	public TestBase() 
	{
		File src = new File ("C:/Users/Prashant/RestAPIWS/RestAPI/src/main/java/com/qa/config/config.properties");
		
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

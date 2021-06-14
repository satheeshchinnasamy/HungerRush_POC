package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties prop;
	
	public Properties init_properties() {
		prop=new Properties();
		
		try {
			FileInputStream inputStream=new FileInputStream("C:\\Users\\Satheesh Chinnasamy\\eclipse-workspace\\HungerRush_POM_BDD\\src\\main\\resources\\config.properties");
			prop.load(inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop;
	}
	

}

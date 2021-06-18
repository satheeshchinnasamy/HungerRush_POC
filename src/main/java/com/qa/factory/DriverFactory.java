package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;
	//public static ThreadLocal<WebDriver> tlDriver =new ThreadLocal<>();
	
	public static WebDriver init_driver() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		
		if(driver==null) {
			driver=init_driver();
			}
		return driver;
		
	}
	
}

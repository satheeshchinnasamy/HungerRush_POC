package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

	private WebDriver driver;
	private By username=By.id("UserName");
	private By password=By.id("Password");
	private By loginbtn=By.id("newLogonButton");
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginbtn).click();
	}

	public void LoginHUB(String uname, String pwd) {
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginbtn).click();
	}

}

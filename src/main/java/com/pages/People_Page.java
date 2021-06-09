package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class People_Page {

	private WebDriver driver;
	private By summary=By.xpath("//h5[normalize-space()='Summary']");
	private By trimclock=By.xpath("//div[@id='main-content']//h2[contains(text(),'Weekly Time Clock Review')]");
	
	
	
	public People_Page(WebDriver driver) {
		this.driver=driver;
	}

	public void selectSummary() {
		driver.findElement(summary).click();
	}


	public String gettextf() {
		String text=driver.findElement(trimclock).getText();
		return null;

	}
}
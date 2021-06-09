package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Communicate_Page {

	private WebDriver driver;
	private By documents=By.xpath("//h5[normalize-space()='Documents']");
	private By doc_content=By.xpath("//*[@id='MainRightContent']//following::h1[contains(text(),'Documents')]");
	
	
	public  Communicate_Page(WebDriver driver) {
		this.driver=driver;
	}


	public void selectDocumnets() {
		driver.findElement(documents).click();
	}
	
	public String gettextf() {
		String text=driver.findElement(doc_content).getText();
		return null;
	}
}

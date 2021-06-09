package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reports_Page {

	private WebDriver driver;
	private By sales=By.id("id_8");
	private By singlestore=By.xpath("//li[@data-displayname='Daily Performance - Single Store']");
	private By from_date=By.id("from");
	private By to_Date=By.id("to");
	private By storelist=By.id("storesDD");
	private By viewbutton=By.id("btnview");
	private By reportsoption=By.id("rptSection1Hdr");
	
	
	public Reports_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public void SelecetSales() throws InterruptedException {
		driver.findElement(sales).click();
		Thread.sleep(5000);
		
	}

	public void SingleStore() {
		driver.findElement(singlestore).click();
	}

	public void enterDateViewReport(String fdate, String tdate) throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElement(from_date).clear();
		driver.findElement(from_date).sendKeys(fdate);
		driver.findElement(to_Date).clear();
		driver.findElement(to_Date).sendKeys(tdate);
		//driver.findElement(storelist).click();
		Thread.sleep(3000);
		
		driver.findElement(viewbutton).click();
	}
	
	public void viewreport() {
		driver.findElement(viewbutton).click();
	}

	

	public String gettextf() {
		String text=driver.findElement(reportsoption).getText();
		return null;
	}
}

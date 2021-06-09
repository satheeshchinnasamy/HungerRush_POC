package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	private WebDriver driver;
	
	private By dashboard=By.id("dashAnchor");
	private By reports=By.id("rptAnchor");
	private By manage=By.id("manageAnchor");
	private By people=By.id("peopleAnchor");
	private By communicate=By.id("communicateAnchor");
	private By inventory=By.id("invAnchor");
	private By sitedesigner=By.id("lySBAnchor");
	private By display=By.id("displayAnchor");
	private By hungerRush=By.id("sysOnlyAnchor");
	
	public Home_Page(WebDriver driver) {
		this.driver=driver;
	}

	
	public void reportpage() { 
		  driver.findElement(reports).click(); 
	  }
	public void managepage() { 
		  driver.findElement(manage).click(); 
	} 
	public void peoplepage(){ 
		  driver.findElement(people).click(); 
	} 
	public void communicatepage() {
	  driver.findElement(communicate).click(); 
	  } 
	public void inventorypage() {
	  driver.findElement(inventory).click(); 
	  } 
	public void designerpage() {
	  driver.findElement(sitedesigner).click(); 
	  } 
    public void displaypage() {
	  driver.findElement(display).click(); 
	  } 
	public void hungerpage() {
	  driver.findElement(hungerRush).click(); 
	  }
	 
	 public void getPageElement() {
		 WebElement reportpage=driver.findElement(reports);
		 WebElement managepage=driver.findElement(manage);
		 WebElement peoplepage=driver.findElement(people);
		 WebElement communicatepage=driver.findElement(communicate);
		 WebElement inventorypage=driver.findElement(inventory);
		 WebElement displaypage=driver.findElement(display);
		 WebElement hungerRushpage=driver.findElement(hungerRush);
		 WebElement sitedesingnerpage=driver.findElement(sitedesigner);
	 }

	 public void gotoPage(WebElement pagename) {
		
		 pagename.click();
	 }
}

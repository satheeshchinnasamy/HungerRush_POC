package appHooks;

import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	// private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader confireader;
	Properties prop;

	
	  @Before(order = 0) 
	  public void getProperty() { 
		  confireader = new ConfigReader(); 
		  prop = confireader.init_properties(); 
		  }
	  
	  @Before(order = 1) 
	  public void launchBrowser() {
	  
	  String browsername = prop.getProperty("browser"); 
	  // driverFactory=new DriverFactory(); 
	  driver = DriverFactory.init_driver(); 
	  }
	 

	
	/*
	 * @BeforeClass public void launchBrowser() {
	 * 
	 * confireader=new ConfigReader(); prop=confireader.init_properties(); String
	 * browsername=prop.getProperty("browser"); //driverFactory=new DriverFactory();
	 * driver=DriverFactory.init_driver(); }
	 */
	 

	@After(order=0)
	public void quitbrowser() {

		driver.quit();
	}

	@After(order=1)
	public void TearDown(Scenario scenario) {

		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll("", "_");
			System.out.println("Going to take the screenshot");
			byte[] source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			System.out.println("The screenshot was captured");
			scenario.attach(source, "image/png", screenshotName);
		}

	}

}

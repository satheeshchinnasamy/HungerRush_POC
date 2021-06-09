package stepDefinitions;

import com.pages.Login_Page;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HungerRushWorkFlowSteps {
	
	private Login_Page loginpage=new Login_Page(DriverFactory.getDriver());
	public ConfigReader config;


	@Given("user is in Login page")
	public void user_is_in_login_page() {
		config=new ConfigReader();
		   DriverFactory.getDriver().get(config.init_properties().getProperty("url")); 
	}

	@When("user enters the valid username")
	public void user_enters_the_valid_username() {
		config=new ConfigReader();
		loginpage.enterUserName(config.init_properties().getProperty("username"));
	}
	@And("user enter the valid password")
	public void user_enter_the_valid_password() {
		config=new ConfigReader();
		   loginpage.enterPassword(config.init_properties().getProperty("password"));
	}
	@And("user clicks the loginbtn")
	public void user_clicks_the_loginbtn() {
		loginpage.clickLoginBtn();
	}
	@Then("user should be in the home page")
	public void user_should_be_in_the_home_page() {
		String title=DriverFactory.getDriver().getTitle();
		Assert.assertEquals("HungerRush HUB | Dashboard", title); 
	}


}
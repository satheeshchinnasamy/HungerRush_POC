package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.pages.Home_Page;
import com.pages.Login_Page;
import com.pages.Reports_Page;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ReportValidationSteps {

	private Login_Page loginpage=new Login_Page(DriverFactory.getDriver());
	private Reports_Page reports=new Reports_Page(DriverFactory.getDriver());
	private Home_Page homepa=new Home_Page(DriverFactory.getDriver());
	
	
	@Given("user already in Home page")
	public void user_already_in_home_page(DataTable dataTable) throws InterruptedException {
	  
		List<Map<String, String>> credlist=dataTable.asMaps();
		String uname=credlist.get(0).get("username");
		String passwd=credlist.get(0).get("password");
		DriverFactory.getDriver().get("http://enterprise.hunger-rush.com/");
		loginpage.LoginHUB(uname, passwd);
		Thread.sleep(5000);
	}

	@Given("user is in report page")
	public void user_is_in_report_page() {
	    homepa.reportpage();
	}

	@Then("Verify the page title is {string}")
	public void verify_the_page_title_is(String string) {
		String title=DriverFactory.getDriver().getTitle();
		Assert.assertEquals("HungerRush HUB | Reports", title);
	}

	@When("User selects the Sales option in the list")
	public void user_selects_the_sales_option_in_the_list() throws InterruptedException {
	    reports.SelecetSales();
	}

	@And("User selects the Daily performance-single store")
	public void user_selects_the_daily_performance_single_store() throws InterruptedException {
	    
		reports.SingleStore();
	}

	@And("Enter the from and to date and click the view report")
	public void enter_the_from_and_to_date_and_click_the_view_report() throws InterruptedException {
	    reports.enterDateViewReport("Jan 01 2021", "Mar 31 2021");
	}

	@Then("report should be displayed")
	public void report_should_be_displayed() {
		String textt=reports.gettextf();
		Assert.assertEquals("Report Options",textt );
	}



}

package stepdefs;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.config.UserConfig;
import com.big.automation.selenium_webdriver.common.config.UserFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CCLoginSteps extends BaseTest {

	

	@Given("^I access ClaimCenter login page$")
	public void i_access_claimcenter_login_page() throws Throwable {

		// TST
		// driver.get("http://10.14.67.173:8080/cc/ClaimCenter.do");
		// DEV
		driver.get("http://10.14.67.209:8080/cc/ClaimCenter.do");
		
		// make sure there is no left over alert
		try {
			   
        	driver.switchTo().alert().accept();
        	System.out.println("login step - alert has been cleared");
        
     	   }
     	   catch(NoAlertPresentException e) {
     		   System.out.print("login step - No alert is present");
     	   }

	}

	
	@When("^I login to ClaimCenter as role \"([^\"]*)\"$")
	public void i_login_to_ClaimCenter_as_role(String role) throws Throwable {
	    UserConfig user = UserFactory.getUserConfig(role);
	    loginPOM.populateUsername(user.username);
		loginPOM.populatePassword(user.password);
		loginPOM.next();
	}
	
	@Given("^I login to ClaimCenter as \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_login_to_ClaimCenter_as_with(String user, String password) throws Throwable {
		loginPOM.populateUsername(user);
		loginPOM.populatePassword(password);
		loginPOM.next();
	}

	@Then("^an error message \"([^\"]*)\" will be shown$")
	public void an_error_message_will_be_shown(String message) throws Throwable {
		Assert.assertEquals(loginPOM.getErrorMessageValue(), message);
	}

	@Then("^I will be logged on to ClaimsCenter desktop$")
	public void i_will_be_logged_on_to_ClaimsCenter_desktop() throws Throwable {
		Assert.assertTrue(loginPOM.isLoggedOn());

	}

}
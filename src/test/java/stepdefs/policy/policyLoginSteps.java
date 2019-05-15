package stepdefs.policy;

import org.openqa.selenium.NoAlertPresentException;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.PropertyManager;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;

public class policyLoginSteps extends BaseTest {

	
	@Given("^I access PolicyCenter login page$")
	public void i_access_policycenter_login_page() throws Throwable {

		String url=null;
		
		String env = ExcelUtil.getTestDataValue("DevOrTstEnvironment");
		if (env != null)
		{
			if (env.equalsIgnoreCase("DEV"))
			{
				url=PropertyManager.getInstance().getDevPolicyURL();
			}
			else if (env.equalsIgnoreCase("TEST"))
			{
				url=PropertyManager.getInstance().getTestPolicyURL();
			}
			else if (env.equalsIgnoreCase("NONPROD"))
			{
				url=PropertyManager.getInstance().getPreProdPolicyURL();
			}
		}
		else {
			throw new Exception("cannot locate which environment to run in from excel sheet");
		}
		
		driver.get(url);
		
		// make sure there is no left over alert
		try {
			   
        	driver.switchTo().alert().accept();
        	System.out.println("login step - alert has been cleared");
        
     	   }
     	   catch(NoAlertPresentException e) {
     		   System.out.print("login step - No alert is present");
     	   }

	}

	
	
	@Given("^I login to PolicyCenter as \"([^\"]*)\" with \"([^\"]*)\"$")
	public void i_login_to_policyCenter_as_with(String user, String password) throws Throwable {
		policyCenterLoginPOM.populateUsername(user);
		policyCenterLoginPOM.populatePassword(password);
		policyCenterLoginPOM.next();
	}

	

}
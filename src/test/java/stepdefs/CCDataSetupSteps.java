package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;

public class CCDataSetupSteps extends BaseTest {

	
	@Given("^I use test data set \"([^\"]*)\"$")
	public void i_use_test_data_set(String sheetName) throws Throwable {
	    ExcelUtil.setExcelFileSheet(sheetName);
	}


}
package stepdefs;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.utilities.excelutils.ExcelUtil;

import cucumber.api.java.en.Given;

public class CCDataSetupSteps extends BaseTest {

	
	@Given("^I use test data set \"([^\"]*)\" for brand \"([^\"]*)\"$")
	public void i_use_test_data_set(String sheetName,String brand) throws Throwable {
	    ExcelUtil.setExcelFileSheet(sheetName,brand);
	}
	
	@Given("^I use test data set \"([^\"]*)\"$")
	public void i_use_test_data_set(String sheetName) throws Throwable {
		// default to ITB if no brand supplied
	    ExcelUtil.setExcelFileSheet(sheetName,ExcelUtil.BRAND_ITB);
	}


}
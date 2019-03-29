package stepdefs.common;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CCNavigatorSteps extends BaseTest {

	@Given("^I select \"([^\"]*)\" on the Claim Navigator$")
	public void i_select_on_the_Claim_Navigator(String link) throws Throwable {

		switch (link) {
		case "Loss Details":
			navigatorBarPOM.clickTopLevel("Loss Details");
			;
			break;
		case "Summary":
			navigatorBarPOM.clickTopLevel("Summary");
			;
			break;
		case "Workplan":
			navigatorBarPOM.clickTopLevel("Workplan");
			;
			break;
		case "Exposures":
			navigatorBarPOM.clickTopLevel("Exposures");
			;
			break;
		case "Parties Involved":
			navigatorBarPOM.clickTopLevel("Parties Involved");
			;
			break;
		case "Policy":
			navigatorBarPOM.clickTopLevel("Policy");
			;
			break;
		case "Financials":
			navigatorBarPOM.clickTopLevel("Financials");
			;
			break;
		case "TP Care":
			navigatorBarPOM.clickTopLevel("TP Care");
			
			break;

		// TODO the rest

		default:
			Assert.fail("unknown field :" + link + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" submenu for \"([^\"]*)\" on the Claim Navigator$")
	public void i_select_submenu_on_the_Claim_Navigator(String sublink, String toplink) throws Throwable {

		switch (toplink) {
		case "Financials":

			navigatorBarPOM.clickSubLevel("Financials", sublink);
			break;
		case "FNOL Snapshot":

			navigatorBarPOM.clickSubLevel("FNOL Snapshot", sublink);
			break;
		case "Parties Involved":

			navigatorBarPOM.clickSubLevel("Parties Involved", sublink);
			break;
		case "Summary":

			navigatorBarPOM.clickSubLevel("Summary", sublink);
			break;
		case "Loss Details":

			navigatorBarPOM.clickSubLevel("Loss Details", sublink);
			break;
		case "Policy":

			navigatorBarPOM.clickSubLevel("Policy", sublink);
			break;
		case "Plan of Action":

			navigatorBarPOM.clickSubLevel("Plan of Action", sublink);
			break;

		// TODO the rest

		default:
			Assert.fail("unknown field :" + toplink + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" on the Desktop Navigator$")
	public void i_select_on_the_Desktop_Navigator(String link) throws Throwable {

		switch (link) {
		case "Activities":
			navigatorBarPOM.clickDesktopTopLevel("Activities");
			;
			break;
		case "Claims":
			navigatorBarPOM.clickDesktopTopLevel("Claims");
			;
			break;
		case "Queues":
			navigatorBarPOM.clickDesktopTopLevel("Queues");
			;
			break;
		case "Subrogations":
			navigatorBarPOM.clickDesktopTopLevel("Subrogations");
			;
			break;
		case "Exposures":
			navigatorBarPOM.clickDesktopTopLevel("Exposures");
			;
			break;

		// TODO the rest

		default:
			Assert.fail("unknown field :" + link + " - check cucumber script!");
		}
	}

	@Given("^I select \"([^\"]*)\" on the Administration Navigator$")
	public void i_select_on_the_Administration_Navigator(String link) throws Throwable {

		switch (link) {
		case "Reference Data":
			navigatorBarPOM.clickAdministrationTopLevel("Effective Dated Reference Data");
			;
			break;

		// TODO the rest

		default:
			Assert.fail("unknown field :" + link + " - check cucumber script!");
		}
	}
	
	@Given("^I select \"([^\"]*)\" on the Search Navigator$")
	public void i_select_on_the_Search_Navigator(String link) throws Throwable {

		switch (link) {
		case "Claims":
			navigatorBarPOM.clickDesktopTopLevel("Claims");
			;
			break;
		case "Activities":
			navigatorBarPOM.clickDesktopTopLevel("Activities");
			;
			break;
		case "Cheques":
			navigatorBarPOM.clickDesktopTopLevel("Cheques");
			;
			break;
		case "Recoveries":
			navigatorBarPOM.clickDesktopTopLevel("Recoveries");
			;
			break;
		case "Bulk Invoices":
			navigatorBarPOM.clickDesktopTopLevel("Bulk Invoices");
			;
			break;

		

		default:
			Assert.fail("unknown field :" + link + " - check cucumber script!");
		}
	}

	@When("^I select the Actions Popup Menu Hierarchy \"([^\"]*)\"$")
	public void i_select_the_Actiuons_Popup_Menu_Hierarchy(String menulist) throws Throwable {
		String[] items = menulist.split(",");
		List<String> list = Arrays.asList(items);
		navigatorBarPOM.selectActionsSubMenuHierarchy(list);
	}
	
	@When("^I select the Desktop Actions Popup Menu Hierarchy \"([^\"]*)\"$")
	public void i_select_the_desktopActiuons_Popup_Menu_Hierarchy(String menulist) throws Throwable {
		String[] items = menulist.split(",");
		List<String> list = Arrays.asList(items);
		navigatorBarPOM.selectDesktopActionsSubMenuHierarchy(list);
	}
	@When("^I select the Account Actions Popup Menu Hierarchy \"([^\"]*)\"$")
	public void i_select_the_accountActiuons_Popup_Menu_Hierarchy(String menulist) throws Throwable {
		String[] items = menulist.split(",");
		List<String> list = Arrays.asList(items);
		navigatorBarPOM.selectAccountActionsSubMenuHierarchy(list);
	}

}
package stepdefs;

import java.util.Arrays;
import java.util.List;

import org.testng.asserts.SoftAssert;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CCMenuBarSTeps extends BaseTest {

	
	
	
	@Given("^I Select New Claim$")
	public void selectNewClaimsMenuItem() {

		menuBarPOM.selectNewClaimMenuItem();
	}

	
	
	@Given("^I select Search,Claims,Simple$")
	public void selectSearchClaimsSimpleMenuItem() {

		menuBarPOM.selectSearchClaimSimpleMenuItem();
	}

	

	@Then("^I will log off$")
	public void i_will_log_off() throws Throwable {
		menuBarPOM.logout();
	}

	@Then("^I will see \"([^\"]*)\" relevant to my \"([^\"]*)\"$")
	public void i_will_see_menus_relevant_to_my_role(String menulist, String role) throws Throwable {

		SoftAssert softAssert = new SoftAssert();

		String[] items = menulist.split(",");
		List<String> list = Arrays.asList(items);

		// loop round list to check menu options is on the page
		for (int i = 0; i < list.size(); i++) {
			softAssert.assertTrue(menuBarPOM.menuOnMenuBar(list.get(i)),
					"For role: " + role + " Menu item Check: " + list.get(i));

		}

		softAssert.assertAll();

	}

	@Then("^I will not see \"([^\"]*)\" which are not relevant to my \"([^\"]*)\"$")
	public void i_will_not_see_which_are_not_relevant_to_my(String menulist, String role) throws Throwable {
		SoftAssert softAssert = new SoftAssert();

		String[] items = menulist.split(",");
		List<String> list = Arrays.asList(items);

		// loop round list to check menu options is on the page - dont check for empty
		// entries
		for (int i = 0; i < list.size(); i++) {

			if (!list.get(i).isEmpty()) {
				softAssert.assertTrue(menuBarPOM.menuNotOnMenuBar(list.get(i)),
						"For role: " + role + " Menu item Check: " + list.get(i));
			}

		}

		softAssert.assertAll();
	}
	

@Then("^I can select top level menus \"([^\"]*)\"$")
public void i_can_select_top_level_menus(String menulist) throws Throwable {
	

	String[] items = menulist.split(",");
	List<String> list = Arrays.asList(items);

	// loop round list to check menu options are selectable - dont check for empty
	// entries
	for (int i = 0; i < list.size(); i++) {

		if (!list.get(i).isEmpty()) {
			System.out.println("click "+list.get(i));
			menuBarPOM.clickTopMenu(list.get(i));
		}

	}

	
}

@Then("^I can select top level menu \"([^\"]*)\"$")
public void i_can_select_top_level_menu(String menu) throws Throwable {
	menuBarPOM.clickTopMenu(menu);
}

@Then("^I can select sub level menus \"([^\"]*)\" for menu \"([^\"]*)\"$")
public void i_can_select_sub_level_menus_for_menu(String subMenulist, String menu) throws Throwable {

	String[] subMenus = subMenulist.split(",");
	List<String> list = Arrays.asList(subMenus);

	// loop round list to check sub menu options are selectable - dont check for empty
	// entries
	for (int i = 0; i < list.size(); i++) {

		if (!list.get(i).isEmpty()) {
			System.out.println("click submenu "+list.get(i) +" for menu: "+menu);
			menuBarPOM.clickSubMenu(menu, list.get(i));
		}

	}
}


}
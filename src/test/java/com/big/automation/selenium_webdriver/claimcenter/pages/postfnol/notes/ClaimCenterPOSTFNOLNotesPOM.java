package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.notes;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNotesPOM extends BaseTest{


	@FindBy(id = "ClaimNotes:NotesSearchScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search")
	private WebElement searchButton;
	



	public String getName() {

		return "POST FNOL Notes";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		
		logger.info(format("%s -found page title for page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().contains(expected); // use contains
	}
	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	public void search() {

		logger.info(format("%s -  going to click search", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getSearchButton());
		
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getSearchButton() {
		return searchButton;
	}
	
	
	


}
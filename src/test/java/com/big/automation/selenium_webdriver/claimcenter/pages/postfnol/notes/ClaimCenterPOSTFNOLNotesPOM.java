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

	@FindBy(xpath = "//div[@class = 'message'][text() = 'The search returned zero results.']")
	private WebElement searchReturnedZeroResultsError;

	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:TextSearch-inputEl")
	private WebElement findTextInput;

	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:Author-trigger-picker")
	private WebElement authorDropdown;

	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:RelatedToSearch-trigger-picker")
	private WebElement relatedToDropdown;

	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:Topic-trigger-picker")
	private WebElement topicDropdown;

	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:DateSearch2:DateSearch2RangeValue-trigger-picker")
	private WebElement dateRangeDropdown;

	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:DateSearch2:DateSearch2DirectChoice_Choice-inputEl")
	private WebElement dateRangeFromToRadio;

	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:DateSearch2:DateSearch2DirectChoice_Choice-inputEl")
	private WebElement languageDropdown;

	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:SortByOption-trigger-picker")
	private WebElement sortByDropdown;
	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:SortAscending_true-inputEl")
	private WebElement sortByAscendingRadio;
	@FindBy(id = "ClaimNotes:NotesSearchScreen:NoteSearchDV:SortAscending_false-inputEl")
	private WebElement sortByDescendingRadio;

	@FindBy(id = "x-form-el-ClaimNotes:NotesSearchScreen:ClaimNotesLV:0:Body")
	private WebElement noteResultDetailsText;


	



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

	public String concatenateDocTypeAndDocSubType(String docType, String docSubType){
		String concatenated = docType + " - " + docSubType;
		return concatenated;
	}

	public void setFindTextInput(String input){
		GuideWireAccessors.setGWTextBox(driver,input,getFindTextInput());
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSearchReturnedZeroResultsError() {
		return searchReturnedZeroResultsError;
	}

	public WebElement getFindTextInput() {
		return findTextInput;
	}

	public WebElement getAuthorDropdown() {
		return authorDropdown;
	}

	public WebElement getRelatedToDropdown() {
		return relatedToDropdown;
	}

	public WebElement getTopicDropdown() {
		return topicDropdown;
	}

	public WebElement getDateRangeDropdown() {
		return dateRangeDropdown;
	}

	public WebElement getDateRangeFromToRadio() {
		return dateRangeFromToRadio;
	}

	public WebElement getLanguageDropdown() {
		return languageDropdown;
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public WebElement getSortByAscendingRadio() {
		return sortByAscendingRadio;
	}

	public WebElement getSortByDescendingRadio() {
		return sortByDescendingRadio;
	}

	public WebElement getNoteResultDetailsText() {
		return noteResultDetailsText;
	}


}
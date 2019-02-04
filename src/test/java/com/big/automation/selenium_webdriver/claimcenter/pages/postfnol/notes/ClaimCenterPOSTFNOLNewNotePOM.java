package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.notes;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewNotePOM extends BaseTest{


	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:Update")
	private WebElement updateButton;
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:Canceln")
	private WebElement cancelButton;
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:NewNoteWorksheet_UseTemplateButton")
	private WebElement useTemplateButton;	
	
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:NoteDetailDV:Topic-inputEl")
	private WebElement topicDropdown;
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:NoteDetailDV:SecurityType-inputEl")
	private WebElement securityTypeDropdown;
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:NoteDetailDV:Subject-inputEl")
	private WebElement subject;
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:NoteDetailDV:RelatedTo-inputEl")
	private WebElement relatedToDropdown;
	
	
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:NoteDetailDV:Confidential_true-inputEl")
	private WebElement confidentialYesRadio;
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:NoteDetailDV:Confidential_false-inputEl")
	private WebElement confidentialNoRadio;
	
	@FindBy(id = "NewNoteWorksheet:NewNoteScreen:NoteDetailDV:Body-inputEl")
	private WebElement noteText;
	
	//TODO all the template stuff

	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "POST FNOL New Note";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		
		logger.info(format("%s -found page title for page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().contains(expected); // use contains
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	
	public void update() {
		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getUpdateButton());
		
	}
	
	public void selectTopic(String option)
	{
		logger.info(format("%s - going to select topic:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getTopicDropdown(), 1);
	}
	public void selectSecurityType(String option)
	{
		logger.info(format("%s - going to select secrutiy type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getSecurityTypeDropdown(), 1);
	}
	public void setSubject(String text)
	{
		logger.info(format("%s -  going to set description", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getSubject());
	}
	public void selectRelatedTo(String option)
	{
		logger.info(format("%s - going to select related to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getRelatedToDropdown(), 1);
	}
	
	
	public void selectConfidential(boolean confidential)
	{
		logger.info(format("%s -  going to set external owned to:"+confidential, getName()));
	    if (confidential)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getConfidentialYesRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getConfidentialNoRadio());
	    }
	
		
	}
	
	public void setNoteText(String text)
	{
		logger.info(format("%s -  going to set note text", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNoteText());
	}
   
	

	
	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getUseTemplateButton() {
		return useTemplateButton;
	}

	private WebElement getTopicDropdown() {
		return topicDropdown;
	}

	private WebElement getSecurityTypeDropdown() {
		return securityTypeDropdown;
	}

	private WebElement getSubject() {
		return subject;
	}

	private WebElement getRelatedToDropdown() {
		return relatedToDropdown;
	}

	private WebElement getConfidentialYesRadio() {
		return confidentialYesRadio;
	}

	private WebElement getConfidentialNoRadio() {
		return confidentialNoRadio;
	}

	private WebElement getNoteText() {
		return noteText;
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	


}
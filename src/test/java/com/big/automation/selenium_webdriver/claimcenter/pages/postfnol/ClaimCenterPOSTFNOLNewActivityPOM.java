package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewActivityPOM extends BaseTest{


	@FindBy(id = "NewActivity:NewActivityScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivity_UpdateButton")
	private WebElement updateButton;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivity_CancelButton")
	private WebElement cancelButton;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivity_AddDocumentButton")
	private WebElement linkDocumentButton;	
		


	
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_Subject-inputEl")
	private WebElement subject;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_Description-inputEl")
	private WebElement description;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_RelatedTo-inputEl")
	private WebElement relatedToDropdown;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_DueDate-inputEl")
	private WebElement dueDate;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_Priority-inputEl")
	private WebElement priorityDropdown;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_Importance-inputEl")
	private WebElement calendarImportanceDropdown;
	
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_ExternallyOwned_true-inputEl")
	private WebElement externalOwnedYesRadio;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_ExternallyOwned_false-boxLabelEl")
	private WebElement externalOwnedNoRadio;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_ExternalOwner-inputEl")
	private WebElement externalOwnerDropdown;
	
	// TODO document template fields
	
	
	
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_AssignActivity-inputEl")
	private WebElement assignToDropdown;
	
	
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "POST FNOL New Activity";
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
	
	public void setDescription(String text)
	{
		logger.info(format("%s -  going to set description", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDescription());
	}
	
	
	
	
	public void selectRelatedTo(String option)
	{
		logger.info(format("%s - going to select related to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getRelatedToDropdown(), 1);
	}
	public void selectPriority(String option)
	{
		logger.info(format("%s - going to select priority to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPriorityDropdown(), 1);
	}
	public void selectCalendarImportance(String option)
	{
		logger.info(format("%s - going to select calendar importance to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getCalendarImportanceDropdown(), 1);
	}
	
	public void selectAssignedTo(String option)
	{
		logger.info(format("%s - going to select assignedTo to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAssignToDropdown(), 1);
	}
	
	
	
	public void selectExternalOwned(boolean attended)
	{
		logger.info(format("%s -  going to set external owned to:"+attended, getName()));
	    if (attended)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getExternalOwnedYesRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getExternalOwnedNoRadio());
	    }
	
		
	}
	

   
	

	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}
	

	
	

	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getLinkDocumentButton() {
		return linkDocumentButton;
	}

	private WebElement getSubject() {
		return subject;
	}

	private WebElement getDescription() {
		return description;
	}

	private WebElement getRelatedToDropdown() {
		return relatedToDropdown;
	}

	private WebElement getDueDate() {
		return dueDate;
	}

	private WebElement getPriorityDropdown() {
		return priorityDropdown;
	}

	private WebElement getCalendarImportanceDropdown() {
		return calendarImportanceDropdown;
	}

	private WebElement getExternalOwnedYesRadio() {
		return externalOwnedYesRadio;
	}

	private WebElement getExternalOwnedNoRadio() {
		return externalOwnedNoRadio;
	}

	private WebElement getExternalOwnerDropdown() {
		return externalOwnerDropdown;
	}

	private WebElement getAssignToDropdown() {
		return assignToDropdown;
	}

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	


}
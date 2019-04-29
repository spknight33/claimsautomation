package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.activities;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
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
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_EscalationDate-inputEl")
	private WebElement overdueDate;
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
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_ExternalOwner:Activity_ExternalOwnerMenuIcon")
	private WebElement externalOwnerPickerIcon;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_ExternalOwner:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement externalOwnerPickerNewPerson;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_ExternalOwner:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-itemEl")
	private WebElement externalOwnerPickerNewCompany;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_ExternalOwner:MenuItem_Search-itemEl")
	private WebElement externalOwnerPickerSearch;
	//TODO - other pickers
	
	// TODO document template fields
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_CreateDocument:SelectActivity_CreateDocument")
	private WebElement documentTemplateFindIcon;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:EmailTemplate:SelectEmailTemplate")
	private WebElement emailTemplateFindIcon;
	
	
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_AssignActivity-inputEl")
	private WebElement assignToDropdown;
	@FindBy(id = "NewActivity:NewActivityScreen:NewActivityDV:Activity_AssignActivity:Activity_AssignActivity_PickerButton")
	private WebElement assignToSearchIcon;
	
	

	public String getName() {

		return "POST FNOL New Activity";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		logger.info(format("%s -found page title for page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().contains(expected); // use contains
	}
	
	public boolean containsErrorMessage(String contains)
	{
		// do a partial match on error message as the date messages contain the current time
				
		return GuideWireAccessors.containsErrorMessagePart(driver, contains, By.className("message"));
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	
	public void update() {
		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getUpdateButton());
		
	}
	
	public void setSubject(String text)
	{
		logger.info(format("%s -  going to set subject: "+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getSubject());
	}
	public void setDescription(String text)
	{
		logger.info(format("%s -  going to set description: "+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDescription());
	}
	
	public void selectRelatedTo(String option)
	{
		logger.info(format("%s - going to select related to: "+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getRelatedToDropdown(), 1);
	}
	public void setDueDate(String text)
	{
		logger.info(format("%s -  going to set due date: "+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDueDate());
	}
	public void setOverdueDate(String text)
	{
		logger.info(format("%s -  going to set overdue date: "+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getOverdueDate());
	}
	
	public void selectPriority(String option)
	{
		logger.info(format("%s - going to select priority to: "+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPriorityDropdown(), 1);
	}
	
	public boolean priorityIsSetTo(String option)
	{
		boolean found=false;
		logger.info(format("%s - going to check if priority is set to :"+option, getName()));
		int initialWait=1;
		String selectedOption = GuideWireAccessors.getSelectedValueFromGWDropdown(driver, this.getPriorityDropdown(),initialWait);
		logger.info(format("%s - selected option in priority:"+selectedOption, getName()));
		if (option.equalsIgnoreCase(selectedOption))
		{
			found = true;
		}
		return found;
	}
	public void selectCalendarImportance(String option)
	{
		logger.info(format("%s - going to select calendar importance to: "+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getCalendarImportanceDropdown(), 1);
	}
	

	
	public void selectExternalOwned(boolean attended)
	{
		logger.info(format("%s -  going to set external owned to: "+attended, getName()));
	    if (attended)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getExternalOwnedYesRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getExternalOwnedNoRadio());
	    }
	
		
	}
	public void selectExternalOwner(String option)
	{
		logger.info(format("%s - going to select external owner to: "+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getExternalOwnerDropdown(), 1);
	}
	public void selectExternalOwnerNewPerson()
	{
		logger.info(format("%s - going to select external owner new person", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getExternalOwnerPickerIcon(), this.getExternalOwnerPickerNewPerson());
	}
	public void selectExternalOwnerNewCompany()
	{
		logger.info(format("%s - going to select external owner new company", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getExternalOwnerPickerIcon(), this.getExternalOwnerPickerNewCompany());
	}
	public void selectExternalOwnerSearch()
	{
		logger.info(format("%s - going to select external owner search", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getExternalOwnerPickerIcon(), this.getExternalOwnerPickerSearch());
	}
	//TODO other pickers for external, ie new vendor
	
	
	// TODO revisit once document solution is sorted
	public void clickFindDocumentTemplate()
	{
		logger.info(format("%s - going to click find Document template", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getDocumentTemplateFindIcon());
	}
	
	public void clickFindEmailTemplate()
	{
		logger.info(format("%s - going to click find Email template", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getEmailTemplateFindIcon());
	}
	
	
	public void selectAssignedTo(String option)
	{
		logger.info(format("%s - going to select assignedTo to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAssignToDropdown(), 1);
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

	private WebElement getOverdueDate() {
		return overdueDate;
	}

	private WebElement getExternalOwnerPickerIcon() {
		return externalOwnerPickerIcon;
	}

	private WebElement getExternalOwnerPickerNewPerson() {
		return externalOwnerPickerNewPerson;
	}

	private WebElement getExternalOwnerPickerNewCompany() {
		return externalOwnerPickerNewCompany;
	}

	private WebElement getExternalOwnerPickerSearch() {
		return externalOwnerPickerSearch;
	}

	private WebElement getDocumentTemplateFindIcon() {
		return documentTemplateFindIcon;
	}

	private WebElement getEmailTemplateFindIcon() {
		return emailTemplateFindIcon;
	}

	private WebElement getAssignToSearchIcon() {
		return assignToSearchIcon;
	}

	


}
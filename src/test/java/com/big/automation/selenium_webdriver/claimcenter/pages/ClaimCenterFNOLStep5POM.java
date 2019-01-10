package com.big.automation.selenium_webdriver.claimcenter.pages;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLStep5POM extends BaseTest{

	
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	
	@FindBy(id = "FNOLWizard:Prev-btnEl")
	private WebElement backButton;
	
	@FindBy(id = "FNOLWizard:Finish-btnEl")
	private WebElement finishButton;
	
	@FindBy(id = "title")
	private WebElement titleDropDown;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:ttlBar")
	private WebElement pageTitle;


	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_AssignSaveScreen:CommonAssign-inputEl")
	private WebElement assignmentDropdown;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_AssignSaveScreen:Note-inputEl")
	private WebElement note;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_AssignSaveScreen:NewExposureLV_tb:AddExposure-btnEl")
	private WebElement addExposureDropdown;
	
	@FindBy(id ="WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton")
	private WebElement closeWarningsWindow;
	private String closeWarningsLocator = "WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton";
	
	
	
	public String getName() {

		return "FNOL Wizard Step5 Save and Assign Claim";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		
		logger.info(format("%s -found page title for step5 :"+this.getPageTitle().getText(), getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getPageTitle()).equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void finish() {

		logger.info(format("%s -  going to click finish", getName()));
		GuideWireAccessors.clickGWButton(driver,getFinishButton());
		// we may get prompt for validation warnings
		//clear any if necessary
		logger.info(format("%s - going to close warnings window if its open", getName()));
		//*[@id="NewClaimDuplicatesWorksheet:NewClaimDuplicatesScreen:NewClaimDuplicatesWorksheet_CloseButton-btnEl"]
		String xpathLocator = "//*[@id='"+  this.closeWarningsLocator + "']";
		if(driver.findElements( By.xpath(xpathLocator) ).size() > 0)
		{
			logger.info(format("%s - going to close warnings window as its open", getName()));
			// close it if present
			driver.findElement(By.xpath(xpathLocator)).click();
			GuideWireAccessors.clickGWButton(driver,getFinishButton());
		}
		else
		{
			logger.info(format("%s - NOT going to warnings window as not open", getName()));
		}
	
		
	}
	
	
		
		
	
	
	
	
	public void back() {
		logger.info(format("%s -  going to click Back", getName()));
		GuideWireAccessors.clickGWButton(driver,getBackButton());
		logger.info(format("%s - done, Back clicked", getName()));
	}

	public void setNote(String text)
	{
		logger.info(format("%s -  going to set note", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNote());
		logger.info(format("%s - done, note set", getName()));
	}
	
	public void selectAssignment(String option)
	{
		logger.info(format("%s - going to select Assignment option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getAssignmentDropdown(),1);
	}
	
	
	public void selectExposureSubMenuHierarchy(List<String> menuHierarchy)
	{
		logger.info(format("%s - going to select Exposure sub menu item ",getName()));
		GuideWireAccessors.selectOptionFromPopupMenu(driver, menuHierarchy, this.getAddExposureDropdown());
	}
	
   
	private WebElement getCancelButton() {
	return cancelButton;
}

private WebElement getFinishButton() {
	return finishButton;
}

	
	
	private WebElement getBackButton() {


		return backButton;
	}
	
	private List<WebElement> getErrorMessages(){
		return errorMessages;
	}
	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	
	

	private WebElement getTitleDropDown() {
		return titleDropDown;
	}

	private WebElement getAssignmentDropdown() {
		return assignmentDropdown;
	}

	private WebElement getNote() {
		return note;
	}

	private WebElement getAddExposureDropdown() {
		return addExposureDropdown;
	}

	public boolean containsErrorMessage(String contains)
	{
		boolean found=false;
		for (WebElement element : getErrorMessages()) 
		{
			if (element.getText().equalsIgnoreCase(contains))
			{
				found = true;
				break;
			}
		}
		return found;
	}
	
	

}
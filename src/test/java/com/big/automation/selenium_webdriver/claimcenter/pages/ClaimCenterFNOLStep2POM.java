package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLStep2POM extends BaseTest{

	//private final WebDriver webDriver;

	
	@FindBy(id = "FNOLWizard:Next-btnEl")
	private WebElement nextButton;
		
	@FindBy(id = "FNOLWizard:Prev")
	private WebElement backButton;
	
	@FindBy(id = "title")
	private WebElement titleDropDown;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:ttlBar")
	private WebElement pageTitle;

	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Notification_ReportedDate-inputEl")
	private WebElement reportedDate;
	
	// these are not robust finders, so will need revisit, just select fierts for now
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:RightPanel:FNOLWizard_BasicInfoRightPanelSet:0:InsuredVehicleDV:InsuredVehicleInputGroup:_checkbox")
	private WebElement firstInsuredVehicleCB;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl")
	private WebElement reportedByName;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:HowReported-inputEl")
	private WebElement howReported;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Claim_ReportedByType-inputEl")
	private WebElement reportedByRelation;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-trigger-picker")
	private WebElement reportedByNamePicker;
	


	public String getName() {

		return "FNOL Wizard Step2 Basic Information";
	}

	// public void populatePage(RqTestData rqTestData) {
//
	// }

// temp
	public void clickNamePicker()
	{
		logger.info(format("%s -  going to click name picker", getName()));
		
		this.reportedByNamePicker.click();
	}
	
	
	public void next() {
    	GuideWireAccessors.clickGWButton(driver,getNextButton());
		logger.info(format("%s - done, Next clicked", getName()));
	}
	
	public void back() {
		GuideWireAccessors.clickGWButton(driver,getBackButton());
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		logger.info(format("%s -check page title for step2 :"+expected, getName()));
		logger.info(format("%s -found page title for step2 :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	
	public String getReportedDateValue() {

		return this.getReportedDate().getText();

	}
	public void setReportedDateValue(String date)
	{			
		logger.info(format("%s - going to set reported date value to:"+date, getName()));
		GuideWireAccessors.setGWTextBox(driver, date, getReportedDate());
		
	}
	
	public String getReportedByValue() {

	return this.getReportedByName().getAttribute("value");

}

public void selectHowReported(String option)
{			
	logger.info(format("%s - going to set reported how value to:"+option, getName()));
	GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getHowReported(), 1);
}



public boolean howReportedContainsOption(String option)
{
	boolean found=false;
	logger.info(format("%s - going to check if options in how reported:"+option, getName()));
	this.getHowReported().click();
	String optionLocator = "//li[text()='"  + option + "']";
	found = this.getHowReported().findElements( By.xpath(optionLocator) ).size() > 0;
	
	return found;
}

public void selectReportedByName(String option)
{
	logger.info(format("%s - going to select report by name option :"+option, getName()));
	GuideWireAccessors.selectOptionFromGWDropDown(driver, option, getReportedByName(), 1);
}

public void selectRelationToInsured(String option)
{
	logger.info(format("%s - going to select relation to insured option :"+option, getName()));
	GuideWireAccessors.selectOptionFromGWDropDown(driver, option,getReportedByRelation(),1);
}



   public void selectVehicleCB()
   {
	   logger.info(format("%s - current CB selection is :"+this.getFirstInsuredVehicleCB().isSelected(), getName()));
   // can be more than one, but just select first for now
	   if (!this.getFirstInsuredVehicleCB().isSelected())
	   {
		   this.getFirstInsuredVehicleCB().click();
		   logger.info(format("%s - done, select Vehicle", getName()));
		   sleep(2);
	   }
   }
   
   public void deselectVehicleCB()
   {
   // can be more than one, but just deselect first for now
	   logger.info(format("%s - done, going to deselect vehicle", getName()));
	   if (this.getFirstInsuredVehicleCB().isSelected())
	   {
		   this.getFirstInsuredVehicleCB().click();
		   logger.info(format("%s - done, deselect vehicle", getName()));
	   }
   }
   
	
	private WebElement getNextButton() {
		
		return nextButton;
	}
	
	private WebElement getBackButton() {


		return backButton;
	}

	private WebElement getReportedDate() {
		return reportedDate;
	}

	
	private WebElement getFirstInsuredVehicleCB()
	{;
		return firstInsuredVehicleCB;
	}
	
	private List<WebElement> getErrorMessages(){
		return errorMessages;
	}
	
	
	private WebElement getReportedByName()
	{
		return reportedByName;
	}
	

	private WebElement getHowReported() {
		return howReported;
	}

	private WebElement getReportedByRelation() {
		return reportedByRelation;
	}
	
	
	
	
	private WebElement getPageTitle() {
		return pageTitle;
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
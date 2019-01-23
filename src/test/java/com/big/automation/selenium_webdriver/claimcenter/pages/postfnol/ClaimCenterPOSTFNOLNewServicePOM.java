package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLNewServicePOM extends BaseTest{


	@FindBy(id = "NewServiceRequest:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV_tb:SubmitButton")
	private WebElement submitButton;
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV_tb:Update")
	private WebElement saveButton;
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV_tb:Cancel")
	private WebElement cancelButton;


	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:RelatedTo-inputEl")
	private WebElement relatedToDropdown;
	
	
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:InstructionServicesLV_tb:AddMultipleServices")
	private WebElement addServiceButton;
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:InstructionServicesLV_tb:Remove")
	private WebElement removeServiceButton;
	
	//TODO service table?
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:Kind-inputEl")
	private WebElement requestTypeDropdown;
	
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:Specialist-inputEl")
	private WebElement vendorNameDropdown;
	
	
	
	// TODO the rest
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "POST FNOL New Service";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		
		logger.info(format("%s -found page title for page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected); 
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	
	public void save() {
		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getSaveButton());
		
	}
	
	public void submit() {
		logger.info(format("%s -  going to click submit", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getSubmitButton());
		
	}

	
	public void selectRelatedTo(String option)
	{
		logger.info(format("%s - going to select related to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getRelatedToDropdown(), 1);
	}
	
	public void clickAddService()
	{
		logger.info(format("%s -  going to click Add service", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddServiceButton());
	}
	public void clickRemoveService()
	{
		logger.info(format("%s -  going to click Remove service", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getRemoveServiceButton());
	}
	
	public void selectRequestType(String option)
	{
		logger.info(format("%s - going to select request type to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getRequestTypeDropdown(), 1);
	}
		

   


	private WebElement getPageTitle() {
		return pageTitle;
	}
	
	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	private WebElement getSubmitButton() {
		return submitButton;
	}

	private WebElement getSaveButton() {
		return saveButton;
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getRelatedToDropdown() {
		return relatedToDropdown;
	}

	private WebElement getAddServiceButton() {
		return addServiceButton;
	}

	private WebElement getRemoveServiceButton() {
		return removeServiceButton;
	}

	private WebElement getRequestTypeDropdown() {
		return requestTypeDropdown;
	}

	private WebElement getVendorNameDropdown() {
		return vendorNameDropdown;
	}

	
	


}
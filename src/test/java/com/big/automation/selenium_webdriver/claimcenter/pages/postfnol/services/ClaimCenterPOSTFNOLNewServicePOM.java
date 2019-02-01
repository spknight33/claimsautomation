package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.services;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(id = "SelectServicesPopup:FilterKeyword-inputEl")
	private WebElement addServiceFilter;
	@FindBy(id = "SelectServicesPopup:FilterServices")
	private WebElement addServiceFilterButton;
	@FindBy(id = "SelectServicesPopup:UpdateServiceRequestServices")
	private WebElement addSelectedServiceButton;
	
	
	
	// //div[@id="SelectServicesPopup:SpecialistServiceTreeLV"]//span[@class="x-tree-node-text "]
	
	//TODO service table?
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:Kind-inputEl")
	private WebElement requestTypeDropdown;
	
	
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:Specialist-inputEl")
	private WebElement vendorNameDropdown;
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:Specialist:SpecialistMenuIcon")
	private WebElement vendorNamePickerIcon;
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:Specialist:MenuItem_Search-itemEl")
	private WebElement vendorNamePickerSearch;
	//TODO other pickers
	
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:NewServiceRequestInstructionInputSet:InstructionText-inputEl")
	private WebElement additionalInstructions;
	
	
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:NewServiceRequestInstructionInputSet:RequestedServiceCompletionDate-inputEl")
	private WebElement requestedCompletionDate;
	
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:NewServiceRequestInstructionInputSet:CustomerContact-inputEl")
	private WebElement customerContactDropdown;
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:NewServiceRequestInstructionInputSet:CustomerContact:CustomerContactMenuIcon")
	private WebElement customerContactPickerIcon;
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:NewServiceRequestInstructionInputSet:CustomerContact:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement customerContactPickerNewPerson;
	//TODO other pickers
	
	
	@FindBy(id = "NewServiceRequest:NewServiceRequestScreen:NewServiceRequestDV:NewServiceRequestInstructionInputSet:ServiceAddressPicker-inputEl")
	private WebElement serviceAddressDropdown;
	
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
	public void setFilterText(String text)
	{
		logger.info(format("%s - going to set filter text to:"+text, getName()));
		sleep(1);
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddServiceFilter());
	}
	public void clickFilterService()
	{
		logger.info(format("%s -  going to click filter  service", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddServiceFilterButton());
	}
	
	public void selectServiceToAdd()
	{
		// just selects first service
		logger.info(format("%s - going to select service from tree", getName()));
		sleep(1);
		WebElement element = driver.findElement(By.xpath("//input[@class=\" x-tree-checkbox\"]"));
		GuideWireAccessors.clickGWButton(driver, element);
		
	}
	public void clickAddSelectedService()
	{
		logger.info(format("%s -  going to click Add selected service", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddSelectedServiceButton());
	}
	
	public void selectRequestType(String option)
	{
		logger.info(format("%s - going to select request type to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getRequestTypeDropdown(), 1);
	}
	
	public void selectSearchVendor()
	{
		logger.info(format("%s - going to select search vendor:", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getVendorNamePickerIcon(), this.getVendorNamePickerSearch());
	}
	public void setAdditionalInstructions(String text)
	{
		logger.info(format("%s - going to set additional instructions to:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAdditionalInstructions());
	}
	public void setRquestedCompletionDate(String text)
	{
		logger.info(format("%s - going to set requestd completion date to:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getRequestedCompletionDate());
	}
		
	public void selectCustomerContact(String option)
	{
		logger.info(format("%s - going to select customer contact to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getCustomerContactDropdown(), 1);
	}
	public void selectServiceAddress(String option)
	{
		logger.info(format("%s - going to select service address to:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getServiceAddressDropdown(), 1);
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

	private WebElement getVendorNamePickerIcon() {
		return vendorNamePickerIcon;
	}

	private WebElement getVendorNamePickerSearch() {
		return vendorNamePickerSearch;
	}

	private WebElement getAdditionalInstructions() {
		return additionalInstructions;
	}

	private WebElement getRequestedCompletionDate() {
		return requestedCompletionDate;
	}

	private WebElement getCustomerContactDropdown() {
		return customerContactDropdown;
	}

	private WebElement getCustomerContactPickerIcon() {
		return customerContactPickerIcon;
	}

	private WebElement getCustomerContactPickerNewPerson() {
		return customerContactPickerNewPerson;
	}

	private WebElement getServiceAddressDropdown() {
		return serviceAddressDropdown;
	}

	private WebElement getAddServiceFilter() {
		return addServiceFilter;
	}

	private WebElement getAddServiceFilterButton() {
		return addServiceFilterButton;
	}

	private WebElement getAddSelectedServiceButton() {
		return addSelectedServiceButton;
	}

	
	


}
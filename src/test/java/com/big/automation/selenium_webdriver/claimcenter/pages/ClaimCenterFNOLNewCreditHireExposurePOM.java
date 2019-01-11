package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLNewCreditHireExposurePOM extends BaseTest{

	
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:ttlBar")
	private WebElement pageTitle;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:Update")
	private WebElement okButton;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:Cancel")
	private WebElement cancelButton;

	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Coverage-inputEl")
	private WebElement coverageDropdown;

	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Claimant_Picker-inputEl")
	private WebElement claimantDropdown;
    @FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Claimant_Picker:Claimant_PickerMenuIcon")
	private WebElement claimantPickerIcon;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Claimant_Picker:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement claimantPickerNewPerson;
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Claimant_Type-inputEl")
	private WebElement claimantTypeDropdown;
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Claimant_ContactProhibited_true-inputEl")
	private WebElement claimantContactProhibYes;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Claimant_ContactProhibited_false-inputEl")
	private WebElement claimantContactProhibNo;
	
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Claimant_ContactProhibited_false-inputEl")
	private WebElement vehicleDropdown;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Vehicle_Incident:Vehicle_IncidentMenuIcon")
	private WebElement vehiclePickerIcon;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:NewClaimVehicleDamageDV:Vehicle_Incident:NewClaimVehicleDamageDV_NewIncidentMenuItem-itemEl")
	private WebElement vehiclePickerNewIncident;
	

	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	

	public String getName() {

		return "New Vehicle Exposure FNOL";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(3);

		logger.info(format("%s -found page title for Exposure page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		
	}
	
		
	public void selectOk() {
		logger.info(format("%s -  going to click ok", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkButton());
		
	}
	
	
	
	public void selectCoverage(String option)
	{
		logger.info(format("%s - going to select coverage option:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getCoverageDropdown(), 1);
	}
	public void selecVehicle(String option)
	{
		logger.info(format("%s - going to select vehicle option:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVehicleDropdown(), 1);
	}
	public void selectClaimant(String option)
	{
		logger.info(format("%s - going to select Claimant  option:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getClaimantDropdown(), 1);
	}
	public void selectNewClaimant()
	{
		logger.info(format("%s - going to select New Person from Claimant picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getClaimantPickerIcon(),this.getClaimantPickerNewPerson());
	}
	public void selectNewVehicle()
	{
		logger.info(format("%s - going to select New Incident from Vehicle picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getVehiclePickerIcon(),this.getVehiclePickerNewIncident());
	}
	
	public void selectClaimantType(String option)
	{
		logger.info(format("%s - going to select Claimant type option:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getClaimantTypeDropdown(), 1);
	}
	
	
   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	


	

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}


	
	private WebElement getCoverageDropdown() {
		return coverageDropdown;
	}

	private WebElement getClaimantDropdown() {
		return claimantDropdown;
	}

	private WebElement getClaimantPickerIcon() {
		return claimantPickerIcon;
	}

	private WebElement getClaimantPickerNewPerson() {
		return claimantPickerNewPerson;
	}

	private WebElement getClaimantTypeDropdown() {
		return claimantTypeDropdown;
	}

	private WebElement getClaimantContactProhibYes() {
		return claimantContactProhibYes;
	}

	private WebElement getClaimantContactProhibNo() {
		return claimantContactProhibNo;
	}


	
	
	

	

	private WebElement getVehicleDropdown() {
		return vehicleDropdown;
	}

	private WebElement getVehiclePickerIcon() {
		return vehiclePickerIcon;
	}

	private WebElement getVehiclePickerNewIncident() {
		return vehiclePickerNewIncident;
	}

	

	private WebElement getOkButton() {
		return okButton;
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
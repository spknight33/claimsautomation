package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLNewExposurePOM extends BaseTest{

	
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:ttlBar")
	private WebElement pageTitle;
		
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:Update-btnEl")
	private WebElement okButton;
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:Cancel-btnEl")
	private WebElement cancelButton;

	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:Coverage-inputEl")
	private WebElement coverageDropdown;
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:Claimant_Picker-inputEl")
	private WebElement claimantDropdown;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:Claimant_Picker:Claimant_PickerMenuIcon")
	private WebElement claimantPickerIcon;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:Claimant_Picker:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-textEl")
	private WebElement claimandPickerNewPerson;
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:Claimant_Type-inputEl")
	private WebElement claimantTypeDropdown;
	
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:Claimant_ContactProhibited_true-inputEl")
	private WebElement claimantContactProhibYes;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:Claimant_ContactProhibited_false-inputEl")
	private WebElement claimantContactProhibNo;
	
	
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:AltContact_Name-inputEl")
	private WebElement altContactDropdown;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:AltContact_Name:AltContact_NameMenuIcon")
	private WebElement altContactPickerIcon;
	@FindBy(id = "NewClaimWizard_NewExposurePopup:NewClaimWizard_ExposurePageScreen:NewClaimExposureDV:AltContact_Name:ClaimNewContactPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-textEl")
	private WebElement altContactPickerNewPerson;
	
	//TODO the rest
		
		
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	

	public String getName() {

		return "Person Contact Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(4);
		logger.info(format("%s -check page title for Person page :"+expected, getName()));
		logger.info(format("%s -found page title for Person page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkButton());
		logger.info(format("%s - done, OK clicked", getName()));
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


	private WebElement getOkButton() {
		return okButton;
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

	private WebElement getClaimandPickerNewPerson() {
		return claimandPickerNewPerson;
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

	private WebElement getAltContactDropdown() {
		return altContactDropdown;
	}

	private WebElement getAltContactPickerIcon() {
		return altContactPickerIcon;
	}

	private WebElement getAltContactPickerNewPerson() {
		return altContactPickerNewPerson;
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
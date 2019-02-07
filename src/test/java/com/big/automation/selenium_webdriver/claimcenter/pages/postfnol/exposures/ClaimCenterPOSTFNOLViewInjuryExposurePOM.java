package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.exposures;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLViewInjuryExposurePOM extends BaseTest{

	
	
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:Edit")
	private WebElement editButton;
	@FindBy(id = "ExposureDetail:ExposureDetail_UpLink")
	private WebElement upToExposuresLink;
	
		
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:Update")
	private WebElement updateButton;
	
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:Cancel")
	private WebElement cancelButton;
	
	

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Coverage-inputEl")
	private WebElement coverage;

	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Claimant_Picker-inputEl")
	private WebElement claimant;
 
	
	@FindBy(id = "ExposureDetail:ExposureDetailScreen:ExposureDetailDV:BodilyInjuryDamageDV:Claimant_Type-inputEl")
	private WebElement claimantTypeText;
	
	
	

	public String getName() {

		return "View Injury Exposure Post FNOL";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);

		logger.info(format("%s -found page title for Exposure page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public boolean containsErrorMessage(String contains)
	{
				
		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	// for readonly page
		public String getClaimantType() {
			logger.info(format("%s - going to get Claimant type:", getName()));
			return GuideWireAccessors.getGWElementText(driver, this.getClaimantTypeText());
		}
	
	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		
	}
	
	public void selectUpdate() {
		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpdateButton());
		
	}
	public void selectEdit() {
		logger.info(format("%s -  going to click Edit", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getEditButton());
		
	}
	public void selectUpToExposures() {
		logger.info(format("%s -  going to click up to exposures link", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpToExposuresLink());
		
	}
	
	
	
   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}



	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getUpToExposuresLink() {
		return upToExposuresLink;
	}

	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getCoverage() {
		return coverage;
	}

	private WebElement getClaimant() {
		return claimant;
	}

	private WebElement getClaimantTypeText() {
		return claimantTypeText;
	}

	

}
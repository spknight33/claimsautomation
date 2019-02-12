package com.big.automation.selenium_webdriver.claimcenter.pages.common;

import static java.lang.String.format;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

public class ClaimCenterInfoBarPOM extends BaseTest {
	

	@FindBy(xpath = "//a[@id='Claim:ClaimInfoBar:PolicyNumber']//span[1]/span[2]/span[2]")
	private WebElement claimPolicyNumber;

	@FindBy(xpath = "//a[@id='Claim:ClaimInfoBar:Insured']//span[1]/span[2]/span[2]")
	private WebElement claimInsuredName;

	@FindBy(xpath = "//a[@id='Claim:ClaimInfoBar:State']//span[1]/span[2]/span[2]")
	private WebElement claimStatus;

	@FindBy(xpath = "//a[@id='Claim:ClaimInfoBar:LossDate']//span[1]/span[2]/span[2]")
	private WebElement claimLossDate;

	@FindBy(xpath = "//a[@id='Claim:ClaimInfoBar:Adjuster']//span[1]/span[2]/span[2]")
	private WebElement claimAdjuster;

	
	public String getName() {

		return "ClaimCenter Infobar";
	}
	
	public String getClaimPolicyNumberText()
	{
		logger.info(format("%s - check claim policy number on infobar" , getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getClaimPolicyNumber());
	}
	
	public String getClaimInsuredNameText()
	{
		logger.info(format("%s - check claim insured name on infobar" , getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getClaimInsuredName());
	}
	
	public String getClaimStatusText()
	{
		logger.info(format("%s - check claimstatus on infobar" , getName()));
		sleep(2);
		return GuideWireAccessors.getGWElementText(driver, this.getClaimStatus());
	}
	
	public String getClaimLossDateText()
	{
		logger.info(format("%s - check claim loss date on infobar" , getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getClaimLossDate());
	}
	
	public String getClaimAdjusterText()
	{
		logger.info(format("%s - check claimadjuster on infobar" , getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getClaimAdjuster());
	}




	private WebElement getClaimPolicyNumber() {
		return claimPolicyNumber;
	}


	private WebElement getClaimInsuredName() {
		return claimInsuredName;
	}


	private WebElement getClaimStatus() {
		return claimStatus;
	}


	private WebElement getClaimLossDate() {
		return claimLossDate;
	}


	private WebElement getClaimAdjuster() {
		return claimAdjuster;
	}

	

}
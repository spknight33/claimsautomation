package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterTotalLossCalulatorPOM extends BaseTest{

	
	@FindBy(id = "TotalLossCalculatorPopup:ttlBar")
	private WebElement pageTitle;
		
	@FindBy(id = "TotalLossCalculatorPopup:Update")
	private WebElement updateButton;
	@FindBy(id = "TotalLossCalculatorPopup:Cancel")
	private WebElement cancelButton;


	
	@FindBy(id = "TotalLossCalculatorPopup:VehicleAge-inputEl")
	private WebElement vehicleAgeDropdown;
	@FindBy(id = "TotalLossCalculatorPopup:Mileage100K_true-inputEl")
	private WebElement over100YesOption;
	@FindBy(id = "TotalLossCalculatorPopup:Mileage100K_false-inputEl")
	private WebElement over100NoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:AirbagsDeployed-inputEl")
	private WebElement airbagsDeployed;
	
	@FindBy(id = "TotalLossCalculatorPopup:VehicleRollOver_true-inputEl")
	private WebElement rolloverYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:VehicleRollOver_false-inputEl")
	private WebElement rolloverNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:CosmeticDamageLevel_true-inputEl")
	private WebElement cosmeticYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:CosmeticDamageLevel_false-inputEl")
	private WebElement cosmeticNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:LightDamageLevel_true-inputEl")
	private WebElement lightYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:LightDamageLevel_false-inputEl")
	private WebElement lightNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:MediumDamageLevel_true-inputEl")
	private WebElement mediumYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:LightDamageLevel_false-inputEl")
	private WebElement mediumNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:HeavyDamageLevel_true-inputEl")
	private WebElement heavyYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:HeavyDamageLevel_false-inputEl")
	private WebElement heavyNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:VeryHeavyDamageLevel_true-inputEl")
	private WebElement veryHeavyYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:VeryHeavyDamageLevel_false-inputEl")
	private WebElement veryHeavyNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:FireBurnEngine_true-inputEl")
	private WebElement burnEngineYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:FireBurnEngine_false-inputEl")
	private WebElement burnEngineNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:FireBurnInterior_true-inputEl")
	private WebElement damageInteriorYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:FireBurnInterior_false-inputEl")
	private WebElement damageInteriorNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:IntoDeepStandingWater_itb_true-inputEl")
	private WebElement floodDeepWaterYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:IntoDeepStandingWater_itb_false-inputEl")
	private WebElement floodDeepWaterNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:VehicleSubmerged_true-inputEl")
	private WebElement fullySubmergedYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:VehicleSubmerged_false-inputEl")
	private WebElement fullySubmergedNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:WaterEnterCompartment_true-inputEl")
	private WebElement waterCompartmentYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:WaterEnterCompartment_false-inputEl")
	private WebElement waterCompartmentNoOption;
	
	@FindBy(id = "TotalLossCalculatorPopup:WaterLevelSeats_true-inputEl")
	private WebElement waterSeatsYesOption;
	@FindBy(id = "TotalLossCalculatorPopup:WaterLevelSeats_false-inputEl")
	private WebElement waterSeatsNoOption;
	
	
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "Person Contact Information";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(3);
		
		logger.info(format("%s -found page title for page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		
	}
	
	public void selectUpdate() {
		logger.info(format("%s -  going to click Update", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getUpdateButton());
		
	}
	
	
	public void selectVehicleAge(String option)
	{
		logger.info(format("%s -  going to select vehicle age", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getVehicleAgeDropdown(), 1);
		
	}
	public void selectOver100K(boolean over)
	{
		logger.info(format("%s -  going to set over 100k to:"+over, getName()));
	    if (over)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getOver100YesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getOver100NoOption());
	    }

	}
	public void selectAirbagsDeployed(String option)
	{
		logger.info(format("%s - going to select airbags deployed option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver,option, this.getAirbagsDeployed(),1); // first on page
	}
	public void selectRollover(boolean rolled)
	{
		logger.info(format("%s -  going to set rollover to:"+rolled, getName()));
	    if (rolled)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getRolloverYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getRolloverNoOption());
	    }

	}
	
	public void selectCosmeticDamage(boolean cosmetic)
	{
		logger.info(format("%s -  going to set cosmetic to:"+cosmetic, getName()));
	    if (cosmetic)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getCosmeticYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getCosmeticYesOption());
	    }

	}
	
	public void selectLightDamage(boolean light)
	{
		logger.info(format("%s -  going to set light to:"+light, getName()));
	    if (light)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getLightYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getLightYesOption());
	    }

	}
	
	public void selectMediumDamage(boolean medium)
	{
		logger.info(format("%s -  going to set medium to:"+medium, getName()));
	    if (medium)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getMediumYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getMediumYesOption());
	    }

	}
	
	public void selectHeavyDamage(boolean heavy)
	{
		logger.info(format("%s -  going to set heavy to:"+heavy, getName()));
	    if (heavy)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getHeavyYesOption());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getHeavyYesOption());
	    }

	}
	
	//TODO the rest
   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getUpdateButton() {
		return updateButton;
	}

	private WebElement getVehicleAgeDropdown() {
		return vehicleAgeDropdown;
	}

	private WebElement getOver100YesOption() {
		return over100YesOption;
	}

	private WebElement getOver100NoOption() {
		return over100NoOption;
	}

	private WebElement getAirbagsDeployed() {
		return airbagsDeployed;
	}

	private WebElement getRolloverYesOption() {
		return rolloverYesOption;
	}

	private WebElement getRolloverNoOption() {
		return rolloverNoOption;
	}

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	private WebElement getCosmeticYesOption() {
		return cosmeticYesOption;
	}

	private WebElement getCosmeticNoOption() {
		return cosmeticNoOption;
	}

	private WebElement getLightYesOption() {
		return lightYesOption;
	}

	private WebElement getLightNoOption() {
		return lightNoOption;
	}

	private WebElement getMediumYesOption() {
		return mediumYesOption;
	}

	private WebElement getMediumNoOption() {
		return mediumNoOption;
	}

	private WebElement getHeavyYesOption() {
		return heavyYesOption;
	}

	private WebElement getHeavyNoOption() {
		return heavyNoOption;
	}

	private WebElement getVeryHeavyYesOption() {
		return veryHeavyYesOption;
	}

	private WebElement getVeryHeavyNoOption() {
		return veryHeavyNoOption;
	}

	private WebElement getBurnEngineYesOption() {
		return burnEngineYesOption;
	}

	private WebElement getBurnEngineNoOption() {
		return burnEngineNoOption;
	}

	private WebElement getDamageInteriorYesOption() {
		return damageInteriorYesOption;
	}

	private WebElement getDamageInteriorNoOption() {
		return damageInteriorNoOption;
	}

	private WebElement getFloodDeepWaterYesOption() {
		return floodDeepWaterYesOption;
	}

	private WebElement getFloodDeepWaterNoOption() {
		return floodDeepWaterNoOption;
	}

	private WebElement getFullySubmergedYesOption() {
		return fullySubmergedYesOption;
	}

	private WebElement getFullySubmergedNoOption() {
		return fullySubmergedNoOption;
	}

	private WebElement getWaterCompartmentYesOption() {
		return waterCompartmentYesOption;
	}

	private WebElement getWaterCompartmentNoOption() {
		return waterCompartmentNoOption;
	}

	private WebElement getWaterSeatsYesOption() {
		return waterSeatsYesOption;
	}

	private WebElement getWaterSeatsNoOption() {
		return waterSeatsNoOption;
	}

	

	
	
	


}
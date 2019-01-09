package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLNewInjuryPOM extends BaseTest{

	//
	// Keep this distinct from other injury pages for now, they could be combined in future (fnol/postfnol new/edit)
	//
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:Cancel-btnEl")
	private WebElement cancelButton;
	

	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:0")
	private WebElement pageTitle;
		
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:Update-btnEl")
	private WebElement okButton;

	
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:Injured_Picker-inputEl")
	private WebElement injuredNameDropdown;
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:Injured_Picker:Injured_PickerMenuIcon")
	private WebElement injuredNamePickerIcon;
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:Injured_Picker:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
	private WebElement injuredNameNewPerson;
	
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:InjuryDescription-inputEl")
	private WebElement injuryDesc;
	
	
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV_tb:Add-btnEl")
	private WebElement addInjuryButton;
	
	
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:Severity-inputEl")
	private WebElement injurySeverity;
	
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:AmbulanceAttended_itb_true-inputEl")
	private WebElement ambulanceTrueRadio;
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:AmbulanceAttended_itb_false-inputEl")
	private WebElement ambulanceFalseRadio;
	
	
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:AmbulanceAttended_itb_false-inputEl")
	private WebElement airAmbulanceTrueRadio;
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:AirAmbulanceAttended_itb_false-inputEl")
	private WebElement airAmbulanceFalseRadio;
	
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:HospitalAttended_itb_true-inputEl")
	private WebElement hospitalAttendTrueRadio;
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:HospitalAttended_itb_false-inputEl")
	private WebElement hospitalAttendFalseRadio;	

	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb-inputEl")
	private WebElement hospitalNameDropdown;
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb:Hospital_itbMenuIcon")
	private WebElement hospitalNamePickerIcon;	
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb:MenuItem_Search-itemEl")
	private WebElement hospitalNameSearch;
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:HospitalDetails_itb:OvernightStayInHospital_itb_true-inputEl")
	private WebElement hospitalStayTrueRadio;
	@FindBy(id = "NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:HospitalDetails_itb:OvernightStayInHospital_itb_false-inputEl")
	private WebElement hospitalStayFalseRadio;
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "POST FNOL New Injury";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(2);
		logger.info(format("%s -found page title for Add Injury page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getOkButton());
		logger.info(format("%s - done, OK clicked", getName()));
	}
	
	public void setInjuryDesc(String text)
	{
		logger.info(format("%s -  going to set injury desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getInjuryDesc());
		logger.info(format("%s - done, injury desc set", getName()));
	}
	
	
	
	
	public void selectNewInjuredPerson()
	{
		logger.info(format("%s - going to select New Person from injured name picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getInjuredNamePickerIcon(),this.getInjuredNameNewPerson());
	}
	
	public void selectSeverity(String option)
	{
		logger.info(format("%s - going to select severity :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getInjurySeverity(), 1);
	}
	
	public void selectAddInjury()
	{
		logger.info(format("%s - going to select add injury button ", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getAddInjuryButton());
	}
	
	public void selectAreaOfBody(String option, int sequence)
	{
		// use to select the area of body for the first (for now) change to be able to set for any row
	    // just change to use table[x]
		String locator = "//*[@id=\"NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table[" + sequence + "]//tr/td[2]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		
	}
	
	public void selectDetailedInjury(String option, int sequence)
	{
		// use to select the detailed injury for the first (for now) change to be able to set for any row
		sleep(2);
		String locator = "//*[@id=\"NewInjuryIncidentPopup:NewInjuryIncidentScreen:InjuryIncidentDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table[" + sequence + "]//tr/td[3]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		
	}
	
	
	public void selectAmbulanceAttended(boolean attended)
	{
		logger.info(format("%s -  going to set amublance attended to:"+attended, getName()));
	    if (attended)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getAmbulanceTrueRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getAmbulanceFalseRadio());
	    }
	
		
	}
	public void selectAirAmbulanceAttended(boolean attended)
	{
		logger.info(format("%s -  going to set Air amublance attended to:"+attended, getName()));
	    if (attended)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getAirAmbulanceTrueRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getAirAmbulanceFalseRadio());
	    }
	
		
	}
	public void selectHospitalAttended(boolean attended)
	{
		logger.info(format("%s -  going to set hospital  attended to:"+attended, getName()));
	    if (attended)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getHospitalAttendTrueRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getHospitalAttendFalseRadio());
	    }
	
		
	}
	public void selectOvernightStay(boolean attended)
	{
		logger.info(format("%s -  going to set overnight stay to:"+attended, getName()));
	    if (attended)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getHospitalStayTrueRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getHospitalStayFalseRadio());
	    }
	
		
	}
	
	public void selectSearchHospital()
	{
		logger.info(format("%s - going to select Search from hospital name picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getHospitalNamePickerIcon(),this.getHospitalNameSearch());
	}
	

   
	private WebElement getInjuredNameDropdown() {
		return injuredNameDropdown;
	}

	private WebElement getInjuredNamePickerIcon() {
		return injuredNamePickerIcon;
	}

	private WebElement getInjuredNameNewPerson() {
		return injuredNameNewPerson;
	}

	private WebElement getAddInjuryButton() {
		return addInjuryButton;
	}

	private WebElement getInjurySeverity() {
		return injurySeverity;
	}

	private WebElement getAmbulanceTrueRadio() {
		return ambulanceTrueRadio;
	}

	private WebElement getAmbulanceFalseRadio() {
		return ambulanceFalseRadio;
	}

	private WebElement getAirAmbulanceTrueRadio() {
		return airAmbulanceTrueRadio;
	}

	private WebElement getAirAmbulanceFalseRadio() {
		return airAmbulanceFalseRadio;
	}

	private WebElement getHospitalAttendTrueRadio() {
		return hospitalAttendTrueRadio;
	}

	private WebElement getHospitalAttendFalseRadio() {
		return hospitalAttendFalseRadio;
	}

	private WebElement getHospitalNameDropdown() {
		return hospitalNameDropdown;
	}

	private WebElement getHospitalNamePickerIcon() {
		return hospitalNamePickerIcon;
	}

	private WebElement getHospitalNameSearch() {
		return hospitalNameSearch;
	}

	private WebElement getHospitalStayTrueRadio() {
		return hospitalStayTrueRadio;
	}

	private WebElement getHospitalStayFalseRadio() {
		return hospitalStayFalseRadio;
	}

	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}
	

	
	private WebElement getInjuryDesc() {
		return injuryDesc;
	}

	private WebElement getOkButton() {
		return okButton;
	}

	

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	


}
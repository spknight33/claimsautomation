package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLNewPassengerDetailsPOM extends BaseTest{

		
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:Update-btnEl")
	private WebElement okButton;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:Cancel")
	private WebElement cancelButton;
	

	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:ClaimContactPerson-inputEl")
	private WebElement passengerNameDropdown;

	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:Prefix-inputEl")
	private WebElement prefix;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl")
	private WebElement firstName;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:MiddleName-inputEl")
	private WebElement middleName;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:LastName-inputEl")
	private WebElement lastName;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Gender-inputEl")
	private WebElement gender;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:DateOfBirth-inputEl")
	private WebElement dob;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:PedestrianOrDriverOrPassengerDetails:PedestrianOrDriverOrPassengerRoleInputSet:WhereWereTheyInTheVehicle_itb-inputEl")
	private WebElement whereInVehicleDropdown;
	
	//tp only here
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:PedestrianOrDriverOrPassengerDetails:PedestrianOrDriverOrPassengerRoleInputSet:WereTheyWearingASeatBelt_itb_true-inputEl")
	private WebElement passengerWearingSeatbeltYesOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:PedestrianOrDriverOrPassengerDetails:PedestrianOrDriverOrPassengerRoleInputSet:WereTheyWearingASeatBelt_itb_false-boxLabelEl")
	private WebElement passengerWearingSeatbeltNoOption;

	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl")
	private WebElement addressLine1;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine2-inputEl")
	private WebElement addressLine2;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine3-inputEl")
	private WebElement addressLine3;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement city;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:County-inputEl")
	private WebElement county;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement postcode;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:addresses-inputEl")
	private WebElement postCodeAddressDropdown;
	
	private WebElement getPostCodeAddressDropdown() {
		return postCodeAddressDropdown;
	}

	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_AddressType-inputEl")
	private WebElement addressType;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement locationDesc;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_ValidUntil-inputEl")
	private WebElement validUntil;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_businessphone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement workPhone;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_homephone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement homePhone;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_mobile:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement mobile;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_primarytype-inputEl")
	private WebElement primaryPhoneDropdown;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_email-inputEl")
	private WebElement mainEmail;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Email2-inputEl")
	private WebElement altEmail;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:NationalInsurance_itb-inputEl")
	private WebElement niNumber;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:DriverLicense-inputEl")
	private WebElement licenseNumber;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Notes-inputEl")
	private WebElement notes;
	
	
	
	// Injury section
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuredBoolean_true-inputEl")
	private WebElement injuredYesOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuredBoolean_false-inputEl")
	private WebElement injuredNoOption;
	
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:InjuryDescription-inputEl")
	private WebElement injuryDesc;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV_tb:Add")
	private WebElement addInjuryButton;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:AmbulanceAttended_itb_true-inputEl")
	private WebElement ambulanceYesRadio;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:AmbulanceAttended_itb_false-inputEll")
	private WebElement ambulanceNoRadio;
	
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:AirAmbulanceAttended_itb_true-inputEl")
	private WebElement airAmbulanceYesRadio;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:AirAmbulanceAttended_itb_false-inputEll")
	private WebElement airAmbulanceNoRadio;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:HospitalAttended_itb_true-inputEl")
	private WebElement hospitalAttendYesRadio;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:HospitalAttended_itb_false-boxLabelEl")
	private WebElement hospitalAttendNoRadio;	

	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb-inputEl")
	private WebElement hospitalNameDropdown;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb:Hospital_itbMenuIcon")
	private WebElement hospitalNamePickerIcon;	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb:MenuItem_Search-itemEl")
	private WebElement hospitalNameSearch;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:HospitalDetails_itb:OvernightStayInHospital_itb_true-inputEl")
	private WebElement hospitalStayYesRadio;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:HospitalDetails_itb:OvernightStayInHospital_itb_false-inputEl")
	private WebElement hospitalStayNoRadio;
	
	@FindBy(className = "message")
	private List <WebElement> errorMessages;

	public String getName() {

		return "FNOL Wizard Step3 Add Driver";
	}

	public boolean isPageTitleDisplayed(String expected)
	{
		sleep(3);
		
		logger.info(format("%s -found page title for page :"+this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	
	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getOkButton());
		
	}
	
	
	
	public void selectPassengerName(String option)
	{
		logger.info(format("%s - going to select passenger name option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPassengerNameDropdown(),1);
	}
	
	public void selectPrefix(String option)
	{
		logger.info(format("%s -  going to select prefix ", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrefix(), 1);
		
	}
	public void setFirstName(String text)
	{
		logger.info(format("%s -  going to set first name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFirstName());
		
	}
	public void setMiddleName(String text)
	{
		logger.info(format("%s -  going to set middle name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMiddleName());
		
	}
	public void setLastName(String text)
	{
		logger.info(format("%s -  going to set last name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLastName());
		
	}
	public void selectGender(String text)
	{
		logger.info(format("%s -  going to set gender", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getGender());
		
	}
	public void setDob(String text)
	{
		logger.info(format("%s -  going to set dob", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDob());
		
	}
	
	public void setAddressLine1(String text)
	{
		logger.info(format("%s -  going to set address line1", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine1());
		
	}
	public void setAddressLine2(String text)
	{
		logger.info(format("%s -  going to set address line2", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());
		
	}
	public void setAddressLine3(String text)
	{
		logger.info(format("%s -  going to set address line3", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine3());
		
	}
	public void setCity(String text)
	{
		logger.info(format("%s -  going to set city", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCity());
		
	}
	public void setCounty(String text)
	{
		logger.info(format("%s -  going to set County", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCounty());
		
	}
	public void setPostcode(String text)
	{
		logger.info(format("%s -  going to set postcode", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostcode());
		// as postcode causes display off other address fields, but this can take a couple of seconds - the next method should wait until available but add a slug anyway
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				sleep(2);
		
	}
	public void selectPostcodeAddress(String option)
	{
		logger.info(format("%s -  going to select address type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPostCodeAddressDropdown(), 1);
		
	}

	public void selectAddressType(String option)
	{
		logger.info(format("%s -  going to select address type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressType(), 1);
		
	}
	public void setLocationDesc(String text)
	{
		logger.info(format("%s -  going to set location desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());
		
	}
	
	//TODO - phone etc
	
	public void setMobile(String text)
	{
		logger.info(format("%s -  going to set mobile", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMobile());
		
	}
	public void setEmail(String text)
	{
		logger.info(format("%s -  going to set email", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMainEmail());
		
	}
	
	
	// Injury Section
	//-------------------------------------
	public void selectInjured(boolean injured)
	{
		logger.info(format("%s -  going to set injured"+injured, getName()));
		
		if (injured)
		{
		GuideWireAccessors.clickGWButton(driver, this.getInjuredYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getInjuredNoOption());
		}
		
	}
	public void selectAddInjury()
	{
		logger.info(format("%s -  going to clikc add injury button", getName()));
		
			GuideWireAccessors.clickGWButton(driver, this.getAddInjuryButton());
	
		
	}
	
	public void setInjuryDesc(String text) {
		sleep(1);
		logger.info(format("%s -  going to set injury desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getInjuryDesc());
	}
	public void selectAreaOfBody(String option, int sequence)
	{
		logger.info(format("%s -  going to select area of body"+option, getName()));
		// use to select the area of body for the first (for now) change to be able to set for any row
	    // just change to use table[x]
		String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table[" + sequence + "]//tr/td[2]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		
	}
	
	public void selectDetailedInjury(String option, int sequence)
	{
		logger.info(format("%s -  going to select detald injury"+option, getName()));
		// use to select the detailed injury for the first (for now) change to be able to set for any row
		sleep(2);
		String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table[" + sequence + "]//tr/td[3]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		
	}
	
	public void selectAmbulanceAttend(boolean attended)
	{
		logger.info(format("%s -  going to set ambulance attended"+attended, getName()));
		
		if (attended)
		{
		GuideWireAccessors.clickGWButton(driver, this.getAmbulanceYesRadio());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getAmbulanceNoRadio());
		}
		
	}
	
	public void selectAirAmbulanceAttend(boolean attended)
	{
		logger.info(format("%s -  going to set air ambulance attended"+attended, getName()));
		
		if (attended)
		{
		GuideWireAccessors.clickGWButton(driver, this.getAirAmbulanceYesRadio());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getAirAmbulanceNoRadio());
		}
		
	}
	
	public void selectHospitalAttend(boolean attended)
	{
		logger.info(format("%s -  going to set hospital attended"+attended, getName()));
		
		if (attended)
		{
		GuideWireAccessors.clickGWButton(driver, this.getHospitalAttendYesRadio());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getHospitalAttendNoRadio());
		}
		
	}
	public void selectOvernightStay(boolean stayed)
	{
		logger.info(format("%s -  going to set overnight stay to:"+stayed, getName()));
	    if (stayed)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getHospitalStayYesRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getHospitalStayNoRadio());
	    }
	
		
	}
	
	public void selectSearchHospital()
	{
		logger.info(format("%s - going to select Search from hospital name picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getHospitalNamePickerIcon(),this.getHospitalNameSearch());
	}
	
   
	private WebElement getCancelButton() {
	return cancelButton;
}

	private WebElement getPageTitle() {
		return pageTitle;
	}
	

	private WebElement getOkButton() {
		return okButton;
	}

	private WebElement getPrefix() {
		return prefix;
	}

	private WebElement getFirstName() {
		return firstName;
	}

	private WebElement getLastName() {
		return lastName;
	}

	private WebElement getMobile() {
		return mobile;
	}

	private WebElement getMainEmail() {
		return mainEmail;
	}

	private WebElement getAddressLine1() {
		return addressLine1;
	}

	private WebElement getAddressLine2() {
		return addressLine2;
	}

	private WebElement getAddressLine3() {
		return addressLine3;
	}

	private WebElement getAddressType() {
		return addressType;
	}

	private List<WebElement> getErrorMessages() {
		return errorMessages;
	}

	

	private WebElement getMiddleName() {
		return middleName;
	}

	private WebElement getGender() {
		return gender;
	}

	private WebElement getDob() {
		return dob;
	}

	private WebElement getCity() {
		return city;
	}

	private WebElement getCounty() {
		return county;
	}

	private WebElement getPostcode() {
		return postcode;
	}

	private WebElement getLocationDesc() {
		return locationDesc;
	}

	private WebElement getValidUntil() {
		return validUntil;
	}

	private WebElement getWorkPhone() {
		return workPhone;
	}

	private WebElement getHomePhone() {
		return homePhone;
	}

	private WebElement getPrimaryPhoneDropdown() {
		return primaryPhoneDropdown;
	}

	private WebElement getAltEmail() {
		return altEmail;
	}

	private WebElement getNiNumber() {
		return niNumber;
	}

	private WebElement getLicenseNumber() {
		return licenseNumber;
	}

	private WebElement getNotes() {
		return notes;
	}

	
	private WebElement getInjuredYesOption() {
		return injuredYesOption;
	}

	private WebElement getInjuredNoOption() {
		return injuredNoOption;
	}

	private WebElement getInjuryDesc() {
		return injuryDesc;
	}

	private WebElement getAddInjuryButton() {
		return addInjuryButton;
	}

	private WebElement getPassengerNameDropdown() {
		return passengerNameDropdown;
	}

	private WebElement getWhereInVehicleDropdown() {
		return whereInVehicleDropdown;
	}

	private WebElement getPassengerWearingSeatbeltYesOption() {
		return passengerWearingSeatbeltYesOption;
	}

	private WebElement getPassengerWearingSeatbeltNoOption() {
		return passengerWearingSeatbeltNoOption;
	}

	private WebElement getAmbulanceYesRadio() {
		return ambulanceYesRadio;
	}

	private WebElement getAmbulanceNoRadio() {
		return ambulanceNoRadio;
	}

	private WebElement getAirAmbulanceYesRadio() {
		return airAmbulanceYesRadio;
	}

	private WebElement getAirAmbulanceNoRadio() {
		return airAmbulanceNoRadio;
	}

	private WebElement getHospitalAttendYesRadio() {
		return hospitalAttendYesRadio;
	}

	private WebElement getHospitalAttendNoRadio() {
		return hospitalAttendNoRadio;
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

	private WebElement getHospitalStayYesRadio() {
		return hospitalStayYesRadio;
	}

	private WebElement getHospitalStayNoRadio() {
		return hospitalStayNoRadio;
	}

	


}
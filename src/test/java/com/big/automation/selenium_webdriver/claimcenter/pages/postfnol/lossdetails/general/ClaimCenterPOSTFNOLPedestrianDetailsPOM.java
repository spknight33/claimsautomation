package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.lossdetails.general;

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

public class ClaimCenterPOSTFNOLPedestrianDetailsPOM extends BaseTest {

	// could be merged with person later

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ttlBar")
	private WebElement pageTitle;

	
	
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:Edit")
	private WebElement editButton;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:Update")
	private WebElement okButton;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:Cancel")
	private WebElement cancelButton;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:Prefix-inputEl")
	private WebElement prefix;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl")
	private WebElement firstName;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:MiddleName-inputEl")
	private WebElement middleName;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:GlobalPersonNameInputSet:LastName-inputEl")
	private WebElement lastName;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Gender-inputEl")
	private WebElement gender;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:DateOfBirth-inputEl")
	private WebElement dob;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine1-inputEl")
	private WebElement addressLine1;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine2-inputEl")
	private WebElement addressLine2;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:AddressLine3-inputEl")
	private WebElement addressLine3;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:City-inputEl")
	private WebElement city;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:County-inputEl")
	private WebElement county;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:PostalCode-inputEl")
	private WebElement postCode;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:addresses-inputEl")
	private WebElement addressPicker;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_AddressType-inputEl")
	private WebElement addressType;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement locationDesc;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_businessphone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement workPhone;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_homephone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement homePhone;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_mobile:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement mobile;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_primarytype-inputEl")
	private WebElement primaryPhoneDropdown;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:reporter_email-inputEl")
	private WebElement mainEmail;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Email2-inputEl")
	private WebElement altEmail;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:NationalInsurance_itb-inputEl")
	private WebElement niNumber;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Notes-inputEl")
	private WebElement notes;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryCardTab")
	private WebElement injuryTab;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuredBoolean_true-inputEl")
	private WebElement injuredTrueRadio;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuredBoolean_false-inputEl")
	private WebElement injuredFalseRadio;

	// INJURY SECTION
	// --------------

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:InjuryDescription-inputEl")
	private WebElement injuredDesc;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:EditableBodyPartDetailsLV_tb:Add")
	private WebElement addInjuryButton;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:AmbulanceAttended_itb_true-inputEl")
	private WebElement ambulanceYesRadio;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:AmbulanceAttended_itb_false-inputEl")
	private WebElement ambulanceNoRadio;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:AirAmbulanceAttended_itb_true-inputEl")
	private WebElement airAmbulanceYesRadio;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:AirAmbulanceAttended_itb_false-inputEl")
	private WebElement airAmbulanceNoRadio;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalAttended_itb_true-inputEl")
	private WebElement hospitalAttendYesRadio;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalAttended_itb_false-inputEl")
	private WebElement hospitalAttendNoRadio;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb-inputEl")
	private WebElement hospitalNameDropdown;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb:Hospital_itbMenuIcon")
	private WebElement hospitalNamePickerIcon;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalDetails_itb:Hospital_itb:MenuItem_Search-itemEl")
	private WebElement hospitalNameSearch;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalDetails_itb:OvernightStayInHospital_itb_true-inputEl")
	private WebElement hospitalStayYesRadio;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalDetails_itb:OvernightStayInHospital_itb_false-inputEl")
	private WebElement hospitalStayNoRadio;

	// Injury MOJ section
	// ---------------------------------------------
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:MOJStatusLV_tb:Add")
	private WebElement addMojButton;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:MOJStatusLV_tb:Remove")
	private WebElement removeMojButton;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:LiabilityDistribution_InsuredLiability-inputEl")
	private WebElement mojInsuredLiability;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:LiabilityDistribution_ClaimantLiability-inputEl")
	private WebElement mojClaimantLiability;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:LiabilityDistribution_OtherLiability-inputEl")
	private WebElement mojOtherLiability;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:NonEconomicDamages_Low-inputEl")
	private WebElement mojLowDamages;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:NonEconomicDamages_High-inputEl")
	private WebElement mojHighDamages;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:NonEconomicDamages_Likely-inputEl")
	private WebElement mojOfferDamages;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:TotalValue_Low-inputEl")
	private WebElement mojTotalLowValue;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:TotalValue_High-inputEl")
	private WebElement mojTotalHighValue;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:TotalValue_Likely-inputEl")
	private WebElement mojTotalOfferValue;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:TotalValue_Amount-inputEl")
	private WebElement mojTotalValue;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:TotalValue_AvailableReserves-inputEl")
	private WebElement mojTotalReserves;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:TotalValue_TotalIncurredNet-inputEl")
	private WebElement mojNetTotal;

	public String getName() {

		return "Pedestrian Contact Information (post FNOL)";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(3);

		logger.info(format("%s -found page title for page :" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	public void selectEdit() {

		logger.info(format("%s -  going to click edit", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getEditButton());

	}

	public void selectCancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());

	}

	public void selectOK() {
		logger.info(format("%s -  going to click OK", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkButton());

	}

	public void selectPrefix(String option) {
		logger.info(format("%s -  going to select prefix ", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrefix(), 1);

	}

	public void setFirstName(String text) {
		logger.info(format("%s -  going to set first name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFirstName());

	}

	public void setMiddleName(String text) {
		logger.info(format("%s -  going to set middle name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMiddleName());

	}

	public void setLastName(String text) {
		logger.info(format("%s -  going to set last name", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLastName());

	}

	public void selectGender(String option) {
		logger.info(format("%s -  going to select geneder type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getGender(), 1);

	}

	// ADDRESS details
	// -------------------------
	public void setAddressLine1(String text) {
		logger.info(format("%s -  going to set address line1", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine1());

	}

	public void setAddressLine2(String text) {
		logger.info(format("%s -  going to set address line2", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());

	}

	public void setAddressLine3(String text) {
		logger.info(format("%s -  going to set address line3", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine3());

	}

	public void setCity(String text) {
		logger.info(format("%s -  going to set city", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCity());

	}

	public void setCounty(String text) {
		logger.info(format("%s -  going to set county", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCounty());

	}

	public void setPostcode(String text) {
		logger.info(format("%s -  going to set postcode:" + text, getName()));
		GuideWireAccessors.clickGWButton(driver, this.getPostCode());
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostCode());
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostCode());
		// as postcode causes display off other address fields, but this can take a
		// couple of seconds - the next method should wait until available but add a
		// slug anyway
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		sleep(2);

	}

	public void selectAddress(String option) {
		logger.info(format("%s -  going to select address for postcode:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressPicker(), 1);

	}

	public void selectAddressType(String option) {
		logger.info(format("%s -  going to select address type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressType(), 1);

	}

	public void setAddressLocation(String text) {
		logger.info(format("%s -  going to set address location desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());

	}

	public void setWorkPhone(String text) {
		logger.info(format("%s -  going to set workphone", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getWorkPhone());

	}

	public void setHomePhone(String text) {
		logger.info(format("%s -  going to set homephone", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getHomePhone());

	}

	public void setMobile(String text) {
		logger.info(format("%s -  going to set mobile", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMobile());

	}

	public void selectPrimaryPhone(String option) {
		logger.info(format("%s -  going to select primary phone type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrimaryPhoneDropdown(), 1);

	}

	public void setEmail(String text) {
		logger.info(format("%s -  going to set email", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMainEmail());

	}

	public void setAltEmail(String text) {
		logger.info(format("%s -  going to set altemail", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAltEmail());

	}

	public void setNiNumber(String text) {
		logger.info(format("%s -  going to set ninumber", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNiNumber());

	}

	public void setNotes(String text) {
		logger.info(format("%s -  going to set notes", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNotes());

	}

	// Injury Section
	// -------------------------------------

	public void clickInjuryTab() {
		logger.info(format("%s -  going to click injury tab", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getInjuryTab());
	}

	public void selectInjured(boolean injured) {
		logger.info(format("%s -  going to set injured" + injured, getName()));

		if (injured) {
			GuideWireAccessors.clickGWButton(driver, this.getInjuredTrueRadio());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getInjuredFalseRadio());
		}

	}

	public void selectAddInjury() {
		logger.info(format("%s -  going to clikc add injury button", getName()));

		GuideWireAccessors.clickGWButton(driver, this.getAddInjuryButton());
		sleep(1); // give time for table load
	}

	public void setInjuryDesc(String text) {
		sleep(1);
		logger.info(format("%s -  going to set injury desc", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getInjuredDesc());
	}

	public void selectAreaOfBody(String option, int sequence) {
		logger.info(format("%s -  going to select area of body" + option, getName()));
		// use to select the area of body for the first (for now) change to be able to
		// set for any row
		// just change to use table[x]
		String locator = "//*[@id=\"PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table["
				+ sequence + "]//tr/td[2]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);

	}

	public void selectDetailedInjury(String option, int sequence) {
		logger.info(format("%s -  going to select detald injury" + option, getName()));
		// use to select the detailed injury for the first (for now) change to be able
		// to set for any row
		sleep(2);
		String locator = "//*[@id=\"PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table["
				+ sequence + "]//tr/td[3]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);

	}

	public void selectAmbulanceAttend(boolean attended) {
		logger.info(format("%s -  going to set ambulance attended" + attended, getName()));

		if (attended) {
			GuideWireAccessors.clickGWButton(driver, this.getAmbulanceYesRadio());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getAmbulanceNoRadio());
		}

	}

	public void selectAirAmbulanceAttend(boolean attended) {
		logger.info(format("%s -  going to set air ambulance attended" + attended, getName()));

		if (attended) {
			GuideWireAccessors.clickGWButton(driver, this.getAirAmbulanceYesRadio());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getAirAmbulanceNoRadio());
		}

	}

	public void selectHospitalAttend(boolean attended) {
		logger.info(format("%s -  going to set hospital attended" + attended, getName()));

		if (attended) {
			GuideWireAccessors.clickGWButton(driver, this.getHospitalAttendYesRadio());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getHospitalAttendNoRadio());
		}

	}

	public void selectOvernightStay(boolean stayed) {
		logger.info(format("%s -  going to set overnight stay to:" + stayed, getName()));
		if (stayed) {
			GuideWireAccessors.clickGWButton(driver, this.getHospitalStayYesRadio());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getHospitalStayNoRadio());
		}

	}

	public void selectSearchHospital() {
		logger.info(format("%s - going to select Search from hospital name picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getHospitalNamePickerIcon(),
				this.getHospitalNameSearch());
	}

	// Injury MOJ section
	// ----------------------------------------------------
public int getCountMoj() {
		
		logger.info(format("%s -  going to get count of MOjs", getName()));
		String locator="//*[@id=\"PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:MOJStatusLV-body\"]//table";
		List<WebElement> elements = driver.findElements(By.xpath(locator));
		
		
		return elements.size();
	}
	public void selectAddMoj() {
		logger.info(format("%s -  going to click add moj button", getName()));

		GuideWireAccessors.clickGWButton(driver, this.getAddMojButton());
		sleep(1); // give time for table load
	}
	
	
	public void selectMojInjuryType(String option, int sequence) {
		logger.info(format("%s -  going to select moj injury type" + option, getName()));
		// use to select the moj injury type for the nth value
		String locator = "//*[@id=\"PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:MOJStatusLV-body\"]//table["
				+ sequence + "]//tr/td[2]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		sleep(1);

	}
	public void setMojCreationDate(String text, int sequence) {
		logger.info(format("%s -  going to set moj creation date :" + text, getName()));
		
		String locator = "//*[@id=\"PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentStatusInputSet:MOJStatusLV-body\"]//table["
				+ sequence + "]//tr/td[3]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.clickGWButton(driver, element); // this will cause element to go stale, so get again
		sleep(1);
		// date setter is actually  in a different part of the page!
		locator = "//input[contains(@id,\"datefield-\")]";
		element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.setGWTextBox(driver, text, element); // use the no wait method for this date field

	}
	

	

	public void setMojInsuredLiability(String text) {

		logger.info(format("%s -  going to set moj insured liability:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMojInsuredLiability());
	}

	public void setMojClaimantLiability(String text) {

		logger.info(format("%s -  going to set moj claimant liability:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMojClaimantLiability());
	}

	public void setMojOtherLiability(String text) {

		logger.info(format("%s -  going to set moj other liability:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMojOtherLiability());
	}

	public void setMojLowDamages(String text) {

		logger.info(format("%s -  going to set moj low damages:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMojLowDamages());
	}

	public void setMojHighDamages(String text) {

		logger.info(format("%s -  going to set moj high damages:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMojHighDamages());
	}

	public void setMojOfferDamages(String text) {

		logger.info(format("%s -  going to set moj offer damages:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMojOfferDamages());
	}

//TODO getter for read only fields
	public void setMojTotal(String text) {

		logger.info(format("%s -  going to set moj total:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMojTotalValue());
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getPageTitle() {
		return pageTitle;
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


	private WebElement getCity() {
		return city;
	}

	private WebElement getPostCode() {
		return postCode;
	}

	private WebElement getWorkPhone() {
		return workPhone;
	}

	private WebElement getOkButton() {
		return okButton;
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

	private WebElement getInjuredTrueRadio() {
		return injuredTrueRadio;
	}

	private WebElement getInjuredFalseRadio() {
		return injuredFalseRadio;
	}

	private WebElement getInjuredDesc() {
		return injuredDesc;
	}

	private WebElement getCounty() {
		return county;
	}

	private WebElement getAddressPicker() {
		return addressPicker;
	}

	private WebElement getLocationDesc() {
		return locationDesc;
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

	private WebElement getNotes() {
		return notes;
	}

	private WebElement getAddInjuryButton() {
		return addInjuryButton;
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

	private WebElement getInjuryTab() {
		return injuryTab;
	}

	private WebElement getAddMojButton() {
		return addMojButton;
	}

	private WebElement getRemoveMojButton() {
		return removeMojButton;
	}

	private WebElement getMojInsuredLiability() {
		return mojInsuredLiability;
	}

	private WebElement getMojClaimantLiability() {
		return mojClaimantLiability;
	}

	private WebElement getMojOtherLiability() {
		return mojOtherLiability;
	}

	private WebElement getMojLowDamages() {
		return mojLowDamages;
	}

	private WebElement getMojHighDamages() {
		return mojHighDamages;
	}

	private WebElement getMojOfferDamages() {
		return mojOfferDamages;
	}

	private WebElement getMojTotalLowValue() {
		return mojTotalLowValue;
	}

	private WebElement getMojTotalHighValue() {
		return mojTotalHighValue;
	}

	private WebElement getMojTotalOfferValue() {
		return mojTotalOfferValue;
	}

	private WebElement getMojTotalValue() {
		return mojTotalValue;
	}

	private WebElement getMojTotalReserves() {
		return mojTotalReserves;
	}

	private WebElement getMojNetTotal() {
		return mojNetTotal;
	}

	private WebElement getEditButton() {
		return editButton;
	}
	

}
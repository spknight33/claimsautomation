package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol;

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

public class ClaimCenterPOSTFNOLDriverDetailsPOM extends BaseTest {

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ttlBar")
	private WebElement pageTitle;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:Edit")
	private WebElement editButton;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:Update")
	private WebElement okupdateButton;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:Cancel")
	private WebElement cancelButton;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:ClaimContactPerson-inputEl")
	private WebElement driverNameDropdown;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:DriverRelationToOwner-inputEl")
	private WebElement relationToOwnerDropdown;

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

	// tp only here TODO
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:PedestrianOrDriverOrPassengerDetails:PedestrianOrDriverOrPassengerRoleInputSet:WereTheyWearingASeatBelt_itb_true-inputEl")
	private WebElement tpWearingSeatbeltYesOption;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:PedestrianOrDriverOrPassengerDetails:PedestrianOrDriverOrPassengerRoleInputSet:WereTheyWearingASeatBelt_itb_false-boxLabelEl")
	private WebElement tpWearingSeatbeltNoOption;

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
	private WebElement postcode;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:globalAddress:GlobalAddressInputSet:addresses-inputEl")
	private WebElement postCodeAddressDropdown;

	private WebElement getPostCodeAddressDropdown() {
		return postCodeAddressDropdown;
	}

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_AddressType-inputEl")
	private WebElement addressType;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_Description-inputEl")
	private WebElement locationDesc;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:CCAddressInputSet:globalAddressContainer:Address_ValidUntil-inputEl")
	private WebElement validUntil;

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

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:DriverLicense-inputEl")
	private WebElement licenseNumber;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Notes-inputEl")
	private WebElement notes;

	// INDEMNITY SECTION
	// ---------------------------
	// TODO - the policy retrieved fields
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimFullTimeOccupation-inputEl")
	private WebElement indemnityOccupationDropdown;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimLicenceType-inputEl")
	private WebElement indemnityLicenseTypeDropdown;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:Notes-inputEl")
	private WebElement indemnityLicenseLengthDropdown;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMedicalConditions-inputEl")
	private WebElement indemnityMedicalDropdown;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHasPreviousMotorClaims_true-inputEl")
	private WebElement indemnityIncLast5YesOption;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHasPreviousMotorClaims_false-inputEl")
	private WebElement indemnityIncLast5NoOption;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHasMotorConvictions_true-inputEl")
	private WebElement indemnityOffenceLast5YesOption;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHasMotorConvictions_false-inputEl")
	private WebElement indemnityOffenceLast5NoOption;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:DrinkOrDrugProsecutionInd-inputEl")
	private WebElement indemnityProsecutionDropdown;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:DriverTestedAtSceneInd_true-inputEl")
	private WebElement indemnityDriverTestedYesOption;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:DriverTestedAtSceneInd_false-inputEl")
	private WebElement indemnityDriverTestedNoOption;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:WearingSeatbeltInd-inputEl")
	private WebElement indemnitySeatbeltDropdown;

	// Injury section
	// --------------------------------------------
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryCardTab")
	private WebElement injuryTab;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuredBoolean_true-inputEl")
	private WebElement injuredYesOption;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuredBoolean_false-inputEl")
	private WebElement injuredNoOption;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:InjuryDescription-inputEl")
	private WebElement injuryDesc;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:EditableBodyPartDetailsLV_tb:Add")
	private WebElement addInjuryButton;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:AmbulanceAttended_itb_true-inputEl")
	private WebElement ambulanceYesRadio;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:AmbulanceAttended_itb_false-inputEll")
	private WebElement ambulanceNoRadio;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:AirAmbulanceAttended_itb_true-inputEl")
	private WebElement airAmbulanceYesRadio;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:AirAmbulanceAttended_itb_false-inputEll")
	private WebElement airAmbulanceNoRadio;

	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalAttended_itb_true-inputEl")
	private WebElement hospitalAttendYesRadio;
	@FindBy(id = "PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:HospitalAttended_itb_false-boxLabelEl")
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

	@FindBy(className = "message")
	private List<WebElement> errorMessages;

	public String getName() {

		return "Post FNOL Edit Driver";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(3);

		logger.info(format("%s -found page title for page :" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());

	}

	public void selectOKOrUpdate() {
		logger.info(format("%s -  going to click OK OR UPDATE", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOkupdateButton());

	}

	public void selectDriverName(String option) {
		logger.info(format("%s - going to select Driver name option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDriverNameDropdown(), 1);
	}

	public void selectRelationToOwner(String option) {
		logger.info(format("%s - going to select relation to owner option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getRelationToOwnerDropdown(), 1);
	}

	public void selectPrefix(String option) {
		logger.info(format("%s -  going to select prefix:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrefix(), 1);

	}

	public void setFirstName(String text) {
		logger.info(format("%s -  going to set first name:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFirstName());

	}

	public void setMiddleName(String text) {
		logger.info(format("%s -  going to set middle name:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMiddleName());

	}

	public void setLastName(String text) {
		logger.info(format("%s -  going to set last name:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLastName());

	}

	public void selectGender(String option) {
		logger.info(format("%s -  going to set gender:" + option, getName()));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getGender(), 1);
		
	}

	public void setDob(String text) {
		
		logger.info(format("%s -  going to set dob:" + text, getName()));
		sleep(1);
		GuideWireAccessors.setGWTextBox(driver, text, this.getDob());

	}

	public void setAddressLine1(String text) {
		logger.info(format("%s -  going to set address line1:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine1());

	}

	public void setAddressLine2(String text) {
		logger.info(format("%s -  going to set address line2:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());

	}

	public void setAddressLine3(String text) {
		logger.info(format("%s -  going to set address line3:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine3());

	}

	public void setCity(String text) {
		logger.info(format("%s -  going to set city:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCity());

	}

	public void setCounty(String text) {
		logger.info(format("%s -  going to set County:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCounty());

	}

	public void setPostcode(String text) {
		logger.info(format("%s -  going to set postcode:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostcode());
		// as postcode causes display off other address fields, but this can take a
		// couple of seconds - the next method should wait until available but add a
		// slug anyway
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		sleep(2);

	}

	public void selectPostcodeAddress(String option) {
		logger.info(format("%s -  going to select address:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPostCodeAddressDropdown(), 1);

	}

	public void selectAddressType(String option) {
		logger.info(format("%s -  going to select address type:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressType(), 1);

	}

	public void setLocationDesc(String text) {
		logger.info(format("%s -  going to set location desc:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());

	}

	// TODO - phone etc
	public void setWorkPhone(String text) {
		logger.info(format("%s -  going to set workphone:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getWorkPhone());
		GuideWireAccessors.setGWTextBox(driver, text, this.getWorkPhone());

	}

	public void setHomePhone(String text) {
		logger.info(format("%s -  going to set homephone:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getHomePhone());
		GuideWireAccessors.setGWTextBox(driver, text, this.getHomePhone());

	}

	public void setMobile(String text) {
		logger.info(format("%s -  going to set mobile:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMobile());

	}

	public void selectPrimaryPhone(String option) {
		logger.info(format("%s -  going to select primary phone type:"+option, getName()));
		sleep(1);
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrimaryPhoneDropdown(), 1);

	}

	public void setEmail(String text) {
		logger.info(format("%s -  going to set email:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMainEmail());

	}

	public void setAltEmail(String text) {
		logger.info(format("%s -  going to set altemail:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAltEmail());

	}

	public void setNiNumber(String text) {
		logger.info(format("%s -  going to set ninumber:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNiNumber());

	}
	
	public void setLicenseNo(String text) {
		logger.info(format("%s -  going to set license no:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLicenseNumber());

	}
	public void setNotes(String text) {
		logger.info(format("%s -  going to set notes:" + text, getName()));
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
			GuideWireAccessors.clickGWButton(driver, this.getInjuredYesOption());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getInjuredNoOption());
		}

	}

	public void selectAddInjury() {
		logger.info(format("%s -  going to clikc add injury button", getName()));

		GuideWireAccessors.clickGWButton(driver, this.getAddInjuryButton());

	}

	public void setInjuryDesc(String text) {
		sleep(1);
		logger.info(format("%s -  going to set injury desc:" + text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getInjuryDesc());
	}

	public void selectAreaOfBody(String option, int sequence) {
		logger.info(format("%s -  going to select area of body:" + option, getName()));
		// use to select the area of body for the first (for now) change to be able to
		// set for any row
		// just change to use table[x]
		String locator = "//*[@id=\"PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table["
				+ sequence + "]//tr/td[2]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);

	}

	public void selectDetailedInjury(String option, int sequence) {
		logger.info(format("%s -  going to select detald injury:" + option, getName()));
		// use to select the detailed injury for the first (for now) change to be able
		// to set for any row
		sleep(2);
		String locator = "//*[@id=\"PostFNOLContactPopup:FNOLContactScreen:InjuryIncidentInputSet:EditableBodyPartDetailsLV-body\"]//table["
				+ sequence + "]//tr/td[3]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);

	}

	public void selectAmbulanceAttend(boolean attended) {
		logger.info(format("%s -  going to set ambulance attended:" + attended, getName()));

		if (attended) {
			GuideWireAccessors.clickGWButton(driver, this.getAmbulanceYesRadio());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getAmbulanceNoRadio());
		}

	}

	public void selectAirAmbulanceAttend(boolean attended) {
		logger.info(format("%s -  going to set air ambulance attended:" + attended, getName()));

		if (attended) {
			GuideWireAccessors.clickGWButton(driver, this.getAirAmbulanceYesRadio());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getAirAmbulanceNoRadio());
		}

	}

	public void selectHospitalAttend(boolean attended) {
		logger.info(format("%s -  going to set hospital attended:" + attended, getName()));

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

	// TODO getter for read only fields
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

	private WebElement getDriverNameDropdown() {
		return driverNameDropdown;
	}

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getOkupdateButton() {
		return okupdateButton;
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

	private WebElement getRelationToOwnerDropdown() {
		return relationToOwnerDropdown;
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

	private WebElement getIndemnityOccupationDropdown() {
		return indemnityOccupationDropdown;
	}

	private WebElement getIndemnityLicenseTypeDropdown() {
		return indemnityLicenseTypeDropdown;
	}

	private WebElement getIndemnityLicenseLengthDropdown() {
		return indemnityLicenseLengthDropdown;
	}

	private WebElement getIndemnityMedicalDropdown() {
		return indemnityMedicalDropdown;
	}

	private WebElement getIndemnityIncLast5YesOption() {
		return indemnityIncLast5YesOption;
	}

	private WebElement getIndemnityIncLast5NoOption() {
		return indemnityIncLast5NoOption;
	}

	private WebElement getIndemnityOffenceLast5YesOption() {
		return indemnityOffenceLast5YesOption;
	}

	private WebElement getIndemnityOffenceLast5NoOption() {
		return indemnityOffenceLast5NoOption;
	}

	private WebElement getIndemnityProsecutionDropdown() {
		return indemnityProsecutionDropdown;
	}

	private WebElement getIndemnityDriverTestedYesOption() {
		return indemnityDriverTestedYesOption;
	}

	private WebElement getIndemnityDriverTestedNoOption() {
		return indemnityDriverTestedNoOption;
	}

	private WebElement getIndemnitySeatbeltDropdown() {
		return indemnitySeatbeltDropdown;
	}

	private WebElement getTpWearingSeatbeltYesOption() {
		return tpWearingSeatbeltYesOption;
	}

	private WebElement getTpWearingSeatbeltNoOption() {
		return tpWearingSeatbeltNoOption;
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

}
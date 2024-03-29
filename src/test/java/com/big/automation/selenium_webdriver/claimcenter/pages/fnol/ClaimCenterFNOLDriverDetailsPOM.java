package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLDriverDetailsPOM extends BaseTest{

		
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:Update-btnEl")
	private WebElement okButton;
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	

	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:ClaimContactPerson-inputEl")
	private WebElement driverNameDropdown;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:DriverRelationToOwner-inputEl")
	private WebElement relationToOwnerDropdown;
	
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
	
	
	//tp only here
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:PedestrianOrDriverOrPassengerDetails:PedestrianOrDriverOrPassengerRoleInputSet:WereTheyWearingASeatBelt_itb_true-inputEl")
	private WebElement tpWearingSeatbeltYesOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:FNOLContactInputSet:PedestrianOrDriverOrPassengerDetails:PedestrianOrDriverOrPassengerRoleInputSet:WereTheyWearingASeatBelt_itb_false-boxLabelEl")
	private WebElement tpWearingSeatbeltNoOption;

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
	
	//INDEMNITY SECTION 
	//---------------------------
	//TODO - the policy retrieved fields
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimPrimaryOccupation-inputEl")
	private WebElement indemnityOccupationDropdown;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimLicenceType-inputEl")
	private WebElement indemnityLicenseTypeDropdown;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHowLongHasLicence-inputEl")
	private WebElement indemnityLicenseLengthDropdown;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:UKResident_true-inputEl")
	private WebElement resident5YearsYesOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:UKResident_false-inputEl")
	private WebElement resident5YearsNoOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:UKResidencyInputSet:ResidencyMonth-inputEl")
	private WebElement residentSinceMonthDropdown;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:UKResidencyInputSet:ResidencyYear-inputEl")
	private WebElement residentSinceYear;
	
		
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMedicalConditions-inputEl")
	private WebElement indemnityMedicalDropdown;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMedicalDetails-inputEl")
	private WebElement indemnityMedicalDetails;
	
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHasPreviousMotorClaims_true-inputEl")
	private WebElement indemnityIncLast5YesOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHasPreviousMotorClaims_false-inputEl")
	private WebElement indemnityIncLast5NoOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimPreviousClaims:PreviousDriverClaimsLV_tb:Add")
	private WebElement indemnityIncLast5AddButton;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHasMotorConvictions_true-inputEl")
	private WebElement indemnityOffenceLast5YesOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimHasMotorConvictions_false-inputEl")
	private WebElement indemnityOffenceLast5NoOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMotorConvictions:MotorConvictionsLV_tb:Add")
	private WebElement indemnityOffenceLast5AddButton;
	
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:DrinkOrDrugProsecutionInd-inputEl")
	private WebElement indemnityProsecutionDropdown;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:DriverTestedAtSceneInd_true-inputEl")
	private WebElement indemnityDriverTestedYesOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:DriverTestedAtSceneInd_false-inputEl")
	private WebElement indemnityDriverTestedNoOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:DriverTestDetails-inputEl")
	private WebElement indemnityDriverTestedDetails;
	
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:WearingSeatbeltInd-inputEl")
	private WebElement indemnitySeatbeltDropdown;
	
	// Injury section
	//--------------------------------------------
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuredBoolean_true-inputEl")
	private WebElement injuredYesOption;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuredBoolean_false-inputEl")
	private WebElement injuredNoOption;
	
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:InjuryDescription-inputEl")
	private WebElement injuryDesc;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:EditableBodyPartDetailsLV_tb:Add")
	private WebElement addInjuryButton;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:Severity-inputEl")
	private WebElement severityDropdown;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:AmbulanceAttended_itb_true-inputEl")
	private WebElement ambulanceYesRadio;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:AmbulanceAttended_itb_false-inputEll")
	private WebElement ambulanceNoRadio;
	
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:AirAmbulanceAttended_itb_true-inputEl")
	private WebElement airAmbulanceYesRadio;
	@FindBy(id = "FNOLContactPopup:FNOLContactScreen:ContactDV:InjuryIncidentInputSet:AirAmbulanceAttended_itb_false-inputEl")
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
	

	public boolean containsErrorMessage(String contains)
	{
				
		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}

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
	
	
	//Driver personal details section
	//--------------------------------------------
	public void selectDriverName(String option)
	{
		logger.info(format("%s - going to select Driver name option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDriverNameDropdown(),1);
	}
	public void selectRelationToOwner(String option)
	{
		logger.info(format("%s - going to select relation to owner option :"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getRelationToOwnerDropdown(),1);
	}
	public void selectPrefix(String option)
	{
		logger.info(format("%s -  going to select prefix:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrefix(), 1);
		
	}
	public void setFirstName(String text)
	{
		logger.info(format("%s -  going to set first name:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getFirstName());
		
	}
	public void setMiddleName(String text)
	{
		logger.info(format("%s -  going to set middle name:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMiddleName());
		
	}
	public void setLastName(String text)
	{
		logger.info(format("%s -  going to set last name:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLastName());
		
	}
	public void selectGender(String text)
	{
		logger.info(format("%s -  going to set gender:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getGender());
		
	}
	public void setDob(String text)
	{
		logger.info(format("%s -  going to set dob:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getDob());
		
	}
	
	
	//Driver address section
	//---------------------
	public void setAddressLine1(String text)
	{
		logger.info(format("%s -  going to set address line1:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine1());
		
	}
	public void setAddressLine2(String text)
	{
		logger.info(format("%s -  going to set address line2:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine2());
		
	}
	public void setAddressLine3(String text)
	{
		logger.info(format("%s -  going to set address line3:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAddressLine3());
		
	}
	public void setCity(String text)
	{
		logger.info(format("%s -  going to set city:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCity());
		
	}
	public void setCounty(String text)
	{
		logger.info(format("%s -  going to set County:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getCounty());
		
	}
	public void setPostcode(String text)
	{
		logger.info(format("%s -  going to set postcode:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getPostcode());
		// as postcode causes display off other address fields, but this can take a couple of seconds - the next method should wait until available but add a slug anyway
				Actions actions = new Actions(driver);
				actions.sendKeys(Keys.TAB);
				actions.build().perform();
				sleep(2);
		
	}
	
	public void selectPostcodeAddress(String option)
	{
		logger.info(format("%s -  going to select address type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPostCodeAddressDropdown(), 1);
		
	}

	public void selectAddressType(String option)
	{
		logger.info(format("%s -  going to select address type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getAddressType(), 1);
		
	}
	public void setLocationDesc(String text)
	{
		logger.info(format("%s -  going to set location desc:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getLocationDesc());
		
	}
	
	//Driver contact details
	//-------------------------
	public void setWorkPhone(String text)
	{
		logger.info(format("%s -  going to set workphone:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getWorkPhone());
		
	}
	public void setHomePhone(String text)
	{
		logger.info(format("%s -  going to set homephone:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getHomePhone());
		
	}
	public void setMobile(String text)
	{
		logger.info(format("%s -  going to set mobile:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMobile());
		
	}
	public void selectPrimaryPhone(String option)
	{
		logger.info(format("%s -  going to select primary phone type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getPrimaryPhoneDropdown(), 2);
		
	}
	
	
	public void setEmail(String text)
	{
		logger.info(format("%s -  going to set email:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getMainEmail());
		
	}
	public void setAltEmail(String text)
	{
		logger.info(format("%s -  going to set altemail:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAltEmail());
		
	}
	public void setNiNumber(String text)
	{
		logger.info(format("%s -  going to set ninumber:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNiNumber());
		
	}
	public void setNotes(String text)
	{
		logger.info(format("%s -  going to set notes:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getNotes());
		
	}
	
	
	//Driver Indemnity Section
	//-----------------------------------------
	public void selectFTOccupation(String option)
	{
		logger.info(format("%s -  going to select fulltime occupation:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getIndemnityOccupationDropdown(), 1);
		
	}
	public void selectLicenseType(String option)
	{
		logger.info(format("%s -  going to select license type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getIndemnityLicenseTypeDropdown(), 1);
		
	}
	public void selectLicenseLength(String option)
	{
		logger.info(format("%s -  going to select license length:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getIndemnityLicenseLengthDropdown(), 1);
		
	}
	
	public void selectResidentOver5Years(boolean resident)
	{
		logger.info(format("%s -  going to set offence in 5 years"+resident, getName()));
		
		if (resident)
		{
		GuideWireAccessors.clickGWButton(driver, this.getResident5YearsYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getResident5YearsNoOption());
		}
		
	}
	
	public void selectResidentSinceMonth(String option)
	{
		logger.info(format("%s -  going to select resident since month:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getResidentSinceMonthDropdown(), 1);
	}
	public void setResidentSinceYear(String text)
	{
		logger.info(format("%s -  going to set resident since year:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getResidentSinceYear());
		
	}
	
	
	public void selectMedicalConditions(String option)
	{
		logger.info(format("%s -  going to select medical conditions:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getIndemnityMedicalDropdown(), 1);
		
	}
	public void setMedicalDetails(String text)
	{
		logger.info(format("%s -  going to set medical detials:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getIndemnityMedicalDetails());
		
	}
	
	
	public void selectIncident5Years(boolean incident)
	{
		logger.info(format("%s -  going to set incident in 5 years"+incident, getName()));
		
		if (incident)
		{
		GuideWireAccessors.clickGWButton(driver, this.getIndemnityIncLast5YesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getIndemnityIncLast5NoOption());
		}
		
	}
	

	public void clickAddIncident5Years()
	{
		logger.info(format("%s -  going to click add incident in 5 years", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getIndemnityIncLast5AddButton());
		
	}
	
	
	public void setIncident5YearsDate(String text, int sequence)
  	{
  	
  		String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimPreviousClaims:PreviousDriverClaimsLV-body\"]//table[" + sequence + "]//tr/td[2]/div";
  		//WebElement element = driver.findElement(By.xpath(locator));
  		String inputLocator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimPreviousClaims:PreviousDriverClaimsLV-body\"]//input[starts-with(@id,'datefield-')]";
		
  		GuideWireAccessors.setGWTextBoxInTable(driver, text, locator, inputLocator);
  		
  	}
	 public void selectIncident5YearsType(String option, int sequence)
	 {
		
	 	String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimPreviousClaims:PreviousDriverClaimsLV-body\"]//table[" + sequence + "]//tr/td[3]/div";
	 	WebElement element = driver.findElement(By.xpath(locator));
	 	GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
			
	 }
	 
	 
	
	public void selectOffence5Years(boolean offence)
	{
		logger.info(format("%s -  going to set offence in 5 years"+offence, getName()));
		
		if (offence)
		{
		GuideWireAccessors.clickGWButton(driver, this.getIndemnityOffenceLast5YesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getIndemnityOffenceLast5NoOption());
		}
		
	}

	public void clickAddOffence5Years()
	{
		logger.info(format("%s -  going to click add offence in 5 years", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getIndemnityOffenceLast5AddButton());
		
	}
	public void setOffence5YearsDate(String text, int sequence)
  	{
  	
  		String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMotorConvictions:MotorConvictionsLV-body\"]//table[" + sequence + "]//tr/td[2]/div";
  		//WebElement element = driver.findElement(By.xpath(locator));
  		String inputLocator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMotorConvictions:MotorConvictionsLV-body\"]//input[starts-with(@id,'datefield-')]";
		
  		GuideWireAccessors.setGWTextBoxInTable(driver, text, locator, inputLocator);
  		
  	}
	 public void selectOffence5YearsCode(String option, int sequence)
		{
		
			String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMotorConvictions:MotorConvictionsLV-body\"]//table[" + sequence + "]//tr/td[3]/div";
			WebElement element = driver.findElement(By.xpath(locator));
			GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
			//need detal
			sleep(2);
			
		}
	 public void setOffence5YearsPoints(String text, int sequence)
	  	{
	  	    sleep(2);
	  		String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMotorConvictions:MotorConvictionsLV-body\"]//table[" + sequence + "]//tr/td[4]/div";
	  		//WebElement element = driver.findElement(By.xpath(locator));
	  		String inputLocator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMotorConvictions:MotorConvictionsLV-body\"]//input[starts-with(@id,'textfield-')]";
			
	  		GuideWireAccessors.setGWTextBoxInTable(driver, text, locator, inputLocator);
	  		
	  	}
	 
	 
	 
	 public void selectOffence5YearsDisqual(String option, int sequence)
		{
		
			String locator = "//*[@id=\"FNOLContactPopup:FNOLContactScreen:ContactDV:DriverIndemnityQuestionsInputSet:ClaimMotorConvictions:MotorConvictionsLV-body\"]//table[" + sequence + "]//tr/td[5]/div";
			WebElement element = driver.findElement(By.xpath(locator));
			GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
			
		}
	 
	 public void selectProsecuted(String option)
		{
			logger.info(format("%s -  going to select prosecuted:"+option, getName()));
			GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getIndemnityProsecutionDropdown(), 1);
		}
	
	//TP only question
		public void selectTPSeatBelt(boolean tpSeatBelt)
		{
			logger.info(format("%s -  going to set TP seat belt:"+tpSeatBelt, getName()));
			
			if (tpSeatBelt)
			{
			GuideWireAccessors.clickGWButton(driver, this.getTpWearingSeatbeltYesOption());
			}
			else
			{
				GuideWireAccessors.clickGWButton(driver, this.getTpWearingSeatbeltNoOption());
			}
			
		}
	 
	public void selectTestedAtScene(boolean tested)
	{
		logger.info(format("%s -  going to set tested at scene:"+tested, getName()));
		
		if (tested)
		{
		GuideWireAccessors.clickGWButton(driver, this.getIndemnityDriverTestedYesOption());
		}
		else
		{
			GuideWireAccessors.clickGWButton(driver, this.getIndemnityDriverTestedNoOption());
		}
		
	}
	public void setTestedAtSceneDetails(String text)
	{
		logger.info(format("%s -  going to set testatschene details:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getIndemnityDriverTestedDetails());
		
	}
	 public void selectIndemnitySeatbelt(String option)
		{
			logger.info(format("%s -  going to select indemnity seatbelt:"+option, getName()));
			GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getIndemnitySeatbeltDropdown(), 2);
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
	

	public void selectInjurySeverity(String option)
	{
		logger.info(format("%s -  going to select injury severity:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getSeverityDropdown(), 1);
		
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
	

	

	
	private WebElement getDriverNameDropdown() {
		return driverNameDropdown;
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

	private WebElement getIndemnityMedicalDetails() {
		return indemnityMedicalDetails;
	}

	private WebElement getIndemnityDriverTestedDetails() {
		return indemnityDriverTestedDetails;
	}

	private WebElement getIndemnityIncLast5AddButton() {
		return indemnityIncLast5AddButton;
	}

	private WebElement getIndemnityOffenceLast5AddButton() {
		return indemnityOffenceLast5AddButton;
	}

	private WebElement getResident5YearsYesOption() {
		return resident5YearsYesOption;
	}

	private WebElement getResident5YearsNoOption() {
		return resident5YearsNoOption;
	}

	private WebElement getResidentSinceMonthDropdown() {
		return residentSinceMonthDropdown;
	}

	private WebElement getResidentSinceYear() {
		return residentSinceYear;
	}

	private WebElement getSeverityDropdown() {
		return severityDropdown;
	}

	


}
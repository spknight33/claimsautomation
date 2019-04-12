package com.big.automation.selenium_webdriver.claimcenter.pages.policycreate;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;
import com.sun.jna.platform.win32.Guid;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

public class ClaimsCenterPolicyNewDriverPOM extends BaseTest {


    @FindBy(id = "NewPMPolicyDriver_itbPopup:ContactDetailScreen:ttlBar")
    private WebElement pageTitle;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:Update-btnInnerEl")
    private WebElement okButton;

    //
    // Person WebElements
    //
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Prefix-inputEl")
    private WebElement titleDropDown;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl")
    private WebElement firstNameTextBox;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl")
    private WebElement lastNameTextBox;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl")
    private WebElement dateOfBirthTextBox;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Gender-inputEl")
    private WebElement genderDropDown;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Occupation-inputEl")
    private WebElement primaryOcupationDropDown;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:MaritalStatus-inputEl")
    private WebElement maritalStatusDropDown;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:UKResident5Years_true-inputEl")
    private WebElement ukResidentYesRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:UKResident5Years_false-inputEl")
    private WebElement ukResidentNoRadio;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Homeowner_true-inputEl")
    private WebElement ownHomeYesRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:Homeowner_false-inputEl")
    private WebElement ownHomeNoRadio;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PHRelationship-inputEl")
    private WebElement relationshipToPolicyholderDropDown;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PrimaryPhone-inputEl")
    private WebElement primaryPhoneDropDown;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
    private WebElement homePhoneTextBox;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
    private WebElement workPhoneText;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
    private WebElement mobilePhoneText;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress1-inputEl")
    private WebElement primaryEmailText;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress2-inputEl")
    private WebElement secondaryEmailText;

    //
    // Second section web elements (roles)
    //
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:LicenseType-inputEl")
    private WebElement drivingLicenceTypeDropDown;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:LicenseNumber-inputEl")
    private WebElement licenceNumberTextBox;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:PassedTest10Years_true-inputEl")
    private WebElement passDrivingTest10YearsAgoYesRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:PassedTest10Years_false-inputEl")
    private WebElement passDrivingTest10YearsAgoNoRadio;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:AccessToOtherVehicles_true-inputEl")
    private WebElement accessToOtherVehiclesYesRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:AccessToOtherVehicles_false-inputEl")
    private WebElement accessToOtherVehiclesNoRadio;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:DrivingQualifications-inputEl")
    private WebElement additionlDrivingQualificationsDropDown;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:MedicalConditions")
    private WebElement medicalConditionsAffectingYourDriving;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:NonMotoringConvictions_true-inputEl")
    private WebElement nonMotoringOffencesYesRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:NonMotoringConvictions_false-inputEl")
    private WebElement nonMotoringOffencesNoRadio;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:CancelledPreviousInsurance_true-inputEl")
    private WebElement cancelledPolicyYesRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:CancelledPreviousInsurance_false-inputEl")
    private WebElement cancelledPolicyNoRadio;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:MotorClaims_true-inputEl")
    private WebElement claims5YearsYesRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:MotorClaims_false-inputEl")
    private WebElement claims5YearsNoRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverClaims:PMClaimsLV_tb:Add-btnInnerEl")
    private WebElement claims5YearsAddButton;
    @FindBy(xpath = "NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverClaims:PMClaimsLV_tb:Add-btnInnerEl")
    private WebElement claimDropDownBox;

    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:MotorConvictions_true-boxLabelEl")
    private WebElement convictions5YearsYesRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:MotorConvictions_false-inputEl")
    private WebElement convictions5YearsNoRadio;
    @FindBy(id ="NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverConvictions:PMConvictionsLV_tb:Add-btnInnerEl")
    private WebElement convictions5YearsAddButton;


    //
    //Methods
    //
    public String getName() {
        return "New Policy Driver";
    }

    private WebElement getPageTitle() {

        return pageTitle;
    }

    public boolean isPageTitleDisplayed(String expected) {
        sleep(1);
        logger.info(format("%s -found page title for :"+this.getPageTitle().getText(), getName()));
        return this.getPageTitle().getText().equalsIgnoreCase(expected);
    }

    public void clickOk()
    {
        GuideWireAccessors.clickGWButton(driver, this.getOkButton());
    }


    //
    //Person Methods
    //
    public void selectTitle(String option){

        logger.info(option);
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getTitleDropDown(),1);
    }

    public void setFirstName(String name){
        GuideWireAccessors.setGWTextBox(driver,name,getFirstNameTextBox());
    }

    public void setLastName(String name){
        GuideWireAccessors.setGWTextBox(driver,name,getLastNameTextBox());
    }

    public void setDateOfBirth(String dob){
        GuideWireAccessors.setGWTextBox(driver,dob,getDateOfBirthTextBox());
    }

    public void selectGender(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getGenderDropDown(),1);
    }

    public void selectPrimaryOcupation(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getPrimaryOcupationDropDown(),1);
    }

    public void selectMaritalStatus(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getMaritalStatusDropDown(),1);
    }

    public void selectUkResident5(Boolean b){
        if(b == true){
            GuideWireAccessors.clickGWButton(driver,getUkResidentYesRadio());
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getUkResidentNoRadio());
        }
    }

    public void selectOwnHome(Boolean b){
        if(b == true){
            GuideWireAccessors.clickGWButton(driver,getOwnHomeYesRadio());
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getOwnHomeNoRadio());
        }
    }

    public void selectRelationshipToPolicyholder(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getRelationshipToPolicyholderDropDown(),1);
    }

    public void selectPrimaryPhone(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getPrimaryPhoneDropDown(),1);
    }

    public void setHomePhone(String name){
        GuideWireAccessors.setGWTextBox(driver,name,getHomePhoneTextBox());
        GuideWireAccessors.clickGWButton(driver,getWorkPhoneText());
    }

    public void setWorkPhone(String name){
        GuideWireAccessors.setGWTextBox(driver,name,getWorkPhoneText());
        GuideWireAccessors.clickGWButton(driver,getHomePhoneTextBox());
    }

    public void setMobilePhone(String name){
        GuideWireAccessors.setGWTextBox(driver,name,getMobilePhoneText());
        GuideWireAccessors.clickGWButton(driver,getHomePhoneTextBox());
    }

    public void setPrimaryEmail(String name){
        GuideWireAccessors.setGWTextBox(driver,name,getPrimaryEmailText());
    }

    public void setSecondaryEmail(String name){
        GuideWireAccessors.setGWTextBox(driver,name,getSecondaryEmailText());
    }

    //
    //Second Section (ROLES)
    //
    public void selectDrivingLicenceType(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getDrivingLicenceTypeDropDown(),1);
    }

    public void setLicenceNumberText(String name){
        GuideWireAccessors.setGWTextBox(driver,name,getLicenceNumberTextBox());
    }

    public void selectDrivingTestPassed10YearsAgo(Boolean b){
        if(b == true){
            GuideWireAccessors.clickGWButton(driver,getPassDrivingTest10YearsAgoYesRadio());
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getPassDrivingTest10YearsAgoNoRadio());
        }
    }

    public void selectAccessToOtherVehicles(Boolean b){
        if(b == true){
            GuideWireAccessors.clickGWButton(driver,getAccessToOtherVehiclesYesRadio());
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getAccessToOtherVehiclesNoRadio());
        }
    }

    public void selectAdditionalDrivingQualifications(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getAdditionlDrivingQualificationsDropDown(),1);
    }

    public void selectMedicalConditionsAffectingYourDriving(String option){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,getMedicalConditionsAffectingYourDriving(),1);
    }

    public void selectNonMotoringOffenses(Boolean b){
        if(b == true){
            GuideWireAccessors.clickGWButton(driver,getNonMotoringOffencesYesRadio());
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getNonMotoringOffencesNoRadio());
        }
    }

    public void selectCancelledPolicy(Boolean b){
        if(b == true){
            GuideWireAccessors.clickGWButton(driver,getCancelledPolicyYesRadio());
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getCancelledPolicyNoRadio());
        }
    }

    public void selectClaimsAccidentsOrLosses(Boolean b){
        if(b == true){
            GuideWireAccessors.clickGWButton(driver,getClaims5YearsYesRadio());
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getClaims5YearsNoRadio());
        }
    }

    public void clickAddPreviousClaimButton(){
        GuideWireAccessors.clickGWButton(driver,getClaims5YearsAddButton());
    }

    public void selectPreviousClaimType(String option, int sequence){
        String typeLocator = "//div[@id = 'NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverClaims:PMClaimsLV-body']//table[" + sequence + "]//td[3]";
        WebElement typeElement = driver.findElement(By.xpath(typeLocator));
        GuideWireAccessors.selectOptionFromGWDropDown(driver,option,typeElement,1);
    }

    public void setPreviousClaimDate(String date, int sequence){
        String dateLocator = "//div[@id = 'NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverClaims:PMClaimsLV-body']//table[" + sequence + "]//td[2]";
        String dateInputLocator = "//div[@id = 'NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverClaims:PMClaimsLV-body']//input[starts-with(@id,'datefield-')]";
        GuideWireAccessors.setGWTextBoxInTable(driver, date, dateLocator, dateInputLocator);
    }

    public void selectConvictions5Years(Boolean b){
        if(b == true){
            GuideWireAccessors.clickGWButton(driver,getConvictions5YearsYesRadio());
        }
        else{
            GuideWireAccessors.clickGWButton(driver,getConvictions5YearsNoRadio());
        }
    }
    
    public void clickAddConvict5()
	{
		logger.info(format("%s -  going to click add Claims in 5 years", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getConvictions5YearsAddButton());

	}

	public void setConvict5Date(String text, int sequence)
	{

		String locator = "//*[@id=\"NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverConvictions:PMConvictionsLV-body\"]//table[" + sequence + "]//tr/td[2]/div";
		//WebElement element = driver.findElement(By.xpath(locator));
		String inputLocator = "//*[@id=\"NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverConvictions:PMConvictionsLV-body\"]//input[starts-with(@id,'datefield-')]";

		GuideWireAccessors.setGWTextBoxInTable(driver, text, locator, inputLocator);

	}

	public void selectConvict5Code(String option, int sequence)
	{

		String locator = "//*[@id=\"NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverConvictions:PMConvictionsLV-body\"]//table[" + sequence + "]//tr/td[3]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);

	}

	public void setConvict5Points(String text, int sequence)
	{

		String locator = "//*[@id=\"NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverConvictions:PMConvictionsLV-body\"]//table[" + sequence + "]//tr/td[4]/div";

		String inputLocator = "//*[@id=\"NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverConvictions:PMConvictionsLV-body\"]//input[starts-with(@id,'textfield-')]";

		GuideWireAccessors.setGWTextBoxInTable(driver, text, locator, inputLocator);

	}

	public void selectConvict5MonthsDisqualified(String option, int sequence)
	{

		String locator = "//*[@id=\"NewPMPolicyDriver_itbPopup:ContactDetailScreen:PMPolicyDriverInfoPanelSet:driverConvictions:PMConvictionsLV-body\"]//table[" + sequence + "]//tr/td[5]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);

	}

    //
    //Getters
    //
    public WebElement getOkButton() {
        return okButton;
    }

    public WebElement getTitleDropDown() {
        return titleDropDown;
    }

    public WebElement getFirstNameTextBox() {
        return firstNameTextBox;
    }

    public WebElement getLastNameTextBox() {
        return lastNameTextBox;
    }

    public WebElement getDateOfBirthTextBox() {
        return dateOfBirthTextBox;
    }

    public WebElement getGenderDropDown() {
        return genderDropDown;
    }

    public WebElement getPrimaryOcupationDropDown() {
        return primaryOcupationDropDown;
    }

    public WebElement getMaritalStatusDropDown() {
        return maritalStatusDropDown;
    }

    public WebElement getUkResidentYesRadio() {
        return ukResidentYesRadio;
    }

    public WebElement getUkResidentNoRadio() {
        return ukResidentNoRadio;
    }

    public WebElement getOwnHomeYesRadio() {
        return ownHomeYesRadio;
    }

    public WebElement getOwnHomeNoRadio() {
        return ownHomeNoRadio;
    }

    public WebElement getRelationshipToPolicyholderDropDown() {
        return relationshipToPolicyholderDropDown;
    }

    public WebElement getPrimaryPhoneDropDown() {
        return primaryPhoneDropDown;
    }

    public WebElement getHomePhoneTextBox() {
        return homePhoneTextBox;
    }

    public WebElement getWorkPhoneText() {
        return workPhoneText;
    }

    public WebElement getMobilePhoneText() {
        return mobilePhoneText;
    }

    public WebElement getPrimaryEmailText() {
        return primaryEmailText;
    }

    public WebElement getSecondaryEmailText() {
        return secondaryEmailText;
    }

    public WebElement getDrivingLicenceTypeDropDown() {
        return drivingLicenceTypeDropDown;
    }

    public WebElement getLicenceNumberTextBox() {
        return licenceNumberTextBox;
    }

    public WebElement getPassDrivingTest10YearsAgoYesRadio() {
        return passDrivingTest10YearsAgoYesRadio;
    }

    public WebElement getPassDrivingTest10YearsAgoNoRadio() {
        return passDrivingTest10YearsAgoNoRadio;
    }

    public WebElement getAccessToOtherVehiclesYesRadio() {
        return accessToOtherVehiclesYesRadio;
    }

    public WebElement getAccessToOtherVehiclesNoRadio() {
        return accessToOtherVehiclesNoRadio;
    }

    public WebElement getAdditionlDrivingQualificationsDropDown() {
        return additionlDrivingQualificationsDropDown;
    }

    public WebElement getMedicalConditionsAffectingYourDriving() {
        return medicalConditionsAffectingYourDriving;
    }

    public WebElement getNonMotoringOffencesYesRadio() {
        return nonMotoringOffencesYesRadio;
    }

    public WebElement getNonMotoringOffencesNoRadio() {
        return nonMotoringOffencesNoRadio;
    }

    public WebElement getCancelledPolicyYesRadio() {
        return cancelledPolicyYesRadio;
    }

    public WebElement getCancelledPolicyNoRadio() {
        return cancelledPolicyNoRadio;
    }

    public WebElement getClaims5YearsYesRadio() {
        return claims5YearsYesRadio;
    }

    public WebElement getClaims5YearsNoRadio() {
        return claims5YearsNoRadio;
    }

    public WebElement getClaims5YearsAddButton() { return claims5YearsAddButton; }

    public WebElement getConvictions5YearsYesRadio() {
        return convictions5YearsYesRadio;
    }

    public WebElement getConvictions5YearsNoRadio() {
        return convictions5YearsNoRadio;
    }

    public WebElement getConvictions5YearsAddButton() { return convictions5YearsAddButton; }

}

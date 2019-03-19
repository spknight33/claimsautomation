package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLStep2POM extends BaseTest {

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "FNOLWizard:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "FNOLWizard:Next")
	private WebElement nextButton;
	@FindBy(id = "FNOLWizard:Prev")
	private WebElement backButton;

	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:RightPanel:FNOLWizard_BasicInfoRightPanelSet:0:InsuredVehicleDV:InsuredVehicleInputGroup:_checkbox")
	private WebElement firstInsuredVehicleCB;

	//Reported By
	//----------------------------------------------------------------
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:HowReported-inputEl")
	private WebElement howReported;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl")
	private WebElement reportedByName;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:ReportedBy_NameMenuIcon")
	private WebElement reportedByPickerIcon;
	// now the New person option
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement reportedByNewPersonPicker;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-itemEl")
	private WebElement reportedByNewCompanyPicker;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:MenuItem_Search-itemEl")
	private WebElement reportedBySearchPicker;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:MenuItem_ViewDetails-textEl")
	private WebElement reportedByViewContactPicker;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Claim_ReportedByType-inputEl")
	private WebElement reportedByRelation;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Notification_ReportedDate-inputEl")
	private WebElement reportedDate;
	
	
    // contact info
	//---------------------------------------
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:DOB-inputEl")
	private WebElement dob;
	
	
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:reporter_Address-inputEl")
	private WebElement contactAddress;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:reporter_businessphone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement contactWorkPhone;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:reporter_homephone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement contactHomePhone;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:reporter_mobile:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl")
	private WebElement contactMobile;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:reporter_primarytype-inputEl")
	private WebElement contactPhoneType;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:reporter_email-inputEl")
	private WebElement contactEmail;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:EditContact")
	private WebElement editContactButton;
	
	// Insured Details
	//-----------------------------------------------
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Insured_Name-inputEl")
	private WebElement insuredName;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Insured_Address-inputEl")
	private WebElement insuredAddress;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Insured_WorkPhone-inputEl")
	private WebElement insuredPrimaryPhone;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:NotifiedByAlertInputSet:NotifiedByAlert_itb_true-inputEl")
	private WebElement alertTrueRadio;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:NotifiedByAlertInputSet:NotifiedByAlert_itb_false-inputEl")
	private WebElement alertFalseRadio;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:NotifiedByAlertInputSet:AlertID_itb-inputEl")
	private WebElement alertId;

	// Main contact
	//-------------------------------------------------------
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContactChoice_true-inputEl")
	private WebElement samePersonTrueRadio;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContactChoice_false-inputEl")
	private WebElement samePersonFalseRadio;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContact_Name-inputEl")
	private WebElement diffPersonNameDropdown;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContact_Name:MainContact_NameMenuIcon")
	private WebElement diffPersonPickerIcon;
	// now the New person option
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContact_Name:ClaimNewPersonOnlyPickerMenuItemSet:ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem-itemEl")
	private WebElement diffPersonNewPersonPicker;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContact_Name:MenuItem_Search-itemEl")
	private WebElement diffPersonSearchPicker;
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Claim_MainContactType-inputEl")
	private WebElement diffPersonRelation;

	

	public String getName() {

		return "FNOL Wizard Step2 Basic Information";
	}
	
    public boolean isPageTitleDisplayed(String expected) {
		
		logger.info(format("%s -found page title for step2 :" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}
    public boolean containsErrorMessage(String contains) {
		
		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
    
    
    public void cancel() {
    	logger.info(format("%s - going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getCancelButton());
		
	}
    
    public void next() {
    	logger.info(format("%s - going to click next", getName()));
		GuideWireAccessors.clickGWButton(driver, getNextButton());
		
	}

	public void back() {
		logger.info(format("%s -going to click back", getName()));
		GuideWireAccessors.clickGWButton(driver, getBackButton());
	}

    //Reported By
    //--------------------------------------------------------------------
	public void selectHowReported(String option) {
		logger.info(format("%s - going to set reported how value to:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getHowReported(), 1);
	}
	
	public void selectReportedByName(String option) {
		logger.info(format("%s - going to select report by name option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, getReportedByName(), 1);
	}
	
	public void selectNewPersonReporter() {
		logger.info(format("%s - going to select New Person from reportedby picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getReportedByPickerLink(), this.getReportedByNewPersonPicker());
	}

	public void selectNewCompanyReporter() {
		logger.info(format("%s - going to select New Company from reportedby picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getReportedByPickerLink(),
				this.getReportedByNewCompanyPicker());
	}

	public void selectSearchReporter() {
		logger.info(format("%s - going to select search from reportedby picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getReportedByPickerLink(), this.getReportedBySearchPicker());
	}
	
	public void selectViewContactReporter() {
		logger.info(format("%s - going to select View contact from reportedby picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getReportedByPickerLink(), this.getReportedByViewContactPicker());
	}

	public void selectRelationToInsured(String option) {
		logger.info(format("%s - going to select relation to insured option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, getReportedByRelation(), 1);
	}

	public void setReportedDateValue(String date) {
		logger.info(format("%s - going to set reported date value to:" + date, getName()));
		GuideWireAccessors.setGWTextBox(driver, date, getReportedDate());

	}

	public String getReportedDateValue() {

		return this.getReportedDate().getText();

	}


	public String getReportedByValue() {

		return this.getReportedByName().getAttribute("value");

	}
	
	
	public String getPolicyHolderAddress() {

		String text=null;
		
		text=  GuideWireAccessors.getGWElementText(driver, this.getContactAddress());
		logger.info(format("%s - found policyholder address:" + text, getName()));
		return text;
	}

	
	// Contact info
	//-----------------------------------------------------------------

	public void setWorkPhone(String text) {
		sleep(1);
		logger.info(format("%s -  going to set Work phone:"+text, getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactWorkPhone());
		
	}

	public void setHomePhone(String text) {
		logger.info(format("%s -  going to set Home phone:"+text, getName()));
		// for bizarre reason. have to set this twice
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactHomePhone());
		sleep(1);
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactHomePhone());
		
	}

	public void setMobile(String text) {
		logger.info(format("%s -  going to set mobile:"+text, getName()));
		// for bizarre reason. have to set this twice
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactMobile());
		sleep(1);
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactMobile());
		
	}

	public void selectPhoneType(String option) {
		sleep(1); //bug means need to wait
		logger.info(format("%s -  going to select phone type:"+option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getContactPhoneType(), 1);
		
	}

	public void setEmail(String text) {
		logger.info(format("%s -  going to set email", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactEmail());
		
	}
	public void clickEditContact() {
		logger.info(format("%s -going to click edit contact", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getEditContactButton());
	}
	
	//Insured read only fields
	//-----------------------------------------
	//TODO
	
	public void selectAlert(boolean alert)
	{
		sleep(2);
		logger.info(format("%s -  going to set alert to:"+alert, getName()));
	    if (alert)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getAlertTrueRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getAlertFalseRadio());
	    }
	
		
	}
	
	public void setAlertId(String text) {
		logger.info(format("%s -  going to set alert id", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getAlertId());
		
	}

	// Main Contact
	//-----------------------------------------------------------
	public void selectMainContactSame(boolean same)
	{
		logger.info(format("%s -  going to set main contact same to:"+same, getName()));
	    if (same)
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getSamePersonTrueRadio());
	    }
	    else
	    {
	    	GuideWireAccessors.clickGWButton(driver, this.getSamePersonFalseRadio());
	    }
	
		
	}
	
	public void selectDiffContactName(String option) {
		logger.info(format("%s - going to select diffferent contact name option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDiffPersonNameDropdown(), 1);
	}
	
	public void selectNewPersonDiffContact() {
		logger.info(format("%s - going to select New Person from different contact picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getDiffPersonPickerIcon(), this.getDiffPersonNewPersonPicker());
	}

	
	public void selectSearchDiffContactRelation() {
		logger.info(format("%s - going to select different contact relation", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getDiffPersonPickerIcon(), this.getDiffPersonSearchPicker());
	}
	
	public void selectDiffContactRelation(String option) {
		logger.info(format("%s - going to select diffferent contact relation :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getDiffPersonRelation(), 1);
	}
	
	
	//Vehicle checkbox
	//-------------------------------------------	
	public void selectVehicleCB() {
		logger.info(format("%s - current CB selection is :" + this.getFirstInsuredVehicleCB().isSelected(), getName()));
		// can be more than one, but just select first for now
		if (!this.getFirstInsuredVehicleCB().isSelected()) {
			this.getFirstInsuredVehicleCB().click();
			logger.info(format("%s - done, select Vehicle", getName()));
			sleep(2);
		}
	}

	public void deselectVehicleCB() {
		// can be more than one, but just deselect first for now
		logger.info(format("%s - done, going to deselect vehicle", getName()));
		// if (this.getFirstInsuredVehicleCB().isSelected())
		// {
		GuideWireAccessors.clickGWButton(driver, this.getFirstInsuredVehicleCB());
		// logger.info(format("%s - done, deselect vehicle", getName()));
		// }
	}
	
	

	private WebElement getNextButton() {

		return nextButton;
	}

	private WebElement getBackButton() {

		return backButton;
	}

	private WebElement getReportedDate() {
		return reportedDate;
	}

	private WebElement getFirstInsuredVehicleCB() {
		;
		return firstInsuredVehicleCB;
	}

	private List<WebElement> getErrorMessages() {
		return driver.findElements(By.className("message"));
	}

	private WebElement getReportedByName() {
		return reportedByName;
	}

	private WebElement getHowReported() {
		return howReported;
	}

	private WebElement getReportedByRelation() {
		return reportedByRelation;
	}



	private WebElement getReportedByPickerLink() {
		return reportedByPickerIcon;
	}

	

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getReportedByPickerIcon() {
		return reportedByPickerIcon;
	}

	private WebElement getReportedByNewPersonPicker() {
		return reportedByNewPersonPicker;
	}

	private WebElement getReportedByNewCompanyPicker() {
		return reportedByNewCompanyPicker;
	}

	private WebElement getReportedBySearchPicker() {
		return reportedBySearchPicker;
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getDob() {
		return dob;
	}

	private WebElement getContactAddress() {
		return contactAddress;
	}

	private WebElement getContactWorkPhone() {
		return contactWorkPhone;
	}

	private WebElement getContactHomePhone() {
		return contactHomePhone;
	}

	private WebElement getContactMobile() {
		return contactMobile;
	}

	private WebElement getContactPhoneType() {
		return contactPhoneType;
	}

	private WebElement getContactEmail() {
		return contactEmail;
	}

	private WebElement getSamePersonTrueRadio() {
		return samePersonTrueRadio;
	}

	private WebElement getSamePersonFalseRadio() {
		return samePersonFalseRadio;
	}

	

	private WebElement getDiffPersonRelation() {
		return diffPersonRelation;
	}
	
	

	private WebElement getEditContactButton() {
		return editContactButton;
	}

	private WebElement getInsuredName() {
		return insuredName;
	}

	private WebElement getInsuredAddress() {
		return insuredAddress;
	}

	private WebElement getInsuredPrimaryPhone() {
		return insuredPrimaryPhone;
	}

	private WebElement getDiffPersonNameDropdown() {
		return diffPersonNameDropdown;
	}

	private WebElement getDiffPersonPickerIcon() {
		return diffPersonPickerIcon;
	}

	private WebElement getDiffPersonNewPersonPicker() {
		return diffPersonNewPersonPicker;
	}

	private WebElement getDiffPersonSearchPicker() {
		return diffPersonSearchPicker;
	}

	private WebElement getAlertTrueRadio() {
		return alertTrueRadio;
	}

	private WebElement getAlertFalseRadio() {
		return alertFalseRadio;
	}

	private WebElement getAlertId() {
		return alertId;
	}

	private WebElement getReportedByViewContactPicker() {
		return reportedByViewContactPicker;
	}

	

}
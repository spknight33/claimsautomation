package com.big.automation.selenium_webdriver.claimcenter.pages;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLStep2POM extends BaseTest {

	@FindBy(id = "FNOLWizard:Next-btnEl")
	private WebElement nextButton;

	@FindBy(id = "FNOLWizard:Prev")
	private WebElement backButton;

	@FindBy(id = "title")
	private WebElement titleDropDown;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:ttlBar")
	private WebElement pageTitle;

	@FindBy(className = "message")
	private List<WebElement> errorMessages;

	// these are not robust finders, so will need revisit, just select fierts for
	// now
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:RightPanel:FNOLWizard_BasicInfoRightPanelSet:0:InsuredVehicleDV:InsuredVehicleInputGroup:_checkbox")
	private WebElement firstInsuredVehicleCB;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:HowReported-inputEl")
	private WebElement howReported;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-inputEl")
	private WebElement reportedByName;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name-trigger-picker")
	private WebElement reportedByNamePicker;
	// this is the picker stuff
	// first the icon
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:ReportedBy_NameMenuIcon")
	private WebElement reportedByPickerLink;
	// now the New person option
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewPerson-itemEl")
	private WebElement newPersonSubLink;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:ClaimNewCompanyOrPersonPickerMenuItemSet:NewContactPickerMenuItemSet_NewCompany-itemEl")
	private WebElement newCompanySubLink;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:ReportedBy_Name:MenuItem_Search-itemEl")
	private WebElement searchSubLink;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Claim_ReportedByType-inputEl")
	private WebElement reportedByRelation;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Notification_ReportedDate-inputEl")
	private WebElement reportedDate;

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
	
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:NotifiedByAlertInputSet:NotifiedByAlert_itb_true-inputEl")
	private WebElement alertTrueRadio;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:NotifiedByAlertInputSet:NotifiedByAlert_itb_false-inputEl")
	private WebElement alertFalseRadio;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:NotifiedByAlertInputSet:AlertID_itb-inputEl")
	private WebElement alertId;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContactChoice_true-inputEl")
	private WebElement samePersonTrueRadio;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContactChoice_false-inputEl")
	private WebElement samePersonFalseRadio;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:MainContact_Name-inputEl")
	private WebElement diffPersonName;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_BasicInfoScreen:PanelRow:BasicInfoDetailViewPanelDV:Claim_MainContactType-inputEl")
	private WebElement diffPersonRelation;

	// TODO diff person new person picker

	public String getName() {

		return "FNOL Wizard Step2 Basic Information";
	}

	public void selectNewPersonReporter() {
		logger.info(format("%s - going to select New Person from reportedby picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getReportedByPickerLink(), this.getNewPersonSubLink());
	}

	public void selectNewCompanyReporter() {
		logger.info(format("%s - going to select New Company from reportedby picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getReportedByPickerLink(),
				this.getNewCompanySubLink());
	}

	public void selectSearchReporter() {
		logger.info(format("%s - going to select search from reportedby picker", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getReportedByPickerLink(), this.getSearchSubLink());
	}

	public void next() {
		GuideWireAccessors.clickGWButton(driver, getNextButton());
		logger.info(format("%s - done, Next clicked", getName()));
	}

	public void back() {
		GuideWireAccessors.clickGWButton(driver, getBackButton());
	}

	public boolean isPageTitleDisplayed(String expected) {
		logger.info(format("%s -check page title for step2 :" + expected, getName()));
		logger.info(format("%s -found page title for step2 :" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().equalsIgnoreCase(expected);
	}

	public String getReportedDateValue() {

		return this.getReportedDate().getText();

	}

	public void setReportedDateValue(String date) {
		logger.info(format("%s - going to set reported date value to:" + date, getName()));
		GuideWireAccessors.setGWTextBox(driver, date, getReportedDate());

	}

	public String getReportedByValue() {

		return this.getReportedByName().getAttribute("value");

	}

	public void selectHowReported(String option) {
		logger.info(format("%s - going to set reported how value to:" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getHowReported(), 1);
	}

	public boolean howReportedContainsOption(String option) {
		boolean found = false;
		logger.info(format("%s - going to check if options in how reported:" + option, getName()));
		this.getHowReported().click();
		String optionLocator = "//li[text()='" + option + "']";
		found = this.getHowReported().findElements(By.xpath(optionLocator)).size() > 0;

		return found;
	}

	public void selectReportedByName(String option) {
		logger.info(format("%s - going to select report by name option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, getReportedByName(), 1);
	}

	public void selectRelationToInsured(String option) {
		logger.info(format("%s - going to select relation to insured option :" + option, getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, getReportedByRelation(), 1);
	}

	public void setWorkPhone(String text) {
		logger.info(format("%s -  going to set Work phone", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactWorkPhone());
		
	}

	public void setHomePhone(String text) {
		logger.info(format("%s -  going to set Home phone", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactHomePhone());
		
	}

	public void setMobile(String text) {
		logger.info(format("%s -  going to set mobile", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactMobile());
		
	}

	public void selectPhoneType(String option) {
		logger.info(format("%s -  going to select phone type", getName()));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, this.getContactPhoneType(), 1);
		
	}

	public void setEmail(String text) {
		logger.info(format("%s -  going to set email", getName()));
		GuideWireAccessors.setGWTextBox(driver, text, this.getContactEmail());
		
	}
	
	public void selectAlert(boolean alert)
	{
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
		return errorMessages;
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

	private WebElement getTitleDropDown() {
		return titleDropDown;
	}

	private WebElement getReportedByNamePicker() {
		return reportedByNamePicker;
	}

	private WebElement getReportedByPickerLink() {
		return reportedByPickerLink;
	}

	private WebElement getNewPersonSubLink() {
		return newPersonSubLink;
	}

	private WebElement getNewCompanySubLink() {
		return newCompanySubLink;
	}

	private WebElement getSearchSubLink() {
		return searchSubLink;
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

	private WebElement getDiffPersonName() {
		return diffPersonName;
	}

	private WebElement getDiffPersonRelation() {
		return diffPersonRelation;
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

	public boolean containsErrorMessage(String contains) {
		boolean found = false;
		for (WebElement element : getErrorMessages()) {
			if (element.getText().equalsIgnoreCase(contains)) {
				found = true;
				break;
			}
		}
		return found;
	}

}
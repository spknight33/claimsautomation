package com.big.automation.selenium_webdriver.claimcenter.pages.fnol;

import static java.lang.String.format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterFNOLStep4POM extends BaseTest {

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:ttlBar")
	private WebElement pageTitle;

	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	@FindBy(id = "FNOLWizard:Prev-btnEl")
	private WebElement backButton;
	@FindBy(id = "FNOLWizard:Next-btnEl")
	private WebElement nextButton;
	@FindBy(id = "FNOLWizard:Finish-btnEl")
	private WebElement finishButton;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:policyholderclaiming_true-inputEl")
	private WebElement phClaimingYesOption;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:policyholderclaiming_false-inputEl")
	private WebElement phClaimingNoOption;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:0:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:_checkbox")
	private WebElement repairServiceCheckbox;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:0:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:AgencyMenuIcon")
	private WebElement repairServicePickerIcon;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:0:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:MenuItem_Search-textEl")
	private WebElement repairServicePickerSearch;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:1:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:_checkbox")
	private WebElement recoveryServiceCheckbox;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:1:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:AgencyMenuIcon")
	private WebElement recoveryServicePickerIcon;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:1:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:MenuItem_Search-textEl")
	private WebElement recoveryServicePickerSearch;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:2:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:_checkbox")
	private WebElement salvageServiceCheckbox;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:2:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:AgencyMenuIcon")
	private WebElement salvageServicePickerIcon;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:2:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:MenuItem_Search-textEl")
	private WebElement salvageServicePickerSearch;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:3:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:_checkbox")
	private WebElement inspectionServiceCheckbox;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:3:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:AgencyMenuIcon")
	private WebElement inspectionServicePickerIcon;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:3:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:MenuItem_Search-textEl")
	private WebElement inspectionServicePickerSearch;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:4:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:_checkbox")
	private WebElement nonFaultReferServiceCheckbox;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:4:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:AgencyMenuIcon")
	private WebElement nonFaultServicePickerIcon;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:4:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:MenuItem_Search-textEl")
	private WebElement nonFaultServicePickerSearch;

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:5:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:_checkbox")
	private WebElement nonFaultReferVehicleServiceCheckbox;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:5:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:AgencyMenuIcon")
	private WebElement nonFaultVehicleServicePickerIcon;
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:0:servicesbyvendor:VehicleIncidentServicePanelSet:5:AutoRepairPanel:VehicleIncidentServiceRequestDV:ServiceRequestInputGroup:Agency:MenuItem_Search-textEl")
	private WebElement nonFaultVehicleServicePickerSearch;

	// IN FNOL other would never really be used but included for completeness
	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:OtherServicesLVInputGroupInputSet:OtherServicesInputGroup:_checkbox")
	private WebElement otherServiceCheckbox;

	private WebElement getOtherServiceCheckbox() {
		return otherServiceCheckbox;
	}

	private WebElement getOtherServiceAddButton() {
		return otherServiceAddButton;
	}

	@FindBy(id = "FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_ServicesScreen:OtherServicesLVInputGroupInputSet:OtherServicesInputGroup:OtherServicesLVInputSet:OtherServicesLV_tb:AddServiceRequest")
	private WebElement otherServiceAddButton;

	public String getName() {

		return "FNOL Wizard Step4 Services";
	}

	public boolean isPageTitleDisplayed(String expected) {

		logger.info(format("%s -found page title :" + this.getPageTitle().getText(), getName()));
		return GuideWireAccessors.getGWElementText(driver, this.getPageTitle()).equalsIgnoreCase(expected);
	}

	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}

	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver, getCancelButton());

	}

	public void finish() {

		logger.info(format("%s -  going to click finish", getName()));
		GuideWireAccessors.clickGWButton(driver, getFinishButton());

	}

	public void next() {

		logger.info(format("%s -  going to click Next", getName()));
		GuideWireAccessors.clickGWButton(driver, getNextButton());

	}

	public void back() {
		logger.info(format("%s -  going to click Back", getName()));
		GuideWireAccessors.clickGWButton(driver, getBackButton());

	}

	public void selectPhClaiming(boolean claiming) {

		logger.info(format("%s -  going to set PH claiming to:" + claiming, getName()));
		if (claiming) {
			GuideWireAccessors.clickGWButton(driver, this.getPhClaimingYesOption());
		} else {
			GuideWireAccessors.clickGWButton(driver, this.getPhClaimingNoOption());
		}

	}

	public void clickRepairServiceBox() {
		logger.info(format("%s -going to click Repair Service Checkbox", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getRepairServiceCheckbox());
	}

	public void clickRecoveryServiceBox() {
		logger.info(format("%s -going to click Recovery Service Checkbox", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getRecoveryServiceCheckbox());
	}

	public void clickSalvageServiceBox() {
		logger.info(format("%s -going to click Salvage Service Checkbox", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getSalvageServiceCheckbox());
	}

	public void clickInspectionServiceBox() {
		logger.info(format("%s -going to click Inspection Service Checkbox", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getInspectionServiceCheckbox());
	}

	public void clickNonFaultReferralServiceBox() {
		logger.info(format("%s -going to click non-fault referral Service Checkbox", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getNonFaultReferServiceCheckbox());
	}

	public void clickNonFaultVehicleReferralServiceBox() {
		logger.info(format("%s -going to click non-fault referral vehicle Service Checkbox", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getNonFaultReferVehicleServiceCheckbox());
	}

	public void clickOtherServiceBox() {
		logger.info(format("%s -going to click other Service Checkbox", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOtherServiceCheckbox());
	}

	public void selectSearchRepairService() {
		logger.info(format("%s - going to search repair service", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getRepairServicePickerIcon(),
				this.getRepairServicePickerSearch());
	}

	public void selectSearchRecoveryService() {
		logger.info(format("%s - going to search recovery service", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getRecoveryServicePickerIcon(),
				this.getRecoveryServicePickerSearch());
	}

	public void selectSearchSalvageService() {
		logger.info(format("%s - going to search salvage service", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getSalvageServicePickerIcon(),
				this.getSalvageServicePickerSearch());
	}

	public void selectSearchInspectionService() {
		logger.info(format("%s - going to search inspection service", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getInspectionServicePickerIcon(),
				this.getInspectionServicePickerSearch());
	}

	public void selectSearchNonFaultReferralService() {
		logger.info(format("%s - going to search non fault referral service", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getNonFaultServicePickerIcon(),
				this.getNonFaultServicePickerSearch());
	}

	public void selectSearchNonFaultVehicleReferralService() {
		logger.info(format("%s - going to search non fault vehicle referral service", getName()));
		GuideWireAccessors.selectOptionFromGWPicker(driver, this.getNonFaultVehicleServicePickerIcon(),
				this.getNonFaultVehicleServicePickerSearch());
	}

	// other services use add
	public void clickAddOtherService() {
		logger.info(format("%s - going to click add other service", getName()));
		GuideWireAccessors.clickGWButton(driver, this.getOtherServiceAddButton());
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getFinishButton() {
		return finishButton;
	}

	private WebElement getNextButton() {

		return nextButton;
	}

	private WebElement getBackButton() {

		return backButton;
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getPhClaimingYesOption() {
		return phClaimingYesOption;
	}

	private WebElement getPhClaimingNoOption() {
		return phClaimingNoOption;
	}

	private WebElement getRepairServiceCheckbox() {
		return repairServiceCheckbox;
	}

	private WebElement getRecoveryServiceCheckbox() {
		return recoveryServiceCheckbox;
	}

	private WebElement getSalvageServiceCheckbox() {
		return salvageServiceCheckbox;
	}

	private WebElement getInspectionServiceCheckbox() {
		return inspectionServiceCheckbox;
	}

	private WebElement getNonFaultReferServiceCheckbox() {
		return nonFaultReferServiceCheckbox;
	}

	private WebElement getNonFaultReferVehicleServiceCheckbox() {
		return nonFaultReferVehicleServiceCheckbox;
	}

	private WebElement getRepairServicePickerIcon() {
		return repairServicePickerIcon;
	}

	private WebElement getRepairServicePickerSearch() {
		return repairServicePickerSearch;
	}

	private WebElement getRecoveryServicePickerIcon() {
		return recoveryServicePickerIcon;
	}

	private WebElement getRecoveryServicePickerSearch() {
		return recoveryServicePickerSearch;
	}

	private WebElement getSalvageServicePickerIcon() {
		return salvageServicePickerIcon;
	}

	private WebElement getSalvageServicePickerSearch() {
		return salvageServicePickerSearch;
	}

	private WebElement getInspectionServicePickerIcon() {
		return inspectionServicePickerIcon;
	}

	private WebElement getInspectionServicePickerSearch() {
		return inspectionServicePickerSearch;
	}

	private WebElement getNonFaultServicePickerIcon() {
		return nonFaultServicePickerIcon;
	}

	private WebElement getNonFaultServicePickerSearch() {
		return nonFaultServicePickerSearch;
	}

	private WebElement getNonFaultVehicleServicePickerIcon() {
		return nonFaultVehicleServicePickerIcon;
	}

	private WebElement getNonFaultVehicleServicePickerSearch() {
		return nonFaultVehicleServicePickerSearch;
	}

}
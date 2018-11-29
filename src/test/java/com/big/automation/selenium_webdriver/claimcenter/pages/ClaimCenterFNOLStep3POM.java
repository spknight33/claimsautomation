package com.big.automation.selenium_webdriver.claimcenter.pages;

import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;

public class ClaimCenterFNOLStep3POM extends BaseTest{

	
	@FindBy(id = "FNOLWizard:Cancel-btnEl")
	private WebElement cancelButton;
	
	@FindBy(id = "FNOLWizard:Next-btnEl")
	private WebElement nextButton;
		
	@FindBy(id = "FNOLWizard:Prev-btnEl")
	private WebElement backButton;
	
	@FindBy(id = "FFNOLWizard:Finish-btnEl")
	private WebElement finishButton;
	
	@FindBy(id = "title")
	private WebElement titleDropDown;

	@FindBy(className = "message")
	private List <WebElement> errorMessages;
	
	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Description-inputEl")
	private WebElement circumstances;

	@FindBy(id ="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_LossCause-inputEl")
	private WebElement incidentType;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_Cause_itb-inputEl")
	private WebElement claimCause;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:Claim_Subcause_itb-inputEl")
	private WebElement claimSubCause;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:LossDetailsAddressDV:IncidentOnly-inputEl")
	private WebElement incidentOnlyCB;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:AddVehicleButton-btnEl")
	private WebElement addVehicleButton;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:AddPedestrianButton-btnEl")
	private WebElement addPedestrianButton;
	
	@FindBy(id="FNOLWizard:AutoWorkersCompWizardStepSet:FNOLWizard_NewLossDetailsScreen:AddPropertyDamageButton-btnEl")
	private WebElement addPropertyDamageButton;

	

	public String getName() {

		return "FNOL Wizard Step3 Add Claim Information";
	}

		
	
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		getCancelButton().click();
		logger.info(format("%s - done, cancel clicked", getName()));
	}
	
	public void finish() {

		logger.info(format("%s -  going to click finish", getName()));
		getFinishButton().click();
		logger.info(format("%s - done, Finish clicked", getName()));
	}
	
	public void next() {

		logger.info(format("%s -  going to click Next", getName()));
		getNextButton().click();
		logger.info(format("%s - done, Next clicked", getName()));
	}
	
	public void back() {
		logger.info(format("%s -  going to click Back", getName()));
		this.getBackButton().click();
		logger.info(format("%s - done, Back clicked", getName()));
	}


	
	public void setCircumstancesValue(String circumstances)
	{
		logger.info(format("%s - setting circumstances: "+circumstances, getName()));
		this.getCircumstances().clear();
		this.getCircumstances().sendKeys(circumstances);
	}
	
	public String getClaimCauseValue() {

		return this.getClaimCause().getAttribute("value");

	}
	
	public String getClaimSubCauseValue() {

		return this.getClaimSubCause().getAttribute("value");

	}
	
	



   public void selectIncidentOnlyCB()
   {
	   logger.info(format("%s - current Incident only CB selection is :"+this.getIncidentOnlyCB().isSelected(), getName()));
   // can be more than one, but just select first for now
	   if (!this.getIncidentOnlyCB().isSelected())
	   {
		   this.getIncidentOnlyCB().click();
		   logger.info(format("%s - done, select Incident Only", getName()));
		   
	   }
   }
   
   public void deselectIncidentOnlyCB()
   {
   // can be more than one, but just deselect first for now
	   logger.info(format("%s - done, going to deselect Incident Only", getName()));
	   if (this.getIncidentOnlyCB().isSelected())
	   {
		   this.getIncidentOnlyCB().click();
		   logger.info(format("%s - done, deselect Incident Only", getName()));
	   }
   }
   
   public void addVehicle() {
		logger.info(format("%s -  going to click AddVehicle", getName()));
		this.getAddVehicleButton().click();
		logger.info(format("%s - done, Add Vehicle clicked", getName()));
	}
   
   public void addPedestrian() {
		logger.info(format("%s -  going to click AddPedestrian", getName()));
		this.getAddPedestrianButton().click();
		logger.info(format("%s - done, Add Pedestrian clicked", getName()));
	}
   
   public void addPropertyDamage() {
		logger.info(format("%s -  going to click Add PropertyDamage", getName()));
		this.getAddPropertyDamageButton().click();
		logger.info(format("%s - done, Add PropertyDamage clicked", getName()));
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
	private WebElement getCircumstances() {
		return circumstances;
	}
	private WebElement getIncidentType() {
		return incidentType;
	}

	
	private WebElement getClaimCause()
	{
		return claimCause;
	}
	private WebElement getClaimSubCause()
	{
		return claimSubCause;
	}
	private WebElement getIncidentOnlyCB()
	{
		return incidentOnlyCB;
	}
	private WebElement getAddVehicleButton()
	{
		return addVehicleButton;
	}
	private WebElement getAddPedestrianButton()
	{
		return addPedestrianButton;
	}
	private WebElement getAddPropertyDamageButton()
	{
		return addPropertyDamageButton;
	}
	private List<WebElement> getErrorMessages(){
		return errorMessages;
	}
	
	
	
	
	
	public boolean containsErrorMessage(String contains)
	{
		boolean found=false;
		for (WebElement element : getErrorMessages()) 
		{
			if (element.getText().equalsIgnoreCase(contains))
			{
				found = true;
				break;
			}
		}
		return found;
	}
	
	
	


}
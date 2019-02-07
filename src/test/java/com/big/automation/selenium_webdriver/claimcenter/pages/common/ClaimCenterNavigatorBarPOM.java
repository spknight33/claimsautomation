package com.big.automation.selenium_webdriver.claimcenter.pages.common;

import static java.lang.String.format;
import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterNavigatorBarPOM extends BaseTest {
	
	
	@FindBy(id = "Claim:ClaimMenuActions-btnEl")
	private WebElement actionsMenu;
	

	@FindBy(xpath = "//span[@class='x-tree-node-text ']")
	private List<WebElement> navigationLinks;
	
	// Summary submenus
	//-----------------------------
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSummaryGroup:ClaimSummaryGroup_ClaimSummary']//span")
	private WebElement summaryOverviewSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSummaryGroup:ClaimSummaryGroup_ClaimStatus']//span")
	private WebElement summaryStatusSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSummaryGroup:ClaimSummaryGroup_ClaimKeyMetrics']//span")
	private WebElement summaryMetricsSubmenu;
	
	//loss details submenus
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimLossDetailsGroup:ClaimLossDetailsGroup_ClaimLossDetails']//span")
	private WebElement lossGeneralSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimLossDetailsGroup:ClaimLossDetailsGroup_ClaimAssociations']//span")
	private WebElement lossAssociationsSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimLossDetailsGroup:ClaimLossDetailsGroup_SIDetails']//span")
	private WebElement lossSIDetailsSubmenu;
	
	//Parties Involved submenus
	//--------------------
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimPartiesGroup:ClaimPartiesGroup_ClaimContacts']//span")
	private WebElement partiesContactsSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimPartiesGroup:ClaimPartiesGroup_ClaimUsers']//span")
	private WebElement partiesUsersSubmenu;
	
	//policy submenus
	//--------------------
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimPolicyGroup:ClaimPolicyGroup_ClaimPolicyGeneral']//span")
	private WebElement policyGeneralSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimPolicyGroup:ClaimPolicyGroup_ClaimPolicyVehicles']//span")
	private WebElement policyVehiclesSubmenu;

	//Financials submenus
	//--------------------
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimFinancialsGroup:ClaimFinancialsGroup_ClaimFinancialsTransactions']//span")
	private WebElement financeTransactionSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimFinancialsGroup:ClaimFinancialsGroup_ClaimFinancialsSummary']//span")
	private WebElement financeSummarySubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimFinancialsGroup:ClaimFinancialsGroup_ClaimFinancialsChecks']//span")
	private WebElement financeChequesSubmenu;
	
	// plan of action submenus
	//--------------------
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimPlanOfActionGroup:ClaimPlanOfActionGroup_ClaimEvaluations']//span")
	private WebElement planEvaluationsSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimPlanOfActionGroup:ClaimPlanOfActionGroup_ClaimNegotiations']//span")
	private WebElement planNegotiationsSubmenu;

	
	//FNOL Snapshot submenus
	//------------------------
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSnapshotGroup:ClaimSnapshotGroup_ClaimSnapshotLossDetails']//span")
	private WebElement fnolSnapshotLossSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSnapshotGroup:ClaimSnapshotGroup_ClaimSnapshotPartiesInvolved']//span")
	private WebElement fnolSnapshotPartiesSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSnapshotGroup:ClaimSnapshotGroup_ClaimSnapshotPolicy']//span")
	private WebElement fnolSnapshotPolicySubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSnapshotGroup:ClaimSnapshotGroup_ClaimSnapshotExposures']//span")
	private WebElement fnolSnapshotExposuresSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSnapshotGroup:ClaimSnapshotGroup_ClaimSnapshotExposures']//span")
	private WebElement fnolSnapshotNotesSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSnapshotGroup:ClaimSnapshotGroup_ClaimSnapshotDocuments']//span")
	private WebElement fnolSnapshotDocumentsSubmenu;
	@FindBy(xpath = "//td[@id='Claim:MenuLinks:Claim_ClaimSnapshotGroup:ClaimSnapshotGroup_ClaimSnapshotExtraFields']//span")
	private WebElement fnolSnapshotAdditionalSubmenu;

	public String getName() {

		return "ClaimCenter Navigator Bar";
	}

	

	
    public void clickTopLevel(String toplink) throws Exception {
    	logger.info(format("%s - done, going to click Navigator", getName()));
    	sleep(1);
    	for (WebElement option : navigationLinks) {
    		
    		    		

    		if(toplink.equalsIgnoreCase(option.getText())){
    		    GuideWireAccessors.clickGWButton(driver, option); 
    		    logger.info(format("%s - done, clicked navigator", getName()));
    		   break;
    		}
    	}
		
	}
    
    
    public void clickSubLevel(String toplink,String sublink) throws Exception {
    	logger.info(format("%s - done, going to click Navigator sub link", getName()));
    	sleep(1);
    	for (WebElement option : navigationLinks) {
    		    		

    		if(toplink.equalsIgnoreCase(option.getText())){
    		    GuideWireAccessors.clickGWButton(driver, option); 
    		    logger.info(format("%s - clicked navigator for top level:"+toplink, getName()));
    		   break;
    		}
    	}
    	sleep(1);
    	
    	if (toplink.equalsIgnoreCase("Summary"))
    	{
    		switch(sublink)
    		{
    		case ("Overview"):
    			GuideWireAccessors.clickGWButton(driver,summaryOverviewSubmenu);
    			break;
    		case ("Status"):
    			GuideWireAccessors.clickGWButton(driver,summaryStatusSubmenu);
    			break;
    		case ("Health Metrics"):
    			GuideWireAccessors.clickGWButton(driver,summaryMetricsSubmenu);
    			break;
    		}
    	}
    	
    	
    	
    	if (toplink.equalsIgnoreCase("Loss Details"))
    	{
    		switch(sublink)
    		{
    		case ("General"):
    			GuideWireAccessors.clickGWButton(driver,lossGeneralSubmenu);
    			break;
    		case ("Associations"):
    			GuideWireAccessors.clickGWButton(driver,lossAssociationsSubmenu);
    			break;
    		case ("Special Investigation Details"):
    			GuideWireAccessors.clickGWButton(driver,lossSIDetailsSubmenu);
    			break;
    		}
    	}
    	
    	if (toplink.equalsIgnoreCase("Parties Involved"))
    	{
    		switch(sublink)
    		{
    		case ("Contacts"):
    			GuideWireAccessors.clickGWButton(driver,partiesContactsSubmenu);
    			break;
    		case ("Users"):
    			GuideWireAccessors.clickGWButton(driver,partiesUsersSubmenu);
    			break;
    		
    		}
    	}
    	
    	if (toplink.equalsIgnoreCase("Policy"))
    	{
    		switch(sublink)
    		{
    		case ("General"):
    			GuideWireAccessors.clickGWButton(driver,policyGeneralSubmenu);
    			break;
    		case ("Vehicles"):
    			GuideWireAccessors.clickGWButton(driver,policyVehiclesSubmenu);
    			break;
    		
    		}
    	}
    	
    	if (toplink.equalsIgnoreCase("Plan of Action"))
    	{
    		switch(sublink)
    		{
    		case ("Evaluations"):
    			GuideWireAccessors.clickGWButton(driver,planEvaluationsSubmenu);
    			break;
    		case ("Negotiations"):
    			GuideWireAccessors.clickGWButton(driver,planNegotiationsSubmenu);
    			break;
    		
    		}
    	}
    	
    	
    	if (toplink.equalsIgnoreCase("Financials"))
    	{
    		switch(sublink)
    		{
    		case ("Summary"):
    			GuideWireAccessors.clickGWButton(driver,financeSummarySubmenu);
    			break;
    		case ("Transactions"):
    			GuideWireAccessors.clickGWButton(driver,financeTransactionSubmenu);
    			break;
    		case ("Cheques"):
    			GuideWireAccessors.clickGWButton(driver,financeChequesSubmenu);
    			break;
    		}
    	}
    	
    	if (toplink.equalsIgnoreCase("FNOL Snapshot"))
    	{
    		switch(sublink)
    		{
    		case ("Loss Details"):
    			GuideWireAccessors.clickGWButton(driver,fnolSnapshotLossSubmenu);
    			break;
    		case ("Parties Involved"):
    			GuideWireAccessors.clickGWButton(driver,fnolSnapshotPartiesSubmenu);
    			break;
    		case ("Policy"):
    			GuideWireAccessors.clickGWButton(driver,fnolSnapshotPolicySubmenu);
    			break;
    		case ("Exposures"):
    			GuideWireAccessors.clickGWButton(driver,fnolSnapshotExposuresSubmenu);
    			break;
    		case ("Notes"):
    			GuideWireAccessors.clickGWButton(driver,fnolSnapshotNotesSubmenu);
    			break;
    		case ("Documents"):
    			GuideWireAccessors.clickGWButton(driver,fnolSnapshotDocumentsSubmenu);
    			break;
    		case ("Additional Fields"):
    			GuideWireAccessors.clickGWButton(driver,fnolSnapshotAdditionalSubmenu);
    			break;
    		}
    	  
		}
    	
    	//TODO -other submenus
    	
    	
    	
	}
    
    public void clickDesktopTopLevel(String toplink) throws Exception {
    	logger.info(format("%s - done, going to click desktop Navigator", getName()));
    	sleep(1);
    	for (WebElement option : navigationLinks) {
    		
    		    		
         // desktop links include a count of items, so exclude that
    		if(option.getText().startsWith(toplink)){
    		    GuideWireAccessors.clickGWButton(driver, option); 
    		    logger.info(format("%s - done, clicked navigator", getName()));
    		   break;
    		}
    	}
		
	}
    
    public void clickAdministrationTopLevel(String toplink) throws Exception {
    	logger.info(format("%s - done, going to click administration Navigator", getName()));
    	sleep(1);
    	for (WebElement option : navigationLinks) {
    		
    		    		
         // desktop links include a count of items, so exclude that
    		if(option.getText().startsWith(toplink)){
    		    GuideWireAccessors.clickGWButton(driver, option); 
    		    logger.info(format("%s - done, clicked navigator", getName()));
    		   break;
    		}
    	}
		
	}
    
    
    public void selectActionsSubMenuHierarchy(List<String> menuHierarchy)
	{
		logger.info(format("%s - going to select Actions sub menu item ",getName()));
		GuideWireAccessors.selectOptionFromPopupMenu(driver, menuHierarchy, this.getActionsMenu());
	}




	private WebElement getActionsMenu() {
		return actionsMenu;
	}




	private List<WebElement> getNavigationLinks() {
		return navigationLinks;
	}
    
    
    

	


	

	

}
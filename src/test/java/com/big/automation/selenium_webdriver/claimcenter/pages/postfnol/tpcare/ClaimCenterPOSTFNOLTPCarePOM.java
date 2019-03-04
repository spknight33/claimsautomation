package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.tpcare;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLTPCarePOM extends BaseTest {

	@FindBy(id = "ClaimTPCare:ClaimTPCareScreen:0")
	private WebElement pageTitle;

	@FindBy(id = "ClaimTPCare:ClaimTPCareScreen:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "ClaimTPCare:ClaimTPCareScreen:Edit")
	private WebElement editButton;
	@FindBy(id = "ClaimTPCare:ClaimTPCareScreen:Update")
	private WebElement updateButton;
	

	public String getName() {

		return "TP Care Screen";
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

	public void update() {

		logger.info(format("%s -  going to click update", getName()));
		GuideWireAccessors.clickGWButton(driver, getUpdateButton());
	}

	public void edit() {
		logger.info(format("%s -  going to click edit", getName()));
		GuideWireAccessors.clickGWButton(driver, getEditButton());
		sleep(2);

	}

	public void selectCaptureOpporunityForRow(String row,String captureYN)
	{
		sleep(1);
		logger.info(format("%s - select capture opportunity for row:"+captureYN, getName()));
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[5]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, captureYN, elementDropdown, 1);
	}
	
	public void selectCaptureOpportunity(String claimant,String role,String incident,String captureYN)
	{
		logger.info(format("%s - select capture opportunity for claimant,role and incident:"+claimant+","+role+","+incident+","+captureYN, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		selectCaptureOpporunityForRow(sRow,captureYN);
		
	}
	
	public void selectCaptureLeadTypeForRow(String row,String leadType)
	{
		sleep(1);
		logger.info(format("%s - select capture lead for row:"+leadType, getName()));
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[6]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, leadType, elementDropdown, 1);
		
	}
	public void selectCaptureLeadType(String claimant,String role,String incident,String leadType)
	{
		logger.info(format("%s - select capture leadtype for claimant,role and incident:"+claimant+","+role+","+incident+","+leadType, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		selectCaptureLeadTypeForRow(sRow,leadType);
		
	}
	
	public void selectCaptureReasonForRow(String row,String reason)
	{
		sleep(1);
		logger.info(format("%s - select capture reason for row:"+reason, getName()));
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[7]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, reason, elementDropdown, 1);
		
	}
	public void selectCaptureReason(String claimant,String role,String incident,String reason)
	{
		logger.info(format("%s - select capture reason for claimant,role and incident:"+claimant+","+role+","+incident+","+reason, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		selectCaptureReasonForRow(sRow,reason);
		
	}

	public void select1stCallForRow(String row,String call)
	{
		sleep(1);
		logger.info(format("%s - select capture 1st call for row:"+call, getName()));
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[8]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, call, elementDropdown, 1);
		
	}
	public void select1stCall(String claimant,String role,String incident,String call)
	{
		logger.info(format("%s - select capture 1st call for claimant,role and incident:"+claimant+","+role+","+incident+","+call, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		select1stCallForRow(sRow,call);
		
	}
	
	
	public void select2ndCallForRow(String row,String call)
	{
		sleep(1);
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[9]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, call, elementDropdown, 2);
		
	}
	public void select2ndCall(String claimant,String role,String incident,String call)
	{
		logger.info(format("%s - select capture 2nd call for claimant,role and incident:"+claimant+","+role+","+incident+","+call, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		select2ndCallForRow(sRow,call);
		
	}
	
	
	public void selectCapturedForRow(String row,String capturedYN)
	{
		sleep(1);
		logger.info(format("%s - select capturedfor row:"+capturedYN, getName()));
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[10]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, capturedYN, elementDropdown, 2); //2nd Y/n on page
		
	}
	public void selectCaptured(String claimant,String role,String incident,String capturedYN)
	{
		logger.info(format("%s - select captured for claimant,role and incident:"+claimant+","+role+","+incident+","+capturedYN, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		selectCapturedForRow(sRow,capturedYN);
		
	}
	
	
	public void selectCaptureResultForRow(String row,String result)
	{
		sleep(1);
		logger.info(format("%s - select capture result for row:"+result, getName()));
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[11]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, result, elementDropdown, 1);
		
	}
	public void selectCaptureResult(String claimant,String role,String incident,String result)
	{
		logger.info(format("%s - select capture result for claimant,role and incident:"+claimant+","+role+","+incident+","+result, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		selectCaptureResultForRow(sRow,result);
		
	}
	
	
	public void selectReasonNotCapturedForRow(String row,String reason)
	{
		sleep(1);
		logger.info(format("%s - select reason not captured for row:"+reason, getName()));
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[12]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, reason, elementDropdown, 1);
		
	}
	public void selectReasonNotCaptured(String claimant,String role,String incident,String reason)
	{
		logger.info(format("%s - select reason not captured for claimant,role and incident:"+claimant+","+role+","+incident+","+reason, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		selectReasonNotCapturedForRow(sRow,reason);
		
	}
	
	public void selectInterventionForRow(String row,String interventionYN)
	{
		sleep(1);
		logger.info(format("%s - select intervention for row:"+interventionYN, getName()));
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table["+row+"]//tr//td[13]";
		
		WebElement elementDropdown = driver.findElement(By.xpath(locator));
		
		GuideWireAccessors.selectOptionFromGWDropDown(driver, interventionYN, elementDropdown, 3); //3rd occ
		
	}
	public void selectIntervention(String claimant,String role,String incident,String interventionYN)
	{
		logger.info(format("%s - select intervention for claimant,role and incident:"+claimant+","+role+","+incident+","+interventionYN, getName()));
		int row = this.getRowForCaptureOpportunity(claimant, role, incident);
		String sRow = new Integer(row).toString();
		selectReasonNotCapturedForRow(sRow,interventionYN);
		
	}
	
	
	private int getRowForCaptureOpportunity(String claimant,String role,String incident) 
	{
		logger.info(format("%s - get row number for claimant,role and incident:"+claimant+","+role+","+incident, getName()));
	    sleep(1);
		String locator = "//*[@id=\"ClaimTPCare:ClaimTPCareScreen:PostFNOLTPCaptureLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement oppClaimant;
		WebElement oppRole;
		WebElement oppIncident;
			
		// loop till find first with mathcing type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
				//find the type
			oppClaimant = driver.findElement(By.xpath(rowLocator+"//tr//td[1]"));
			oppRole = driver.findElement(By.xpath(rowLocator+"//tr//td[2]"));
			oppIncident = driver.findElement(By.xpath(rowLocator+"//tr//td[3]"));
		
		
	
			if (oppClaimant.getText().equalsIgnoreCase(claimant) && oppRole.getText().equalsIgnoreCase(role)&& oppIncident.getText().equalsIgnoreCase(incident))
			{
				logger.info(format("%s - Found match in TP opportunity table: "+i, getName()));
				return i;
				
			}
		}
		
		logger.info(format("%s - NO match in TP opportuniy tables table", getName()));
		return 0;
	
		
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getUpdateButton() {
		return updateButton;
	}

	
}
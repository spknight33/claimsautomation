package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.financials;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;

public class ClaimCenterPOSTFNOLSetReservesPOM extends BaseTest {

	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ttlBar")
	private WebElement pageTitle;
	
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Edit")
	private WebElement editButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Update")
	private WebElement saveButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Cancel")
	private WebElement cancelButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Add")
	private WebElement addButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:Remove")
	private WebElement removeButton;
	
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ReserveAndRecoveryReserveListDetailPanel:EditableRecoveryReservesLV_tb:Add")
	private WebElement addRecoveryReserveButton;
	@FindBy(id = "NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ReserveAndRecoveryReserveListDetailPanel:EditableRecoveryReservesLV_tb:Remove")
	private WebElement removeRecoveryReserveButton;
	
	

	public String getName() {

		return "Post FNOL Reserves and recovery reserves";
	}

	public boolean isPageTitleDisplayed(String expected) {
		sleep(1);

		logger.info(format("%s -found page title:" + this.getPageTitle().getText(), getName()));
		return this.getPageTitle().getText().contains(expected);
	}

	private WebElement getPageTitle() {
		return pageTitle;
	}

	public boolean containsErrorMessage(String contains) {

		return GuideWireAccessors.containsErrorMessage(driver, contains, By.className("message"));
	}
	
	public void edit() {

		logger.info(format("%s -  going to click edit", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getEditButton());
		sleep(1);
		
	}
	public void save() {

		logger.info(format("%s -  going to click save", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getSaveButton());
		
	}
	public void cancel() {

		logger.info(format("%s -  going to click cancel", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getCancelButton());
		
	}
	public void add() {

		logger.info(format("%s -  going to click add", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddButton());
		
	}
	public void remove() {

		logger.info(format("%s -  going to click remove", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getRemoveButton());
		
	}
	
	
	public void selectReserve(String exposure,String coverage,String coverageSubType) 
	{
		logger.info(format("%s - select reserve entry|"+exposure+"|"+coverage+"|"+coverageSubType+"|", getName()));
	
		String locator = "//*[@id=\"NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ReserveAndRecoveryReserveListDetailPanel:EditableReservesLV-body\"]//table";
		List <WebElement> rows = driver.findElements(By.xpath(locator));
		
		WebElement currExposure;
		WebElement currCoverage;
		WebElement currCoverageSubType;
		
		
		// loop till find first with matching type
		int rowTotal = rows.size();
		String rowLocator = null;
		for(int i=1; i<=rowTotal; i++)
		{
			
			rowLocator = locator + "[" + i + "]";
			//find the subject
			currExposure = driver.findElement(By.xpath(rowLocator+"//tr//td[2]"));
			currCoverage = driver.findElement(By.xpath(rowLocator+"//tr//td[3]"));
			currCoverageSubType = driver.findElement(By.xpath(rowLocator+"//tr//td[4]"));
			
		
			if (currExposure.getText().equalsIgnoreCase(exposure)  && currCoverage.getText().equalsIgnoreCase(coverage)&& currCoverageSubType.getText().equalsIgnoreCase(coverageSubType))
			{
				logger.info(format("%s - Found match reserve table ", getName()));
				
				WebElement element  = driver.findElement(By.xpath(rowLocator+"//tr//td[2]"));
				GuideWireAccessors.clickGWButton(driver, element);
				return;
			}
			
		}
		
		logger.info(format("%s - NO match in reserve table: |"+exposure+"|"+coverage+"|"+coverageSubType+"|", getName()));
		
	
		
	}
	
	
	
	
	public void addRecoveryReserve() {

		logger.info(format("%s -  going to click add recovery reserve", getName()));
		GuideWireAccessors.clickGWButton(driver,this.getAddRecoveryReserveButton());
		
	}
	
	
	public void createRecoveryReserve(String category, String amount)
	{
		
		this.selectRecoveryReserveCategory(category, 1);
		this.setRecoveryReserveAmount(amount, 1);
		
		
	}
	
	private void setRecoveryReserveAmount(String text, int sequence)
	{
		//TODO make this line specfici
		logger.info(format("%s - going to set recovery reserve amount:"+text, getName()));
		
		String locator = "//*[@id=\"NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ReserveAndRecoveryReserveListDetailPanel:EditableRecoveryReservesLV-body\"]//table[" + sequence + "]//tr//td[4]/div";
		String inputLocator = "//*[@id=\"NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ReserveAndRecoveryReserveListDetailPanel:EditableRecoveryReservesLV-body\"]//input[starts-with(@id,'textfield-')]";
		
		GuideWireAccessors.setGWTextBoxInTable(driver, text, locator, inputLocator);
	}
	
	private void selectRecoveryReserveCategory(String option, int sequence)
	{
		logger.info(format("%s -  going to select recoverreserve category:"+option, getName()));

		String locator = "//*[@id=\"NewReserveAndRecoveryReserveSet:NewReserveAndRecoveryReserveSetScreen:ReserveAndRecoveryReserveListDetailPanel:EditableRecoveryReservesLV-body\"]//table[" + sequence + "]//tr/td[2]/div";
		WebElement element = driver.findElement(By.xpath(locator));
		GuideWireAccessors.selectOptionFromGWDropDown(driver, option, element, 1);
		
	}
	
	//TODO - rest of this page
	// TODO - set values for new reserver
	//TODO - update values for existing reserve
	

	private WebElement getCancelButton() {
		return cancelButton;
	}

	private WebElement getEditButton() {
		return editButton;
	}

	private WebElement getAddButton() {
		return addButton;
	}

	private WebElement getRemoveButton() {
		return removeButton;
	}

	private WebElement getSaveButton() {
		return saveButton;
	}

	private WebElement getAddRecoveryReserveButton() {
		return addRecoveryReserveButton;
	}

	private WebElement getRemoveRecoveryReserveButton() {
		return removeRecoveryReserveButton;
	}

	
	
	
	

}
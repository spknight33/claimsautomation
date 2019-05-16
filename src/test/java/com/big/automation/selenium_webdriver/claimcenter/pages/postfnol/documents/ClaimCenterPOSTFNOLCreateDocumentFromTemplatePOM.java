package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.documents;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

public class ClaimCenterPOSTFNOLCreateDocumentFromTemplatePOM extends BaseTest {

    //
    //WEB ELEMENTS BELOW
    //

    @FindBy(id = "ClaimNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:ttlBar")
    private WebElement pageTitle;


    //Search for template Begin
    @FindBy(id = "ClaimNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:NewTemplateDocumentDV:TemplatePicker:SelectTemplatePicker")
    private WebElement documentTemplateSearchButton;

    @FindBy(id = "DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchDV:TemplateType-trigger-picker")
    private WebElement docTypeTemplateSearchDropDown;

    @FindBy(id = "DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchDV:LossType-trigger-picker")
    private WebElement lineOfBusinessTemplateSearchDropDown;

    @FindBy(id = "DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchDV:JurisdictionState-trigger-picker")
    private WebElement jurisdictionTemplateSearchDropDown;

    @FindBy(id = "DocumentTemplateSearchPopup:DocumentTemplateSearchScreen:DocumentTemplateSearchDV:Keywords-inputEl")
    private WebElement keywordsTemplateSearchTextBox;

    private String selectDocTemplateShell = "//div[text() = '%s']/../..//a";
    //Search for template end


    @FindBy(id = "")
    private WebElement recipientType;

    @FindBy(id = "")
    private WebElement docType;
    @FindBy(id = "")
    private WebElement docTypeDropDown;

    @FindBy(id = "")
    private WebElement docSubType;
    @FindBy(id = "")
    private WebElement docSubTypeDropDown;

    @FindBy(id = "")
    private WebElement name;

    @FindBy(id = "")
    private WebElement description;

    @FindBy(id = "")
    private WebElement recipient;

    @FindBy(id = "")
    private WebElement InOutOutboundButton;
    @FindBy(id = "ClaimNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:DocumentDetailsEditDVPanelSet:DocumentDetailsEditInputSet:InBound_true-inputEl")
    private WebElement InOutInboundButton;

    @FindBy(id = "")
    private WebElement channel;

    @FindBy(id = "")
    private WebElement visibleToCustomer;

    @FindBy(id = "")
    private WebElement createdBy;

    @FindBy(id = "")
    private WebElement handler;



    //
    //METHODS BELOW
    //

    public String getName() {

        return "POST FNOL New Document";
    }

    public boolean isPageTitleDisplayed(String expected) {
        sleep(1);

        logger.info(format("%s -found page title:" + this.getPageTitle().getText(), getName()));
        return this.getPageTitle().getText().equalsIgnoreCase(expected);
    }


    public void selectDocTypeAndSubType(String docType,String docSubType){
        logger.info("Attempting to enter select Doc type: " + docType);
        GuideWireAccessors.selectOptionFromGWDropDown(driver,docType,getDocTypeDropDown(),0);
        logger.info("Attempting to enter select Doc Sub type: " + docSubType);
        GuideWireAccessors.selectOptionFromGWDropDown(driver,docSubType,getDocSubTypeDropDown(),0);
    }

    public void selectDocType(String docType){
        logger.info("Attempting to enter select Doc type: " + docType);
        GuideWireAccessors.selectOptionFromGWDropDown(driver,docType,getDocTypeDropDown(),0);
    }

    public void selectDocSubType(String docSubType){
        logger.info("Attempting to enter select Doc Sub type: " + docSubType);
        GuideWireAccessors.selectOptionFromGWDropDown(driver,docSubType,getDocSubTypeDropDown(),0);
    }

    public void clickSearchForDocTemplateButton(){
        logger.info("Attempting to click search for doc template button");
        GuideWireAccessors.clickGWButton(driver,postFnolCreateDocumentFromTemplatePOM.getDocumentTemplateSearchButton());
    }

    public void setInOut(String s){
        if(s.equals("Inbound")){
            GuideWireAccessors.clickGWButton(driver,getInOutInboundButton());
        }
        else if (s.equals("Outbound")){
            GuideWireAccessors.clickGWButton(driver,getInOutOutboundButton());
        }
    }


    //
    //Doc Template page
    //
    public void clickSelectButtonForDocTemplateByText(String elementText){
        logger.info("Attempting to select element from template table with the text: " + elementText);
        GuideWireAccessors.clickGWButton(driver,createWebElementForDocumentTemplateSelectButton(elementText));
    }



    //
    //UTILITY METHODS
    //

    public WebElement createWebElementForDocumentTemplateSelectButton(String text){
        By xpath  = By.xpath(String.format(selectDocTemplateShell,text));
        WebElement webElement = driver.findElement(xpath);
        return webElement;
    }



    //
    //GETTERS BELOW
    //

    public WebElement getPageTitle() {
        return pageTitle;
    }

    public WebElement getDocumentTemplateSearchButton() {
        return documentTemplateSearchButton;
    }

    public WebElement getDocTypeTemplateSearchDropDown() {
        return docTypeTemplateSearchDropDown;
    }

    public WebElement getLineOfBusinessTemplateSearchDropDown() {
        return lineOfBusinessTemplateSearchDropDown;
    }

    public WebElement getJurisdictionTemplateSearchDropDown() {
        return jurisdictionTemplateSearchDropDown;
    }

    public String getSelectDocTemplateShell() {
        return selectDocTemplateShell;
    }

    public WebElement getRecipientType() {
        return recipientType;
    }

    public WebElement getDocType() {
        return docType;
    }

    public WebElement getDocTypeDropDown() {
        return docTypeDropDown;
    }

    public WebElement getDocSubType() {
        return docSubType;
    }

    public WebElement getDocSubTypeDropDown() {
        return docSubTypeDropDown;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getRecipient() {
        return recipient;
    }

    public WebElement getInOutOutboundButton() {
        return InOutOutboundButton;
    }

    public WebElement getInOutInboundButton() {
        return InOutInboundButton;
    }

    public WebElement getChannel() {
        return channel;
    }

    public WebElement getVisibleToCustomer() {
        return visibleToCustomer;
    }

    public WebElement getCreatedBy() {
        return createdBy;
    }

    public WebElement getHandler() {
        return handler;
    }
}

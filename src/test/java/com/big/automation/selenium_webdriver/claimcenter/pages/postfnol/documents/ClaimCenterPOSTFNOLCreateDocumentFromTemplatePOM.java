package com.big.automation.selenium_webdriver.claimcenter.pages.postfnol.documents;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.big.automation.selenium_webdriver.common.utilities.ThreadUtils.sleep;
import static java.lang.String.format;

public class ClaimCenterPOSTFNOLCreateDocumentFromTemplatePOM extends BaseTest {


    //WEB ELEMENTS BELOW

    @FindBy(id = "ClaimNewDocumentFromTemplateWorksheet:NewDocumentFromTemplateScreen:ttlBar")
    private WebElement pageTitle;

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
    @FindBy(id = "")
    private WebElement InOutInboundButton;

    @FindBy(id = "")
    private WebElement channel;

    @FindBy(id = "")
    private WebElement visibleToCustomer;

    @FindBy(id = "")
    private WebElement createdBy;

    @FindBy(id = "")
    private WebElement handler;


    //METHODS BELOW

    public String getName() {

        return "POST FNOL New Document";
    }

    public boolean isPageTitleDisplayed(String expected) {
        sleep(1);

        logger.info(format("%s -found page title:" + this.getPageTitle().getText(), getName()));
        return this.getPageTitle().getText().equalsIgnoreCase(expected);
    }

    public void selectDocTypeAndSubType(String docType,String docSubType){
        GuideWireAccessors.selectOptionFromGWDropDown(driver,docType,getDocTypeDropDown(),0);
        GuideWireAccessors.selectOptionFromGWDropDown(driver,docSubType,getDocSubTypeDropDown(),0);
    }



    //GETTERS BELOW

    public WebElement getPageTitle() {
        return pageTitle;
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

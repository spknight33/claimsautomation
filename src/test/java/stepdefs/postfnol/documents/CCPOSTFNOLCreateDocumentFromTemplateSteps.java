package stepdefs.postfnol.documents;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

import java.util.List;

public class CCPOSTFNOLCreateDocumentFromTemplateSteps extends BaseTest {

    @Then("^I will see post FNOL Create Document from Template panel$")
    public void i_will_see_post_FNOL_Create_Document_From_Template_Panel() throws Throwable {
        postFnolDocumentsPOM.isPageTitleDisplayed("New Document");
    }

    @Then("^I set the Doc Type to: \"([^\"]*)\" and the Subtype to: \"([^\"]*)\" on the post FNOL Create Document from Template panel$")
    public  void I_Will_Select_DocType_And_SubType(DataTable dt){
        List<List<String>> list = dt.asLists(String.class);
        for(int i = 1; i < list.size(); i++){ // i starts from 1 because i=0 represents the header
            postFnolCreateDocumentFromTemplatePOM.selectDocTypeAndSubType(list.get(i).get(1),list.get(i).get(2));
        }
    }

    @Then("^I will check that every type of document is available on the post FNOL Create Document from Template panel$")
    public  void I_Check_Every_Document_Is_Available(DataTable dt){
        List<List<String>> list = dt.asLists(String.class);
        for(int i = 1; i < list.size(); i++){ // i starts from 1 because i=0 represents the header
            postFnolCreateDocumentFromTemplatePOM.selectDocTypeAndSubType(list.get(i).get(0),list.get(i).get(1));
        }
    }

}

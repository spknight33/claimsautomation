package stepdefs.postfnol.documents;

import com.big.automation.selenium_webdriver.common.baseTest.BaseTest;
import com.big.automation.selenium_webdriver.common.gw.utilities.GuideWireAccessors;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.testng.asserts.SoftAssert;

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
            postFnolCreateDocumentFromTemplatePOM.selectDocTypeAndSubType(list.get(i).get(0),list.get(i).get(1));
        }
    }

    @Then("^I will check that every type of document is available on the post FNOL Create Document from Template panel$")
    public  void I_Check_Every_Document_Is_Available(DataTable dt){
        SoftAssert softAssert = new SoftAssert();
        List<List<String>> list = dt.asLists(String.class);
        for(int i = 1; i < list.size(); i++){ // i starts from 1 because i=0 represents the header
            postFnolCreateDocumentFromTemplatePOM.selectDocType(list.get(i).get(0));

            postFnolCreateDocumentFromTemplatePOM.selectDocSubType(list.get(i).get(1));
        }
    }

    @Then("^I click the search for doc template button on the post FNOL Create Document From Template panel$")
    public  void Click_Search_For_Doc_Template(){
        postFnolCreateDocumentFromTemplatePOM.clickSearchForDocTemplateButton();
    }

    @Then("^I click select on the \"([^\"]*)\" document in the document table on the post FNOL Create Document From Template panel$")
    public  void Click_select_on_defined_table_entry(String text){
        postFnolCreateDocumentFromTemplatePOM.clickSelectButtonForDocTemplateByText(text);
    }

    @Then("^I set In/Out to \"([^\"]*)\" on the post FNOL Create Document From Template panel$")
    public  void Set_In_Out(String text){
        postFnolCreateDocumentFromTemplatePOM.setInOut(text);
    }



}

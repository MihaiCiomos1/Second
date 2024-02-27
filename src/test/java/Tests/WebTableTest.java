package Tests;

import ObjectData.WebTableObject;
import PropertyUtility.PropertyUtility;
import ShareData.Hooks;
import extentUtility.ExtentUtility;
import extentUtility.ReportStep;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
import pages.WebTablePage;

public class WebTableTest  extends Hooks {



    HomePage homePage;
    CommonPage commonPage;
    WebTablePage webTablePage;

    @Test
    public void automationMethod()  {

        PropertyUtility propertyUtility = new PropertyUtility("WebTableTest");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getData());

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        webTablePage = new WebTablePage(getDriver());

        homePage.goToDesiredMenu("Elements");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Elements menu");
        commonPage.goToDesiredSubMenu("Web Tables");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Web Tables sub-menu");

        //click pe add ca sa deschida tabelu
        webTablePage.fillTable(webTableObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user fills the entire form with valid values");
    }

}

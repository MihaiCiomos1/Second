package Tests;

import ObjectData.WebTableObject;
import PropertyUtility.PropertyUtility;
import ShareData.Hooks;
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


        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        webTablePage = new WebTablePage(getDriver());
        homePage.goToDesiredMenu("Elements");
        commonPage.goToDesiredSubMenu("Web Tables");
        PropertyUtility propertyUtility = new PropertyUtility("WebTableTest");
        WebTableObject webTableObject = new WebTableObject(propertyUtility.getData());
        //click pe add ca sa deschida tabelu
        webTablePage.fillTable(webTableObject);
    }

}

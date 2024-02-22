package Tests;

import ShareData.Hooks;
import org.testng.annotations.Test;
import pages.BrowserWebPage;
import pages.CommonPage;
import pages.HomePage;

public class BrowserWindowsTabsTest extends Hooks {


    HomePage homePage;
    CommonPage commonPage;
    BrowserWebPage browserWebPage;

    @Test
    public void automationMethod() {

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        browserWebPage = new BrowserWebPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Browser Windows");

        // New Tab:
        browserWebPage.displayedTextFromNewTab();
        browserWebPage.displayedTextFromNewWindow();
    }
}

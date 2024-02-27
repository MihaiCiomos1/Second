package Tests;

import ShareData.Hooks;
import extentUtility.ExtentUtility;
import extentUtility.ReportStep;
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
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu");
        commonPage.goToDesiredSubMenu("Browser Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Browser Windows sub-menu");

        // New Tab:
        browserWebPage.displayedTextFromNewTab();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with new tab process");
        browserWebPage.displayedTextFromNewWindow();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with new window process");
    }
}

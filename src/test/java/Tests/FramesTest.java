package Tests;

import ShareData.Hooks;
import extentUtility.ExtentUtility;
import extentUtility.ReportStep;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.FramesPage;
import pages.HomePage;

public class FramesTest extends Hooks {

    HomePage homePage;
    CommonPage commonPage;
    FramesPage framesPage;

    @Test
    public void automationMethod() {
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        framesPage = new FramesPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu");
        commonPage.goToDesiredSubMenu("Frames");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Frames sub-menu");

        framesPage.displayedTextFromFrame1();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with the first iframe");
        framesPage.displayedTextFromFrame2();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with the second iframe");
    }
}

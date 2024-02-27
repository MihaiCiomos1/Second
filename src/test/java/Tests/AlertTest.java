package Tests;

import ShareData.Hooks;
import extentUtility.ExtentUtility;
import extentUtility.ReportStep;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.CommonPage;
import pages.HomePage;

public class AlertTest extends Hooks {

    HomePage homePage;
    CommonPage commonPage;
    AlertsPage alertsPage;

    @Test
    public void automationMethod() {

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        alertsPage = new AlertsPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu");

        commonPage.goToDesiredSubMenu("Alerts");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts sub-menu");


        alertsPage.simpleAlert();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user deals with alert with ok");
        alertsPage.alertDelay();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user deals with alert with delay");
        alertsPage.promptAlert();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user deals with alert with prompt");
        alertsPage.confirmationAlert();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user deals with alert with cancel");

    }

}

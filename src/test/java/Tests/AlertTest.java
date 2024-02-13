package Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;
import pages.AlertsPage;
import pages.CommonPage;
import pages.HomePage;

public class AlertTest extends ShareData {

    HomePage homePage;
    CommonPage commonPage;
    AlertsPage alertsPage;

    @Test
    public void automationMethod() {

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        alertsPage = new AlertsPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Alerts");

        alertsPage.simpleAlert();
        alertsPage.alertDelay();
        alertsPage.promptAlert();
        alertsPage.confirmationAlert();
        // Alert simplu: Doar Text si OK button
//        WebElement alertOkButton = driver.findElement(By.id("alertButton"));
//        elementMethods.clickOnElement(alertOkButton);
//        alertMethods.interactWithAlertOK();

        // Alert cu delay la afisare
//        WebElement alertDelayButton = driver.findElement(By.id("timerAlertButton"));
//        elementMethods.clickOnElement(alertDelayButton);
//        alertMethods.interactWithDelayAlert();
//
//        // Alert cu Confirm - OK/cancel
//        WebElement alertConfirmButton = driver.findElement(By.id("confirmButton"));
//        elementMethods.clickOnElement(alertConfirmButton);
//        alertMethods.interactWithAlertCancel();
//
//        // Alert cu Prompt Text
//        WebElement alertPromptButton = driver.findElement(By.id("promtButton"));
//        elementMethods.clickOnElement(alertPromptButton);
//        alertMethods.interactWithPromptAlertOK("Some automation text here...");
//
//        driver.quit();
    }

}

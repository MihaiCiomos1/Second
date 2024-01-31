package demoQAWebsite.Tests;

import demoQAWebsite.HelperMethods.AlertMethods;
import demoQAWebsite.HelperMethods.ElementsMethods;
import demoQAWebsite.HelperMethods.JavascriptHelpers;
import demoQAWebsite.ShareData.ShareData;
import demoQAWebsite.pages.AlertsPage;
import demoQAWebsite.pages.CommonPage;
import demoQAWebsite.pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

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

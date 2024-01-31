package demoQAWebsite.Tests;

import demoQAWebsite.HelperMethods.ElementsMethods;
import demoQAWebsite.HelperMethods.JavascriptHelpers;
import demoQAWebsite.HelperMethods.WindowsMethods;
import demoQAWebsite.ShareData.ShareData;
import demoQAWebsite.pages.BrowserWebPage;
import demoQAWebsite.pages.CommonPage;
import demoQAWebsite.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserWindowsTabsTest extends ShareData {


    HomePage homePage;
    CommonPage commonPage;
    BrowserWebPage browserWebPage;

    @Test
    public void automationMethod() throws InterruptedException {



        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        browserWebPage = new BrowserWebPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Browser Windows");

        // New Tab:
        browserWebPage.displayedTextFromNewTab();
        browserWebPage.displayedTextFromNewWindow();
//        WebElement newTabButtonElement = driver.findElement(By.id("tabButton"));
//        elementsMethods.clickOnElement(newTabButtonElement);
//        windowsMethods.switchToOpenedTab();
//        WebElement sampleHeadingFromNewTabElement = driver.findElement(By.id("sampleHeading"));
//        System.out.println("Textul din new tab este: " + sampleHeadingFromNewTabElement.getText());
//        windowsMethods.closeTab();

//        windowsMethods.switchToMainTab();

        // New Window:
//        WebElement newWindowButtonElement = driver.findElement(By.id("windowButton"));
//        elementsMethods.clickOnElement(newWindowButtonElement);
//        windowsMethods.switchToOpenedWindow();
//        WebElement sampleHeadingFromNewWindowElement = driver.findElement(By.id("sampleHeading"));
//        System.out.println("Textul din new window este: " + sampleHeadingFromNewWindowElement.getText());
//        windowsMethods.closeWindow();
//
//        windowsMethods.switchToMainWindow();



    }
}

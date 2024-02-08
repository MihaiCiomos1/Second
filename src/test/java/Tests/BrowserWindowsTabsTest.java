package demoQAWebsite.Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;
import pages.BrowserWebPage;
import pages.CommonPage;
import pages.HomePage;

public class BrowserWindowsTabsTest extends ShareData {


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

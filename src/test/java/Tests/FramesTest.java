package Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.FramesPage;
import pages.HomePage;

public class FramesTest extends ShareData {

    HomePage homePage;
    CommonPage commonPage;
    FramesPage framesPage;

    @Test
    public void automationMethod() {



        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        framesPage = new FramesPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        commonPage.goToDesiredSubMenu("Frames");

        //javascriptHelpers.scrollDown(400);

        // Frame 1:
        framesPage.displayedTextFromFrame1();
        framesPage.displayedTextFromFrame2();

//        // Frame 2:
//        WebElement frame2Element = driver.findElement(By.id("frame2"));
//        framesMethods.switchToFrame(frame2Element);
//        WebElement sampleHeadingFromFrame2Element = driver.findElement(By.id("sampleHeading"));
//        elementsMethods.displayContentOfElement(sampleHeadingFromFrame2Element);
//
//        Thread.sleep(2000);
//        javascriptHelpers.scroll(50, 50);
//
//        framesMethods.switchToMainContent();
//
//        Thread.sleep(5000);
//        driver.quit();
    }
}

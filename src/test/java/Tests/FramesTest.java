package Tests;

import ShareData.Hooks;
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
        commonPage.goToDesiredSubMenu("Frames");


        // Frame 1:
        framesPage.displayedTextFromFrame1();
        framesPage.displayedTextFromFrame2();

    }
}

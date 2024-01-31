package demoQAWebsite.pages;

import demoQAWebsite.HelperMethods.AlertMethods;
import demoQAWebsite.HelperMethods.ElementsMethods;
import demoQAWebsite.HelperMethods.FramesMethods;
import demoQAWebsite.HelperMethods.JavascriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage extends demoQAWebsite.pages.CommonPage {

    @FindBy (id = "frame1")
    private WebElement frame1Element;

    @FindBy (id = "sampleHeading")
    private WebElement sampleHeadingFromFrame1Element;

    @FindBy (id = "frame2")
    private WebElement frame2Element;

    @FindBy (id = "sampleHeading")
    private WebElement sampleHeadingFromFrame2Element;

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void displayedTextFromFrame1()
    {
        framesMethods.switchToFrame(frame1Element);
        elementsMethods.displayContentOfElement(sampleHeadingFromFrame1Element);
        framesMethods.switchToMainContent();
    }

    public void displayedTextFromFrame2()
    {
        framesMethods.switchToFrame(frame2Element);
        elementsMethods.displayContentOfElement(sampleHeadingFromFrame2Element);
        javascriptHelpers.scroll(0,100);
        framesMethods.switchToMainContent();
    }


}

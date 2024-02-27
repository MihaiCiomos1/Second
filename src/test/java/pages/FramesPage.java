package pages;

import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.logging.Logger;

public class FramesPage extends CommonPage {

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
        LoggerUtility.infoLog("The user switches on specific frame");

        elementsMethods.displayContentOfElement(sampleHeadingFromFrame1Element);
        LoggerUtility.infoLog("The user deals with sampleHeadingFromFrame1Element element from specific iframe");

        framesMethods.switchToMainContent();
        LoggerUtility.infoLog("The user switches on parent frame");
    }

    public void displayedTextFromFrame2()
    {
        framesMethods.switchToFrame(frame2Element);
        LoggerUtility.infoLog("The user switches on specific frame");

        elementsMethods.displayContentOfElement(sampleHeadingFromFrame2Element);
        LoggerUtility.infoLog("The user deals with sampleHeadingFromFrame2Element element from specific iframe");

        javascriptHelpers.scroll(0,100);
        LoggerUtility.infoLog("The user scrolls down the page");

        framesMethods.switchToMainContent();
        LoggerUtility.infoLog("The user switches on parent frame");
    }


}

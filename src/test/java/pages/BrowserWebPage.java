package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWebPage extends CommonPage{


    @FindBy (id = "tabButton")
    private WebElement newTabButtonElement;

    @FindBy (id = "sampleHeading")
    private WebElement sampleHeadingFromNewTabElement;

    @FindBy (id = "windowButton")
    private WebElement newWindowButtonElement;

    @FindBy (id = "sampleHeading")
    private WebElement sampleHeadingFromNewWindow;

    public BrowserWebPage(WebDriver driver) {
        super(driver);
    }

    public void displayedTextFromNewTab()
    {
        elementsMethods.clickOnElement(newTabButtonElement);
        windowsMethods.switchToOpenedTab();
        elementsMethods.displayContentOfElement(sampleHeadingFromNewTabElement);
        windowsMethods.switchToMainTab();
    }

    public void displayedTextFromNewWindow()
    {
        elementsMethods.clickOnElement(newWindowButtonElement);
        windowsMethods.switchToOpenedWindow();
        elementsMethods.displayContentOfElement(sampleHeadingFromNewWindow);
        windowsMethods.switchToMainWindow();
    }
}

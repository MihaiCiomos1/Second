package demoQAWebsite.pages;

import demoQAWebsite.HelperMethods.AlertMethods;
import demoQAWebsite.HelperMethods.ElementsMethods;
import demoQAWebsite.HelperMethods.JavascriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends CommonPage{



    @FindBy (id = "alertButton")
    private WebElement alertOkButton;

    @FindBy (id = "timerAlertButton")
    private WebElement alertDelayButton;

    @FindBy (id = "confirmButton")
    private WebElement alertConfirmationButton;

    @FindBy (id = "promtButton")
    private WebElement alertPromptButton;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void simpleAlert ()
    {
        elementsMethods.clickOnElement(alertOkButton);
        alertMethods.interactWithAlertOK();
    }

    public void alertDelay()
    {
        elementsMethods.clickOnElement(alertDelayButton);
        alertMethods.interactWithDelayAlert();
    }

    public void promptAlert()
    {
        elementsMethods.clickOnElement(alertPromptButton);
        alertMethods.interactWithPromptAlertOK("Text");
    }
    public void confirmationAlert()
    {
        elementsMethods.clickOnElement(alertConfirmationButton);
        alertMethods.interactWithAlertCancel();
    }
}

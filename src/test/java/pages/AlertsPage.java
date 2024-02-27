package pages;

import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        LoggerUtility.infoLog("The user clicks on alertOkButton field");

        alertMethods.interactWithAlertOK();
        LoggerUtility.infoLog("The user interacts with an alert with ok option");
    }

    public void alertDelay()
    {
        elementsMethods.clickOnElement(alertDelayButton);
        LoggerUtility.infoLog("The user clicks on alertDelayButton field");

        alertMethods.interactWithDelayAlert();
        LoggerUtility.infoLog("The user interacts with an alert with delay mechanism");
    }

    public void promptAlert()
    {
        elementsMethods.clickOnElement(alertPromptButton);
        LoggerUtility.infoLog("The user clicks on alertPromptButton field");

        alertMethods.interactWithPromptAlertOK("Text");
        LoggerUtility.infoLog("The user interacts with an alert with prompt");
    }
    public void confirmationAlert()
    {
        elementsMethods.clickOnElement(alertConfirmationButton);
        LoggerUtility.infoLog("The user clicks on alertConfirmationButton field");

        alertMethods.interactWithAlertCancel();
        LoggerUtility.infoLog("The user interacts with an alert with cancel option");
    }
}

package pages;

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

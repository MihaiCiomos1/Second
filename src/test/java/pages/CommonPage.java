package demoQAWebsite.pages;

import demoQAWebsite.HelperMethods.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonPage {

    WebDriver driver;
    demoQAWebsite.HelperMethods.ElementsMethods elementsMethods;
    demoQAWebsite.HelperMethods.JavascriptHelpers javascriptHelpers;
    demoQAWebsite.HelperMethods.AlertMethods alertMethods;
    Actions actions;
    demoQAWebsite.HelperMethods.WindowsMethods windowsMethods;
    demoQAWebsite.HelperMethods.FramesMethods framesMethods;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethods = new demoQAWebsite.HelperMethods.ElementsMethods(driver);
        this.javascriptHelpers = new demoQAWebsite.HelperMethods.JavascriptHelpers(driver);
        this.alertMethods = new demoQAWebsite.HelperMethods.AlertMethods(driver);
        this.actions = new Actions(driver);
        this.windowsMethods = new demoQAWebsite.HelperMethods.WindowsMethods(driver);
        this.framesMethods = new demoQAWebsite.HelperMethods.FramesMethods(driver);
        PageFactory.initElements(driver,this);
    }

    // Identificam WebElement-ele specifice pentru sub-pagini
    @FindBy(xpath = "//span[@class='text']")
    private List<WebElement> elements;

    // Facem metode specifice pentru pagina
    public void goToDesiredSubMenu(String submenu) {
        javascriptHelpers.scrollDown(400);
        elementsMethods.selectElementFromListByText(elements, submenu);
    }
}

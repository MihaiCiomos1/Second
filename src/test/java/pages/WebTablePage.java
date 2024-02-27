package pages;

import ObjectData.WebTableObject;
import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends CommonPage {


    @FindBy (id = "addNewRecordButton")
    private WebElement addElement;

    @FindBy (id = "firstName")
    private WebElement firstName;
    @FindBy (id = "lastName")
    private WebElement lastName;
    @FindBy (id = "userEmail")
    private WebElement emailField;
    @FindBy (id = "age")
    private WebElement ageField;
    @FindBy (id = "salary")
    private WebElement salaryField;
    @FindBy (id = "department")
    private WebElement departamentField;
    @FindBy(id = "submit")
    private WebElement submitButtom;

    public WebTablePage(WebDriver driver) {
        super(driver);
    }


    public void fillTable(WebTableObject webTableObject)
    {
        elementsMethods.clickOnElement(addElement);
        LoggerUtility.infoLog("The user clicks on addElement field");

        elementsMethods.fillElement(firstName, webTableObject.getFirstN());
        LoggerUtility.infoLog("The user fill the firstName field with value: "+webTableObject.getFirstN());

        elementsMethods.fillElement(lastName, webTableObject.getLastN());
        LoggerUtility.infoLog("The user fill the lastName field with value: "+webTableObject.getLastN());

        elementsMethods.fillElement(emailField, webTableObject.getEmail());
        LoggerUtility.infoLog("The user fill the emailField field with value: "+webTableObject.getEmail());

        elementsMethods.fillElement(ageField, webTableObject.getAgeNr());
        LoggerUtility.infoLog("The user fill the ageField field with value: "+webTableObject.getAgeNr());

        elementsMethods.fillElement(salaryField, webTableObject.getSalaryVal());
        LoggerUtility.infoLog("The user fill the salaryField field with value: "+webTableObject.getSalaryVal());

        elementsMethods.fillElement(departamentField, webTableObject.getDepartmentName());
        LoggerUtility.infoLog("The user fill the departamentField field with value: "+webTableObject.getDepartmentName());

        elementsMethods.clickOnElement(submitButtom);
        LoggerUtility.infoLog("The user clicks on submitButton field");
    }
}

package pages;

import ObjectData.WebTableObject;
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
        elementsMethods.fillElement(firstName, webTableObject.getFirstN());
        elementsMethods.fillElement(lastName, webTableObject.getLastN());
        elementsMethods.fillElement(emailField, webTableObject.getEmail());
        elementsMethods.fillElement(ageField, webTableObject.getAgeNr());
        elementsMethods.fillElement(salaryField, webTableObject.getSalaryVal());
        elementsMethods.fillElement(departamentField, webTableObject.getDepartmentName());
        elementsMethods.clickOnElement(submitButtom);

    }
}

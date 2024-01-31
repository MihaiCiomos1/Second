package demoQAWebsite.pages;

import demoQAWebsite.HelperMethods.ElementsMethods;
import demoQAWebsite.HelperMethods.JavascriptHelpers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage extends demoQAWebsite.pages.CommonPage {


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


    public void fillTable(String fName, String lName, String email, String age, String salary, String department)
    {
        elementsMethods.clickOnElement(addElement);
        elementsMethods.fillElement(firstName, fName);
        elementsMethods.fillElement(lastName, lName);
        elementsMethods.fillElement(emailField, email);
        elementsMethods.fillElement(ageField, age);
        elementsMethods.fillElement(salaryField, salary);
        elementsMethods.fillElement(departamentField, department);
        elementsMethods.clickOnElement(submitButtom);

    }
}

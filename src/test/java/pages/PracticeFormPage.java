package pages;

import ObjectData.PracticeFormObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage extends CommonPage {


    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement userEmailElement;

    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement mobileNumberElement;

    @FindBy(id = "uploadPicture")
    private  WebElement pictureElement;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement maleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement femaleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement otherGenderElement;

    @FindBy(id = "currentAddress")
    private WebElement currentAddressElement;

    @FindBy(id = "state")
    private  WebElement stateElement;

    @FindBy(id = "city")
    private WebElement cityElement;

    @FindBy (xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement hobbiesSportsElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private  WebElement hobbiesReadingElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    private WebElement hobbiesMusicElement;

    //    @FindBy(xpath = "//div[@id='subjectsContainer']")
//    WebElement subjectsElement;
    @FindBy(id = "subjectsInput")
    private WebElement subjectsElement;

    @FindBy (id = "submit")
    private WebElement submitElement;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }


    public void completeFirstRegion(PracticeFormObject practiceFormObject)
    {
        elementsMethods.fillElement(firstNameElement, practiceFormObject.getFirstName());
        elementsMethods.fillElement(lastNameElement, practiceFormObject.getLastName());
        elementsMethods.fillElement(userEmailElement, practiceFormObject.getEmail());
        elementsMethods.fillElement(currentAddressElement, practiceFormObject.getAdress());
        elementsMethods.fillElement(mobileNumberElement, practiceFormObject.getMobile());

    }
    public void completeGender(PracticeFormObject practiceFormObject)
    {
        switch (practiceFormObject.getGender()){
            case "Male":
                elementsMethods.clickOnElement(maleGenderElement);
                break;
            case "Female":
                elementsMethods.clickOnElement(femaleGenderElement);
                break;
            case "Other":
                elementsMethods.clickOnElement(otherGenderElement);
        }

    }
    public void completeSubject(String subject)
    {
        elementsMethods.clickOnElement(subjectsElement);
        elementsMethods.fillWithActions(subjectsElement, subject);
    }
    public void completeSubjectWithList(PracticeFormObject practiceFormObject)
    {
        elementsMethods.clickOnElement(subjectsElement);
        elementsMethods.fillWithMultipleValues(subjectsElement, practiceFormObject.getSubjects());
    }
    public void completeHobies(PracticeFormObject practiceFormObject)
    {
        List<WebElement> hobiesElements = new ArrayList<>();
        hobiesElements.add(hobbiesMusicElement);
        hobiesElements.add(hobbiesReadingElement);
        hobiesElements.add(hobbiesSportsElement);
        elementsMethods.clickWithMultipleValues(hobiesElements, practiceFormObject.getHobbies());
        javascriptHelpers.scroll(0, 400);
    }
    public void uploadPicture(WebElement element)
    {
        elementsMethods.uploadPicture(pictureElement);
    }
    public void completeState(PracticeFormObject practiceFormObject)
    {
        //javascriptHelpers.forceClick(stateElement);
        elementsMethods.clickOnElement(stateElement);
        elementsMethods.waitVisibilityElement(stateElement);
        elementsMethods.fillWithActions(stateElement, practiceFormObject.getState());
        //javascriptHelpers.forceClick(cityElement);
        elementsMethods.clickOnElement(cityElement);
        elementsMethods.waitVisibilityElement(cityElement);
        elementsMethods.fillWithActions(cityElement, practiceFormObject.getCity());

    }
    public void submit()
    {
        submitElement.submit();
    }
//    public void completeCity(String city)
//    {
//        javascriptHelpers.forceClick(cityElement);
//        elementsMethods.waitVisibilityElement(cityElement);
//        elementsMethods.fillWithActions(cityElement, city);
//    }
}

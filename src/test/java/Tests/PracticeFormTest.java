package Tests;

import HelperMethods.JavascriptHelpers;
import ObjectData.PracticeFormObject;
import PropertyUtility.PropertyUtility;
import ShareData.Hooks;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTest extends Hooks {


    HomePage homePage;
    CommonPage commonPage;
    PracticeFormPage practiceFormPage;

    @Test
    public void automationMethod()  {

        PropertyUtility propertyUtility = new PropertyUtility("PracticeFormTest");
        PracticeFormObject practiceFormObject = new PracticeFormObject(propertyUtility.getData());
        JavascriptHelpers javascriptHelpers = new JavascriptHelpers(getDriver());

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormPage= new PracticeFormPage(getDriver());

        homePage.goToDesiredMenu("Forms");
        commonPage.goToDesiredSubMenu("Practice Form");


        javascriptHelpers.scroll(0,400);
        practiceFormPage.completeFirstRegion(practiceFormObject);
        practiceFormPage.completeGender(practiceFormObject);
        practiceFormPage.completeSubjectWithList(practiceFormObject);
        practiceFormPage.completeHobies(practiceFormObject);

        practiceFormPage.completeState(practiceFormObject);
        practiceFormPage.submit();
    }
}

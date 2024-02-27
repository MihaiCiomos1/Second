package Tests;

import HelperMethods.JavascriptHelpers;
import ObjectData.PracticeFormObject;
import PropertyUtility.PropertyUtility;
import ShareData.Hooks;
import extentUtility.ExtentUtility;
import extentUtility.ReportStep;
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
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Forms menu");
        commonPage.goToDesiredSubMenu("Practice Form");
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Practice Form sub-menu");


        javascriptHelpers.scroll(0,400);
        practiceFormPage.completeFirstRegion(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user fills the entire first region section");
        practiceFormPage.completeGender(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user fills the gender section");
        practiceFormPage.completeSubjectWithList(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user fills the subjects section");
        practiceFormPage.completeHobies(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user fills the hobbies section");
        practiceFormPage.completeState(practiceFormObject);
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user fills the state section");
        practiceFormPage.submit();
        ExtentUtility.attachLog(ReportStep.PASS_STEP, "The user clicks on submit button");
    }
}

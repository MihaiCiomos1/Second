package Tests;

import ShareData.ShareData;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest extends ShareData {


    HomePage homePage;
    CommonPage commonPage;
    PracticeFormPage practiceFormPage;

    @Test
    public void automationMethod() throws InterruptedException {


        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormPage= new PracticeFormPage(getDriver());

        homePage.goToDesiredMenu("Forms");
        commonPage.goToDesiredSubMenu("Practice Form");



        practiceFormPage.completeFirstRegion("Cristi",  "Pop", "test@test.com", "adress", "0756552211");
        practiceFormPage.completeGender("Male");
        //  practiceFormPage.completeSubject("Maths");
        List<String> subjectsList=new ArrayList<>();
        subjectsList.add("Maths");
        subjectsList.add("English");
        practiceFormPage.completeSubjectWithList(subjectsList);
        List<String> hobies = new ArrayList<>();
        hobies.add("Sports");
        hobies.add("Reading");
        hobies.add("Music");
        practiceFormPage.completeHobies(hobies);

        practiceFormPage.completeState("NCR", "Delhi");
        practiceFormPage.submit();
//        practiceFormPage.completeCity("Delhi");
//
//
//        WebElement yearElement = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//        elementMethods.selectByValue(yearElement, yearOfBirthValue);
//
//        WebElement monthElement = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//        elementMethods.selectByVisibleText(monthElement, monthOfBirthValue);
//
//        String dayOfBirthxPath = "//div[@class='react-datepicker__day react-datepicker__day--0" + dayOfBirthValue + "']";
//        WebElement dayOfBirthElement = driver.findElement(By.xpath(dayOfBirthxPath));
//        elementMethods.clickOnElement(dayOfBirthElement);
//
//
//
//
//
//        // State:
//        WebElement stateElement = driver.findElement(By.id("react-select-3-input"));
//        javascriptHelpers.forceClick(stateElement);
//        elementMethods.fillElementWithEnter(stateElement, "NCR");
//
//        // City:
//        WebElement cityElement = driver.findElement(By.id("react-select-4-input"));
//        javascriptHelpers.forceClick(cityElement);
//        elementMethods.fillElementWithEnter(cityElement, "Delhi");
//
//        // Submit Form:
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        javascriptHelpers.forceClick(submitElement);
//
//        // Tema: Compararea datelor de dupa Submit:
//
//        // Pregatim datele pentru comparari si facem formatarile necesare unde e cazul
//        // in functie de cum sunt afisate in pagina de dupa "Submit"
//        String expectedStudentName = "Daniel Mindru";
//        String expectedEmail = "daniel@test.com";
//        String expectedMobileNumber = "0740696969";
//        String expectedGender = "Male";
//        String expectedDateOfBirth = String.format("%s %s,%s", dayOfBirthValue, monthOfBirthValue, yearOfBirthValue); // Format: "DD Month,YYYY"
//        String expectedSubjects = String.join(", ", subjectValues); // Lista de subiecte concatenata cu virgula si spatiu ", "
//        String expectedHobbies = String.join(", ", hobbiesValues); // Lista de hobbies concatenata cu virgula si spatiu ", "
//
//        // Sample: "src/test/resources/1.png";  -> Trebuie sa luam doar ultima parte
//        String[] filePathStrings = "src/test/resources/1.png".split("/");
//        String expectedPicture = filePathStrings[filePathStrings.length - 1];
//
//        String expectedAddress = currentAddressValue.replaceAll("\n", " ");
//        String expectedStateAndCity = "NCR" + " " + "Delhi";
//
//        Map<String, String> expectedValuesMap = new LinkedHashMap<>();
//        expectedValuesMap.put("Student Name", expectedStudentName);
//        expectedValuesMap.put("Student Email", expectedEmail);
//        expectedValuesMap.put("Gender", expectedGender);
//        expectedValuesMap.put("Mobile", expectedMobileNumber);
//        expectedValuesMap.put("Date of Birth", expectedDateOfBirth);
//        expectedValuesMap.put("Subjects", expectedSubjects);
//        expectedValuesMap.put("Hobbies", expectedHobbies);
//        expectedValuesMap.put("Picture", expectedPicture);
//        expectedValuesMap.put("Address", expectedAddress);
//        expectedValuesMap.put("State and City", expectedStateAndCity);
//
//        int index = 0;
//        for (String key : expectedValuesMap.keySet()) {
//            String labelElementXPath = "//tbody/tr[" + (index + 1) + "]/td[1]";
//            WebElement labelElement = driver.findElement(By.xpath(labelElementXPath));
//            System.out.println("Label Element: " + labelElement.getText());
//            Assert.assertEquals(labelElement.getText(), key);
//
//            String valueElementXPath = "//tbody/tr[" + (index + 1) + "]/td[2]";
//            WebElement valueElement = driver.findElement(By.xpath(valueElementXPath));
//            System.out.println("Value Element: " + valueElement.getText());
//            Assert.assertEquals(valueElement.getText(), expectedValuesMap.get(key));
//
//            index++;
//        }
//
//        /* Sample table:
//        Student Name	    Daniel Mindru
//        Student Email	    daniel@test.com
//        Gender	            Male
//        Mobile	            0740696969
//        Date of Birth	    30 March,1988
//        Subjects	        Social Studies, Maths, History
//        Hobbies	            Sports, Music
//        Picture	            1.png
//        Address	            Targu Mures, Romania Line 2 Line 3
//        State and City	    NCR Delhi
//
//         */
//
//        Thread.sleep(10000);
//        driver.close();

    }
}

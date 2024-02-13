package Tests;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class mapTable {

//    public WebDriver driver;
//    @Test
//    public void AutomationMethod() {
//        //deschidem Chrome browser
//        driver = new ChromeDriver();
//
//        //accesam o pagina web
//        driver.get("https://demoqa.com/");
//
//        //facem browserul in modul maximize
//
//        driver.manage().window().maximize();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");
//
//
//        WebElement FormField= driver.findElement(By.xpath("//h5[text()='Forms']"));
//        FormField.click();
//
//        WebElement PracticeFormField= driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        PracticeFormField.click();
//
//        WebElement FirstNameElement= driver.findElement(By.id("firstName"));
//        String firstNameValue = "Cristi";
//        FirstNameElement.sendKeys(firstNameValue);
//
//        WebElement LastNameElement= driver.findElement(By.id("lastName"));
//        String LastNameValue="Pop";
//        LastNameElement.sendKeys(LastNameValue);
//        String fullName= firstNameValue + " " + LastNameValue;
//        WebElement EmailElement= driver.findElement(By.id("userEmail"));
//        String EmailValue="test@yahoo.com";
//        EmailElement.sendKeys(EmailValue);
//
//        WebElement MobileField= driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
//        String MobileValue="1234567890";
//        MobileField.sendKeys(MobileValue);
//
//        WebElement PictureElement= driver.findElement(By.id("uploadPicture"));
//
//        File file = new File("src/test/resources/1.png");
//        PictureElement.sendKeys(file.getAbsolutePath());
//
//        WebElement MaleElement= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        WebElement FemaleElement= driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        WebElement OtherElement= driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
//
//        String Gender="Other";
//        if(MaleElement.getText().equals(Gender))
//        {
//            MaleElement.click();
//        }
//        else if (FemaleElement.getText().equals(Gender))
//        {
//            FemaleElement.click();
//        }
//        else if (OtherElement.getText().equals(Gender))
//        {
//            OtherElement.click();
//        }
//
//        WebElement SubjectsElement= driver.findElement(By.id("subjectsInput"));
//        String SubjectsValue="Social Studies";
//        SubjectsElement.sendKeys(SubjectsValue);
//        SubjectsElement.sendKeys(Keys.ENTER);
//
//
//
//        WebElement StateElement= driver.findElement(By.id("react-select-3-input"));
//        js.executeScript("arguments[0].click();", StateElement);
//        StateElement.sendKeys("NCR");
//        StateElement.sendKeys(Keys.ENTER);
//
//        WebElement CityElement= driver.findElement(By.id("react-select-4-input"));
//        js.executeScript("arguments[0].click();", CityElement);
//        CityElement.sendKeys("Delhi");
//        CityElement.sendKeys(Keys.ENTER);
//        String fullAdress= StateElement + " " + CityElement;
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        js.executeScript("arguments[0].click();", submitElement);
//
//        WebElement table = driver.findElement(By.xpath("//div[@class='modal-content']"));
//
//        HashMap<String,String> campuri= new HashMap<>();
//
//        List<WebElement> randuri=table.findElements(By.tagName("tr"));
//
//        for(WebElement i:randuri)
//        {
//            List<WebElement> celule =  i.findElements(By.tagName("td"));
//            if(celule.size()>=2)
//            {
//                String label=celule.get(0).getText();
//                String value=celule.get(1).getText();
//                campuri.put(label,value);
//
//            }
//        }
//        assert campuri.get("Student Name").equals(fullName);
//        assert campuri.get("Student Email").equals(EmailValue);
//        assert campuri.get("Mobile").equals(MobileValue);
//        assert campuri.get("Subjects").equals(SubjectsValue);
//        //assert campuri.get("State and City").equals(fullAdress);
//
//
//    }
}

package Tests;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class formTable {

//    public WebDriver driver;
//
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
//        WebElement FormField = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        FormField.click();
//
//        WebElement PracticeFormField = driver.findElement(By.xpath("//span[text()='Practice Form']"));
//        PracticeFormField.click();
//
//        WebElement FirstNameElement = driver.findElement(By.id("firstName"));
//        String firstNameValue = "Cristi";
//        FirstNameElement.sendKeys(firstNameValue);
//
//        WebElement LastNameElement = driver.findElement(By.id("lastName"));
//        String LastNameValue = "Pop";
//        LastNameElement.sendKeys(LastNameValue);
//        String fullName = firstNameValue + " " + LastNameValue;
//        WebElement EmailElement = driver.findElement(By.id("userEmail"));
//        String EmailValue = "test@yahoo.com";
//        EmailElement.sendKeys(EmailValue);
//
//        WebElement MobileField = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
//        String MobileValue = "1234567890";
//        MobileField.sendKeys(MobileValue);
//
//        WebElement PictureElement = driver.findElement(By.id("uploadPicture"));
//
//        File file = new File("src/test/resources/1.png");
//        PictureElement.sendKeys(file.getAbsolutePath());
//
//        WebElement MaleElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        WebElement FemaleElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        WebElement OtherElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
//
//        String Gender = "Other";
//        if (MaleElement.getText().equals(Gender)) {
//            MaleElement.click();
//        } else if (FemaleElement.getText().equals(Gender)) {
//            FemaleElement.click();
//        } else if (OtherElement.getText().equals(Gender)) {
//            OtherElement.click();
//        }
//
//        WebElement SubjectsElement = driver.findElement(By.id("subjectsInput"));
//        String SubjectsValue = "Social Studies";
//        SubjectsElement.sendKeys(SubjectsValue);
//        SubjectsElement.sendKeys(Keys.ENTER);
//
//        WebElement StateElement = driver.findElement(By.id("react-select-3-input"));
//        js.executeScript("arguments[0].click();", StateElement);
//        StateElement.sendKeys("NCR");
//        StateElement.sendKeys(Keys.ENTER);
//
//        WebElement CityElement = driver.findElement(By.id("react-select-4-input"));
//        js.executeScript("arguments[0].click();", CityElement);
//        CityElement.sendKeys("Delhi");
//        CityElement.sendKeys(Keys.ENTER);
//        String fullAdress = StateElement + " " + CityElement;
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        js.executeScript("arguments[0].click();", submitElement);
//
//        WebElement tabel = driver.findElement(By.xpath("//div[@class='modal-content']"));
//
//    }
}
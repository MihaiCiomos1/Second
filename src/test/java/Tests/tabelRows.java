package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class tabelRows {
    public WebDriver driver;

    @Test
    public void AutomationMethod() {
        //deschidem Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://demoqa.com/");

        //facem browserul in modul maximize

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        //declaram un element
        WebElement ElementsField = driver.findElement(By.xpath("//h5[text()='Elements']"));

        ElementsField.click();

        WebElement WebTableField = driver.findElement(By.xpath("//span[text()='Web Tables']"));

        WebTableField.click();

        List<WebElement> actualTabel= driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        Integer actualSize=actualTabel.size();

        WebElement AddField = driver.findElement(By.id("addNewRecordButton"));
        AddField.click();

        WebElement FirstNameField = driver.findElement(By.id("firstName"));
        String firstNameValue = "Mihai";
        FirstNameField.sendKeys(firstNameValue);

        WebElement LastNameField = driver.findElement(By.id("lastName"));
        String LastNameValue = "Ciomos";
        LastNameField.sendKeys(LastNameValue);

        WebElement EmailField = driver.findElement(By.id("userEmail"));
        String EmailValue = "mihaiciomos@yahoo.com";
        EmailField.sendKeys(EmailValue);

        WebElement AgeField = driver.findElement(By.id("age"));
        String AgeValue = "25";
        AgeField.sendKeys(AgeValue);

        WebElement SalaryField = driver.findElement(By.id("salary"));
        String SalaryValue = "10000";
        SalaryField.sendKeys(SalaryValue);

        WebElement DepartamentField = driver.findElement(By.id("department"));
        String DepartamentValue = "Testing";
        DepartamentField.sendKeys(DepartamentValue);

        WebElement SubmitField = driver.findElement(By.id("submit"));
        SubmitField.click();

        List<WebElement> expectedTable = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        Integer expectedValue = actualSize + 1;

        Assert.assertEquals(expectedTable.size(), expectedValue);

        String expectedValueRow = expectedTable.get(3).getText();
        Assert.assertTrue(expectedValueRow.contains(firstNameValue));

    }

}
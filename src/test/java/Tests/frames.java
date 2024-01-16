package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frames {
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

        WebElement alertFormWindows= driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        alertFormWindows.click();

        WebElement framesWindow= driver.findElement(By.xpath("//span[text()='Frames']"));

        framesWindow.click();

        WebElement frame1Element= driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame1Element);

        WebElement textFrame= driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din frame este: " + textFrame.getText());
        driver.switchTo().defaultContent();

        WebElement frame2Element = driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frame2Element);
        js.executeScript("window.scrollBy(50,400)");




    }

}

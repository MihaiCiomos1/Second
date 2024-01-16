package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class browserWindowTab {
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

        WebElement browserWindow= driver.findElement(By.xpath("//span[text()='Browser Windows']"));

        browserWindow.click();

        WebElement tabElement = driver.findElement(By.id("tabButton"));
        tabElement.click();

        List<String> tabList= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
        WebElement textElement = driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul din new tab este: " + textElement.getText());
        driver.close();

        driver.switchTo().window(tabList.get(0));
        WebElement newTabWindow = driver.findElement(By.id("windowButton"));
        newTabWindow.click();

        List<String> windowList= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));
        WebElement textEl=driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul este: " + textEl.getText());

        driver.close();
        driver.switchTo().window(windowList.get(0));


    }
}
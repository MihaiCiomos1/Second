package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class alerteFrameWindow {
    public WebDriver driver;

    @Test
    public void AutomationMethod() {
        //deschidem Chrome browser
        driver = new ChromeDriver();

        //accesam o pagina web
        driver.get("https://demoqa.com/");
        //definim un wait implicit pt intervalul maxim de timp

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //facem browserul in modul maximize

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");

        WebElement alertFormWindows = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

        alertFormWindows.click();

        WebElement browserWindow= driver.findElement(By.xpath("//span[text()='Browser Windows']"));

        browserWindow.click();

        WebElement tab1= driver.findElement(By.id("tabButton"));
        tab1.click();

        List<String> taburi= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(taburi.get(1));
        WebElement text= driver.findElement(By.id("sampleHeading"));
        System.out.println("Textul este" + text.getText());
        driver.close();

        driver.switchTo().window(taburi.get(0));
        WebElement fereastra2= driver.findElement(By.id("windowButton"));
        fereastra2.click();
        List<String> fereastra=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(taburi.get(1));
        WebElement text2=driver.findElement(By.id("sampleHeading"));
        System.out.println("textul este: "+text2.getText());
    }
}

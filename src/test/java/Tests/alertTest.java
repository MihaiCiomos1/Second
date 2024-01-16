package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class alertTest {
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

        WebElement alertFormWindows= driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));

        alertFormWindows.click();

        WebElement alertElement= driver.findElement(By.xpath("//span[text()='Alerts']"));

        alertElement.click();

        WebElement alertOkElement= driver.findElement(By.id("alertButton"));
        alertOkElement.click();

        Alert alertOk=driver.switchTo().alert();
        //ne mutam cu focus pe alerta

        alertOk.accept();

        //delay alarm

        WebElement alertDelayOkElement= driver.findElement(By.id("timerAlertButton"));
        alertDelayOkElement.click();
        //definim un wait explicit ca sa astepte dupa alerta
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alertDelayOk=driver.switchTo().alert();
        //ne mutam cu focus pe alerta

        alertOk.accept();

        //alarm cu mesaj
        WebElement alertConfirmationElement= driver.findElement(By.id("confirmButton"));
        alertConfirmationElement.click();

        Alert alertConfirmation=driver.switchTo().alert();
        alertConfirmation.dismiss();


        WebElement alertPromptElement= driver.findElement(By.id("promtButton"));
        alertPromptElement.click();

        Alert alertPromt=driver.switchTo().alert();
        alertPromt.sendKeys("Alol alo");
        alertPromt.accept();



    }
}

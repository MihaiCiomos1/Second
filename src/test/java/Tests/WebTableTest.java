package Tests;

import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.HomePage;
import pages.WebTablePage;

import java.util.ArrayList;
import java.util.List;

public class WebTableTest  extends ShareData {



    HomePage homePage;
    CommonPage commonPage;
    WebTablePage webTablePage;

    @Test
    public void automationMethod() throws InterruptedException {


        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        webTablePage = new WebTablePage(getDriver());
        homePage.goToDesiredMenu("Elements");
        commonPage.goToDesiredSubMenu("Web Tables");
//        String firstN = "Cristi";
//        String lastN= "Pop";
//        String emalAdr="test@test.com";
//        String ageNr="25";
//        String salaryVal="1000";
//        String departmentName="Testing";
//        List<String> listaFinala= new ArrayList<>();
//        listaFinala.add(firstN);
//        listaFinala.add(lastN);
//        listaFinala.add(emalAdr);
//        listaFinala.add(ageNr);
//        listaFinala.add(departmentName);
//        WebElement tabel = getDriver().findElement(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//        List<String> listaInitiala= new ArrayList<String>();
//        List<WebElement> celule=tabel.findElements(By.tagName("td"));
//        for(int j=0; j<celule.size(); j++)
//        {
//            listaInitiala.add(celule.get(j).getText());
//        }
//        for(int i=0;i<listaFinala.size();i++) {
//            if(listaInitiala.get(i).contains(listaFinala.get(i))) {
//                System.out.println("Search function verified");
//            }else {
//                System.out.println("Search function verification failed"+listaInitiala.get(i));
//            }
//        }
        //div[@class='rt-tbody']/div/div[@class='rt-tr -even']");
//        List<WebElement> tableElements = driver.findElements(By.xpath(
//            "//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));

//        int initialTableSize = tableElements.size();

//
//
//        List<WebElement> expectedTableElements = driver.findElements(By.xpath(
//            "//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//        Integer expectedTableSize = initialTableSize +1;
//
//        Assert.assertEquals(expectedTableElements.size(), expectedTableSize);
//
//        String actualTableValue = expectedTableElements.get(3).getText();
//
//        Assert.assertTrue(actualTableValue.contains(firstNameValue));
//        Assert.assertTrue(actualTableValue.contains(lastNameValue));
//        Assert.assertTrue(actualTableValue.contains(emailValue));
//        Assert.assertTrue(actualTableValue.contains(ageValue));
//        Assert.assertTrue(actualTableValue.contains(salaryValue));
//        Assert.assertTrue(actualTableValue.contains(departmentValue));
//
//        Thread.sleep(3000);
//        driver.close();
    }

}

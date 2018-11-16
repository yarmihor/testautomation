package lesson3;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.HomePageAdidasUS;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SimpleTestPageObjectAdidasUS extends TestBase {
    private  WebDriver driver;
    private HomePageAdidasUS homePage;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        homePage= PageFactory.initElements(driver, HomePageAdidasUS.class);
    }


    @BeforeMethod
    public void beforeMethod ()
        {

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


    @AfterMethod
     public void afterMethod() {
        driver.close();
    }


    @Test
    public void SimpleTestMaven() {


        driver.navigate().to("https://adidas.de");

//        Asset page title
//        assertEquals(driver.getTitle(), "Home Page");
//     login

        homePage.clickCTA();
        System.out.println("Done");

    }

}

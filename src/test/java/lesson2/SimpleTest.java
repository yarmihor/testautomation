package lesson2;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


import static org.testng.Assert.assertEquals;

public class SimpleTest extends TestBase {
    private  WebDriver driver;


    @BeforeMethod (alwaysRun = true)
    public void beforeMethod ()
        {
               driver= new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


    @AfterMethod (alwaysRun = true)
     public void afterMethod() {
        driver.close();
    }


    @Test (groups="Group1")
    public void SimpleTestMaven() {


        driver.navigate().to("https://epam.github.io/JDI/index.html");

//        Asset page title
        assertEquals(driver.getTitle(), "Home Page");
//     login
        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.cssSelector("[id = 'Name']")).sendKeys("epam");
        driver.findElement(By.cssSelector("[id = 'Password']")).sendKeys("1234");

        driver.findElement(By.cssSelector(".login [type = 'submit']")).click();

        WebElement mainTitle = driver.findElement(By.cssSelector("h3.main-title"));
        assertEquals(mainTitle.getText(),"EPAM FRAMEWORK WISHES…");

    }
    @Test (groups="Group1")
    public void SimpleTestMaven2() {


        driver.navigate().to("https://epam.github.io/JDI/index.html");

//        Asset page title
        assertEquals(driver.getTitle(), "Home Page");
//     login
        driver.findElement(By.cssSelector(".profile-photo")).click();
        driver.findElement(By.cssSelector("[id = 'Name']")).sendKeys("epam");
        driver.findElement(By.cssSelector("[id = 'Password']")).sendKeys("1234");

        driver.findElement(By.cssSelector(".login [type = 'submit']")).click();

        WebElement mainTitle = driver.findElement(By.cssSelector("h3.main-title"));
        assertEquals(mainTitle.getText(),"EPAM FRAMEWORK WISHES…");

    }
}

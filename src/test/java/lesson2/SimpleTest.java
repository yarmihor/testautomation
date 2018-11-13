package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;
import static org.testng.Assert.assertEquals;

public class SimpleTest {

 @Test
    public void SimpleTestMaven() {
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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
     driver.close();
    }
}

package lesson4;

import base.SelenideTestBase;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static java.lang.System.setProperty;
import static org.testng.Assert.assertEquals;

public class SimpleTestSelenide extends SelenideTestBase {

 @Test
    public void SimpleTest() {
        setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
//1 Open BR
        Selenide.open("https://epam.github.io/JDI/index.html");

// 2       Assert page title
     assertEquals(getWebDriver().getTitle(), "Home Page");
//  3   login
    $(".profile-photo").click();
    $("[id = 'Name']").sendKeys("epam");
    $("[id = 'Password']").sendKeys("1234");

    $(".login [type = 'submit']").click();


//
     SelenideElement mainTitle = $("h3.main-title");
     assertEquals(mainTitle.getText(),"EPAM FRAMEWORK WISHES…");

     mainTitle.shouldBe(visible);
    mainTitle.shouldHave(text("EPAM FRAMEWORK WISHES…"));



//    $$(By.xpath("")).shouldHaveSize(4);
//    $$(By.xpath("")).shouldBe(CollectionCondition.sizeLessThan(5));

    }
}

package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageAdidasUS {
//    @FindBy(css = "[title=Explore]")
//    private WebElement teaser_text;

    @FindBy (css = "[title=Explore]")
    private WebElement cta_button;

    public void clickCTA (){
        cta_button.click();
    }
}

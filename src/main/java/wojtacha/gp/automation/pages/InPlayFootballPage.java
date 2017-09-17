package wojtacha.gp.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("http://sports.williamhill.com/betting/en-gb")
public class InPlayFootballPage extends PageObject {

    @FindBy(xpath= "//header[@data-id='Football']/parent::article")
    private WebElementFacade footballEventsArray;

    private By css = By.cssSelector("div.btmarket");


    @FindBy(xpath = "//div[@class='btmarket']/div[@class='btmarket__content']")
    private List<WebElement> eventsArray;

    @FindBy(name = "go")
    private WebElementFacade homeButton;

    @FindBy(name = "go")
    private WebElementFacade drawButton;

    @FindBy(name = "go")
    private WebElementFacade awayButton;

    public WebElementFacade named(String footballEventName) {
     footballEventsArray.findElements(css);

        return (WebElementFacade) eventsArray.stream().filter(match -> match.getText().equals(footballEventName));
    }


}
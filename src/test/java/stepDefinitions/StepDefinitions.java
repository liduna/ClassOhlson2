package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private WebDriver driver;
    

    @Given("I have navigated to webpage https:\\/\\/www.clasohlson.com\\/se\\/Superlim-Loctite-Precision,-5-g\\/p\\/25-1544")
    public void iHaveNavigatedToWebpage () {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https:\\/\\/www.clasohlson.com\\/se\\/Superlim-Loctite-Precision,-5-g\\/p\\/25-1544");
        
    }
    @And("I have accepted cookies")
    public void iHaveAcceptedCookies() {
        WebElement cookiePopUp = driver.findElement(By.id("js-cookie-notification"));
        cookiePopUp.isDisplayed();
        WebElement acceptButton = driver.findElement(By.className("btn-text"));
        acceptButton.click();

    }


    @When("I press add to cart")
    public void iPressAddToCart() {
        WebElement addInCartButton = driver.findElement(By.xpath
                ("//button[@class='btn btn-pd-cart btn-pdp-addtocart js-pdp-cart-btn btn-addtocart-pdp'] "));
        addInCartButton.click();
    }

    @And("I click on the cart icon")
    public void iClickOnTheCartItem() {
        WebElement cartIcon = driver.findElement(By.xpath("/html/body/main/div[2]/header/nav[1]/div/div[2]/div/ul/li[2]/div/div/div/div[1]/a/div/div[2]"));
        cartIcon.click();

    }


    @Then("the item is added to the cart")
    public void theItemIsAddedToTheCart() {


        throw new PendingException();

    }



}

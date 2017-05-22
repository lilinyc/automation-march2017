package product;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Lili on 5/21/2017.
 */
public class ProductPage extends CommonAPI {
    private static final String popupNoCoveragebuttonId = "siNoCoverage-announce";

    @FindBy(how = How.CSS, using = "#productTitle")
    public static WebElement productTitleElement;

    @FindBy(how = How.CSS, using = "#add-to-cart-button")
    public static WebElement addToCartButton;

    @FindBy(how = How.CSS, using = "#siNoCoverage-announce")
    public static WebElement popupNoCoveragebutton;


    public String getProductTitle() {
        return productTitleElement.getText();
    }

    public void clickOnAddToCart() {
        addToCartButton.click();

        //reduce the wait to 5 sec to not waste time
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (getListOfWebElementsById(popupNoCoveragebuttonId).size() > 0) {
            popupNoCoveragebutton.click();
        }

        waitUntilVisible(By.cssSelector("#huc-v2-order-row-confirm-text"));
    }

    public void verifyProductTitle(String searchedTitle) {
        String productName = this.getProductTitle();
        Assert.assertEquals(productName.contains(searchedTitle), true);
    }
}

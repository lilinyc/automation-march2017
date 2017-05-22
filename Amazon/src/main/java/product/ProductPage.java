package product;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Lili on 5/21/2017.
 */
public class ProductPage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#productTitle")
    public static WebElement productTitleElement;

    @FindBy(how = How.CSS, using =  "#add-to-cart-button")
    public static WebElement addToCartButton;



    public String getProductTitle() {
        return productTitleElement.getText();
    }

    public void clickOnAddToCart() {
        addToCartButton.click();
        waitUntilVisible(By.cssSelector("#huc-v2-order-row-confirm-text"));
    }

    public void verifyProductTitle(String searchedTitle) {
        String productName =  this.getProductTitle();
        Assert.assertEquals(productName.contains(searchedTitle), true);
    }
}

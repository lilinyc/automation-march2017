package product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by Lili on 5/21/2017.
 */
public class CartPage {
    @FindBy(how = How.CSS, using =  "#huc-v2-order-row-confirm-text")
    public static WebElement confirmationElement;

    @FindBy(how = How.CSS, using =  ".huc-v2-upsell-title")
    public static WebElement productTitleElement;

    public String getConfirmationText() {
        return confirmationElement.getText();
    }

    public String getProductTitle() {
        return productTitleElement.getText();
    }

    public void verifyItemIsAddedToCart(String addedItem) {
        String addToCartText = this.getConfirmationText();
        Assert.assertEquals(addToCartText.contains("Added to Cart"), true);
        String productName = this.getProductTitle();
        Assert.assertEquals(productName.contains(addedItem), true);
    }
}

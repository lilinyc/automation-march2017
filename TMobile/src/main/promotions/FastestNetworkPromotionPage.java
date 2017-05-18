package promotions;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Lili on 5/18/2017.
 */
public class FastestNetworkPromotionPage extends CommonAPI {
    public static final String videoContainerSelector = "#testCustVid";

    @FindBy(how = How.CSS, using = "h2.normal")
    public static WebElement promotionsTextHeaderElement;

    public String getPromotionText() {
        return promotionsTextHeaderElement.getText();
    }
}

package cellphones;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Lili on 5/17/2017.
 */
public class CellPhonesPage extends CommonAPI {
    public static final String productContainerSelector = "#productDescription";
    public static final String productGridSelector = "product-grid";

    @FindBy(how = How.CSS, using = ".product-name")
    public static WebElement firstProductElement;

    @FindBy(how = How.CSS, using = "#productDescription h3")
    public static WebElement cellPhoneDescriptionElement;

    public String getFirstProductName() {
        return firstProductElement.getText();
    }

    public String getCellPhoneDescription() {
        return cellPhoneDescriptionElement.getText();
    }
}

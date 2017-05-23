package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import product.CartPage;
import product.ProductPage;
import search.SearchPage;
import utility.reporting.TestLogger;

/**
 * Created by Lili on 5/22/2017.
 */
public class SearchItemsNegativeTest extends CommonAPI {
    @Test
    public void TestSearchInvalidItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItemNoResults("Bdjdjdjjdjsbhdhdbdbbdbdbdbvsvscavsv");
        String productName = searchPage.getSearchDidNotMatchProductMessage();
        Assert.assertEquals(productName.contains("Bdjdjdjjdjsbhdhdbdbbdbdbdbvsvscavsv"), true);
    }
}

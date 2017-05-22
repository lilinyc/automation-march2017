package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import product.CartPage;
import product.ProductPage;
import search.SearchPage;
import utility.reporting.TestLogger;

/**
 * Created by PIIT_NYA on 5/7/2017.
 */
public class SearchItems extends CommonAPI {

    @Test
    public void TestSerachBasic() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("iphone");
    }

    @Test
    public void TestSerachCategories() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Lenovo Yoga 14");
        String category = searchPage.getFirstCategoryTitle();
        Assert.assertEquals(category, "Computers & Accessories");
    }

    @Test
    public void TestSearchLaptop() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Lenovo Yoga 710 80V4000GUS");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Lenovo Yoga 710 80V4000GUS"), true);
    }

    @Test
    public void TestSearchLaptopDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("Lenovo Yoga 710 80V4000GUS");
        searchPage.clickOnFirstProdcut();

        productPage.verifyProductTitle("Lenovo Yoga 710 80V4000GUS");
    }

    @Test
    public void TestSearchLaptopOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("Lenovo Yoga 710 80V4000GUS");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Lenovo Yoga 710 80V4000GUS");
    }


    @Test
    public void TestSearchHeadphones() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("headphones seinnheiser 360");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Sennheiser PC 360 Special Edition"), true);
    }

    @Test
    public void TestSearchHeadphonesDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("headphones seinnheiser 360");
        searchPage.clickOnFirstProdcut();

        productPage.verifyProductTitle("Sennheiser PC 360 Special Edition");
    }

    @Test
    public void TestSearchHeadphonesOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("headphones seinnheiser 360");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Sennheiser PC 360 Special Edition");
    }

    @Test
    public void TestSearchMouse() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("mouse logitech g502");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Logitech G502 Proteus"), true);
    }

    @Test
    public void TestSearchMouseDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("mouse logitech g502");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("Logitech G502 Proteus");
    }

    @Test
    public void TestSearchMouseOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("mouse logitech g502");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Logitech G502 Proteus");
    }

    @Test
    public void TestSearchSpeakers() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("AmazonBasics Portable Bluetooth Speaker ");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("AmazonBasics Portable Bluetooth Speaker "), true);
    }

    @Test
    public void TestSearchSpeakersDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("AmazonBasics Portable Bluetooth Speaker ");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("AmazonBasics Portable Bluetooth Speaker ");
    }

    @Test
    public void TestSearchSpeakersOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("AmazonBasics Portable Bluetooth Speaker");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("AmazonBasics Portable Bluetooth Speaker");
    }

    @Test
    public void TestSearchTV() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Sony XBR65X850D 65-Inch");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Sony XBR65X850D 65-Inch"), true);
    }

    @Test
    public void TestSearchTVDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("Sony XBR65X850D 65-Inch");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("Sony XBR65X850D 65-Inch");
    }

    @Test
    public void TestSearchTVOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("Sony XBR65X850D 65-Inch");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Sony XBR65X850D 65-Inch");
    }

    @Test
    public void TestSearchCamera() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Canon EOS Rebel T7i");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Canon EOS Rebel T7i"), true);
    }

    @Test
    public void TestSearchCameraDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("Canon EOS Rebel T7i");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("Canon EOS Rebel T7i");
    }

    @Test
    public void TestSearchCameraOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("Canon EOS Rebel T7i");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Canon EOS Rebel T7i");
    }

    @Test
    public void TestSearchCarCamera() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("PowerLead Pdvr D011");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("PowerLead Pdvr D011"), true);
    }

    @Test
    public void TestSearchCarCameraDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("PowerLead Pdvr D011");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("PowerLead Pdvr D011");
    }

    @Test
    public void TestSearchCarCameraOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("PowerLead Pdvr D011");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("PowerLead Pdvr D011");
    }

    @Test
    public void TestSearchWatch() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Garmin Forerunner 35");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Garmin Forerunner 35"), true);
    }

    @Test
    public void TestSearchWatchDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("Garmin Forerunner 35");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("Garmin Forerunner 35");
    }

    @Test
    public void TestSearchWatchOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("Garmin Forerunner 35");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Garmin Forerunner 35");
    }

    @Test
    public void TestSearchTablet() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Samsung Galaxy Tab S3");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Samsung Galaxy Tab S3"), true);
    }

    @Test
    public void TestSearchTabletDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("Samsung Galaxy Tab S3");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("Samsung Galaxy Tab S3");
    }

    @Test
    public void TestSearchTabletOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("Samsung Galaxy Tab S3");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Samsung Galaxy Tab S3");
    }

    @Test
    public void TestSearchRouter() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Linksys AC5400 Tri Band");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Linksys AC5400 Tri Band"), true);
    }

    @Test
    public void TestSearchRouterDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("Linksys AC5400 Tri Band");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("Linksys AC5400 Tri Band");
    }

    @Test
    public void TestSearchRouterOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("Linksys AC5400 Tri Band");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Linksys AC5400 Tri Band");
    }

    @Test
    public void TestSearchRoku() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Roku 4 4400R");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Roku 4 4400R"), true);
    }

    @Test
    public void TestSearchRokuDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("Roku 4 4400R");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("Roku 4 4400R");
    }

    @Test
    public void TestSearchRokuOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("Roku 4 4400R");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Roku 4 4400R");
    }

    @Test
    public void TestSearchBulb() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);

        searchPage.searchForItem("Philips 465443 Hue White");
        String productName = searchPage.getFirstProductTitle();
        Assert.assertEquals(productName.contains("Philips 465443 Hue White"), true);
    }

    @Test
    public void TestSearchBulbDrillDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

        searchPage.searchForItem("Philips 465443 Hue White");
        searchPage.clickOnFirstProdcut();
        productPage.verifyProductTitle("Philips 465443 Hue White");
    }

    @Test
    public void TestSearchBulbOrder() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);
        CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

        searchPage.searchForItem("Philips 465443 Hue White");
        searchPage.clickOnFirstProdcut();
        productPage.clickOnAddToCart();
        cartPage.verifyItemIsAddedToCart("Philips 465443 Hue White");
    }
}

package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 5/7/2017.
 */
public class SearchItems extends CommonAPI {

    @Test
    public void TestSerachBasic(){
        typeByCss("#twotabsearchtextbox", "iphone");
        clickByCss(".nav-input");
    }

    @Test
    public void TestSerachCategories(){
        typeByCss("#twotabsearchtextbox", "Lenovo Yoga 14");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        String category = getTextByCss(".categoryRefinementsSection ul li a span:first-child");
        Assert.assertEquals(category, "Computers & Accessories");
    }

    @Test
    public void TestSearchLaptop(){
        typeByCss("#twotabsearchtextbox", "Lenovo Yoga 710 80V4000GUS");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        String productName = getTextByCss(".s-access-title");
        Assert.assertEquals(productName.contains("Lenovo Yoga 710 80V4000GUS"), true);
    }

    @Test
    public void TestSearchLaptopDrillDown(){
        typeByCss("#twotabsearchtextbox", "Lenovo Yoga 710 80V4000GUS");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        clickByCss(".s-access-title");
        waitUntilVisible(By.cssSelector("#productTitle"));
        String productName = getTextByCss("#productTitle");
        Assert.assertEquals(productName.contains("Lenovo Yoga 710 80V4000GUS"), true);
    }

    @Test
    public void  TestSearchLaptopOrder(){
        typeByCss("#twotabsearchtextbox", "Lenovo Yoga 710 80V4000GUS");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        clickByCss(".s-access-title");
        waitUntilVisible(By.cssSelector("#productTitle"));
        clickByCss("#add-to-cart-button");

        waitUntilVisible(By.cssSelector("#huc-v2-order-row-confirm-text"));
        String addToCartText = getTextByCss("#huc-v2-order-row-confirm-text");
        Assert.assertEquals(addToCartText.contains("Added to Cart"), true);
        String productName = getTextByCss(".huc-v2-upsell-title");
        Assert.assertEquals(productName.contains("Lenovo Yoga 710 80V4000GUS"), true);
    }

    @Test
    public void TestSearchHeadphones(){
        typeByCss("#twotabsearchtextbox", "headphones seinnheiser 360");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        String productName = getTextByCss(".s-access-title");
        Assert.assertEquals(productName.contains("Sennheiser PC 360 Special Edition"), true);
    }

    @Test
    public void TestSearchHeadphonesDrillDown(){
        typeByCss("#twotabsearchtextbox", "headphones seinnheiser 360");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        clickByCss(".s-access-title");
        waitUntilVisible(By.cssSelector("#productTitle"));
        String productName = getTextByCss("#productTitle");
        Assert.assertEquals(productName.contains("Sennheiser PC 360 Special Edition"), true);
    }

    @Test
    public void  TestSearchHeadphonesOrder(){
        typeByCss("#twotabsearchtextbox", "headphones seinnheiser 360");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        clickByCss(".s-access-title");
        waitUntilVisible(By.cssSelector("#productTitle"));
        clickByCss("#add-to-cart-button");

        waitUntilVisible(By.cssSelector("#huc-v2-order-row-confirm-text"));
        String addToCartText = getTextByCss("#huc-v2-order-row-confirm-text");
        Assert.assertEquals(addToCartText.contains("Added to Cart"), true);
        String productName = getTextByCss(".huc-v2-upsell-title");
        Assert.assertEquals(productName.contains("Sennheiser PC 360 Special Edition"), true);
    }

    @Test
    public void TestSearchMouse(){
        typeByCss("#twotabsearchtextbox", "mouse logitech g502");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        String productName = getTextByCss(".s-access-title");
        Assert.assertEquals(productName.contains("Logitech G502 Proteus"), true);
    }

    @Test
    public void TestSearchMouseDrillDown(){
        typeByCss("#twotabsearchtextbox", "mouse logitech g502");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        clickByCss(".s-access-title");
        waitUntilVisible(By.cssSelector("#productTitle"));
        String productName = getTextByCss("#productTitle");
        Assert.assertEquals(productName.contains("Logitech G502 Proteus"), true);
    }

    @Test
    public void TestSearchMouseOrder(){
        typeByCss("#twotabsearchtextbox", "mouse logitech g502");
        clickByCss(".nav-input");
        waitUntilVisible(By.cssSelector(".categoryRefinementsSection"));
        clickByCss(".s-access-title");
        waitUntilVisible(By.cssSelector("#productTitle"));
        clickByCss("#add-to-cart-button");

        waitUntilVisible(By.cssSelector("#huc-v2-order-row-confirm-text"));
        String addToCartText = getTextByCss("#huc-v2-order-row-confirm-text");
        Assert.assertEquals(addToCartText.contains("Added to Cart"), true);
        String productName = getTextByCss(".huc-v2-upsell-title");
        Assert.assertEquals(productName.contains("Logitech G502 Proteus"), true);
    }

}

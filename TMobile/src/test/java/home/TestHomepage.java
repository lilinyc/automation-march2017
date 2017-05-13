package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by PIIT_NYA on 5/7/2017.
 */
public class TestHomepage extends CommonAPI {
    @Override
    public String Url(){
        return "https://www.t-mobile.com/";
    }

    @Test
    public void TestSerachBasic(){
        clickByCss(".lvl-one li:nth-child(2)");
        waitUntilVisible(By.cssSelector("product-grid"));
        String productName = getTextByCss(".product-name");
        Assert.assertEquals(productName, "Samsung Galaxy S8");

    }
}
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
        String laptopName = getTextByCss(".s-access-title");
        Assert.assertEquals(laptopName.contains("Lenovo Yoga 710 80V4000GUS"), true);
    }
}

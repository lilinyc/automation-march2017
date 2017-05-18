package testhomepage;

import base.CommonAPI;
import org.junit.Assert;
import org.testng.annotations.Test;

/**
 * Created by Lili on 5/17/2017.
 */
public class TestHomePage extends CommonAPI {
    @Override
    public String Url() {
        return "https://www.alibaba.com/";
    }

    @Test
    public void TestClickMachinery() {
        clickByCss(".header-category-wrapper.trigger-active");
        clickByCss(".header-category-wrapper.trigger-active .component-list li:nth-child(1)");
    }

    @Test
    public void TestClickMachinerySubMenu() {
        clickByCss(".header-category-wrapper.trigger-active");
        clickByCss(".header-category-wrapper.trigger-active .component-list li:nth-child(1) i");
        clickByCss(".header-category-wrapper.trigger-active .component-list li:nth-child(1) .level-two-list a:nth-child(1)");


        //TODO FIX test opens new windows
        //sleepFor(5);
        //String productName = getTextByCss(".m-category-filter a");
        ///Assert.assertEquals(productName, "Hand Tools");
    }
}

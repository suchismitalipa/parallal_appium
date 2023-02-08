package com.browserstack.run_parallel_test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import io.appium.java_client.MobileBy;


import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class ParallelTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
      WebElement searchElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(20)).until(
          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Search Wikipedia")));
      searchElement.click();
      WebElement insertTextElement = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(20)).until(
          ExpectedConditions.elementToBeClickable(MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
      insertTextElement.sendKeys("BrowserStack");
      Thread.sleep(5000);

      List<WebElement> allProductsName = driver.findElements(By.className(("android.widget.TextView")));
      AssertJUnit.assertTrue(allProductsName.size() > 0);
    }
}

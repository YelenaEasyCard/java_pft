package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EasyCard {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEasyCard() throws Exception {
    driver.get("https://ectest.e-c.co.il/Accounts/Login");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='קיצור דרך'])[1]/following::div[2]")).click();
    driver.findElement(By.id("btnEnter")).click();
    driver.findElement(By.id("PaymentSerivce")).click();
    driver.findElement(By.id("BroadcastManger")).click();
    driver.findElement(By.id("BillingSystem")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("Settings"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("CreditBilling")).click();
    driver.findElement(By.id("Code")).click();
    new Select(driver.findElement(By.id("Code"))).selectByVisibleText("עסקת חתימה");
    driver.findElement(By.id("Code")).click();
    driver.findElement(By.id("Month2")).click();
    new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("06");
    driver.findElement(By.id("Month2")).click();
    driver.findElement(By.id("Year2")).click();
    new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2023");
    driver.findElement(By.id("Year2")).click();
    driver.findElement(By.id("btnSubmit")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='סכום עסקה לא חוקי5000'])[1]/following::div[1]")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='שגיאה'])[1]/following::div[2]"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (isElementPresent(By.id("Clicker"))) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("Clicker")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

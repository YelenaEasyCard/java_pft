package ru.stqa.pft.billingClearingHouse;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BillingSysCardEMV {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://stage.e-c.co.il";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testBillingSysCard() throws Exception {
        // driver.get("https://stage.e-c.co.il");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://stage.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("10899");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("BillingSystem")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("BillingSysCard")).click();
        Thread.sleep(6000);
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("check-all")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        driver.findElement(By.id("check-all")).click();
        driver.findElement(By.xpath("//td/input[2]")).click();
        driver.findElement(By.id("ChargeAll")).click();
        driver.findElement(By.id("liSucssesDeals")).click();
        driver.findElement(By.cssSelector("button.printExportButtons.Btn3"));
        driver.findElement(By.id("ShowUser")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("ReportsSearchStartDate"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
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

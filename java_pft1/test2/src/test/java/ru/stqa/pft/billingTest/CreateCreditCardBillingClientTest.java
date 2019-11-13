package ru.stqa.pft.billingTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class CreateCreditCardBillingClientTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://ectest.e-c.co.il";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCreditCardBillingClient() throws Exception {
        driver.get("https://ectest.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("22648");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("BillingSystem")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("create-user")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            assertTrue(isElementPresent(By.id("accordionClientDetails1")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.id("accordionClientDetails1"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement  elemX = driver.findElement(By.id("accordionClientDetails1"));
        //driver.findElement(By.cssSelector("#divCreateEditCustomer > div > form > div.DialogHeaderShape")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='divCreateEditCustomer']/div/form/div[2]/button")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        //elemX.click();
        driver.findElement(By.id("EditedCustomer_LastName")).click();
        driver.findElement(By.id("EditedCustomer_LastName")).clear();
        driver.findElement(By.id("EditedCustomer_LastName")).sendKeys("Neon");
        driver.findElement(By.id("EditedCustomer_Name")).click();
        driver.findElement(By.id("EditedCustomer_Name")).clear();
        driver.findElement(By.id("EditedCustomer_Name")).sendKeys("Yelena");
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).click();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).clear();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).sendKeys("348658899");
        driver.findElement(By.id("EditedCustomer_FileNum")).click();
        driver.findElement(By.id("EditedCustomer_FileNum")).clear();
        driver.findElement(By.id("EditedCustomer_FileNum")).sendKeys("123456");
        driver.findElement(By.id("EditedCustomer_Address")).click();
        driver.findElement(By.id("EditedCustomer_Address")).clear();
        driver.findElement(By.id("EditedCustomer_Address")).sendKeys("Ha-Melakha St 14");
        driver.findElement(By.id("EditedCustomer_City")).click();
        driver.findElement(By.id("EditedCustomer_City")).clear();
        driver.findElement(By.id("EditedCustomer_City")).sendKeys("Netanya");
        driver.findElement(By.id("EditedCustomer_postalCode")).click();
        driver.findElement(By.id("EditedCustomer_postalCode")).clear();
        driver.findElement(By.id("EditedCustomer_postalCode")).sendKeys("4250545");
      //  driver.findElement(By.id("EditedCustomer_Phone")).click();
        driver.findElement(By.id("EditedCustomer_Phone")).clear();
        driver.findElement(By.id("EditedCustomer_Phone")).sendKeys("0585456911");
        driver.findElement(By.id("EditedCustomer_Phone2")).click();
        driver.findElement(By.id("EditedCustomer_Phone2")).clear();
        driver.findElement(By.id("EditedCustomer_Phone2")).sendKeys("0585456910");
        driver.findElement(By.id("EditedCustomer_Email")).click();
        driver.findElement(By.id("EditedCustomer_Email")).clear();
        driver.findElement(By.id("EditedCustomer_Email")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("EditedCustomer_Note")).click();
        driver.findElement(By.id("EditedCustomer_Note")).clear();
        driver.findElement(By.id("EditedCustomer_Note")).sendKeys("notes");
        driver.findElement(By.id("EditedCustomer_CardNumber")).click();
        driver.findElement(By.id("EditedCustomer_CardNumber")).clear();
        driver.findElement(By.id("EditedCustomer_CardNumber")).sendKeys("375510190000062");
        driver.findElement(By.id("EditedCustomer_ValMonth")).click();
        new Select(driver.findElement(By.id("EditedCustomer_ValMonth"))).selectByVisibleText("03");
        driver.findElement(By.id("EditedCustomer_ValMonth")).click();
        driver.findElement(By.id("EditedCustomer_ValYear")).click();
        new Select(driver.findElement(By.id("EditedCustomer_ValYear"))).selectByVisibleText("2022");
        driver.findElement(By.id("EditedCustomer_ValYear")).click();
        driver.findElement(By.id("accordionClientDetails3")).click();
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).sendKeys("02/10/2019");
        driver.findElement(By.id("EditedCustomer_LastPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_LastPayDate")).sendKeys("26/12/2020");
        driver.findElement(By.id("trTotalSum")).click();
        driver.findElement(By.id("EditedCustomer_Totalsum")).clear();
        driver.findElement(By.id("EditedCustomer_Totalsum")).sendKeys("1");
        new Select(driver.findElement(By.id("EditedCustomerPayDay"))).selectByValue("02");
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("ReportsSearchStartDate"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("tblBSCustomers")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("numRecords")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("create-user")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        driver.findElement(By.id("create-user")).click();
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

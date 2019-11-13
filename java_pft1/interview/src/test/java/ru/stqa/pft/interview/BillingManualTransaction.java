package ru.stqa.pft.interview;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;


public class BillingManualTransaction {
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
    public void testDoDeal() throws Exception {
        // driver.get("https://stage.e-c.co.il");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://stage.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("10897");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("BillingSystem")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("create-user")).click();
        driver.findElement(By.id("accordionClientDetails1")).click();
        driver.findElement(By.id("EditedCustomer_LastName")).click();
        driver.findElement(By.id("EditedCustomer_LastName")).clear();
        driver.findElement(By.id("EditedCustomer_LastName")).sendKeys("Neon");
        driver.findElement(By.id("EditedCustomer_Name")).click();
        driver.findElement(By.id("EditedCustomer_Name")).clear();
        driver.findElement(By.id("EditedCustomer_Name")).sendKeys("19/08-01");
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).click();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).clear();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).sendKeys("348658899");
        driver.findElement(By.id("EditedCustomer_Phone")).click();
        driver.findElement(By.id("EditedCustomer_Phone")).clear();
        driver.findElement(By.id("EditedCustomer_Phone")).sendKeys("0585456911");
        //driver.findElement(By.id("btnInitDeal")).click();
     //   driver.findElement(By.id("CardNumber")).click();
        //driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580080111962546");
        driver.findElement(By.id("ValMonth")).click();
        new Select(driver.findElement(By.id("ValMonth"))).selectByVisibleText("10");
        driver.findElement(By.id("ValMonth")).click();
        driver.findElement(By.id("ValYear")).click();
        new Select(driver.findElement(By.id("ValYear"))).selectByVisibleText("2021");
        driver.findElement(By.id("ValYear")).click();
        driver.findElement(By.id("CVV")).click();
        driver.findElement(By.id("CVV")).clear();
        driver.findElement(By.id("CVV")).sendKeys("458");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("btnInitDealStart")).click();
        driver.findElement(By.id("accordionClientDetails3")).click();
        driver.findElement(By.id("trTotalSum")).click();
        driver.findElement(By.id("EditedCustomer_Totalsum")).clear();
        driver.findElement(By.id("EditedCustomer_Totalsum")).sendKeys("2");
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.findElement(By.id("BillingSysCard")).click();
        driver.findElement(By.id("BillingSysCard")).click();
        driver.findElement(By.id("ChargeAll")).click();
        driver.findElement(By.id("liSucssesDeals")).click();
        driver.findElement(By.id("liFailDeals")).click();

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

package ru.stqa.pft.interview;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class J5FillformSubmit {
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
    public void testPaymentRequest() throws Exception {
        // driver.get("https://stage.e-c.co.il");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://stage.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("10902");
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test12345");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("Reservationframe")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580031900109146");
        driver.findElement(By.id("Month2")).click();
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        driver.findElement(By.id("Year2")).click();
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2022");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("10");
        //driver.findElement(By.id("MType")).click();
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("751");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("122222227");
       // driver.findElement(By.id("CellPhone")).click();
        //driver.findElement(By.id("CellPhone")).clear();
        //driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
        driver.findElement(By.id("j5btnSubmit")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("ResImplementation")).click();
        driver.findElement(By.xpath("//label/a")).click();
        driver.findElement(By.id("BillingForm")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("btnMail")).click();




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

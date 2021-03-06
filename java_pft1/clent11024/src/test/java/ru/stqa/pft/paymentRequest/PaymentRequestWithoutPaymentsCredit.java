package ru.stqa.pft.paymentRequest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class PaymentRequestWithoutPaymentsCredit {
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
        driver.manage().window().maximize();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("11024");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("10");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        new Select(driver.findElement(By.id("Lang"))).selectByValue("HEB");
        driver.findElement(By.id("spanCheckmarkEMAIL")).click();
        driver.findElement(By.id("EMail")).click();
        driver.findElement(By.id("EMail")).clear();
        driver.findElement(By.id("EMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("spanCheckmarkSMS")).click();
        driver.findElement(By.id("PhoneNumber")).click();
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("TaxId")).click();
        driver.findElement(By.id("TaxId")).clear();
        driver.findElement(By.id("TaxId")).sendKeys("348658899");
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).clear();
        driver.findElement(By.id("Address")).sendKeys("Address");
        driver.findElement(By.id("Product")).click();
        driver.findElement(By.id("Product")).clear();
        driver.findElement(By.id("Product")).sendKeys("Product type");
        driver.findElement(By.id("txtareaNot")).click();
        driver.findElement(By.id("txtareaNot")).clear();
        driver.findElement(By.id("txtareaNot")).sendKeys("Notes");
        driver.findElement(By.id("txtareaAddedText")).click();
        driver.findElement(By.id("txtareaAddedText")).clear();
        driver.findElement(By.id("txtareaAddedText")).sendKeys("Comments");
        driver.findElement(By.id("sendRequestButton")).click();
        driver.findElement(By.cssSelector("input[name=\"radioP\"]")).click();
        driver.findElement(By.id("MenuActivties")).click();
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


package ru.stqa.pft.invoices;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class CreditCardClubCreditInvoice {
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
    public void testCreditCardClubInvoice() throws Exception {
        // driver.get("https://stage.e-c.co.il");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://stage.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("11024");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("menu_ECInvoice")).click();
        new Select(driver.findElement(By.id("ECInvoiceDocType"))).selectByValue("PAYMENT_INFO");
        new Select(driver.findElement(By.id("PaymentModel_paymentMethod"))).selectByValue("CREDIT_CARD_CLUB_CREDIT");
        new Select(driver.findElement(By.id("PaymentModel_creditCardType"))).selectByValue("VISA");
        driver.findElement(By.id("PaymentModel_creditCard4LastDigits")).sendKeys("3547");
        driver.findElement(By.id("ECInvoiceCustomerName")).click();
        driver.findElement(By.id("ECInvoiceCustomerName")).clear();
        driver.findElement(By.id("ECInvoiceCustomerName")).sendKeys("Yelena");
        driver.findElement(By.id("invoiceDetails")).click();
        driver.findElement(By.id("ECInvoiceAddress")).click();
        driver.findElement(By.id("ECInvoiceAddress")).clear();
        driver.findElement(By.id("ECInvoiceAddress")).sendKeys("Ha-Melakha St 10, Netanya, 4250545");
        driver.findElement(By.id("ECInvoicePhoneNumber")).click();
        driver.findElement(By.id("ECInvoicePhoneNumber")).clear();
        driver.findElement(By.id("ECInvoicePhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("ECInvoiceTaxID")).click();
        driver.findElement(By.id("ECInvoiceTaxID")).clear();
        driver.findElement(By.id("ECInvoiceTaxID")).sendKeys("348658899");
        driver.findElement(By.id("ECInvoiceEMail")).clear();
        driver.findElement(By.id("ECInvoiceEMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("26");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("okMsgFromServer"));

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


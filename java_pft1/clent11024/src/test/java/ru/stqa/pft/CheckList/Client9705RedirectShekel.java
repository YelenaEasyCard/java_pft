package ru.stqa.pft.CheckList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class Client9705RedirectShekel {
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
    public void testRedirect() throws Exception {
        // driver.get("https://stage.e-c.co.il");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://secure.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("9705");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuSettings")).click();
        driver.findElement(By.id("ExitSubMenu")).click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("accordionSettings4")).click();
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("31");
        driver.findElement(By.id("RedirectOwnerName")).click();
        driver.findElement(By.id("RedirectOwnerName")).clear();
        driver.findElement(By.id("RedirectOwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("RedirectOwnerTZ")).click();
        driver.findElement(By.id("RedirectOwnerTZ")).clear();
        driver.findElement(By.id("RedirectOwnerTZ")).sendKeys("348658899");
        driver.findElement(By.id("RedirectOwnerAddress")).click();
        driver.findElement(By.id("RedirectOwnerAddress")).clear();
        driver.findElement(By.id("RedirectOwnerAddress")).sendKeys("Address");
        driver.findElement(By.id("RedirectOwnerMail")).click();
        driver.findElement(By.id("RedirectOwnerMail")).clear();
        driver.findElement(By.id("RedirectOwnerMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("RedirectOwnerCell")).click();
        driver.findElement(By.id("RedirectOwnerCell")).clear();
        driver.findElement(By.id("RedirectOwnerCell")).sendKeys("0585456911");
        driver.findElement(By.id("RedirectECInvoiceSingleProduct")).click();
        driver.findElement(By.id("RedirectECInvoiceSingleProduct")).clear();
        driver.findElement(By.id("RedirectECInvoiceSingleProduct")).sendKeys("prod test");
        driver.findElement(By.id("RedirectNote")).click();
        driver.findElement(By.id("RedirectNote")).clear();
        driver.findElement(By.id("RedirectNote")).sendKeys("notes");
        driver.findElement(By.id("CreateRedirectPaymentUrl")).click();
        Thread.sleep(4000);

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

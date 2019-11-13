package ru.stqa.pft.reports1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class PassedDealReportByDateAndByVoucherNumber {

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
    public void testPassedDealReportByDateAndByVoucherNumber() throws Exception {
        // driver.get("https://stage.e-c.co.il");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://stage.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.findElement(By.id("MangerUser")).click();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("11024");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuReports")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"Manual\"]")).click();
        driver.findElement(By.id("FromDate")).click();
        driver.findElement(By.id("FromDate")).clear();
        driver.findElement(By.id("FromDate")).sendKeys("01/01/2019");
        driver.findElement(By.id("ToDate")).click();
        driver.findElement(By.id("ToDate")).clear();
        driver.findElement(By.id("ToDate")).sendKeys("31/12/2019");
        driver.findElement(By.id("FromShovar")).sendKeys("1800202");
        driver.findElement(By.id("ToShovar")).sendKeys("1800223");
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("FirstPageBtn"));
        driver.findElement(By.cssSelector("[name=printReport][onclick=\"JavaScript: window.location.href = '../Home/Report1';\"]")).click();
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


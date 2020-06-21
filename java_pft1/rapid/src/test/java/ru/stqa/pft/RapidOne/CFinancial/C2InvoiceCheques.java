package ru.stqa.pft.RapidOne.CFinancial;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class C2InvoiceCheques {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://revitalc.rapid-image.nett";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLoginLogout() throws Exception {
        driver.get("https://revitalc.rapid-image.net/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.cssSelector("button.login_btn.btn.ng-binding")).click();
        Thread.sleep(4000);
        driver.get("https://revitalc.rapid-image.net/financial/new-sale");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='choose_customer']/div[2]/img")).click();
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Yelena");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Phone #'])[1]/following::button[1]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yelena'])[1]/following::td[3]")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Add item/s from price list']/parent::*")).click();
        driver.findElement(By.xpath("//div[@id='table_of_prices']/div[5]/div[3]/span")).click();
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Add items to invoice']/parent::*")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(1000,0)");
        Thread.sleep(2000);
        WebElement Element = driver.findElement(By.xpath("//*/text()[normalize-space(.)='Add cash']/parent::*"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Add cash']/parent::*")).click();
        driver.findElement(By.id("total_amount_cash_0")).clear();
        driver.findElement(By.id("total_amount_cash_0")).sendKeys("100");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Create document']/parent::*")).click();
        driver.findElement(By.id("global_search_input")).click();
        driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='daniel'])[1]/following::span[2]")).click();
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Create document']/parent::*")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@value='Issue only']")).click();
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

package ru.stqa.pft.RapidOne.Schedule3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class WaitingListAddNew {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://revitalc.rapid-image.net";
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
        driver.get("https://revitalc.rapid-image.net/schedule/shift-management-wizard");
        Thread.sleep(3000);
        driver.get(" https://revitalc.rapid-image.net/schedule");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[@id='waiting_list_btn']/img")).click();
           Thread.sleep(4000);
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='New waiting list item']/parent::*")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='choose_customer']/div[2]/img")).click();
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Yel");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yelena'])[1]/following::span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("repaet_on_MON")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("10");
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("10");
        driver.findElement(By.xpath("(//input[@type='text'])[8]")).click();
        driver.findElement(By.xpath("//div[@id='appointment_duration']/div/span/i")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Duration'])[1]/following::span[6]")).click();
        driver.findElement(By.id("note")).click();
        driver.findElement(By.id("note")).clear();
        driver.findElement(By.id("note")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='search']")).click();
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Admin']/parent::*")).click();
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Save']/parent::*")).click();
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

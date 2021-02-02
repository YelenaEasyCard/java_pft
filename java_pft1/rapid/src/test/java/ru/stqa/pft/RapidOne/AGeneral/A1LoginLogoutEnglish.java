package ru.stqa.pft.RapidOne.AGeneral;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class A1LoginLogoutEnglish {
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
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.name("loginForm")).click();
        //driver.findElement(By.name("loginForm")).clear();
        driver.findElement(By.name("loginForm")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password']")).click();
       // driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.cssSelector("button.login_btn.btn.ng-binding")).click();
        if(driver.findElement(By.cssSelector("div.container-fluid.ng-scope")).isDisplayed() ) {
        driver.findElement(By.cssSelector("input.btn.btn-default.customBtn.send-confirmation-message-btn")).click();
        }
        else {
         Thread.sleep(4000);
        }
        Thread.sleep(4000);
        //driver.findElement(By.cssSelector("i.glyphicon.glyphicon-user")).click();
        driver.findElement(By.id("simple-dropdown")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Attendance Tracking'])[1]/following::label[2]")).click();
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

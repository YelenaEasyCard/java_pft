package ru.stqa.pft.RapidOne.General;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class AttendaceAddExit {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://roqa.rapid-image.net";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testExit() throws Exception {
        driver.get("https://roqa.rapid-image.net/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin-2");
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.id("login_btn")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.cssSelector("div.title.no-burger.ng-binding"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
       /* Thread.sleep(4000);
        if (driver.findElement(By.cssSelector("div.modal-content")).isDisplayed()) {
            driver.findElement(By.cssSelector("input.btn.btn-default.customBtn.send-confirmation-message-btn")).click();
        }
        else {
            assertEquals(driver.findElement(By.cssSelector("div.title.no-burger.ng-binding")).getText(), "Customers");
        }
        Thread.sleep(5000);
       driver.findElement(By.cssSelector("i.glyphicon.glyphicon-user")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Attendance Tracking'])[1]/following::label[2]")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
       Thread.sleep(5000);
        //driver.findElement(By.id("simple-dropdown")).click();
        driver.findElement(By.xpath("//div[@id='main_header']/div/ul/li[3]/div/div/ul/li[6]/a/label[2]")).click();
     */
        driver.get("https://roqa.rapid-image.net/attendance-tracking");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a.text-center > img")).click();
        driver.findElement(By.xpath("//label[2]/input")).click();
        driver.findElement(By.id("notes")).click();
        driver.findElement(By.id("notes")).click();
        driver.findElement(By.id("notes")).click();
        driver.findElement(By.id("notes")).clear();
        driver.findElement(By.id("notes")).sendKeys("Test");
        driver.findElement(By.cssSelector("button.btn.btn-info.ng-binding")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.cssSelector("div.display-flex.margin-top-10")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
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

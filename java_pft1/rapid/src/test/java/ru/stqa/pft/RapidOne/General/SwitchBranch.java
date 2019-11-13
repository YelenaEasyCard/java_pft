package ru.stqa.pft.RapidOne.General;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class SwitchBranch {
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
    public void testSwitchBranch() throws Exception {
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
        driver.get("https://roqa.rapid-image.net/dashboard");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-user")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Attendance Tracking'])[1]/following::label[2]")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        Thread.sleep(5000);
       driver.findElement(By.xpath("//div[@id='main_header']/div/ul/li[3]/div/div/ul/li[5]/a/label[2]")).click();
        Thread.sleep(3000);
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select branch'])[1]/following::select[1]"))).selectByVisibleText("2nd Branch");
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select department'])[1]/following::select[1]"))).selectByValue("number:3");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.btn.btn-default.customBtn")).click();
       /* try {
            assertEquals(driver.findElement(By.cssSelector("span.navbar-brand.ng-binding")).getText(), "2nd Branch");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
       */
       Thread.sleep(5000);
         driver.findElement(By.cssSelector("i.glyphicon.glyphicon-user")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Attendance Tracking'])[1]/following::label[2]")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='main_header']/div/ul/li[3]/div/div/ul/li[5]/a/label[2]")).click();
        Thread.sleep(3000);
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select branch'])[1]/following::select[1]"))).selectByVisibleText("QA 2.3");
        new Select(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select department'])[1]/following::select[1]"))).selectByValue("number:1");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input.btn.btn-default.customBtn")).click();
        Thread.sleep(3000);
         driver.get("https://roqa.rapid-image.net/dashboard");
        /*try {
            assertEquals(driver.findElement(By.cssSelector("span.navbar-brand.ng-binding")).getText(), "QA 2.3");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        Thread.sleep(3000);
        */
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

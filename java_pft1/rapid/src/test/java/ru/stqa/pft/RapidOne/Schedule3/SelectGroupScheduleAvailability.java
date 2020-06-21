package ru.stqa.pft.RapidOne.Schedule3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class SelectGroupScheduleAvailability {
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
    public void testMarkAppoinmentDelete() throws Exception {
        driver.get("https://roqa.rapid-image.net/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin-2");
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.cssSelector("button.login_btn.btn.ng-binding")).click();
        Thread.sleep(4000);
        driver.get("https://roqa.rapid-image.net/schedule/shift-management-wizard");
        Thread.sleep(3000);
        driver.get(" https://roqa.rapid-image.net/schedule");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[@id='availability_search_btn']/img")).click();
        driver.findElement(By.id("start_date")).click();
        driver.findElement(By.id("start_date")).clear();
        driver.findElement(By.id("start_date")).sendKeys("01/12/2019");
        driver.findElement(By.id("end_date")).click();
        driver.findElement(By.id("end_date")).clear();
        driver.findElement(By.id("end_date")).sendKeys("31/12/2019");
        driver.findElement(By.cssSelector("label.tgl-btn")).click();
        driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
        // driver.findElement(By.xpath("//*/text()[normalize-space(.)='בדיקהה']/parent::*")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='daniel'])[2]/preceding::span[2]")).click();
        //driver.findElement(By.cssSelector("button.btn.btn-info.ng-binding")).click();
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

package ru.stqa.pft.RapidOne.Schedule;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class NewAppointmentNewPatient {
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
    public void testLoginLogout() throws Exception {
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
        Thread.sleep(4000);
        driver.get("https://roqa.rapid-image.net/schedule/shift-management-wizard");
        Thread.sleep(3000);
        driver.get(" https://roqa.rapid-image.net/schedule");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//div[@id='scheduler']/table/tbody/tr[2]/td[2]/div/table/tbody/tr[12]/td[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("appointment_date")).click();
       driver.findElement(By.id("appointment_date")).clear();
        driver.findElement(By.id("appointment_date")).sendKeys("Tue, Nov 05, 2019");
        Thread.sleep(3000);
        // new Select(driver.findElement(By.id("appt_doctor"))).selectByVisibleText("daniel");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::input[1]")).sendKeys("09");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=':'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=':'])[1]/following::input[1]")).sendKeys("00");
        driver.findElement(By.cssSelector("button.btn.btn-info.ng-binding")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[1]")).sendKeys("Korsakova");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[2]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[2]")).sendKeys("Yelena");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[3]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[3]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[3]")).sendKeys("korsakovyelena@gmail.com");
        Thread.sleep(3000);
        new Select(driver.findElement(By.id("typeId"))).selectByVisibleText("Passport");
        driver.findElement(By.id("passport")).click();
        driver.findElement(By.id("passport")).clear();
        driver.findElement(By.id("passport")).sendKeys("");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[4]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[4]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer'])[1]/following::input[4]")).sendKeys("0585466900");
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).getText(), "Submit");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
       // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Submit'])")).click();
        Thread.sleep(8000);
        // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='No']")).click();
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

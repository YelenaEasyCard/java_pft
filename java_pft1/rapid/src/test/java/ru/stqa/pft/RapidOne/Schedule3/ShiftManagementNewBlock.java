package ru.stqa.pft.RapidOne.Schedule3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ShiftManagementNewBlock {
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
    public void testShiftManagementNewBlock() throws Exception {
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
        Thread.sleep(6000);
        driver.findElement(By.xpath("//a[contains(text(),'Blocks')]")).click();
        driver.findElement(By.xpath("//div[@id='doctor']/div/span/i")).click();
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Admin']/parent::*")).click();
        driver.findElement(By.id("shift_date_from")).click();
        driver.findElement(By.id("shift_date_from")).clear();
        driver.findElement(By.id("shift_date_from")).sendKeys("01/12/19");
        driver.findElement(By.id("shift_dat_until")).click();
        driver.findElement(By.id("shift_dat_until")).clear();
        driver.findElement(By.id("shift_dat_until")).sendKeys("31/12/19");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='New block']/parent::*")).click();
        driver.findElement(By.id("start_date")).click();
        driver.findElement(By.id("start_date")).clear();
        driver.findElement(By.id("start_date")).sendKeys("10/12/19");
        driver.findElement(By.id("end_date")).click();
        driver.findElement(By.id("end_date")).clear();
        driver.findElement(By.id("end_date")).sendKeys("10/12/19");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("10");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("00");
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("16");
        driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
        driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("00");
        try {
            assertEquals(driver.findElement(By.xpath("//*/text()[normalize-space(.)='Save']/parent::*")).getText(), "Save");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("description")).click();
        driver.findElement(By.id("description")).clear();
        driver.findElement(By.id("description")).sendKeys("test");
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

package ru.stqa.pft.RapidOne.AGeneral;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class A6PreviousPatients {
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
    public void testPreviosPatient() throws Exception {
        driver.get("https://revitalc.rapid-image.net/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.cssSelector("button.login_btn.btn.ng-binding")).click();
        Thread.sleep(4000);
       /* Pop in
        if(driver.findElement(By.cssSelector("div.container-fluid.ng-scope")).isDisplayed() ) {
            driver.findElement(By.cssSelector("input.btn.btn-default.customBtn.send-confirmation-message-btn")).click();
        }
        else {
            Thread.sleep(4000);
        }
        */
        driver.get("https://revitalc.rapid-image.net/dashboard");
        Thread.sleep(4000);
        driver.findElement(By.id("history-dropdown")).click();
        driver.findElement(By.linkText("Vlad SoapUI")).click();
        Thread.sleep(4000);
        try {
            assertEquals(driver.findElement(By.cssSelector("div.patientName.flex-1-0-0.overflow-ellipsis-name > span.ng-binding.ng-scope")).getText(), "Vlad SoapUI");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
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

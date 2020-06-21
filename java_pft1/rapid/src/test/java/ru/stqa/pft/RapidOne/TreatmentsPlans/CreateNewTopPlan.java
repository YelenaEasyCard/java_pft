package ru.stqa.pft.RapidOne.TreatmentsPlans;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class CreateNewTopPlan {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://roqa.rapid-image.net";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testNewPlan() throws Exception {
        driver.get("https://roqa.rapid-image.net/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin-2");
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.cssSelector("button.login_btn.btn.ng-binding")).click();
        Thread.sleep(4000);
        driver.get("https://roqa.rapid-image.net/patients/R1C100048");
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("#pluse-dropdown")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Treatments']/parent::*")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//input[@type='search'])[4]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Admin']/parent::*")).click();
        driver.findElement(By.cssSelector("input.k-input")).click();
        driver.findElement(By.cssSelector("input.k-input")).clear();
        driver.findElement(By.cssSelector("input.k-input")).sendKeys("15/12/2019");
        try {
            assertEquals("Save", driver.findElement(By.xpath("//*/text()[normalize-space(.)='Save']/parent::*")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
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

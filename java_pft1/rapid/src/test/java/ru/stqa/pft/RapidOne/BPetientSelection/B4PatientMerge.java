package ru.stqa.pft.RapidOne.BPetientSelection;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class B4PatientMerge {
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
    public void testPatientMerge() throws Exception {
        driver.get("https://revitalc.rapid-image.net/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.cssSelector("button.login_btn.btn.ng-binding")).click();
        Thread.sleep(6000);
        Thread.sleep(4000);
        driver.get("https://revitalc.rapid-image.net/dashboard");
        driver.get("https://revitalc.rapid-image.net/patients/list");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//div[@id='content_wrapper']/div/patients/div/patients-list/patients-list-desktop/div/div/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Yelena");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='navigation_table_list']/thead/tr/th[7]")));
        try {
            assertEquals(driver.findElement(By.xpath("//table[@id='navigation_table_list']/thead/tr/th[7]")).getText(), "Branch / Department");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr/td[5]/span")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("img")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Vlad");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='navigation_table_list']/tbody/tr[2]/td[5]/span")));
        driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr[2]/td[5]/span")).click();
        Thread.sleep(10000);
        WebDriverWait waits = new WebDriverWait(driver,30);
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[2]")));
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
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

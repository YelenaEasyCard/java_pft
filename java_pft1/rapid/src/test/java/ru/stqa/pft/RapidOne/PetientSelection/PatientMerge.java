package ru.stqa.pft.RapidOne.PetientSelection;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class PatientMerge {
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
    public void testPatientMerge() throws Exception {
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
        driver.get("https://roqa.rapid-image.net/patients/list");
       // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customers'])[1]/preceding::div[1]")).click();
        try {
            assertEquals(driver.findElement(By.xpath("//div[@id='content_wrapper']/div/patients/div/patients-list/patients-list-desktop/div/div/button[2]")).getText(), "Merge Records");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='content_wrapper']/div/patients/div/patients-list/patients-list-desktop/div/div/button[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Source Records'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Yel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr[3]")).click();
       Thread.sleep(4000);
       // driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr[3]/td[5]/span"));        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Target Record'])[1]/following::img[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Yel");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Phone #'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr[4]")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yel'])[2]/following::td[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Source Records'])[1]/following::button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Yel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr[3]")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yel1'])[2]/following::td[2]")).click();
        Thread.sleep(4000);
        try {
            assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Target Record'])[1]/following::button[1]")).getText(), "Discard changes");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Target Record'])[1]/following::button[1]")).click();
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

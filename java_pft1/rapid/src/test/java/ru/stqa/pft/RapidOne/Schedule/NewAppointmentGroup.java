package ru.stqa.pft.RapidOne.Schedule;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class NewAppointmentGroup {
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
    public void testNewGroup() throws Exception {
        driver.get("https://roqa.rapid-image.net/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin-2");
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.cssSelector("button.login_btn.btn.ng-binding")).click();
        Thread.sleep(4000);
        driver.get(" https://roqa.rapid-image.net/patients/list");
        Thread.sleep(4000);
        driver.get("https://roqa.rapid-image.net/schedule/shift-management-wizard");
        Thread.sleep(3000);
        driver.get(" https://roqa.rapid-image.net/schedule");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='scheduler']/table/tbody/tr[2]/td[2]/div/table/tbody/tr[31]/td[2]")).click();
        Thread.sleep(3000);
        try {
            assertEquals(driver.findElement(By.xpath("//a[contains(@href, '#')]")).getText(), "Make a group Appt");
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.xpath("//a[contains(@href, '#')]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("appointment_title")).click();
        driver.findElement(By.id("appointment_title")).clear();
        driver.findElement(By.id("appointment_title")).sendKeys("Group appointment");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add customer'])[1]/following::img[1]")).click();
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Yelena");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Phone #'])[1]/following::button[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr[4]/td[5]/span")).click();
        Thread.sleep(4000);
        // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Yelena'])[2]/following::td[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add customer'])[1]/following::img[1]")).click();
        driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).clear();
        driver.findElement(By.id("first_name")).sendKeys("Yelenak");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Phone #'])[1]/following::button[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Time'])[1]/following::input[1]")).sendKeys("13");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=':'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=':'])[1]/following::input[1]")).sendKeys("30");
        driver.findElement(By.id("appointment_date")).click();
        driver.findElement(By.id("appointment_date")).clear();
        driver.findElement(By.id("appointment_date")).sendKeys("Thu, Jan 02, 2020");
        driver.findElement(By.id("appointment_title")).click();
        driver.findElement(By.id("appointment_title")).clear();
        driver.findElement(By.id("appointment_title")).sendKeys("Group appoinment");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Discard changes'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("//input[@value='Send SMS and Email']")).click();
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

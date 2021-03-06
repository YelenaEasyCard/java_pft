package ru.stqa.pft.RapidOne.TreatmentsPlans;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class AddItem {
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
    public void testAddItem() throws Exception {
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
        /*
        driver.findElement(By.xpath("//
        //text()[normalize-space(.)='PLANS']/parent::*")).click();
         Thread.sleep(4000);
        Actions action = new Actions(driver);
        WebElement element =  driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr/td[5]"));
        action.doubleClick(element).perform();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//
        //text()[normalize-space(.)='Add Item']/parent::*")).click();
         Thread.sleep(4000);
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("#unit_price"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        driver.findElement(By.cssSelector("#unit_price")).click();
        driver.findElement(By.cssSelector("#unit_price")).clear();
        driver.findElement(By.cssSelector("#unit_price")).sendKeys("15");
        driver.findElement(By.xpath("//div[@id='wrapper']/div/plan-table-view/div/div[2]/div[2]/div/div/div/plan-item-editor/ng-form/div/div[3]/div/div/div/span/i")).click();
        driver.findElement(By.id("ui-select-choices-row-2-0")).click();
        driver.findElement(By.xpath("//
        //text()[normalize-space(.)='Submit']/parent::*")).click();
         */
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

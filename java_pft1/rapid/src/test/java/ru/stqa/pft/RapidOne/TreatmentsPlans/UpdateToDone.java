package ru.stqa.pft.RapidOne.TreatmentsPlans;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class


UpdateToDone {
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
    public void testUpdateToDone() throws Exception {
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
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='PLANS']/parent::*")).click();
        Thread.sleep(4000);
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//table[@id='navigation_table_list']/tbody/tr/td[5]"));
        action.doubleClick(element).perform();
        Thread.sleep(4000);
        Actions act = new Actions(driver);
        WebElement elementk = driver.findElement(By.xpath("//div[@id='table_container']/treatment-table-detailed/div[2]/div/table/tbody/tr[7]/td[5]"));
        act.doubleClick(elementk).perform();
        Thread.sleep(4000);
        //driver.findElement(By.cssSelector("span.custom-checkbox")).click();
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Active']/parent::*")).click();
        Thread.sleep(8000);
        //driver.findElement(By.cssSelector("span.custom-checkbox")).click();
        //driver.findElement(By.xpath("//*/text()[normalize-space(.)='Active']/parent::*")).click();
         /*
        WebElement elementc = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₪15.00'])[5]/following::select[2]"));
        if (elementc.isDisplayed() && element.isEnabled()) {
            elementc.click();
        }
        WebElement elementm = driver.findElement(By.cssSelector("select.form-control"));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", elementm);
       */
        new Select(driver.findElement(By.xpath("//treatment-details/div/div/div/select"))).selectByVisibleText("Done");
        driver.findElement(By.xpath("//*/text()[normalize-space(.)='Active']/parent::*")).click();
        Thread.sleep(8000);
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

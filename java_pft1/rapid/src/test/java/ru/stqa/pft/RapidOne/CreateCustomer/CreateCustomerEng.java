package ru.stqa.pft.RapidOne.CreateCustomer;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class CreateCustomerEng {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://revitalc.rapid-image.net";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testLoginLogout() throws Exception {
        driver.get("https://revitalc.rapid-image.net/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-empty.ng-invalid.ng-invalid-required")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Admin_123");
        driver.findElement(By.cssSelector("button.login_btn.btn.ng-binding")).click();
        Thread.sleep(4000);
        driver.get(" https://revitalc.rapid-image.net/patients/list");
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("div.menu-icon.patients-icon")).click();
        Thread.sleep(3000);
        assertEquals(driver.findElement(By.cssSelector("div.title.no-burger.ng-binding")).getText(), "Customers");
        driver.findElement(By.cssSelector("button.btn.btn-primary.ng-binding.ng-scope")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("firstName")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("Yelenak");
        driver.findElement(By.id("lastName")).click();
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Korsakov");
        driver.findElement(By.id("title")).click();
        new Select(driver.findElement(By.id("title"))).selectByVisibleText("Mrs");
        driver.findElement(By.id("foreignFirstName")).click();
        driver.findElement(By.id("foreignFirstName")).clear();
        driver.findElement(By.id("foreignFirstName")).sendKeys("Test");
        driver.findElement(By.id("foreignLastName")).click();
        driver.findElement(By.id("foreignLastName")).clear();
        driver.findElement(By.id("foreignLastName")).sendKeys("Test1");
        driver.findElement(By.id("birthDate")).click();
        driver.findElement(By.id("birthDate")).clear();
        driver.findElement(By.id("birthDate")).sendKeys("12/05/1976");
        new Select(driver.findElement(By.id("typeId"))).selectByVisibleText("Nat.ID");
        driver.findElement(By.id("nationalIDNumber")).click();
        driver.findElement(By.id("nationalIDNumber")).clear();
        driver.findElement(By.id("nationalIDNumber")).sendKeys("328359336");
        new Select(driver.findElement(By.id("genderId"))).selectByVisibleText("Female");
        driver.findElement(By.id("phone_type_0")).click();
        new Select(driver.findElement(By.id("phone_type_0"))).selectByVisibleText("Cell");
        driver.findElement(By.id("phone_number_0")).click();
        driver.findElement(By.id("phone_number_0")).clear();
        driver.findElement(By.id("phone_number_0")).sendKeys("0585456911");
        driver.findElement(By.id("phone_note_0")).click();
        driver.findElement(By.id("phone_note_0")).clear();
        driver.findElement(By.id("phone_note_0")).sendKeys("notes");
        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-plus")).click();
        driver.findElement(By.cssSelector("div.tab-content")).click();
        //driver.findElement(By.cssSelector("div.ps-scrollbar-y")).click();
        //WebElement baseElement = driver.findElement(By.cssSelector("div.form-column.scroll-wrapper.perfect-scrollbar-wrap.ps-container.ps-theme-default.ps-active-y > div.ps-scrollbar-y-rail"));
        //Actions clicker = new Actions(driver);
        // clicker.moveToElement(baseElement).moveByOffset(0, 100).click().perform();
        driver.findElement(By.id("phone_number_1")).click();
        driver.findElement(By.id("phone_number_1")).clear();
        driver.findElement(By.id("phone_number_1")).sendKeys("0585456910");
        driver.findElement(By.id("phone_note_1")).click();
        driver.findElement(By.id("phone_note_1")).clear();
        driver.findElement(By.id("phone_note_1")).sendKeys("notes 1");
        //driver.findElement(By.cssSelector("div.form-column.scroll-wrapper.perfect-scrollbar-wrap.ps-container.ps-theme-default.ps-active-y > div.ps-scrollbar-y-rail")).click();
        //((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-plus")).click();
        new Select(driver.findElement(By.id("phone_type_2"))).selectByVisibleText("Home");
        driver.findElement(By.id("phone_number_2")).click();
        driver.findElement(By.id("phone_number_2")).clear();
        driver.findElement(By.id("phone_number_2")).sendKeys("0585456909");
        driver.findElement(By.id("phone_note_2")).click();
        driver.findElement(By.id("phone_note_2")).clear();
        driver.findElement(By.id("phone_note_2")).sendKeys("notes 2");
        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-plus")).click();
        new Select(driver.findElement(By.id("phone_type_3"))).selectByVisibleText("Work");
        driver.findElement(By.id("phone_number_3")).click();
        driver.findElement(By.id("phone_number_3")).clear();
        driver.findElement(By.id("phone_number_3")).sendKeys("0585456908");
        driver.findElement(By.id("phone_note_3")).click();
        driver.findElement(By.id("phone_note_3")).clear();
        driver.findElement(By.id("phone_note_3")).sendKeys("notes 3");
        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-plus")).click();
        //clicker.moveToElement(baseElement).moveByOffset(0, 100).click().perform();
        new Select(driver.findElement(By.id("phone_type_4"))).selectByVisibleText("Emergency");
        driver.findElement(By.id("phone_number_4")).click();
        driver.findElement(By.id("phone_number_4")).clear();
        driver.findElement(By.id("phone_number_4")).sendKeys("0585456908");
        driver.findElement(By.id("phone_note_4")).click();
        driver.findElement(By.id("phone_note_4")).clear();
        driver.findElement(By.id("phone_note_4")).sendKeys("notes 4");
        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-plus")).click();
        //clicker.moveToElement(baseElement).moveByOffset(0, 100).click().perform();
        new Select(driver.findElement(By.id("phone_type_5"))).selectByVisibleText("Father Cell");
        driver.findElement(By.id("phone_number_5")).click();
        driver.findElement(By.id("phone_number_5")).clear();
        driver.findElement(By.id("phone_number_5")).sendKeys("0585456908");
        driver.findElement(By.id("phone_note_5")).click();
        driver.findElement(By.id("phone_note_5")).clear();
        driver.findElement(By.id("phone_note_5")).sendKeys("notes 5");
        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-plus")).click();
        //clicker.moveToElement(baseElement).moveByOffset(0, 150).click().perform();
        new Select(driver.findElement(By.id("phone_type_6"))).selectByVisibleText("Mother Cell");
        driver.findElement(By.id("phone_number_6")).click();
        driver.findElement(By.id("phone_number_6")).clear();
        driver.findElement(By.id("phone_number_6")).sendKeys("0585456908");
        driver.findElement(By.id("phone_note_6")).click();
        driver.findElement(By.id("phone_note_6")).clear();
        driver.findElement(By.id("phone_note_6")).sendKeys("notes 6");
        // clicker.moveToElement(baseElement).moveByOffset(0, -100).click().perform();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("i.glyphicon.glyphicon-plus")).click();
        Thread.sleep(4000);
        //clicker.moveToElement(baseElement).moveByOffset(0, 200).click().perform();
        //driver.findElement(By.id("tab-content")).click();
        //clicker.moveToElement(baseElement).moveByOffset(0, 200).click().perform();
        //clicker.moveToElement(baseElement).moveByOffset(0, 50).click().perform();
        new Select(driver.findElement(By.id("phone_type_7"))).selectByVisibleText("Fax");
        driver.findElement(By.id("phone_number_7")).click();
        driver.findElement(By.id("phone_number_7")).clear();
        driver.findElement(By.id("phone_number_7")).sendKeys("0585456908");
        driver.findElement(By.id("phone_note_7")).click();
        driver.findElement(By.id("phone_note_7")).clear();
        driver.findElement(By.id("phone_note_7")).sendKeys("notes 7");
        //clicker.moveToElement(baseElement).moveByOffset(0, 50).click().perform();
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

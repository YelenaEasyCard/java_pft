
/*
LoginEmployerLogout
LoginManagerLogout
DoDealCredit
DoDealRefund
DoDealWithDollar
DoDealWithInvoice
DoDealWithPayment
DoDealCardReader
DoDealRefundCardReader
DoDealWithDollarCardReader
DoDealWithInvoiceCardReader
DoDealWithPaymentCardReader
DoDealCreditPhone
DoDealRefundPhone
DoDealWithDollarPhone
CreateCreditCardBillingClient
BillingSysCard
CreateOratKevaBillingClient
BillingSysBank
CreateInvoiceOnlyBillingClient
BillingSysInvoice
PaymentRequestEnglishDollar
PaymentRequestEnglishShekels
 PaymentRequestHebrewDollar
 PaymentRequestHebrewShekels
  PaymentRequestsTables
  RemovePaymentRequests
 UpdatePaymentRequests
 ReportPassedDealDailyWeeklyMonthly
 ReportPassedDealReportByCompanyCard1
 ReportFailedDealDailyWeeklyMonthlyReport
 DoDealReserveWithShekel (J5)
 ReliaseDoDeal (J5)
 CreateURLRedirectHEBShekel

 */
package ru.stqa.pft.CheckList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

public class Client11024 {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://stage.e-c.co.il";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCheckList() throws Exception {
        driver.get("https://stage.e-c.co.il/Accounts/Login");
     driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("EmplyeUser")).click();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("11024");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test12345");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a.ExitIcon.Icons")).click();
        driver.get("https://stage.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MangerUser")).click();
        driver.manage().window().maximize();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("11024");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        new Select(driver.findElement(By.id("Month2"))).selectByValue("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("130");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("6");
        new Select(driver.findElement(By.name("CreditPaymentsNum"))).selectByVisibleText("4");
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.xpath("//div/input[2]")).click();
        driver.findElement(By.xpath("//div/input[1]")).click();
        driver.findElement(By.xpath("//div/input[2]")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        new Select(driver.findElement(By.id("Month2"))).selectByValue("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("15");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("1");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("3");
        new Select(driver.findElement(By.id("MType"))).selectByValue("2");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("11");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        Thread.sleep(4000);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("1");
        driver.findElement(By.cssSelector("span.checkmark")).click();
        driver.findElement(By.id("InvoiceName")).click();
        driver.findElement(By.id("InvoiceName")).clear();
        driver.findElement(By.id("InvoiceName")).sendKeys("CreditCardOwnerName");
        driver.findElement(By.id("InvoiceAddress")).click();
        driver.findElement(By.id("InvoiceAddress")).clear();
        driver.findElement(By.id("InvoiceAddress")).sendKeys("CreditCardOwnerAddress");
        driver.findElement(By.id("InvioicePhoneNumber")).click();
        driver.findElement(By.id("InvioicePhoneNumber")).clear();
        driver.findElement(By.id("InvioicePhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("InvoiceTaxId")).click();
        driver.findElement(By.id("InvoiceTaxId")).clear();
        driver.findElement(By.id("InvoiceTaxId")).sendKeys("348658899");
        driver.findElement(By.id("InvoiceEMail")).click();
        driver.findElement(By.id("InvoiceEMail")).clear();
        driver.findElement(By.id("InvoiceEMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("InvoiceProduct")).click();
        driver.findElement(By.id("InvoiceProduct")).clear();
        driver.findElement(By.id("InvoiceProduct")).sendKeys("product type");
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("22");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("8");
        new Select(driver.findElement(By.id("PaymentsNum"))).selectByVisibleText("3");
        driver.findElement(By.id("FirstPay")).click();
        driver.findElement(By.id("FirstPay")).clear();
        driver.findElement(By.id("FirstPay")).sendKeys("2");
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("375510190000062=220320119032059212200");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("100");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("424");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("6");
        new Select(driver.findElement(By.name("CreditPaymentsNum"))).selectByVisibleText("4");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.xpath("//div/input[2]")).click();
        driver.findElement(By.xpath("//div/input[1]")).click();
        driver.findElement(By.xpath("//div/input[2]")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("375510190000062=220320119032059212200");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("11");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("424");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("1");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580031900109146=22032011022021711001");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("3");
        new Select(driver.findElement(By.id("MType"))).selectByValue("2");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580031900109146=22032011022021711001");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("11");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("1");
        driver.findElement(By.cssSelector("span.checkmark")).click();
        driver.findElement(By.id("InvoiceName")).click();
        driver.findElement(By.id("InvoiceName")).clear();
        driver.findElement(By.id("InvoiceName")).sendKeys("CreditCardOwnerName");
        driver.findElement(By.id("InvoiceAddress")).click();
        driver.findElement(By.id("InvoiceAddress")).clear();
        driver.findElement(By.id("InvoiceAddress")).sendKeys("CreditCardOwnerAddress");
        driver.findElement(By.id("InvioicePhoneNumber")).click();
        driver.findElement(By.id("InvioicePhoneNumber")).clear();
        driver.findElement(By.id("InvioicePhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("InvoiceTaxId")).click();
        driver.findElement(By.id("InvoiceTaxId")).clear();
        driver.findElement(By.id("InvoiceTaxId")).sendKeys("348658899");
        driver.findElement(By.id("InvoiceEMail")).click();
        driver.findElement(By.id("InvoiceEMail")).clear();
        driver.findElement(By.id("InvoiceEMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("InvoiceProduct")).click();
        driver.findElement(By.id("InvoiceProduct")).clear();
        driver.findElement(By.id("InvoiceProduct")).sendKeys("product type");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580031900109146=22032011022021711001");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("22");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("8");
        new Select(driver.findElement(By.id("PaymentsNum"))).selectByVisibleText("3");
        driver.findElement(By.id("FirstPay")).click();
        driver.findElement(By.id("FirstPay")).clear();
        driver.findElement(By.id("FirstPay")).sendKeys("2");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("50");
        new Select(driver.findElement(By.id("Month2"))).selectByValue("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("150");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("6");
        new Select(driver.findElement(By.name("CreditPaymentsNum"))).selectByVisibleText("4");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.xpath("//div/input[2]")).click();
        driver.findElement(By.xpath("//div/input[1]")).click();
        driver.findElement(By.xpath("//div/input[2]")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("50");
        new Select(driver.findElement(By.id("Month2"))).selectByValue("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("15");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("1");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("50");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("30");
        new Select(driver.findElement(By.id("MType"))).selectByValue("2");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("TZ")).click();
        driver.findElement(By.id("TZ")).clear();
        driver.findElement(By.id("TZ")).sendKeys("348658899");
        driver.findElement(By.id("CVV2")).click();
        driver.findElement(By.id("CVV2")).clear();
        driver.findElement(By.id("CVV2")).sendKeys("458");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("btnMail")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("BillingSystem")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("create-user")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            assertTrue(isElementPresent(By.id("accordionClientDetails1")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.id("accordionClientDetails1"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement  elemX = driver.findElement(By.id("accordionClientDetails1"));
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@id='divCreateEditCustomer']/div/form/div[2]/button")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.id("EditedCustomer_LastName")).click();
        driver.findElement(By.id("EditedCustomer_LastName")).clear();
        driver.findElement(By.id("EditedCustomer_LastName")).sendKeys("Neon");
        driver.findElement(By.id("EditedCustomer_Name")).click();
        driver.findElement(By.id("EditedCustomer_Name")).clear();
        driver.findElement(By.id("EditedCustomer_Name")).sendKeys("Yelena");
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).click();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).clear();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).sendKeys("348658899");
        driver.findElement(By.id("EditedCustomer_FileNum")).click();
        driver.findElement(By.id("EditedCustomer_FileNum")).clear();
        driver.findElement(By.id("EditedCustomer_FileNum")).sendKeys("123456");
        driver.findElement(By.id("EditedCustomer_Address")).click();
        driver.findElement(By.id("EditedCustomer_Address")).clear();
        driver.findElement(By.id("EditedCustomer_Address")).sendKeys("Ha-Melakha St 14");
        driver.findElement(By.id("EditedCustomer_City")).click();
        driver.findElement(By.id("EditedCustomer_City")).clear();
        driver.findElement(By.id("EditedCustomer_City")).sendKeys("Netanya");
        driver.findElement(By.id("EditedCustomer_postalCode")).click();
        driver.findElement(By.id("EditedCustomer_postalCode")).clear();
        driver.findElement(By.id("EditedCustomer_postalCode")).sendKeys("4250545");
        //  driver.findElement(By.id("EditedCustomer_Phone")).click();
        driver.findElement(By.id("EditedCustomer_Phone")).clear();
        driver.findElement(By.id("EditedCustomer_Phone")).sendKeys("0585456911");
        driver.findElement(By.id("EditedCustomer_Phone2")).click();
        driver.findElement(By.id("EditedCustomer_Phone2")).clear();
        driver.findElement(By.id("EditedCustomer_Phone2")).sendKeys("0585456910");
        driver.findElement(By.id("EditedCustomer_Email")).click();
        driver.findElement(By.id("EditedCustomer_Email")).clear();
        driver.findElement(By.id("EditedCustomer_Email")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("EditedCustomer_Note")).click();
        driver.findElement(By.id("EditedCustomer_Note")).clear();
        driver.findElement(By.id("EditedCustomer_Note")).sendKeys("notes");
        driver.findElement(By.id("EditedCustomer_CardNumber")).click();
        driver.findElement(By.id("EditedCustomer_CardNumber")).clear();
        driver.findElement(By.id("EditedCustomer_CardNumber")).sendKeys("375510190000062");
        driver.findElement(By.id("EditedCustomer_ValMonth")).click();
        new Select(driver.findElement(By.id("EditedCustomer_ValMonth"))).selectByVisibleText("03");
        driver.findElement(By.id("EditedCustomer_ValMonth")).click();
        driver.findElement(By.id("EditedCustomer_ValYear")).click();
        new Select(driver.findElement(By.id("EditedCustomer_ValYear"))).selectByVisibleText("2022");
        driver.findElement(By.id("EditedCustomer_ValYear")).click();
        driver.findElement(By.id("accordionClientDetails3")).click();
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).sendKeys("02/10/2019");
        driver.findElement(By.id("EditedCustomer_LastPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_LastPayDate")).sendKeys("26/12/2020");
        driver.findElement(By.id("trTotalSum")).click();
        driver.findElement(By.id("EditedCustomer_Totalsum")).clear();
        driver.findElement(By.id("EditedCustomer_Totalsum")).sendKeys("5");
       // new Select(driver.findElement(By.id("EditedCustomerPayDay"))).selectByValue("02");
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        Thread.sleep(5000);
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("ReportsSearchStartDate"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("tblBSCustomers")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("numRecords")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(6000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("BillingSysCard")).click();
        Thread.sleep(3000);
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("check-all")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        driver.findElement(By.id("check-all")).click();
        driver.findElement(By.xpath("//td/input[2]")).click();
        driver.findElement(By.id("ChargeAll")).click();
        driver.findElement(By.id("liSucssesDeals")).click();
        driver.findElement(By.cssSelector("button.printExportButtons.Btn3"));
        driver.findElement(By.id("ShowUser")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.name("ReportsSearchStartDate"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        Thread.sleep(4000);
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(4000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("create-user")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            assertTrue(isElementPresent(By.id("accordionClientDetails1")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.id("accordionClientDetails1"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='divCreateEditCustomer']/div/form/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("EditedCustomer_LastName")).click();
        driver.findElement(By.id("EditedCustomer_LastName")).clear();
        driver.findElement(By.id("EditedCustomer_LastName")).sendKeys("Neon");
        driver.findElement(By.id("EditedCustomer_Name")).click();
        driver.findElement(By.id("EditedCustomer_Name")).clear();
        driver.findElement(By.id("EditedCustomer_Name")).sendKeys("Yelena");
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).click();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).clear();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).sendKeys("348658899");
        driver.findElement(By.id("EditedCustomer_FileNum")).click();
        driver.findElement(By.id("EditedCustomer_FileNum")).clear();
        driver.findElement(By.id("EditedCustomer_FileNum")).sendKeys("123456");
        driver.findElement(By.id("EditedCustomer_Address")).click();
        driver.findElement(By.id("EditedCustomer_Address")).clear();
        driver.findElement(By.id("EditedCustomer_Address")).sendKeys("Ha-Melakha St 14");
        driver.findElement(By.id("EditedCustomer_City")).click();
        driver.findElement(By.id("EditedCustomer_City")).clear();
        driver.findElement(By.id("EditedCustomer_City")).sendKeys("Netanya");
        driver.findElement(By.id("EditedCustomer_postalCode")).click();
        driver.findElement(By.id("EditedCustomer_postalCode")).clear();
        driver.findElement(By.id("EditedCustomer_postalCode")).sendKeys("4250545");
        driver.findElement(By.id("EditedCustomer_Phone")).click();
        driver.findElement(By.id("EditedCustomer_Phone")).clear();
        driver.findElement(By.id("EditedCustomer_Phone")).sendKeys("0585456911");
        driver.findElement(By.id("EditedCustomer_Phone2")).click();
        driver.findElement(By.id("EditedCustomer_Phone2")).clear();
        driver.findElement(By.id("EditedCustomer_Phone2")).sendKeys("0585456910");
        driver.findElement(By.id("EditedCustomer_Email")).click();
        driver.findElement(By.id("EditedCustomer_Email")).clear();
        driver.findElement(By.id("EditedCustomer_Email")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("EditedCustomer_Note")).click();
        driver.findElement(By.id("EditedCustomer_Note")).clear();
        driver.findElement(By.id("EditedCustomer_Note")).sendKeys("notes");
        driver.findElement(By.id("EditedCustomerBType")).click();
        driver.findElement(By.id("EditedCustomerBType")).click();
        new Select(driver.findElement(By.id("EditedCustomerBType"))).selectByValue("2");
        driver.findElement(By.id("EditedCustomer_BankName")).click();
        new Select(driver.findElement(By.id("EditedCustomer_BankName"))).selectByValue("10");
        driver.findElement(By.id("EditedCustomer_BankName")).click();
        driver.findElement(By.id("EditedCustomer_BankBranch")).click();
        driver.findElement(By.id("EditedCustomer_BankBranch")).clear();
        driver.findElement(By.id("EditedCustomer_BankBranch")).sendKeys("123");
        driver.findElement(By.id("EditedCustomer_BankAccountNumber")).click();
        driver.findElement(By.id("EditedCustomer_BankAccountNumber")).clear();
        driver.findElement(By.id("EditedCustomer_BankAccountNumber")).sendKeys("123456789");
        driver.findElement(By.id("accordionClientDetails3")).click();
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).sendKeys("26/09/2019");
        driver.findElement(By.id("EditedCustomer_LastPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_LastPayDate")).sendKeys("20/10/2020");
        driver.findElement(By.id("trTotalSum")).click();
        driver.findElement(By.id("EditedCustomer_Totalsum")).clear();
        driver.findElement(By.id("EditedCustomer_Totalsum")).sendKeys("33");
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("ReportsSearchStartDate"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("tblBSCustomers")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("numRecords")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("create-user")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        Thread.sleep(3000);
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@onclick='setClickOption(4);']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("check-all")).click();
        driver.findElement(By.xpath("//td/input[2]")).click();
        driver.findElement(By.id("BillingSysCardMSV")).click();
        driver.findElement(By.id("ShowUser")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("ReportsSearchStartDate"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        Thread.sleep(3000);
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("create-user")).click();
        Thread.sleep(3000);
        try {
            assertTrue(isElementPresent(By.id("accordionClientDetails1")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.id("accordionClientDetails1"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@id='divCreateEditCustomer']/div/form/div[2]/button")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.findElement(By.id("EditedCustomer_LastName")).click();
        driver.findElement(By.id("EditedCustomer_LastName")).clear();
        driver.findElement(By.id("EditedCustomer_LastName")).sendKeys("Neon");
        driver.findElement(By.id("EditedCustomer_Name")).click();
        driver.findElement(By.id("EditedCustomer_Name")).clear();
        driver.findElement(By.id("EditedCustomer_Name")).sendKeys("Yelena");
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).click();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).clear();
        driver.findElement(By.id("EditedCustomer_IdentityNumber")).sendKeys("348658899");
        driver.findElement(By.id("EditedCustomer_FileNum")).click();
        driver.findElement(By.id("EditedCustomer_FileNum")).clear();
        driver.findElement(By.id("EditedCustomer_FileNum")).sendKeys("123456");
        driver.findElement(By.id("EditedCustomer_Address")).click();
        driver.findElement(By.id("EditedCustomer_Address")).clear();
        driver.findElement(By.id("EditedCustomer_Address")).sendKeys("Ha-Melakha St 14");
        driver.findElement(By.id("EditedCustomer_City")).click();
        driver.findElement(By.id("EditedCustomer_City")).clear();
        driver.findElement(By.id("EditedCustomer_City")).sendKeys("Netanya");
        driver.findElement(By.id("EditedCustomer_postalCode")).click();
        driver.findElement(By.id("EditedCustomer_postalCode")).clear();
        driver.findElement(By.id("EditedCustomer_postalCode")).sendKeys("4250545");
        driver.findElement(By.id("EditedCustomer_Phone")).click();
        driver.findElement(By.id("EditedCustomer_Phone")).clear();
        driver.findElement(By.id("EditedCustomer_Phone")).sendKeys("0585456911");
        driver.findElement(By.id("EditedCustomer_Phone2")).click();
        driver.findElement(By.id("EditedCustomer_Phone2")).clear();
        driver.findElement(By.id("EditedCustomer_Phone2")).sendKeys("0585456910");
        driver.findElement(By.id("EditedCustomer_Email")).click();
        driver.findElement(By.id("EditedCustomer_Email")).clear();
        driver.findElement(By.id("EditedCustomer_Email")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("EditedCustomer_Note")).click();
        driver.findElement(By.id("EditedCustomer_Note")).clear();
        driver.findElement(By.id("EditedCustomer_Note")).sendKeys("notes");
        driver.findElement(By.id("EditedCustomerBType")).click();
        driver.findElement(By.id("EditedCustomerBType")).click();
        new Select(driver.findElement(By.id("EditedCustomerBType"))).selectByValue("3");
        driver.findElement(By.id("accordionClientDetails3")).click();
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).sendKeys("26/09/2019");
        driver.findElement(By.id("EditedCustomer_LastPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_LastPayDate")).sendKeys("26/11/2020");
        driver.findElement(By.id("trTotalSum")).click();
        driver.findElement(By.id("EditedCustomer_Totalsum")).clear();
        driver.findElement(By.id("EditedCustomer_Totalsum")).sendKeys("31");
        new Select(driver.findElement(By.id("EditedCustomerPayDay"))).selectByValue("26");
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("ReportsSearchStartDate"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("tblBSCustomers")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("numRecords")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("create-user")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[7]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("check-all")).click();
        driver.findElement(By.xpath("//td/input[2]")).click();
        //driver.findElement(By.id("ChargeAll")).click();
        driver.findElement(By.id("BillingSysCardInvoce")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("ShowUser")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
        }
        Thread.sleep(3000);
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("10");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
        new Select(driver.findElement(By.id("MType"))).selectByValue("2");
        new Select(driver.findElement(By.id("Lang"))).selectByValue("ENG");
        driver.findElement(By.id("spanCheckmarkEMAIL")).click();
        driver.findElement(By.id("EMail")).click();
        driver.findElement(By.id("EMail")).clear();
        driver.findElement(By.id("EMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("spanCheckmarkSMS")).click();
        driver.findElement(By.id("PhoneNumber")).click();
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("TaxId")).click();
        driver.findElement(By.id("TaxId")).clear();
        driver.findElement(By.id("TaxId")).sendKeys("348658899");
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).clear();
        driver.findElement(By.id("Address")).sendKeys("Address");
        driver.findElement(By.id("Product")).click();
        driver.findElement(By.id("Product")).clear();
        driver.findElement(By.id("Product")).sendKeys("Product type");
        driver.findElement(By.id("txtareaNot")).click();
        driver.findElement(By.id("txtareaNot")).clear();
        driver.findElement(By.id("txtareaNot")).sendKeys("Notes");
        driver.findElement(By.id("txtareaAddedText")).click();
        driver.findElement(By.id("txtareaAddedText")).clear();
        driver.findElement(By.id("txtareaAddedText")).sendKeys("Comments");
        driver.findElement(By.id("sendRequestButton")).click();
        driver.findElement(By.cssSelector("input[name=\"radioP\"]")).click();
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("PaymentSerivce")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("10");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        new Select(driver.findElement(By.id("Lang"))).selectByValue("ENG");
        driver.findElement(By.id("spanCheckmarkEMAIL")).click();
        driver.findElement(By.id("EMail")).click();
        driver.findElement(By.id("EMail")).clear();
        driver.findElement(By.id("EMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("spanCheckmarkSMS")).click();
        driver.findElement(By.id("PhoneNumber")).click();
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("TaxId")).click();
        driver.findElement(By.id("TaxId")).clear();
        driver.findElement(By.id("TaxId")).sendKeys("348658899");
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).clear();
        driver.findElement(By.id("Address")).sendKeys("Address");
        driver.findElement(By.id("Product")).click();
        driver.findElement(By.id("Product")).clear();
        driver.findElement(By.id("Product")).sendKeys("Product type");
        driver.findElement(By.id("txtareaNot")).click();
        driver.findElement(By.id("txtareaNot")).clear();
        driver.findElement(By.id("txtareaNot")).sendKeys("Notes");
        driver.findElement(By.id("txtareaAddedText")).click();
        driver.findElement(By.id("txtareaAddedText")).clear();
        driver.findElement(By.id("txtareaAddedText")).sendKeys("Comments");
        driver.findElement(By.id("sendRequestButton")).click();
        driver.findElement(By.cssSelector("input[name=\"radioP\"]")).click();
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("10");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
        new Select(driver.findElement(By.id("MType"))).selectByValue("2");
        new Select(driver.findElement(By.id("Lang"))).selectByValue("HEB");
        driver.findElement(By.id("spanCheckmarkEMAIL")).click();
        driver.findElement(By.id("EMail")).click();
        driver.findElement(By.id("EMail")).clear();
        driver.findElement(By.id("EMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("spanCheckmarkSMS")).click();
        driver.findElement(By.id("PhoneNumber")).click();
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("TaxId")).click();
        driver.findElement(By.id("TaxId")).clear();
        driver.findElement(By.id("TaxId")).sendKeys("348658899");
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).clear();
        driver.findElement(By.id("Address")).sendKeys("Address");
        driver.findElement(By.id("Product")).click();
        driver.findElement(By.id("Product")).clear();
        driver.findElement(By.id("Product")).sendKeys("Product type");
        driver.findElement(By.id("txtareaNot")).click();
        driver.findElement(By.id("txtareaNot")).clear();
        driver.findElement(By.id("txtareaNot")).sendKeys("Notes");
        driver.findElement(By.id("txtareaAddedText")).click();
        driver.findElement(By.id("txtareaAddedText")).clear();
        driver.findElement(By.id("txtareaAddedText")).sendKeys("Comments");
        driver.findElement(By.id("sendRequestButton")).click();
        driver.findElement(By.cssSelector("input[name=\"radioP\"]")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("10");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        new Select(driver.findElement(By.id("Lang"))).selectByValue("HEB");
        driver.findElement(By.id("spanCheckmarkEMAIL")).click();
        driver.findElement(By.id("EMail")).click();
        driver.findElement(By.id("EMail")).clear();
        driver.findElement(By.id("EMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("spanCheckmarkSMS")).click();
        driver.findElement(By.id("PhoneNumber")).click();
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("TaxId")).click();
        driver.findElement(By.id("TaxId")).clear();
        driver.findElement(By.id("TaxId")).sendKeys("348658899");
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).clear();
        driver.findElement(By.id("Address")).sendKeys("Address");
        driver.findElement(By.id("Product")).click();
        driver.findElement(By.id("Product")).clear();
        driver.findElement(By.id("Product")).sendKeys("Product type");
        driver.findElement(By.id("txtareaNot")).click();
        driver.findElement(By.id("txtareaNot")).clear();
        driver.findElement(By.id("txtareaNot")).sendKeys("Notes");
        driver.findElement(By.id("txtareaAddedText")).click();
        driver.findElement(By.id("txtareaAddedText")).clear();
        driver.findElement(By.id("txtareaAddedText")).sendKeys("Comments");
        driver.findElement(By.id("sendRequestButton")).click();
        driver.findElement(By.cssSelector("input[name=\"radioP\"]")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("10");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        new Select(driver.findElement(By.id("Lang"))).selectByValue("HEB");
        driver.findElement(By.id("spanCheckmarkEMAIL")).click();
        driver.findElement(By.id("EMail")).click();
        driver.findElement(By.id("EMail")).clear();
        driver.findElement(By.id("EMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("spanCheckmarkSMS")).click();
        driver.findElement(By.id("PhoneNumber")).click();
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("TaxId")).click();
        driver.findElement(By.id("TaxId")).clear();
        driver.findElement(By.id("TaxId")).sendKeys("348658899");
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).clear();
        driver.findElement(By.id("Address")).sendKeys("Address");
        driver.findElement(By.id("Product")).click();
        driver.findElement(By.id("Product")).clear();
        driver.findElement(By.id("Product")).sendKeys("Product type");
        driver.findElement(By.id("txtareaNot")).click();
        driver.findElement(By.id("txtareaNot")).clear();
        driver.findElement(By.id("txtareaNot")).sendKeys("Notes");
        driver.findElement(By.id("txtareaAddedText")).click();
        driver.findElement(By.id("txtareaAddedText")).clear();
        driver.findElement(By.id("txtareaAddedText")).sendKeys("Comments");
        driver.findElement(By.id("sendRequestButton")).click();
        driver.findElement(By.cssSelector("input[name=\"radioP\"]")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuReports")).click();
        driver.findElement(By.id("ECPayDemandRep")).click();
        driver.findElement(By.cssSelector("label.ui_table_header"));
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("10");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        new Select(driver.findElement(By.id("Lang"))).selectByValue("HEB");
        driver.findElement(By.id("spanCheckmarkEMAIL")).click();
        driver.findElement(By.id("EMail")).click();
        driver.findElement(By.id("EMail")).clear();
        driver.findElement(By.id("EMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("spanCheckmarkSMS")).click();
        driver.findElement(By.id("PhoneNumber")).click();
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("TaxId")).click();
        driver.findElement(By.id("TaxId")).clear();
        driver.findElement(By.id("TaxId")).sendKeys("348658899");
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).clear();
        driver.findElement(By.id("Address")).sendKeys("Address");
        driver.findElement(By.id("Product")).click();
        driver.findElement(By.id("Product")).clear();
        driver.findElement(By.id("Product")).sendKeys("Product type");
        driver.findElement(By.id("txtareaNot")).click();
        driver.findElement(By.id("txtareaNot")).clear();
        driver.findElement(By.id("txtareaNot")).sendKeys("Notes");
        driver.findElement(By.id("txtareaAddedText")).click();
        driver.findElement(By.id("txtareaAddedText")).clear();
        driver.findElement(By.id("txtareaAddedText")).sendKeys("Comments");
        driver.findElement(By.id("sendRequestButton")).click();
        driver.findElement(By.cssSelector("input[name=\"radioP\"]")).click();
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuReports")).click();
        driver.findElement(By.id("ECPayDemandRep")).click();
        driver.findElement(By.cssSelector("label.ui_table_header"));
        assertTrue(isElementPresent(By.cssSelector("button.ui_table_row_btn")));
        //driver.findElement(By.cssSelector("button.ui_table_row_btn")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("10");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        new Select(driver.findElement(By.id("Lang"))).selectByValue("HEB");
        driver.findElement(By.id("spanCheckmarkEMAIL")).click();
        driver.findElement(By.id("EMail")).click();
        driver.findElement(By.id("EMail")).clear();
        driver.findElement(By.id("EMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("spanCheckmarkSMS")).click();
        driver.findElement(By.id("PhoneNumber")).click();
        driver.findElement(By.id("PhoneNumber")).clear();
        driver.findElement(By.id("PhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("TaxId")).click();
        driver.findElement(By.id("TaxId")).clear();
        driver.findElement(By.id("TaxId")).sendKeys("348658899");
        driver.findElement(By.id("Address")).click();
        driver.findElement(By.id("Address")).clear();
        driver.findElement(By.id("Address")).sendKeys("Address");
        driver.findElement(By.id("Product")).click();
        driver.findElement(By.id("Product")).clear();
        driver.findElement(By.id("Product")).sendKeys("Product type");
        driver.findElement(By.id("txtareaNot")).click();
        driver.findElement(By.id("txtareaNot")).clear();
        driver.findElement(By.id("txtareaNot")).sendKeys("Notes");
        driver.findElement(By.id("txtareaAddedText")).click();
        driver.findElement(By.id("txtareaAddedText")).clear();
        driver.findElement(By.id("txtareaAddedText")).sendKeys("Comments");
        driver.findElement(By.id("sendRequestButton")).click();
        driver.findElement(By.cssSelector("input[name=\"radioP\"]")).click();
       Thread.sleep(4000);
       driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuReports")).click();
        driver.findElement(By.id("ECPayDemandRep")).click();
        driver.findElement(By.cssSelector("label.ui_table_header"));
       assertTrue(isElementPresent(By.cssSelector("button.ui_table_row_btn")));
       driver.findElement(By.cssSelector("button.ui_table_row_btn")).click();
        driver.findElement(By.cssSelector("input.textox.allownumericwithdecimal")).click();
        driver.findElement(By.cssSelector("input.textox.allownumericwithdecimal")).clear();
        driver.findElement(By.cssSelector("input.textox.allownumericwithdecimal")).sendKeys("20");
     driver.findElement(By.cssSelector("input.textox")).click();
     driver.findElement(By.cssSelector("input.textox")).clear();
     driver.findElement(By.cssSelector("input.textox")).sendKeys("korsakovyelena@gmail.com");
     driver.findElement(By.cssSelector("input.textox.allownumericwithoutdecimal")).click();
     driver.findElement(By.cssSelector("input.textox.allownumericwithoutdecimal")).clear();
     driver.findElement(By.cssSelector("input.textox.allownumericwithoutdecimal")).sendKeys("0585456910");
        Thread.sleep(4000);
     driver.findElement(By.cssSelector("#modalEditPayDemand > div.modal-footer > button.btn.btn-primary")).click();
     Thread.sleep(2000);
       driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuReports")).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"Today\"]")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("FirstPageBtn"));
        driver.findElement(By.name("backReport")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"Yesterday\"]")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("FirstPageBtn"));
        driver.findElement(By.name("backReport")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"Last7Days\"]")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("FirstPageBtn"));
        driver.findElement(By.name("backReport")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"ThisMonth\"]")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("FirstPageBtn"));
        driver.findElement(By.name("backReport")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"LastMonth\"]")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("FirstPageBtn"));
        driver.findElement(By.name("backReport")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"Manual\"]")).click();
        driver.findElement(By.id("fromDateButton")).click();
        driver.findElement(By.linkText("2")).click();
        driver.findElement(By.id("toDateButton")).click();
        driver.findElement(By.linkText("30")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("FirstPageBtn"));
        driver.findElement(By.name("backReport")).click();
        Thread.sleep(4000);
     driver.findElement(By.id("MenuReports")).click();
     driver.findElement(By.cssSelector("[name=ShowRange][value=\"LastMonth\"]")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("-1");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     driver.findElement(By.cssSelector("[name=ShowRange][value=\"LastMonth\"]")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("0");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     driver.findElement(By.cssSelector("[name=ShowRange][value=\"LastMonth\"]")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("1");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     driver.findElement(By.cssSelector("[name=ShowRange][value=\"LastMonth\"]")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("2");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     driver.findElement(By.cssSelector("[name=ShowRange][value=\"LastMonth\"]")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("3");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("4");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     driver.findElement(By.cssSelector("[name=ShowRange][value=\"LastMonth\"]")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("5");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("4");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     driver.findElement(By.cssSelector("[name=ShowRange][value=\"LastMonth\"]")).click();
     new Select(driver.findElement(By.id("Soleket"))).selectByValue("50");
     driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
     driver.findElement(By.id("btnSubmit")).click();
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     driver.findElement(By.id("FirstPageBtn"));
     driver.findElement(By.name("backReport")).click();
     Thread.sleep(4000);
     driver.findElement(By.id("MenuActivties")).click();
     Thread.sleep(4000);
    driver.findElement(By.id("Reservationframe")).click();
     driver.findElement(By.id("CardNumber")).click();
     driver.findElement(By.id("CardNumber")).clear();
     driver.findElement(By.id("CardNumber")).sendKeys("375510190000062");
     new Select(driver.findElement(By.id("Code"))).selectByValue("50");
     new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
     new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2022");
     driver.findElement(By.id("Sum")).click();
     driver.findElement(By.id("Sum")).clear();
     driver.findElement(By.id("Sum")).sendKeys("15");
     new Select(driver.findElement(By.id("MType"))).selectByValue("1");
     driver.findElement(By.id("OwnerName")).click();
     driver.findElement(By.id("OwnerName")).clear();
     driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
     driver.findElement(By.id("Note")).click();
     driver.findElement(By.id("Note")).clear();
     driver.findElement(By.id("Note")).sendKeys("notes");
     driver.findElement(By.id("TZ")).click();
     driver.findElement(By.id("TZ")).clear();
     driver.findElement(By.id("TZ")).sendKeys("348658899");
     driver.findElement(By.id("CVV2")).click();
     driver.findElement(By.id("CVV2")).clear();
     driver.findElement(By.id("CVV2")).sendKeys("424");
     driver.findElement(By.id("j5btnSubmit")).click();
     driver.findElement(By.id("Clicker")).click();
     driver.findElement(By.id("OkNumber")).click();
     driver.findElement(By.id("OkNumber")).clear();
     driver.findElement(By.id("OkNumber")).sendKeys("123456");
     driver.findElement(By.id("j5btnSubmit")).click();
     driver.findElement(By.id("btnMail")).click();
     driver.findElement(By.id("MenuActivties")).click();
     Thread.sleep(4000);
     driver.findElement(By.id("MenuActivties")).click();
     driver.findElement(By.id("ResImplementation")).click();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//table[@id='tfhover']/tbody/tr[2]/td[2]/label/a")).click();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     new Select(driver.findElement(By.id("MType"))).selectByValue("1");
     driver.findElement(By.id("OwnerName")).click();
     driver.findElement(By.id("OwnerName")).clear();
     driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
     driver.findElement(By.id("Note")).click();
     driver.findElement(By.id("Note")).clear();
     driver.findElement(By.id("Note")).sendKeys("notes");
     driver.findElement(By.id("TZ")).click();
     driver.findElement(By.id("TZ")).clear();
     driver.findElement(By.id("TZ")).sendKeys("348658899");
     driver.findElement(By.id("CVV2")).click();
     driver.findElement(By.id("CVV2")).clear();
     driver.findElement(By.id("CVV2")).sendKeys("458");
     driver.findElement(By.cssSelector("span.checkmark")).click();
     driver.findElement(By.id("InvoiceName")).click();
     driver.findElement(By.id("InvoiceName")).clear();
     driver.findElement(By.id("InvoiceName")).sendKeys("CreditCardOwnerName");
     driver.findElement(By.id("InvoiceAddress")).click();
     driver.findElement(By.id("InvoiceAddress")).clear();
     driver.findElement(By.id("InvoiceAddress")).sendKeys("CreditCardOwnerAddress");
     driver.findElement(By.id("InvioicePhoneNumber")).click();
     driver.findElement(By.id("InvioicePhoneNumber")).clear();
     driver.findElement(By.id("InvioicePhoneNumber")).sendKeys("0585456911");
     driver.findElement(By.id("InvoiceTaxId")).click();
     driver.findElement(By.id("InvoiceTaxId")).clear();
     driver.findElement(By.id("InvoiceTaxId")).sendKeys("348658899");
     driver.findElement(By.id("InvoiceEMail")).click();
     driver.findElement(By.id("InvoiceEMail")).clear();
     driver.findElement(By.id("InvoiceEMail")).sendKeys("korsakovyelena@gmail.com");
     driver.findElement(By.id("InvoiceProduct")).click();
     driver.findElement(By.id("InvoiceProduct")).clear();
     driver.findElement(By.id("InvoiceProduct")).sendKeys("product type");
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.findElement(By.id("btnSubmit")).click();
     driver.findElement(By.id("MenuActivties")).click();
     driver.findElement(By.id("MenuActivties")).click();
     Thread.sleep(4000);
     driver.findElement(By.id("MenuSettings")).click();
     driver.findElement(By.id("ExitSubMenu")).click();
     driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
     Thread.sleep(4000);
     driver.findElement(By.id("accordionSettings4")).click();
     driver.findElement(By.id("TotalSum")).click();
     driver.findElement(By.id("TotalSum")).clear();
     driver.findElement(By.id("TotalSum")).sendKeys("10");
     driver.findElement(By.id("RedirectOwnerName")).click();
     driver.findElement(By.id("RedirectOwnerName")).clear();
     driver.findElement(By.id("RedirectOwnerName")).sendKeys("Yelena");
     driver.findElement(By.id("RedirectOwnerTZ")).click();
     driver.findElement(By.id("RedirectOwnerTZ")).clear();
     driver.findElement(By.id("RedirectOwnerTZ")).sendKeys("348658899");
     driver.findElement(By.id("RedirectOwnerAddress")).click();
     driver.findElement(By.id("RedirectOwnerAddress")).clear();
     driver.findElement(By.id("RedirectOwnerAddress")).sendKeys("Address");
     driver.findElement(By.id("RedirectOwnerMail")).click();
     driver.findElement(By.id("RedirectOwnerMail")).clear();
     driver.findElement(By.id("RedirectOwnerMail")).sendKeys("korsakovyelena@gmail.com");
     driver.findElement(By.id("RedirectOwnerCell")).click();
     driver.findElement(By.id("RedirectOwnerCell")).clear();
     driver.findElement(By.id("RedirectOwnerCell")).sendKeys("0585456911");
     driver.findElement(By.id("RedirectECInvoiceSingleProduct")).click();
     driver.findElement(By.id("RedirectECInvoiceSingleProduct")).clear();
     driver.findElement(By.id("RedirectECInvoiceSingleProduct")).sendKeys("prod test");
     driver.findElement(By.id("RedirectNote")).click();
     driver.findElement(By.id("RedirectNote")).clear();
     driver.findElement(By.id("RedirectNote")).sendKeys("notes");
     driver.findElement(By.id("CreateRedirectPaymentUrl")).click();

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

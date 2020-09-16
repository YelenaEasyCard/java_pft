
/*
LoginEmployerLogout
LoginManagerLogout

Deals: 8
Card Reader /Shekel
Phone /Shekel
Signiture / Shekel
Payments / Card Reader
Payments /Phone
Payments /Signiture
Deal with invoice
Payment with ribit

Payment Request:
Hebrew/ Shekels
English

Redirect

Report 1: deals, invoices, iska, payments, billings, one-time charge,
Passed Deals
Failed Deals

Report Invoices:
Invoices / PDF
Kabalot / PDF

Billings:
Create new credit card client
Make credit card billing
Create new orat keva client
Make orat keva billing
Create new only invoice billling client
Sent Invoice
One-Time Charge billing

Generate invoice from report page
 */
package ru.stqa.pft.CheckList;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class Client7899U {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://secure.e-c.co.il";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCheckList() throws Exception {
         //LoginEmployerLogout
        driver.get("https://secure.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("EmplyeUser")).click();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("7899");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1234567");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a.ExitIcon.Icons")).click();
                //LoginManager
        driver.get("https://secure.e-c.co.il/Accounts/Login");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("MangerUser")).click();
        driver.manage().window().maximize();
        driver.findElement(By.id("LoginID")).click();
        driver.findElement(By.id("LoginID")).clear();
        driver.findElement(By.id("LoginID")).sendKeys("7899");
        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("test1212");
        driver.findElement(By.id("btnEnter")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(4000);
              //DEAL CARD READER / SHEKEL
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("12012600023456100=0900015239989421085");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("1.15");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("CellPhone")).click();
        driver.findElement(By.id("CellPhone")).clear();
        driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("1");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("btnMail")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
        //DEAL PHONE SHEKEL
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("50");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("35");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("CellPhone")).click();
        driver.findElement(By.id("CellPhone")).clear();
        driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("btnMail")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
        //DEAL SIGNITURE SHEKEL
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("51");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("18");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("CellPhone")).click();
        driver.findElement(By.id("CellPhone")).clear();
        driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("btnMail")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
        // PAYMENT WITH CARD READER
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("375510190000062=220320119032059212200");
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
        driver.findElement(By.id("CellPhone")).click();
        driver.findElement(By.id("CellPhone")).clear();
        driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("8");
        new Select(driver.findElement(By.id("PaymentsNum"))).selectByVisibleText("3");
        driver.findElement(By.id("FirstPay")).click();
        driver.findElement(By.id("FirstPay")).clear();
        driver.findElement(By.id("FirstPay")).sendKeys("2");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("btnMail")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
        // PAYMENT WITH PHONE
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("50");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("24");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("CellPhone")).click();
        driver.findElement(By.id("CellPhone")).clear();
        driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("8");
        new Select(driver.findElement(By.id("PaymentsNum"))).selectByVisibleText("3");
        driver.findElement(By.id("FirstPay")).click();
        driver.findElement(By.id("FirstPay")).clear();
        driver.findElement(By.id("FirstPay")).sendKeys("2");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("btnMail")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
         // PAYMENT WITH SIGNITURE / magnety
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("4580000000000000");
        new Select(driver.findElement(By.id("Code"))).selectByValue("51");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2021");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("20");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("CellPhone")).click();
        driver.findElement(By.id("CellPhone")).clear();
        driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("8");
        new Select(driver.findElement(By.id("PaymentsNum"))).selectByVisibleText("4");
        driver.findElement(By.id("FirstPay")).click();
        driver.findElement(By.id("FirstPay")).clear();
        driver.findElement(By.id("FirstPay")).sendKeys("5");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("btnMail")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
        // DEAL WITH INVOICE
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("375510190000062");
        new Select(driver.findElement(By.id("Code"))).selectByValue("50");
        new Select(driver.findElement(By.id("Month2"))).selectByVisibleText("03");
        new Select(driver.findElement(By.id("Year2"))).selectByVisibleText("2022");
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
        driver.findElement(By.id("CellPhone")).click();
        driver.findElement(By.id("CellPhone")).clear();
        driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
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
        driver.findElement(By.id("btnMail")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
        //PAYMENT WITH RIBIT
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("CardNumber")).click();
        driver.findElement(By.id("CardNumber")).clear();
        driver.findElement(By.id("CardNumber")).sendKeys("375510190000062=220320119032059212200");
        new Select(driver.findElement(By.id("Code"))).selectByValue("00");
        driver.findElement(By.id("Sum")).click();
        driver.findElement(By.id("Sum")).clear();
        driver.findElement(By.id("Sum")).sendKeys("46");
        new Select(driver.findElement(By.id("MType"))).selectByValue("1");
        driver.findElement(By.id("OwnerName")).click();
        driver.findElement(By.id("OwnerName")).clear();
        driver.findElement(By.id("OwnerName")).sendKeys("Yelena");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("CellPhone")).click();
        driver.findElement(By.id("CellPhone")).clear();
        driver.findElement(By.id("CellPhone")).sendKeys("0585456911");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        new Select(driver.findElement(By.id("DealType"))).selectByValue("80");
        new Select(driver.findElement(By.id("PaymentsNumWithCommission"))).selectByVisibleText("3");
        driver.findElement(By.id("FirstPay")).click();
        driver.findElement(By.id("FirstPay")).clear();
        driver.findElement(By.id("FirstPay")).sendKeys("2");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("btnMail"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        driver.findElement(By.id("btnMail")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuActivties")).click();
        //PAYMENT REQUEST HEBREW / SHEKEL
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("16");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
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
        //PAYMENT REQUEST ENGLISH
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("PaymentSerivce")).click();
        driver.findElement(By.id("Name")).click();
        driver.findElement(By.id("Name")).clear();
        driver.findElement(By.id("Name")).sendKeys("Yelena");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("18");
        driver.findElement(By.id("EmailSubject")).click();
        driver.findElement(By.id("EmailSubject")).clear();
        driver.findElement(By.id("EmailSubject")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("radioOffP")).click();
        driver.findElement(By.id("radioOff")).click();
        driver.findElement(By.name("radioP")).click();
        driver.findElement(By.name("radio")).click();
        new Select(driver.findElement(By.id("MinPayments"))).selectByVisibleText("5");
        new Select(driver.findElement(By.id("MinCreditPayments"))).selectByVisibleText("4");
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
        /*
         //REDIRECT
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuSettings")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("ExitSubMenu")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("accordionSettings1")).click();
        driver.findElement(By.id("accordionSettings4")).click();
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("31");
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
        Thread.sleep(4000);
        // REPORT 1: PASSED DEALS (dayly report)
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuReports")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"Today\"]")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("FirstPageBtn"));
        driver.findElement(By.name("backReport")).click();
        Thread.sleep(4000);
        // REPORT 1: FAILED DEALS (dayly report)
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("MenuReports")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"Today\"]")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Fail\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.name("backReport")).click();
        Thread.sleep(4000);
         // Create Kabala (Vouchers Invoices)
        driver.findElement(By.id("MenuActivties")).click();
        driver.findElement(By.id("menu_ECInvoice")).click();
        new Select(driver.findElement(By.id("ECInvoiceDocType"))).selectByValue("PAYMENT_INFO");
        new Select(driver.findElement(By.id("PaymentModel_paymentMethod"))).selectByValue("CHEQUE");
        driver.findElement(By.id("Payments_0__chequeNumber")).click();
        driver.findElement(By.id("Payments_0__chequeNumber")).clear();
        driver.findElement(By.id("Payments_0__chequeNumber")).sendKeys("5000921");
        driver.findElement(By.id("Payments_0__chequeBank")).click();
        driver.findElement(By.id("Payments_0__chequeBank")).clear();
        driver.findElement(By.id("Payments_0__chequeBank")).sendKeys("10");
        driver.findElement(By.id("Payments_0__chequeBranch")).click();
        driver.findElement(By.id("Payments_0__chequeBranch")).clear();
        driver.findElement(By.id("Payments_0__chequeBranch")).sendKeys("80851");
        driver.findElement(By.id("Payments_0__chequeAccount")).click();
        driver.findElement(By.id("Payments_0__chequeAccount")).clear();
        driver.findElement(By.id("Payments_0__chequeAccount")).sendKeys("06774522234");
        driver.findElement(By.id("Payments_0__amount")).click();
        driver.findElement(By.id("Payments_0__amount")).clear();
        driver.findElement(By.id("Payments_0__amount")).sendKeys("30");
        driver.findElement(By.id("Payments_0__chequeDateVal")).click();
        driver.findElement(By.linkText("29")).click();
        driver.findElement(By.id("ECInvoiceCustomerName")).click();
        driver.findElement(By.id("ECInvoiceCustomerName")).clear();
        driver.findElement(By.id("ECInvoiceCustomerName")).sendKeys("Yelena");
        driver.findElement(By.id("invoiceDetails")).click();
        driver.findElement(By.id("ECInvoiceAddress")).click();
        driver.findElement(By.id("ECInvoiceAddress")).clear();
        driver.findElement(By.id("ECInvoiceAddress")).sendKeys("Ha-Melakha St 10, Netanya, 4250545");
        driver.findElement(By.id("ECInvoicePhoneNumber")).click();
        driver.findElement(By.id("ECInvoicePhoneNumber")).clear();
        driver.findElement(By.id("ECInvoicePhoneNumber")).sendKeys("0585456911");
        driver.findElement(By.id("ECInvoiceTaxID")).click();
        driver.findElement(By.id("ECInvoiceTaxID")).clear();
        driver.findElement(By.id("ECInvoiceTaxID")).sendKeys("348658899");
        driver.findElement(By.id("ECInvoiceEMail")).clear();
        driver.findElement(By.id("ECInvoiceEMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("TotalSum")).click();
        driver.findElement(By.id("TotalSum")).clear();
        driver.findElement(By.id("TotalSum")).sendKeys("26");
        driver.findElement(By.id("Note")).click();
        driver.findElement(By.id("Note")).clear();
        driver.findElement(By.id("Note")).sendKeys("notes");
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("okMsgFromServer"));
        // REPORT INVOICES
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("MenuReports")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("ECInvoiceRep")).click();
        new Select(driver.findElement(By.id("ReportType"))).selectByValue("0");
        new Select(driver.findElement(By.id("ddlDocType"))).selectByValue("pdf");
        driver.findElement(By.id("FromDate")).click();
        driver.findElement(By.id("FromDate")).clear();
        driver.findElement(By.id("FromDate")).sendKeys("17/03/2020");
        driver.findElement(By.cssSelector("div.row.container")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("toDate")).click();
        driver.findElement(By.id("toDate")).clear();
        driver.findElement(By.id("toDate")).sendKeys("17/03/2020");
        driver.findElement(By.cssSelector("div.row.container")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("btnSubmit1")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.id("gview_jqGrid"));
        Thread.sleep(4000);
        //  REPORT KABALOT
        driver.findElement(By.id("MenuActivties")).click();
        Thread.sleep(4000);
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("MenuReports")))
                    break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        driver.findElement(By.id("MenuReports")).click();
        driver.findElement(By.id("ECInvoiceRep")).click();
        new Select(driver.findElement(By.id("ReportType"))).selectByValue("1");
        new Select(driver.findElement(By.id("ReportType"))).selectByValue("0");
        new Select(driver.findElement(By.id("ddlDocType"))).selectByValue("pdf");
        driver.findElement(By.id("FromDate")).click();
        driver.findElement(By.id("FromDate")).clear();
        driver.findElement(By.id("FromDate")).sendKeys("17/03/2020");
        driver.findElement(By.cssSelector("div.row.container")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("toDate")).click();
        driver.findElement(By.id("toDate")).clear();
        driver.findElement(By.id("toDate")).sendKeys("17/03/2020");
        driver.findElement(By.cssSelector("img[alt=\"EasyCard\"]")).click();
        driver.findElement(By.cssSelector("div.row.container")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("PaymentInfoReportShow")).click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Thread.sleep(4000);
        // BILLING: CREATE NEW CREDIT CARD CLIENT
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("MenuActivties"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        driver.findElement(By.id("MenuActivties")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("BillingSystem"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("create-user")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            assertTrue(isElementPresent(By.id("accordionClientDetails1")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("accordionClientDetails1"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement elemX = driver.findElement(By.id("accordionClientDetails1"));
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
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).sendKeys("02/06/2020");
        driver.findElement(By.id("EditedCustomer_LastPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_LastPayDate")).sendKeys("12/11/2020");
        driver.findElement(By.id("trTotalSum")).click();
        driver.findElement(By.id("EditedCustomer_Totalsum")).clear();
        driver.findElement(By.id("EditedCustomer_Totalsum")).sendKeys("5");
        new Select(driver.findElement(By.id("EditedCustomerPayDay"))).selectByValue("2");
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        Thread.sleep(10000);
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.name("ReportsSearchStartDate"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        Thread.sleep(1000);
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("tblBSCustomers")).isDisplayed()) break;
            } catch (Exception e) {
            }
            Thread.sleep(3000);
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("numRecords")).isDisplayed()) break;
            } catch (Exception e) {
            }
            Thread.sleep(3000);
        }
       /*
         //MAKE A CREDIT CARD BILLING
       driver.findElement(By.id("BillingSystem")).click();
       Thread.sleep(6000);
        driver.findElement(By.id("BillingSysCard")).click();
        Thread.sleep(6000);
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("check-all")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        Thread.sleep(5000);
        driver.findElement(By.id("check-all")).click();
        driver.findElement(By.xpath("//td/input[2]")).click();
        driver.findElement(By.id("ChargeAll")).click();
        Thread.sleep(5000);
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
          Thread.sleep(4000);
        //BILLING: CREATE ORAT KEVA CLENT
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("create-user")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        try {
            assertTrue(isElementPresent(By.id("accordionClientDetails1")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("accordionClientDetails1"))) break;
            } catch (Exception e) {
            }
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
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).sendKeys("02/06/2020");
        driver.findElement(By.id("EditedCustomer_LastPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_LastPayDate")).sendKeys("12/11/2020");
        driver.findElement(By.id("trTotalSum")).click();
        driver.findElement(By.id("EditedCustomer_Totalsum")).clear();
        driver.findElement(By.id("EditedCustomer_Totalsum")).sendKeys("33");
        new Select(driver.findElement(By.id("EditedCustomerPayDay"))).selectByValue("2");
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.name("ReportsSearchStartDate"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("tblBSCustomers")).isDisplayed()) break;
            } catch (Exception e) {
            }
            Thread.sleep(3000);
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("numRecords")).isDisplayed()) break;
            } catch (Exception e) {
            }
            Thread.sleep(3000);
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("create-user")).isDisplayed()) break;
            } catch (Exception e) {
            }
            Thread.sleep(3000);
        }
        Thread.sleep(6000);
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("BillingSystem")).isDisplayed()) break;
            } catch (Exception e) {
            }
        }
        Thread.sleep(6000);
       /*
        //Make ORAT KEVA BILLING
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@onclick='setClickOption(4);']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("check-all")).click();
        driver.findElement(By.xpath("//td/input[2]")).click();
       Thread.sleep(3000);
      // driver.findElement(By.cssSelector("#BillingSysCardMSV")).click();
       driver.findElement(By.id("BillingSysCardMSV")).click();
        driver.findElement(By.id("ShowUser")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.name("ReportsSearchStartDate"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }
        Thread.sleep(3000);
           //BILLLING CREATE NEW INVOICE ONLY BILLING
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("create-user")).click();
        Thread.sleep(3000);
        try {
            assertTrue(isElementPresent(By.id("accordionClientDetails1")));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.id("accordionClientDetails1"))) break;
            } catch (Exception e) {
            }
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
        driver.findElement(By.id("EditedCustomer_FirstPayDate")).sendKeys("02/06/2020");
        driver.findElement(By.id("EditedCustomer_LastPayDate")).clear();
        driver.findElement(By.id("EditedCustomer_LastPayDate")).sendKeys("12/11/2020");
        driver.findElement(By.id("trTotalSum")).click();
        driver.findElement(By.id("EditedCustomer_Totalsum")).clear();
        driver.findElement(By.id("EditedCustomer_Totalsum")).sendKeys("31");
        new Select(driver.findElement(By.id("EditedCustomerPayDay"))).selectByValue("02");
        driver.findElement(By.id("btnAddUpdateCustomer")).click();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.name("ReportsSearchStartDate"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("tblBSCustomers")).isDisplayed()) break;
            } catch (Exception e) {
            }
            Thread.sleep(3000);
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("numRecords")).isDisplayed()) break;
            } catch (Exception e) {
            }
            Thread.sleep(3000);
        }
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (driver.findElement(By.id("create-user")).isDisplayed()) break;
            } catch (Exception e) {
            }
            Thread.sleep(3000);
        }
        /*
        //SENT INVOICE BILLING
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//td[7]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("check-all")).click();
        driver.findElement(By.xpath("//td/input[2]")).click();
        driver.findElement(By.id("BillingSysCardInvoce")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (driver.findElement(By.id("ShowUser")).isDisplayed()) break; } catch (Exception e) {}
            Thread.sleep(3000);
       }
     Thread.sleep(6000);

        //BILLING: ONE TIME CHARGE
        driver.findElement(By.id("BillingSystem")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("BillingSysCard")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//button[@value='1']")).click();
        Thread.sleep(6000);
        driver.findElement(By.id("TotlaSum")).click();
        driver.findElement(By.id("TotlaSum")).clear();
        driver.findElement(By.id("TotlaSum")).sendKeys("4");
        driver.findElement(By.id("tbnDODEAL")).click();
        Thread.sleep(6000);
        //Generate invoice from report page
        driver.findElement(By.id("MenuReports")).click();
        driver.findElement(By.cssSelector("[name=ShowRange][value=\"Today\"]")).click();
        driver.findElement(By.cssSelector("[name=StatusType][value=\"Pass\"]")).click();
        driver.findElement(By.id("btnSubmit")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.id("tblDeals_button1_5")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("ECInvoiceCustomerName")).clear();
        driver.findElement(By.id("ECInvoiceCustomerName")).sendKeys("Yelena");
        driver.findElement(By.id("ECInvoiceEMail")).clear();
        driver.findElement(By.id("ECInvoiceEMail")).sendKeys("korsakovyelena@gmail.com");
        driver.findElement(By.id("btnSubmit")).click();
        Thread.sleep(4000);
        */
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

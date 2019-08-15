import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://ectest.e-c.co.il/Accounts/Login")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='קיצור דרך'])[1]/following::div[2]")
selenium.click("id=btnEnter")
selenium.click("id=PaymentSerivce")
selenium.click("id=BroadcastManger")
selenium.click("id=BillingSystem")
for (int second = 0;; second++) {
	if (second >= 60) fail("timeout");
	try { if (selenium.isElementPresent("id=Settings")) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

selenium.click("id=CreditBilling")
selenium.click("id=Code")
selenium.select("id=Code", "label=עסקת חתימה")
selenium.click("id=Code")
selenium.click("id=Month2")
selenium.select("id=Month2", "label=06")
selenium.click("id=Month2")
selenium.click("id=Year2")
selenium.select("id=Year2", "label=2023")
selenium.click("id=Year2")
selenium.click("id=btnSubmit")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='סכום עסקה לא חוקי5000'])[1]/following::div[1]")
for (int second = 0;; second++) {
	if (second >= 60) fail("timeout");
	try { if (selenium.isElementPresent("xpath=(.//*[normalize-space(text()) and normalize-space(.)='שגיאה'])[1]/following::div[2]")) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

for (int second = 0;; second++) {
	if (second >= 60) fail("timeout");
	try { if (selenium.isElementPresent("id=Clicker")) break; } catch (Exception e) {}
	Thread.sleep(1000);
}

selenium.click("id=Clicker")

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.click(findTestObject('SimpleLoginTokopedia_OR/Page_Situs Jual Beli Online Terlengkap Mudah  Aman  Tokopedia/span_Masuk'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SimpleLoginTokopedia_OR/Page_Situs Jual Beli Online Terlengkap Mudah  Aman  Tokopedia/input_Nomor Ponsel atau Email_css-96wq3o etqnizx0'), 
    'testing.case89@gmail.com')

WebUI.click(findTestObject('SimpleLoginTokopedia_OR/Page_Situs Jual Beli Online Terlengkap Mudah  Aman  Tokopedia/button_Selanjutnya'))

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Object Repository/SimpleLoginTokopedia_OR/Page_Situs Jual Beli Online Terlengkap Mudah  Aman  Tokopedia/input_Kata Sandi_css-96wq3o etqnizx0'), 
    'PLDDmBUWByq9MhqWXYPXWQ==')

WebUI.delay(5)

not_run: WebElement element = WebUiCommonHelper.findWebElement(findTestObject('SimpleLoginTokopedia_OR/Page_Situs Jual Beli Online Terlengkap Mudah  Aman  Tokopedia/span_Masuk'), 
    10)

not_run: WebUI.executeJavaScript('arguments[0].click', Arrays.asList(element))

WebUI.click(findTestObject('SimpleLoginTokopedia_OR/Page_Situs Jual Beli Online Terlengkap Mudah  Aman  Tokopedia/span_Masuk_1'))


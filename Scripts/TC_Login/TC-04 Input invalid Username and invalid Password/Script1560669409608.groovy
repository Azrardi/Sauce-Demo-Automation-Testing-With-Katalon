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
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Login/TC-04/Page_Swag Labs/input_standard_userlocked_out_'), 
    'welcome')

WebUI.setText(findTestObject('Login/TC-04/Page_Swag Labs/input_standard_userlocked_out__1'), 
    'hello_world')

WebUI.click(findTestObject('Login/TC-04/Page_Swag Labs/input_standard_userlocked_out__16'))

WebUI.verifyElementPresent(findTestObject('Login/TC-04/Page_Swag Labs/h3_Epic sadface Username and p'), 
    0)

WebUI.closeBrowser()


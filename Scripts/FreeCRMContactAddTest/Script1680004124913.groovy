import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.corba.se.impl.orbutil.closure.Constant

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
WebUI.openBrowser(webUrl)
WebUI.setText(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/input_The field Name is required_name'), userName)
WebUI.setText(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/input_Login_password'), Password)
WebUI.click(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/div_Login'))
WebUI.click(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/span_Contacts'))
WebUI.click(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/button_Create'))
WebUI.setText(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/input_First Name_first_name'), 'Krunal')
WebUI.setText(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/input_Login_email'),'Butt')
WebUI.click(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/button_Save'))
WebUI.click(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/i_Free account_settings icon'))
WebUI.click(findTestObject('Object Repository/Page_FreeCRM/Page_Cogmento CRM/span_Log Out'))
WebUI.closeBrowser()

//if(name=='abd') {
//	System.out.print('Name matches !')
//}else {
//	System.out.print('Name mismatch !')

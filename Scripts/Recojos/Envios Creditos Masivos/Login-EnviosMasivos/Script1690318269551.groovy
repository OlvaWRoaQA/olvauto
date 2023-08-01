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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-pimcore.olvaexpress.pe/atc/user/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/span_X'))

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (4)'), '120508371901')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password (4)'), '8kIfpnHAK5XGf3XAsZ+fNQ==')

WebUI.click(findTestObject('Object Repository/button_Entrar (8)'))

WebUI.click(findTestObject('Object Repository/small_Servicios'))

WebUI.click(findTestObject('Creditos Masivos/a_panorama_fish_eyeEnvos Masivos'))


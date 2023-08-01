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

WebUI.navigateToUrl('https://app.aimo.co')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Aimo Dashboard/input_Ingresar_MuiInputBase-input MuiInput-input'), 
    'fulfillment@olva.com.pe')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Aimo Dashboard/input_Ingresar_MuiInputBase-input MuiInput-_643b93'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Comprar Empaques/Page_Aimo Dashboard/input_Ingresar_MuiInputBase-input MuiInput-_643b93'), 
    'NEzHLWrOQcYvsbSxoLQLQw==')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Aimo Dashboard/button_Iniciar sesin'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Aimo Dashboard/svg_Ver tienda_sc-AykKH LFzel'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Aimo Dashboard/a_Ver tienda_sc-LzLqK fSTtFv'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Aimo Dashboard/checkbox_AIMO'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('$ 0', false)

WebUI.verifyTextPresent('$ 0.00', false)


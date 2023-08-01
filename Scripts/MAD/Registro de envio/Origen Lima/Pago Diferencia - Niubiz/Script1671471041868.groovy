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

WebUI.openBrowser(link)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/button_Pagar la diferencia'))

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/input_He ledo y acepto los_ckbTerms'))

WebUI.click(findTestObject('Object Repository/button_He ledo y acepto los_start-js-btn mo_acbcf3'))

WebUI.click(findTestObject('Object Repository/label_Tarjeta de crdito y dbito Realiza tu pago en cuotas o directo'))

WebUI.click(findTestObject('Object Repository/button_Continuar (3)'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), '5160')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('0300'))

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('0000'))

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('0317'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), '12')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), Keys.chord('23'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_cvc'), '111')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_name'), 'Aquiles')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_lastname'), 'Castro')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_email'), 'correo@email.com')

WebUI.click(findTestObject('Object Repository/button_Pagar'))


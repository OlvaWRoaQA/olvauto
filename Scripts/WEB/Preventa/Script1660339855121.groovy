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

WebUI.callTestCase(findTestCase('WEB/Registro de Envios/Positivo/Sobre/Selecciona el Destino de tu envío - Entrega a Domicilio'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/a_DNI (2)'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/input_documento_receptor'), 
    '07000001')

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/input_telefono_receptor'), 
    '900000002')

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 
    'RECEPTOR DE PRUEBA QA 001')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 6.44'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Confirma tus datos/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Medios de pago/i_Pago con tarjeta de crdito y dbito'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(3)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)


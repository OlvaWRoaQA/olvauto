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

WebUI.callTestCase(findTestCase('Registro de Envio/Inicio de Registro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro de Envio/Registro de Envios/Positivo/Paquete/Enviar un Paquete - Quien Envia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 350)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_UTILES DE OFICINA'))

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'ARTICULO OFICINA QA 001')

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/input_paquete_valor'), '80')

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/input_UTILES DE OFICINA_txt_paquete_largo'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.verifyElementPresent(findTestObject('Inicio/Page_Olva Courier  Datos Personales/div_Las dimensiones mnimas deben ser 10cm x 10cm x 14cm o el equivalente'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/div_El campo Peso no puede ser menor a uno'), 
    0)


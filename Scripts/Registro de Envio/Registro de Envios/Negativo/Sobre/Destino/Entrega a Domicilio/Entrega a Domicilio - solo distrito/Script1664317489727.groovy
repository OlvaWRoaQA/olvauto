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

WebUI.callTestCase(findTestCase('Registro de Envio/Registro de Envios/Positivo/Paquete/Enviar un Paquete - Que envia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 300)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (2)'))

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text)'), 
    'lima - lima - santi')

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/a_LIMA - LIMA - SANTIAGO DE SURCO (3)'))

WebUI.scrollToElement(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/div_La direccion debe ser mayor a 3 caracteres'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/div_Debe escribir una referencia'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/div_Debe Seleccionar Tipo Documento'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/div_Debe Ingresar Nmero Documento'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/div_Debe ingresar Nmero CelularTelfono'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/div_Debe Ingresar Nombre'))


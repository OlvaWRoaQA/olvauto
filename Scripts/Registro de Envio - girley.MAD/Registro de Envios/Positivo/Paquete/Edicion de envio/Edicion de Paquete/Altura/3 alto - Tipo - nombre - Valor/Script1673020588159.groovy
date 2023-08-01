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

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Inicio de Registro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Enviar un Paquete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowTitle('Olva Courier | Datos Personales')

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Datos Personales/span_RUC'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '10066810581')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '900000001')

WebUI.click(findTestObject('Object Repository/button_LIMA'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELEC'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'Impresora QA 001')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_paquete_valor'), '100')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_paquete_largo'), '14')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_ancho'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_peso'), '1')

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text)'), 
    'ica - ica - ica')

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_direccion_domicilio'), 
    'DIRECCION DE PRUEBA QA 001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_direccion__referencia'), 
    'AL LADO DEL TAMBO')

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/a_DNI (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_documento_receptor'), '07000001')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '900000002')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 'RECEPTOR DE PRUEBA QA 001')

WebUI.scrollToElement(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_Editar'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_UTILES DE OFICINA'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'Cartuchos de impresora')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_paquete_valor'), '200')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), '25')

WebUI.scrollToPosition(0, 400)

WebUI.scrollToElement(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Medios de pago/i_Pago agencias y banca'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(3)


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

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_DNI_txt_documento_cliente'), 
    '45878206')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_El apellido ingresado debe ser igual _544e76'), 
    'GARRAFA')

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_El apellido ingresado debe ser igual _544e76'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '934051999')

//WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_Hola,_txt_email_cliente'), 'email1@correo.com')
WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Departamento - Provincia - Distrito'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_Departamento - Provincia - Distrito_f_f56910'), 
    'lima - lima - santiago')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_LIMA - LIMA - SANTIAGO DE SURCO (1)'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/button_COLABORADOR'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/b_Promocin Empleados Olva'), 
    'Promoción Empleados Olva')

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/button_Aceptar'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELEC'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'Impresora QA 001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_valor'), '450')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_largo'), '34')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_ancho'), 
    '22')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), 
    '16')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_peso'), 
    '1.5')

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (2)'))

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text) - 03'), 
    'la libertad - trujillo - trujillo')

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/a_LA LIBERTAD - TRUJILLO - TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_TRUJILLO- TIENDA TUPAC AMARU NRO 1675 (URB ALTO MOCHICA'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_clave_recojo_tienda'), 
    '0000')

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Registro de Envio/Page_Olva Courier  Datos Personales/span_retorno de cargo'))

WebUI.click(findTestObject('Registro de Envio/Page_Olva Courier  Datos Personales/span_retorno de cargo - SI'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/a_DNI (2) - Receptor'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_documento_receptor'), '07000001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '900000002')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 'RECEPTOR DE PRUEBA QA 001')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'), 0)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Medios de pago/i_Pago agencias y banca'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(1)


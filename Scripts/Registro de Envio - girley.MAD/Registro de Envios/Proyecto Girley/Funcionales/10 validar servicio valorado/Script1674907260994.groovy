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

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Inicio de Registro - Girley'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Enviar un Paquete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowTitle('Olva Courier | Datos Personales')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_RUC (2)'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '10066810581')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '900000001')

WebUI.click(findTestObject('Object Repository/button_LIMA'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELEC'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 
    'Impresora QA 001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_paquete_valor'), 
    '1200')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_paquete_largo'), 
    '14')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_ancho'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_peso'), 
    '1.5')

WebUI.scrollToPosition(0, 400)

WebUI.delay(5)

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley2'))

WebUI.sendKeys(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley2'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley (text)'), 
    'lima - lima - ate')

WebUI.sendKeys(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley (text)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_Direccin de Entrega_address'), 
    'Avenida Arenales 1775, Lince, Perú')

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Meet - pvd-uiyo-xob/Page_Olva Courier  Datos Personales/Page_Olva Courier  Datos Personales/button_Avenida Arenales 1775, Lince, Per'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/button_Guardar Direccin (1)'))

WebUI.verifyElementText(findTestObject('Page_Olva Courier  Datos Personales/div_Servicio Valorado'), 'Servicio Valorado')


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
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import java.util.StringTokenizer as StringTokenizer
import java.lang.Object as Object
import groovy.lang.Closure as Closure

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Inicio de Registro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Enviar un Paquete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowTitle('Olva Courier | Datos Personales')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Datos Personales/span_RUC'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '10066810581')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '900000001')

WebUI.click(findTestObject('Object Repository/button_LIMA'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELEC'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'Impresora QA 001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_valor'), '400')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_largo'), '14')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_ancho'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_peso'), 
    '2.1')

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.click(findTestObject('Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (2)'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text) - 02'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text) - 02'), 
    'AREQUIPA - CARAVELI - BELLA UNION')

WebUI.sendKeys(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text) - 02'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_direccion_domicilio'), 
    'DIRECCION DE PRUEBA QA 001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_direccion__referencia'), 
    'AL LADO DEL TAMBO')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_documento_receptor'), '07000001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '900000002')

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_DNI (2)'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_documento_receptor'), '07000001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '900000002')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 'RECEPTOR DE PRUEBA QA 001')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'))

monto_RE = WebUI.getText(findTestObject('Page_Olva Courier  Medios de pago/td_IGV_registro de envio'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Olva Corp/Page_Olva Courier  Medios de pago/i_Pago agencias y banca'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(1)

nro_pedido1 = WebUI.getText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/nro de pedido - 2'))

WebUI.delay(5)

WebUI.openBrowser('http://desa.olva.com.pe:8080/OlvaERP-web/')

WebUI.navigateToUrl('http://desa.olva.com.pe:8080/OlvaERP-web/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'garce')

WebUI.setEncryptedText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'n6MrA7ftZ0I=')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Maestros'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/span_Host'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Configurar'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_Host_frmConfHosthostComplete_input'), 
    'ELIN03')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_Host_frmConfHosthostComplete_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Principal - Olva Courier/span_Grabar'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/a_Gerardo Arce Gutierrez'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/a_Cerrar sesin'))

WebUI.navigateToUrl('http://desa.olva.com.pe:8080/OlvaERP-web/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'garce')

WebUI.setEncryptedText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'n6MrA7ftZ0I=')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Atencin Cliente (1)'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Venta (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/span_Buscar Preventa'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), 
    nro_pedido1)

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Olva Corp/Page_Principal - Olva Courier/td_01'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/span_Seleccionar'))

WebUI.delay(5)

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Meet - pvd-uiyo-xob/Page_Principal - Olva Courier/Page_Principal - Olva Courier/input_editar_'))

WebUI.click(findTestObject('Negativo/Page_Principal - Olva Courier/input_LECTORA_frmNewEnvioremManual'))

WebUI.setText(findTestObject('Negativo/Page_Principal - Olva Courier/input_LECTORA_frmNewEnvioremManual'), '12230860100')

WebUI.sendKeys(findTestObject('Negativo/Page_Principal - Olva Courier/input_LECTORA_frmNewEnvioremManual'), Keys.chord(Keys.ENTER))

monto_base1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/monto_base'), 
    FailureHandling.STOP_ON_FAILURE)

monto_exceso1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/monto_exceso'), 
    FailureHandling.STOP_ON_FAILURE)

monto_otros1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/monto_otros'), 
    FailureHandling.STOP_ON_FAILURE)

monto_IGV1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Meet - pvd-uiyo-xob/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/span_IGV_olvacorp'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyNotEqual(monto_base1, 'S/.0.00')

WebUI.verifyNotEqual(monto_exceso1, 'S/.0.00')

WebUI.verifyEqual(monto_base1, 'S/.13.97')

WebUI.verifyEqual(monto_exceso1, 'S/.6.55')

WebUI.verifyEqual(monto_otros1, 'S/.8.47')


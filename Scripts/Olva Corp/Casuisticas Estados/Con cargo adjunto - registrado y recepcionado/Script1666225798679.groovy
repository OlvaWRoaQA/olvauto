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

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Registro de Envios/Positivo/Paquete/Declaracion/Sin Declaracion - con cargo adjunto'), 
    [:], FailureHandling.STOP_ON_FAILURE)

nro_pedido1 = WebUI.getText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/nro de pedido - 2'))

WebUI.delay(90)

WebUI.openBrowser('https://registro.olvacourier.com/registrar_envios_nuevo/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://desa.olva.com.pe:8080/OlvaERP-web/')

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

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'garce')

WebUI.setEncryptedText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'n6MrA7ftZ0I=')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Principal - Olva Courier/span_Atencin Cliente (1)'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Principal - Olva Courier/span_Venta (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/span_Buscar Preventa'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), nro_pedido1)

WebUI.sendKeys(findTestObject('Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Page_Principal - Olva Courier/td_01'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Seleccionar'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/input_S_frmVentaContadotblEnvio0j_idt105'))

WebUI.setText(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/input_LECTORA_frmNewEnvioremManual'), 
    '12230860002')

WebUI.click(findTestObject('Olva Corp/despacho/Page_Principal - Olva Courier/span_Grabar - tracking'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/span_Editar'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/span_Salir'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/span_Grabar_preventa'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/input_EFECTIVO_frmTipoComprobanteefectivo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_EFECTIVO_frmTipoComprobanteefectivo'), '50')

WebUI.click(findTestObject('Page_Principal - Olva Courier/div_(function()PrimeFaces.focus(frmTipoComp_1aba4c'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_GRABAR E IMPRMIR'))

WebUI.delay(5)

nro_tracking = WebUI.getText(findTestObject('Page_Principal - Olva Courier/nro_tracking'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/span_Despacho'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/span_Consulta Envio'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/input_N Tracking_frmConsultaEnviotxtRemito'))

WebUI.setText(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/input_N Tracking_frmConsultaEnviotxtRemito'), 
    nro_tracking)

WebUI.sendKeys(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/input_N Tracking_frmConsultaEnviotxtRemito'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/li_Ruta envo'))

WebUI.scrollToElement(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/td_REGISTRADO'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/td_REGISTRADO'), 'REGISTRADO')

WebUI.verifyElementText(findTestObject('Object Repository/Negativo/Page_Principal - Olva Courier/td_RECEPCION TIENDA'), 
    'RECEPCION TIENDA')

WebUI.openBrowser('')


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

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '002699003')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '900000001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_Hola,_txt_email_cliente'), 
    'email1@correo.com')

//WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_Hola,_txt_email_cliente'), 'email1@correo.com')
WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Departamento - Provincia - Distrito'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_Departamento - Provincia - Distrito_f_f56910'), 
    'lima - lima - santiago')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_LIMA - LIMA - SANTIAGO DE SURCO (1)'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELEC'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'Impresora QA 001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_valor'), '450')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_largo'), '14')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_ancho'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_peso'), 
    '1.5')

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (2)'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (24)'), 
    destino_promocion)

WebUI.sendKeys(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (24)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Page_Olva Courier  Datos Personales/span_Tienda - seleccion'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_clave_recojo_tienda'), 
    '0000')

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_DNI (2)'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_documento_receptor'), '07000001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '900000002')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 'RECEPTOR DE PRUEBA QA 001')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/a_AGREGAR ENVOS'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/img_paquete'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELEC'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'Impresora QA 001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_valor'), '450')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_largo'), '14')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_ancho'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_peso'), 
    '1.5')

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (2)'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (24)'), 
    'cusco - cusco - cusco')

WebUI.sendKeys(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (24)'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_cusco tienda av pardo 575'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_clave_recojo_tienda'), 
    '0000')

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_DNI (2)'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_documento_receptor'), '07000001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '900000002')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 'RECEPTOR DE PRUEBA QA 001')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'), 0)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Confirma tus datos/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Medios de pago/i_Pago agencias y banca'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/td_Dcto. PROMOCION'), 'Dcto. PROMOCION')

total_1 = WebUI.getText(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/th_TOTALES'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(1)

nro_pedido1 = WebUI.getText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/nro de pedido'))

WebUI.delay(90)

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

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Configurar'))

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_Host_frmConfHosthostComplete_input'), 'ELIN03')

WebUI.sendKeys(findTestObject('Page_Principal - Olva Courier/input_Host_frmConfHosthostComplete_input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/span_Grabar'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/a_Gerardo Arce Gutierrez'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/a_Cerrar sesin'))

WebUI.navigateToUrl('http://desa.olva.com.pe:8080/OlvaERP-web/')

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'garce')

WebUI.setEncryptedText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'n6MrA7ftZ0I=')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Atencin Cliente (1)'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Venta (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/span_Buscar Preventa'))

WebUI.setText(findTestObject('Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), nro_pedido1)

WebUI.sendKeys(findTestObject('Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/td_01'))

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Seleccionar'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/span_Grabar_preventa'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/span_total_olvacorp'))

total_2 = WebUI.getText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/span_total_olvacorp'))

WebUI.verifyEqual('S/ ' + total_2, total_1)


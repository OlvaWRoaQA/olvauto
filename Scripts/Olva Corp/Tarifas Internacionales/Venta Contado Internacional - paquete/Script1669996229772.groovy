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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://registro.olvacourier.com:8080/OlvaERP-web/login.xhtml')

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

WebUI.navigateToUrl('http://registro.olvacourier.com:8080/OlvaERP-web/login.xhtml')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'garce')

WebUI.setEncryptedText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'n6MrA7ftZ0I=')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Atencin Cliente (1)'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Venta (1)'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_DNIRUC_ui-button-icon-left ui-icon ui-c ui-icon-search'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_DNIRUC_ui-button-icon-left ui-icon ui-c ui-icon-search'), 
    '74747458')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_DNIRUC_ui-button-icon-left ui-icon ui-c ui-icon-search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Agregar nuevo'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_QUIN RECIBE_frmNewEnviotxtConsignado'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_QUIN RECIBE_frmNewEnviotxtConsignado'), 
    'Pedro Perez')

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_TELF_frmNewEnvioconsignadoDni'), 
    '07777777')

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_TELF_frmNewEnvioconsignadoTelf'), 
    '999666333')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_Destino_frmNewEnviodestino'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/body_btnInit  function() PrimeFaces.ab(sfrm_3ee89d'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_DESTINO_frmUbigeoDestinofltDestino'), 
    'Japon')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_DESTINO_frmUbigeoDestinofltDestino'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Olva Corp/Distribucion/Page_Principal - Olva Courier/td_seleccion_pais'))

WebUI.setText(findTestObject('Olva Corp/despacho/Page_Principal - Olva Courier/input_COD.POSTAL'), '000001')

WebUI.click(findTestObject('Olva Corp/Page_Principal - Olva Courier/span_Seleccionar_destino'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_Direccin_frmNewEnviodirEntrega'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_Direccin_frmNewEnviodirEntrega'), 
    'av 28 de julio 1550')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_SERVICIOS_frmNewEnvioservicio_input'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/tr_SERVICIOSbtnCodeService  function() Prim_d41b54'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_SERVICIOS_frmNewEnvioservicio_input'), 
    'IPQ')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_SERVICIOS_frmNewEnvioservicio_input'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_ARTICULO_frmNewEnvioarticulo (1)'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_ARTICULO_frmNewEnvioarticulo (1)'), 
    'caja')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_ARTICULO_frmNewEnvioarticulo (1)'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/select_SOBRECAJATUBOJABA DE MADERAVALIJABOL_63b6a0'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/tr_NRO PIEZASARTICULObtnSearchArt  function_41390d'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_P. REAL_frmNewEnviopesoReal'), 
    '2.6')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/div_Nro PiezasArticuloCont. Art.P. RealP. V_8591d6'))

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/Peso_Volumen'))

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/Alto Peso_Volumen'))

WebUI.setText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/Alto Peso_Volumen'), '14')

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/Ancho Peso_Volumen'))

WebUI.setText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/Ancho Peso_Volumen'), '10')

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/Largo - Peso_Volumen'))

WebUI.setText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/Largo - Peso_Volumen'), '10')

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/span_Calcular'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_P. CONSIGNADO_ui-button-icon-left ui-i_91eb9f'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/textarea_OBSERVACIN_frmNewEnvioobservacion'), 
    'Caja Blanca')

valor_venta1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/valor_venta'))

WebUI.verifyMatch(valor_venta1, 'S/.682.80', true)

WebUI.click(findTestObject('Page_Principal - Olva Courier/span_Fotos_ENV_INTER'))

WebUI.click(findTestObject('Inicio/Page_Principal - Olva Courier/input_Seleccionar_imagen_cliente'))

WebUI.delay(10)

WebUI.click(findTestObject('Olva Corp/despacho/Page_Principal - Olva Courier/span_Grabar - imagenes'))

WebUI.click(findTestObject('Olva Corp/despacho/Page_Principal - Olva Courier/span_Grabar - tracking'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/a_salir_track'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Grabar_venta'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_EFECTIVO_frmTipoComprobanteefectivo'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_EFECTIVO_frmTipoComprobanteefectivo'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/div_(function()PrimeFaces.focus(frmTipoComp_1aba4c'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_GRABAR E IMPRMIR'))

WebUI.delay(5)

nro_tracking = WebUI.getText(findTestObject('Olva Corp/despacho/Page_Principal - Olva Courier/nro_tracking'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Tiempos de entrega  Olva Courier/Page_Principal - Olva Courier/span_General'))

WebUI.setText(findTestObject('Object Repository/Negativo/Page_Tiempos de entrega  Olva Courier/Page_Principal - Olva Courier/input_N Tracking_frmConsultaEnviotxtRemito'), 
    nro_tracking)

WebUI.sendKeys(findTestObject('Negativo/Page_Principal - Olva Courier/input_N Tracking_frmConsultaEnviotxtRemito'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Tiempos de entrega  Olva Courier/Page_Principal - Olva Courier/span_imagen envio internacional'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Tiempos de entrega  Olva Courier/Page_Principal - Olva Courier/a_Descargar_ui-link ui-widget'))


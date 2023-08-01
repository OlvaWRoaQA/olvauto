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
    'lima')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_DESTINO_frmUbigeoDestinofltDestino'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Olva Corp/despacho/Page_Principal - Olva Courier/td_LIMA - LIMA - LIMA'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Seleccionar_destino'))

WebUI.click(findTestObject('Olva Corp/Page_Principal - Olva Courier/span_Seleccionar_domicilio'))

WebUI.click(findTestObject('Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Seleccionar - girley'))

WebUI.click(findTestObject('Inicio/Page_Principal - Olva Courier/input_Direccin_Entrega_oc'))

WebUI.setText(findTestObject('Inicio/Page_Principal - Olva Courier/input_Direccin_Entrega_oc'), 'av javier prado e, san borja')

WebUI.click(findTestObject('Inicio/Page_Principal - Olva Courier/button_Avenida Javier Prado E, San Borja'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inicio/Page_Principal - Olva Courier/button_Avenida Javier Prado E, San Borja'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/button_Guardar Direccin'), 
    0)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/button_Guardar Direccin'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_SERVICIOS_frmNewEnvioservicio_input'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/tr_SERVICIOSbtnCodeService  function() Prim_d41b54'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_SERVICIOS_frmNewEnvioservicio_input'), 
    'reg')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_REG'))

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

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_P. CONSIGNADO_ui-button-icon-left ui-i_91eb9f'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/textarea_OBSERVACIN_frmNewEnvioobservacion'), 
    'Caja Blanca')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Grabar_tracking'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/a_salir_track'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Grabar_venta'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_EFECTIVO_frmTipoComprobanteefectivo'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_EFECTIVO_frmTipoComprobanteefectivo'), 
    '50')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/div_(function()PrimeFaces.focus(frmTipoComp_1aba4c'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_GRABAR E IMPRMIR'))

WebUI.delay(5)

nro_tracking = WebUI.getText(findTestObject('Olva Corp/despacho/Page_Principal - Olva Courier/nro_tracking'))


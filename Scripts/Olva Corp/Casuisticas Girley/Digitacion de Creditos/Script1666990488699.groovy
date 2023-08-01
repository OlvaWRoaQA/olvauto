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

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Despacho'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Digitacion Creditos'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_EMISIN_frmVentaContadotxtEmisionOrderServ'), 
    '18')

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_NRO ORDEN_frmVentaContadotxtNumeroOrdenServ'), 
    '28906')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_NRO ORDEN_frmVentaContadotxtNumeroOrdenServ'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/td_05568965'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/input_QUIN RECIBE_frmNewEnviotxtConsignado'), 
    'Pedro Perez')

WebUI.setText(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/input_TELF_frmNewEnvioconsignadoDni'), 
    '07777777')

WebUI.setText(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/input_TELF_frmNewEnvioconsignadoTelf'), 
    '999666333')

WebUI.click(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/input_Destino_frmNewEnviodestino'))

WebUI.click(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/body_btnInit  function() PrimeFaces.ab(sfrm_3ee89d'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_DESTINO_frmUbigeoDestinofltDestino'), 
    'lima')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_DESTINO_frmUbigeoDestinofltDestino'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Olva Corp/despacho/Page_Principal - Olva Courier/td_LIMA - LIMA - LIMA'))

WebUI.click(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/span_Seleccionar_destino - digitacion'))

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley (text)'), 
    'av javier prado e, san borja')

WebUI.click(findTestObject('Inicio/Page_Principal - Olva Courier/button_Avenida Javier Prado E, San Borja'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inicio/Page_Principal - Olva Courier/button_Avenida Javier Prado E, San Borja'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_Mz, Lote o Referencia2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_Mz, Lote o Referencia2'), 
    'cerca estacion de metropolitano')

WebUI.click(findTestObject('Negativo/Page_Olva Courier  Datos Personales/button_direccion_1'))

WebUI.click(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/input_SERVICIOS_frmNewEnvioservicio_input'))

WebUI.click(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/tr_SERVICIOSbtnCodeService  function() Prim_d41b54'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/input_SERVICIOS_frmNewEnvioservicio_input'), 
    'reg')

WebUI.click(findTestObject('Object Repository/Olva Corp/despacho/Page_Principal - Olva Courier/span_REG'))

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

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_P. CONSIGNADO_ui-button-icon-left ui-i_91eb9f'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/textarea_OBSERVACIN_frmNewEnvioobservacion'), 
    'Caja Blanca')

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/input_NRO PIEZAS_frmNewEnvionumeroPiezas'), 
    '2')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Grabar'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Salir'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Imprimir Tracking Termico'))

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

WebUI.callTestCase(findTestCase('Registro de Envio/Inicio de Registro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/img_Qu deseas realizar hoy_img_paquete (2)'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark (4)'))

WebUI.scrollToElement(findTestObject('Object Repository/button_CONTINUAR (9)'), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (9)'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (2)'))

WebUI.click(findTestObject('Object Repository/span_DNI (Boleta) (1)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (1)'), '71735786')

WebUI.setText(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (4)'), 'RIOS')

WebUI.click(findTestObject('Object Repository/button_Validar (4)'))

WebUI.scrollToElement(findTestObject('Object Repository/span_Seleccionar artculo (1)'), 0)

WebUI.click(findTestObject('Object Repository/span_Seleccionar artculo (1)'))

WebUI.click(findTestObject('Object Repository/span_ACCESORIOS Y EQUIPOS ELECTRONICOS (1)'))

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_articulo (2)'), 'PRUEBAS')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_valor (2)'), '450')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_largo (2)'), '14')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_ancho (2)'), '10')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_altura (2)'), '10')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_peso (2)'), '2')

WebUI.click(findTestObject('Object Repository/button_Tipo De Documento (3)'))

WebUI.click(findTestObject('Object Repository/a_DNI (4)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (3)'), '71735786')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (3)'), '987456321')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (3)'), 'PRUEBAS 01')

WebUI.scrollToElement(findTestObject('Object Repository/button_CONTINUAR (10)'), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (10)'))

WebUI.click(findTestObject('Object Repository/button_Tipo de entrega (2)'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda (3)'))

WebUI.click(findTestObject('Object Repository/span_Departamento -Provincia - Distrito (1)'))

WebUI.click(findTestObject('Object Repository/span_AMAZONAS - CONDORCANQUI - SANTA MARIA _e875ce (1)'))

WebUI.click(findTestObject('Object Repository/span_Tienda (2)'))

WebUI.click(findTestObject('Object Repository/span_SANTA MARIA DE NIEVA - SANTA MARIA DE _128a7d (1)'))

WebUI.setText(findTestObject('Object Repository/input_SANTA MARIA DE NIEVA - SANTA MARIA DE_50fc39 (1)'), '1111')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (10)'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 48.40'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Olva Corp/Page_Olva Courier  Medios de pago/i_Pago en nuestras oficinas'), FailureHandling.CONTINUE_ON_FAILURE)

//WebUI.click(findTestObject('Olva Corp/Page_Olva Courier  Medios de pago/i_Pago agencias y banca'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Registro de Envio/Page_Olva Courier  Datos Personales/body_REGISTRO DE ENVOS_confirmacion'), 
    'Se envió un correo con los detalles de su registro.')

WebUI.verifyElementNotPresent(findTestObject('button_Participar'), 0)

WebUI.verifyElementNotPresent(findTestObject('button_Participar2'), 0)


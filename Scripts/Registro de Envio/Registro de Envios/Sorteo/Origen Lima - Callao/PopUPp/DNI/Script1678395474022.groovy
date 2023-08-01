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

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (1)'), '72097202')

WebUI.setText(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (4)'), 'llaja')

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

WebUI.scrollToElement(findTestObject('Object Repository/button_IR A PAGAR S 48.40'), 0)

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 48.40'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/div_Pago con tarjeta de crdito, dbito y Yape'))

WebUI.scrollToElement(findTestObject('Object Repository/button_PAGAR (3)'), 0)

WebUI.click(findTestObject('Object Repository/button_PAGAR (3)'))

WebUI.click(findTestObject('Object Repository/label'))

WebUI.scrollToElement(findTestObject('Object Repository/button_He ledo y acepto los_start-js-btn mo_acbcf3 (1)'), 0)

WebUI.click(findTestObject('Object Repository/button_He ledo y acepto los_start-js-btn mo_acbcf3 (1)'))

WebUI.click(findTestObject('Object Repository/i'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/span_Tarjeta de crdito y dbito'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/button_Continuar (11)'), 0)

WebUI.click(findTestObject('Object Repository/button_Continuar (11)'))

WebUI.click(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), '4474')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('1183'))

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('5563'))

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('2240'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), '12')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), Keys.chord('26'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_cvc'), '111')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_name'), 'Aquiles')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_lastname'), 'Castro')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_email'), 'correo@email.com')

WebUI.click(findTestObject('Object Repository/button_Pagar S 48.40'))

WebUI.verifyElementClickable(findTestObject('button_Participar'))

WebUI.click(findTestObject('button_Participar'))


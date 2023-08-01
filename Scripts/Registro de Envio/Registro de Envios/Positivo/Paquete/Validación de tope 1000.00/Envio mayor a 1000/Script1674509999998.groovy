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

WebUI.navigateToUrl('https://registro.olvacourier.com/registrar_envios_test/')

WebUI.click(findTestObject('Object Repository/button_Cerrar (2)'))

WebUI.click(findTestObject('Object Repository/img_Qu deseas realizar hoy_img_paquete'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark (2)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (4)'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/a_DNI (2)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_documento_cliente (2)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (2)'), 'rios')

WebUI.click(findTestObject('Object Repository/button_Validar (2)'))

WebUI.click(findTestObject('Object Repository/span_'))

WebUI.click(findTestObject('Object Repository/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/span_ACCESORIOS Y EQUIPOS  ELECTRONICOS'))

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_articulo'), 'LAPTOP')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_largo'), '14')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_ancho'), '10')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_altura'), '10')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_peso'), '1')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_valor'), '1000')

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega_caret'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda (1)'))

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_valor'), '1001')

WebUI.verifyElementText(findTestObject('Object Repository/div_Tracking Web_sweet-overlay'), '')

WebUI.verifyElementPresent(findTestObject('Object Repository/div_Entrega a domicilioTipo de entregaRecoj_9e05a3'), 0)

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_valor'), '1000')

WebUI.click(findTestObject('Object Repository/button_Entrega a domicilio'))

WebUI.verifyElementPresent(findTestObject('Object Repository/a_Recojo en tienda (1)'), 0)

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda (1)'))

WebUI.click(findTestObject('Object Repository/span_Provincia - Departamento - Distrito (1)'))

WebUI.click(findTestObject('Object Repository/span_AMAZONAS - CONDORCANQUI - SANTA MARIA _e875ce'))

WebUI.click(findTestObject('Object Repository/span_Tienda'))

WebUI.click(findTestObject('Object Repository/span_SANTA MARIA DE NIEVA - SANTA MARIA DE _128a7d'))

WebUI.setText(findTestObject('Object Repository/input_SANTA MARIA DE NIEVA - SANTA MARIA DE_50fc39'), '0000')

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/a_RUC'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (1)'), '10717357855')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (1)'), '957378086')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (1)'), 'PRUEBAS001')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (5)'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 43.13'))

WebUI.click(findTestObject('Object Repository/div_Pago en agencias y banca por internet'))

WebUI.click(findTestObject('Object Repository/button_PAGAR (1)'))

WebUI.click(findTestObject('Object Repository/label_He ledo la                           _55438f'))

WebUI.click(findTestObject('Object Repository/label_Declaro bajo juramento los productos _f4619d'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (6)'))

WebUI.click(findTestObject('Object Repository/button_PAGAR (1)'))


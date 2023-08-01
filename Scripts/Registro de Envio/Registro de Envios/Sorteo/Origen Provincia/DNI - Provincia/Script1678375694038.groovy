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

WebUI.click(findTestObject('Object Repository/img_Envo de cajas o paquetescon un peso mxi_37770f (3)'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark (6)'))

WebUI.scrollToElement(findTestObject('Object Repository/button_CONTINUAR (14)'), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (14)'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (4)'))

WebUI.click(findTestObject('Object Repository/a_DNI (Boleta)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (3)'), '72097208')

WebUI.click(findTestObject('Object Repository/span_ (1)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (3)'), '72097202')

WebUI.setText(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (5)'), 'llaja')

WebUI.sendKeys(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (5)'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Object Repository/button_PROVINCIA (2)'), 0)

WebUI.click(findTestObject('Object Repository/button_PROVINCIA (2)'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (2)'))

WebUI.click(findTestObject('Object Repository/span_ICA - ICA - ICA'))

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/span_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/span_Departamento -Provincia - Distrito (2)'))

WebUI.click(findTestObject('Object Repository/a_CALLAO - CALLAO - CALLAO'))

WebUI.click(findTestObject('Object Repository/span_Tienda (3)'))

WebUI.click(findTestObject('Object Repository/span_AGENTE OLVA CALLAO  J  G GIFT STORE - _2ec0e6'))

WebUI.setText(findTestObject('Object Repository/input_OLVA ALMACEN - AV. ARGENTINA 4458 - C_1e1a8d'), '1111')

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (4)'))

WebUI.click(findTestObject('Object Repository/a_DNI (6)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (5)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (5)'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (5)'), 'PRIEBAS')

WebUI.scrollToElement(findTestObject('Object Repository/button_CONTINUAR (15)'), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (15)'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 15.00'))

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

WebUI.verifyElementNotPresent(findTestObject('button_Participar'), 0)

WebUI.verifyElementNotPresent(findTestObject('button_Participar2'), 0)


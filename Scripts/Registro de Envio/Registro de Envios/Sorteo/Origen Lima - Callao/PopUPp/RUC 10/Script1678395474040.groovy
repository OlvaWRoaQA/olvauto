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

WebUI.click(findTestObject('Object Repository/img_Envo de cajas o paquetescon un peso mxi_37770f (2)'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark (5)'))

WebUI.scrollToElement(findTestObject('Object Repository/button_CONTINUAR (12)'), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (12)'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (3)'))

WebUI.click(findTestObject('Object Repository/span_RUC (Factura)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (2)'), '10717357855')

WebUI.scrollToElement(findTestObject('Object Repository/span_Tipo de entrega_caret (1)'), 0)

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega_caret (1)'))

WebUI.click(findTestObject('Object Repository/span_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (1)'))

WebUI.click(findTestObject('Object Repository/span_ANCASH - CARHUAZ - CARHUAZ'))

WebUI.setText(findTestObject('Object Repository/input_UCAYALI - PURUS - PURUS_txt_direccion_99fa8f'), 'PRUEBAS')

WebUI.setText(findTestObject('Object Repository/input_UCAYALI - PURUS - PURUS_txt_direccion_114a42'), 'PRUEBAS')

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (3)'))

WebUI.click(findTestObject('Object Repository/a_DNI (4)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (4)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (4)'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (4)'), 'PRUEBAS01')

WebUI.scrollToElement(findTestObject('Object Repository/button_CONTINUAR (13)'), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (13)'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 14.42'))

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


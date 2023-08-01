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

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Enviar un Sobre'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowTitle('Olva Courier | Datos Personales')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Datos Personales/span_RUC'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '10066810581')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '900000001')

WebUI.click(findTestObject('Object Repository/button_LIMA'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (2)'))

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text)'), 
    'ica - ica - ica')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_ICA - ICA - ICA'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_ICA CA GUATEMALA URB SAN FRAN'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_clave_recojo_tienda'), 
    '0000')

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Registro de Envio/Page_Olva Courier  Datos Personales/span_retorno de cargo'))

WebUI.click(findTestObject('Registro de Envio/Page_Olva Courier  Datos Personales/span_retorno de cargo - SI'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_DNI (2)'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_documento_receptor'), '07000001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '900000002')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 'RECEPTOR DE PRUEBA QA 001')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Olva Corp/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'), 1200)

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Confirma tus datos/button_CAMBIAR'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_domiclio o tienda - carga adjunto'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (2)'))

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text) - CA'), 
    'ica - ica - ica')

WebUI.sendKeys(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Provincia - Departamento - Distrito (text) - CA'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_ICA CA GUATEMALA URB SAN FRAN'))

WebUI.click(findTestObject('Olva Corp/Page_Olva Courier  Confirma tus datos/button_ACEPTAR_CA'))

WebUI.click(findTestObject('Olva Corp/Page_Olva Courier  Medios de pago/i_Pago con tarjeta de crdito y dbito'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Registro de Envio/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Confirma tus datos/button_PAGA AQUI'), 
    0)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/span_He ledo y acepto los_terminos y privacidad pago'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Confirma tus datos/button_PAGA AQUI'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/span_Tarjeta de crdito y dbito'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/button_Continuar'))

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

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_email'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Aprobado y completado con exito'), 
    'Aprobado y completado con exito')


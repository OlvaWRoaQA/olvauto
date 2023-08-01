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

WebUI.openBrowser('https://registro.olvacourier.com/registrar_envios_geo_beta/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/button_Cerrar'))

WebUI.callTestCase(findTestCase('Registro de Envio - girley.MAD/Enviar un Paquete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowTitle('Olva Courier | Datos Personales')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '002699003')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '900000001')

WebUI.click(findTestObject('Object Repository/button_PROVINCIA'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito'))

WebUI.click(findTestObject('Object Repository/span_AREQUIPA - AREQUIPA - AREQUIPA'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELEC'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'Impresora QA 001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_valor'), '400')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_paquete_largo'), '14')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_ancho'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_peso'), 
    '1.5')

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley'))

WebUI.setText(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley (text)'), 
    'lima - lima - ate')

WebUI.sendKeys(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley (text)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/input_Direccin de Entrega_address'), 
    'Calle C 185, Breña, Perú')

WebUI.click(findTestObject('Negativo/Page_Olva Courier  Datos Personales/button_direccion_1'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/input_Mz, Lote o Referencia_reference'), 
    0)

WebUI.setText(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/input_Mz, Lote o Referencia_reference'), 
    'cerca estacion de metropolitano')

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Datos Personales/button_Guardar Direccin'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_DNI (2)'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_documento_receptor'), '07000001')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '900000002')

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 'RECEPTOR DE PRUEBA QA 001')

WebUI.scrollToElement(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR'))

WebUI.click(findTestObject('Olva Corp/Page_Olva Courier  Medios de pago/i_Pago con tarjeta de crdito y dbito'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Registro de Envio/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Confirma tus datos/button_PAGA AQUI'), 
    0)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/span_He ledo y acepto los_terminos y privacidad pago'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Confirma tus datos/button_PAGA AQUI'))

WebUI.click(findTestObject('Page_Olva Courier  Medios de pago/span_Tarjeta de crdito y dbito 2'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/button_Continuar'))

//WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/span_Tarjeta de crdito y dbito'),  FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/Page_Olva Courier  Medios de pago/button_Continuar'))
WebUI.click(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), '4041')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('6504'))

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('4443'))

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('7904'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), '12')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), Keys.chord('26'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_cvc'), '111')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_name'), 'Aquiles')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_lastname'), 'Castro')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_email'), 'correo@email.com')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_email'), Keys.chord(Keys.ENTER))

WebUI.verifyElementText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/span_Operacion denegada'), 'Lo sentimos, no se realizó el pago debido a:')


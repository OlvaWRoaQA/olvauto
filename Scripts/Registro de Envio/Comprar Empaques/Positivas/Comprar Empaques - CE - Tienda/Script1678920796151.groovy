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
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern

WebUI.callTestCase(findTestCase('Registro de Envio/Inicio de Registro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/img_Envo de documentoscon un peso mximo de__8aba39'))

WebUI.click(findTestObject('Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_Cerrar_2'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/span_He ledo y acepto los_checkmark'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '002699003')

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '900000001')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Hola,'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToPosition(0, 400)

//WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1'))
WebUI.click(findTestObject('EMPAQUE 1'))

WebUI.click(findTestObject('EMPAQUE 2'))

WebUI.click(findTestObject('EMPAQUE 3'))

WebUI.scrollToElement(findTestObject('EMPAQUE 4'), 0)

WebUI.click(findTestObject('EMPAQUE 4'))

WebUI.click(findTestObject('EMPAQUE 5'))

WebUI.click(findTestObject('EMPAQUE 6'))

WebUI.scrollToElement(findTestObject('Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'), 0)

WebUI.click(findTestObject('Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Departamento -Provincia - Distrito'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_Departamento -Provincia - Distrito_fo_3f727f'), 
    'santiago de surco')

WebUI.sendKeys(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_Departamento -Provincia - Distrito_fo_3f727f'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_AGENTE OLVA SURCO BODEGA LA CESERA - S_04e838'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_OLVA SURCO - AV. EL POLO 108 - SANTIA_b82c80'), 
    '0000')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2_3'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Pago con tarjeta de crdito, dbito y Yape'))

WebUI.scrollToElement(findTestObject('Comprar Empaques/Page_Olva Courier  Datos Personales/button_He ledo y acepto los_start-js-btn mo_acbcf3'), 
    0)

WebUI.click(findTestObject('Comprar Empaques/Page_Olva Courier  Datos Personales/button_He ledo y acepto los_start-js-btn mo_acbcf3'))

WebUI.click(findTestObject('Registro de Envio/Page_Olva Courier  Confirma tus datos/button_PAGA AQUI'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/Tarjeta de crédito y débito_i'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Continuar (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Continuar (1)'))

WebUI.click(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), '5160')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('0300'))

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('0000'))

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_number'), Keys.chord('0317'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), '12')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), Keys.chord('23'))

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_cvc'), '111')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_name'), 'Aquiles')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_lastname'), 'Castro')

WebUI.setText(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_email'), 'correo@email.com')

WebUI.sendKeys(findTestObject('Page_Olva Courier  Medios de pago/input_compras por internet_email'), Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Comprar Empaques/Page_Olva Courier  Resultado/button_23 - 00005177'), 0)

nro_tracking1 = WebUI.getText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Resultado/button_23 - 00005177'))

String nro_tracking2 = nro_tracking1

Pattern p = Pattern.compile('23 =([^;]+)')

Matcher m = p.matcher(nro_tracking2)

while (m.find()) {
    def splitted = m.group().split('-')

    System.out.println(splitted[1])
}


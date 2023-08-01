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

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/img_Envo de documentoscon un peso mximo de__8aba39'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_Cerrar_2'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/span_He ledo y acepto los_checkmark'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Debe seleccionar un tipo de documento'), 
    'Debe seleccionar un tipo de documento')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Debe Ingresar un Nmero Documento'), 
    'Debe Ingresar un Número Documento')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Ingrese 9 digitos'), 
    'Ingrese 9 digitos')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Ingrese nmero de celular'), 
    'Ingrese número de celular')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Ingrese formato correo electrnico'), 
    'Ingrese formato correo electrónico')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '1234567')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_El DNI debe tener 8 dgitos'), 
    'El DNI debe tener 8 dígitos')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_DNI'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_RUC'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '2000000000')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_El RUC debe tener 11 dgitos'), 
    'El RUC debe tener 11 dígitos')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_RUC_caret'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '12345678')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_El CE debe tener 9 dgitos'), 
    'El CE debe tener 9 dígitos')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_RUC'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '10066810581')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_PROVINCIA'))

WebUI.click(findTestObject('button_Aceptar - provincia'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'))

WebUI.verifyTextPresent('Debe seleccionar mínimo 3 cajas para la entrega en tienda o 10 para envío a domicilio', false)

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Object Repository/EMPAQUE 4'), 0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Object Repository/EMPAQUE 4'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Object Repository/EMPAQUE 4'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Object Repository/EMPAQUE 4'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_empaque'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/a_Eliminar'))

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_La cantidad mnima es 1'), 
    'No puede tener menos de 3 cajas en total')

WebUI.click(findTestObject('Object Repository/button_Aceptar - mensaje'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_CONTINUAR_1_2_3'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Debe Selecionar Provincia'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Debe Seleccionar Tienda'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/div_Debe escribir 4 nmeros'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Recojo en tienda_caret'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/span_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/button_No'))

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

Total_venta1 = WebUI.getText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/td_S 14.93'))

WebUI.scrollToElement(findTestObject('Comprar Empaques/Page_Olva Courier  Datos Personales/button_He ledo y acepto los_start-js-btn mo_acbcf3'), 
    0)

WebUI.click(findTestObject('Comprar Empaques/Page_Olva Courier  Datos Personales/button_He ledo y acepto los_start-js-btn mo_acbcf3'))

WebUI.click(findTestObject('Registro de Envio/Page_Olva Courier  Confirma tus datos/button_PAGA AQUI'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/Tarjeta de crédito y débito_i'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Continuar (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Datos Personales/button_Continuar (1)'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), '4024')

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), 
    Keys.chord('0071'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), 
    Keys.chord('2691'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), 
    Keys.chord('9058'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), '12')

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_expiry'), 
    Keys.chord('23'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_cvc'), '111')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_name'), 'Aquiles')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_lastname'), 
    'Castro')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_email'), 'correo@email.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_email'), Keys.chord(
        Keys.ENTER))

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Resultado/strong_COMPRA RECHAZADA'), 
    '¡COMPRA RECHAZADA!')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Resultado/h4_Lo sentimos, no se pudo realizar el pago'), 
    'Lo sentimos, no se pudo realizar el pago.')


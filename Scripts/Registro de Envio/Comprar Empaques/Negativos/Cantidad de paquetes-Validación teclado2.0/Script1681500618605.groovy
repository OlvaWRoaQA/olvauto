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

WebUI.callTestCase(findTestCase('Registro de Envio/Comprar Empaques/Inicio venta de cajas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_Cerrar_1'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/img_Envo de documentoscon un peso mximo de__8aba39'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_Cerrar_2'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/span_He ledo y acepto los_checkmark'))

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (7)'))

WebUI.click(findTestObject('Object Repository/a_RUC (Factura)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (6)'), '10717357855')

WebUI.scrollToElement(findTestObject('Object Repository/button_CONTINUAR (21)'), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (21)'))

WebUI.scrollToPosition(0, 400)

WebUI.click(findTestObject('Object Repository/button_ (2)'))

WebUI.click(findTestObject('Object Repository/button_ (2)'))

WebUI.click(findTestObject('Object Repository/button_ (2)'))

WebUI.click(findTestObject('Object Repository/button_ (2)'))

WebUI.click(findTestObject('Object Repository/button_ (2)'))

WebUI.click(findTestObject('Object Repository/input_-_cantidad960 (1)'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad960 (1)'), '100')

WebUI.setText(findTestObject('Object Repository/input_-_cantidad855 (1)'), '50')

WebUI.setText(findTestObject('Object Repository/input_-_cantidad857 (1)'), '50')

WebUI.click(findTestObject('Object Repository/div_Caja N 5                               _2f9a6c'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad858 (1)'), '100')

WebUI.setText(findTestObject('Object Repository/input_-_cantidad856 (1)'), '95')

WebUI.click(findTestObject('Object Repository/form_Seleccione su pedido                  _c4b03e'))

WebUI.click(findTestObject('Object Repository/button_ (2)'))

WebUI.click(findTestObject('Object Repository/form_Seleccione su pedido                  _c4b03e'))

WebUI.click(findTestObject('Object Repository/input_-_cantidad856 (1)'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad856 (1)'), '195')

WebUI.click(findTestObject('Object Repository/body_REGISTRO DE COMPRA DE EMPAQUES        _959f9d (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/div_La cantidad mxima de compra es de 500 empaques (1)'), 'La cantidad máxima de compra es de 500 empaques')

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (6)'))

WebUI.click(findTestObject('Object Repository/input_-_cantidad962'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad962'), '0')

WebUI.verifyElementText(findTestObject('Object Repository/div_La cantidad mnima por empaque es 1 (1)'), 'La cantidad mínima por empaque es 1')

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (6)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1 (2)'))

WebUI.click(findTestObject('Object Repository/button__1 (1)'))

WebUI.click(findTestObject('Object Repository/button__1 (1)'))

WebUI.click(findTestObject('Object Repository/button__1 (1)'))

WebUI.click(findTestObject('Object Repository/button__1 (1)'))

WebUI.click(findTestObject('Object Repository/button__1 (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_-_input_962'))

WebUI.setText(findTestObject('Object Repository/input_-_input_960'), '5')

WebUI.sendKeys(findTestObject('Object Repository/input_-_input_960'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/input_-_input_855'), '1')

WebUI.click(findTestObject('Object Repository/div_Tipo de empaqueMedidasPrecio unitarioPr_decb39'))

WebUI.click(findTestObject('Object Repository/input_-_input_857'))

WebUI.sendKeys(findTestObject('Object Repository/input_-_input_857'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/input_-_input_855'), '1')

WebUI.setText(findTestObject('Object Repository/input_-_input_857'), '0')

WebUI.click(findTestObject('Object Repository/body_REGISTRO DE COMPRA DE EMPAQUES        _959f9d_1'))

WebUI.verifyElementText(findTestObject('Object Repository/div_La cantidad mnima por empaque es 1 (1)'), 'La cantidad mínima por empaque es 1')

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (6)'))

WebUI.setText(findTestObject('Object Repository/input_-_input_858'), '1')

WebUI.sendKeys(findTestObject('Object Repository/input_-_input_858'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/input_-_input_856'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1_2 (2)'))

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega (2)'))

WebUI.click(findTestObject('Object Repository/span_Entrega a domicilio (2)'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (5)'))

WebUI.click(findTestObject('Object Repository/span_CALLAO - CALLAO - CALLAO (1)'))

WebUI.setText(findTestObject('Object Repository/input_No se encuentra tu direccin_address'), 'avenida 28 de julio')

WebUI.click(findTestObject('Object Repository/button_Avenida 28 de Julio, Lima, Per'))

WebUI.setText(findTestObject('Object Repository/input_Referencia_reference'), 'pruebas')

WebUI.click(findTestObject('Object Repository/button_Guardar Direccin'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1_2_3 (2)'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/i_Elige tu medio de pago_fa fa-circle-o (2)'))

WebUI.click(findTestObject('Object Repository/label (3)'))

WebUI.click(findTestObject('Object Repository/button_con el pago debe aceptar los trminos_86fdda (1)'))

WebUI.click(findTestObject('Object Repository/i'))

WebUI.scrollToElement(findTestObject('Object Repository/button_Continuar'), 0)

WebUI.click(findTestObject('Object Repository/button_Continuar'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), '5160')

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), 
    Keys.chord('0300'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), 
    Keys.chord('0000'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/input_compras por internet_number'), 
    Keys.chord('0317'))

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

WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Resultado/button_23 - 00005177'), 
    0)


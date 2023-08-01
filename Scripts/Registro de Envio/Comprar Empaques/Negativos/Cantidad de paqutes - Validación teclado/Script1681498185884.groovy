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

WebUI.click(findTestObject('Object Repository/img_Envo de documentoscon un peso mximo de__8aba39 (1)'))

WebUI.click(findTestObject('Object Repository/button_Cerrar (8)'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark (8)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (18)'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (6)'))

WebUI.click(findTestObject('Object Repository/a_DNI (Boleta) (1)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (5)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (7)'), 'rios')

WebUI.click(findTestObject('Object Repository/button_Validar (5)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (19)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.doubleClick(findTestObject('Object Repository/input_-_cantidad960'))

WebUI.click(findTestObject('Object Repository/input_-_cantidad960'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad960'), '100')

WebUI.click(findTestObject('Object Repository/div_Caja N 2                               _cb8751'))

WebUI.doubleClick(findTestObject('Object Repository/input_-_cantidad855'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad855'), '200')

WebUI.setText(findTestObject('Object Repository/input_-_cantidad857'), '0')

WebUI.click(findTestObject('Object Repository/div_Sobre Burbupack                        _b9ea92'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad857'), '0')

WebUI.verifyElementText(findTestObject('Object Repository/div_La cantidad mnima por empaque es 1'), 'La cantidad mínima por empaque es 1')

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (5)'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad858'), '200')

WebUI.click(findTestObject('Object Repository/body_REGISTRO DE COMPRA DE EMPAQUES        _959f9d'))

WebUI.verifyElementText(findTestObject('Object Repository/div_La cantidad mxima de compra es de 500 empaques'), 'La cantidad máxima de compra es de 500 empaques')

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (5)'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/div_La cantidad mxima de compra es de 500 empaques'), 'La cantidad máxima de compra es de 500 empaques')

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (5)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1 (1)'))

WebUI.click(findTestObject('Object Repository/a_Eliminar'))

WebUI.click(findTestObject('Object Repository/button__1'))

WebUI.click(findTestObject('Object Repository/button__1'))

WebUI.verifyElementText(findTestObject('Object Repository/div_La cantidad mxima de compra es de 500 empaques'), 'La cantidad máxima de compra es de 500 empaques')

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (5)'))

WebUI.click(findTestObject('Object Repository/a_AGREGAR EMPAQUES'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad856'), '0')

WebUI.click(findTestObject('Object Repository/body_REGISTRO DE COMPRA DE EMPAQUES        _959f9d'))

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (5)'))

WebUI.click(findTestObject('Object Repository/button_-'))

WebUI.click(findTestObject('Object Repository/button_-'))

WebUI.click(findTestObject('Object Repository/button_-'))

WebUI.click(findTestObject('Object Repository/button_-'))

WebUI.click(findTestObject('Object Repository/button_-'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad856'), '5')

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/div_Caja N 6                               _95c82a'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.click(findTestObject('Object Repository/div_Sobre Burbupack                        _b9ea92'))

WebUI.click(findTestObject('Object Repository/button_ (1)'))

WebUI.setText(findTestObject('Object Repository/input_-_cantidad857'), '1')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1 (1)'))

WebUI.click(findTestObject('Object Repository/button__1_2'))

WebUI.click(findTestObject('Object Repository/button__1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/div_La cantidad mxima de compra es de 500 empaques'), 'La cantidad máxima de compra es de 500 empaques')

WebUI.click(findTestObject('Object Repository/button_ACEPTAR (5)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1_2 (1)'))

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega (1)'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda (4)'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (4)'))

WebUI.click(findTestObject('Object Repository/span_CALLAO - CALLAO - CALLAO'))

WebUI.click(findTestObject('Object Repository/span_Tienda (4)'))

WebUI.click(findTestObject('Object Repository/span_OLVA ALMACEN - AV. ARGENTINA 4458 - CA_913efa'))

WebUI.setText(findTestObject('Object Repository/input_OLVA VENTANILLA - CALLAO - CA OFICINA_b19c87'), '1111')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1_2_3 (1)'))

WebUI.click(findTestObject('Object Repository/div_Pago con tarjeta de crdito, dbito y Yape (1)'))

WebUI.click(findTestObject('Object Repository/label (2)'))

WebUI.click(findTestObject('Object Repository/button_con el pago debe aceptar los trminos_86fdda'))


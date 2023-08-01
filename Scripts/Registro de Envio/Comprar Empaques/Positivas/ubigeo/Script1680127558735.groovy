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

WebUI.click(findTestObject('Object Repository/img_Envo de documentoscon un peso mximo de__8aba39'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark (7)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (16)'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (5)'))

WebUI.click(findTestObject('Object Repository/span_DNI (Boleta) (2)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (4)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (6)'), 'rios')

WebUI.sendKeys(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (6)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (17)'))

WebUI.click(findTestObject('Object Repository/button_'))

WebUI.click(findTestObject('Object Repository/button_'))

WebUI.doubleClick(findTestObject('Object Repository/button_'))

WebUI.doubleClick(findTestObject('Object Repository/button_'))

WebUI.doubleClick(findTestObject('Object Repository/button_'))

WebUI.doubleClick(findTestObject('Object Repository/button_'))

WebUI.doubleClick(findTestObject('Object Repository/button_'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1_2'))

WebUI.click(findTestObject('Object Repository/button_Tipo de entrega (3)'))

WebUI.click(findTestObject('Object Repository/span_Entrega a domicilio (1)'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (3)'))

WebUI.setText(findTestObject('Object Repository/input_Departamento - Provincia - Distrito_f_f56910'), 'lima - lima')

WebUI.click(findTestObject('Object Repository/span_LIMA - LIMA - SANTIAGO DE SURCO'))

WebUI.setText(findTestObject('Object Repository/input_No se encuentra tu direccin_address'), 'jiron via ')

WebUI.click(findTestObject('Object Repository/button_Jirn Va Lctea Cuadra 2, Santiago de _a8174b'))

WebUI.click(findTestObject('Object Repository/div_Sin cobertura para entregaComo alternat_21e8df'))

WebUI.click(findTestObject('Object Repository/input_No se encuentra tu direccin_address'))

WebUI.click(findTestObject('Object Repository/canvas'))

WebUI.click(findTestObject('Object Repository/canvas'))

WebUI.click(findTestObject('Object Repository/div_Cancelar Guardar Direccin'))

WebUI.setText(findTestObject('Object Repository/input_No se encuentra tu direccin_address'), 'avenida los pro')

WebUI.click(findTestObject('Object Repository/button_Per, Santiago de Surco, Avenida Los _7b1755'))

WebUI.setText(findTestObject('Object Repository/input_Referencia_reference'), 'pruebas')

WebUI.click(findTestObject('Object Repository/button_Guardar Direccin'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR_1_2_3'))

WebUI.click(findTestObject('Object Repository/i_Elige tu medio de pago_fa fa-circle-o (1)'))


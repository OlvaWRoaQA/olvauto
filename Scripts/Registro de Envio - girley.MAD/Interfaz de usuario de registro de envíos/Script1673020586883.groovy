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

WebUI.navigateToUrl('https://registro.olvacourier.com/registrar_envios_mad/nuevo-envio')

WebUI.click(findTestObject('Object Repository/button_Cerrar'))

WebUI.click(findTestObject('Object Repository/img_Envo de cajas o paquetescon un peso mxi_37770f'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/button_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/a_DNI'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_documento_cliente'), '71735786')

WebUI.setText(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76'), 'rios')

WebUI.click(findTestObject('Object Repository/button_Validar'))

WebUI.click(findTestObject('Object Repository/button_PROVINCIA'))

WebUI.click(findTestObject('Object Repository/button_LIMA'))

WebUI.click(findTestObject('Object Repository/button_PROVINCIA'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito'))

WebUI.click(findTestObject('Object Repository/span_AREQUIPA - AREQUIPA - AREQUIPA'))

WebUI.click(findTestObject('Object Repository/button_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/span_Provincia - Departamento - Distrito'))

WebUI.click(findTestObject('Object Repository/span_AREQUIPA - AREQUIPA - MIRAFLORES'))

WebUI.click(findTestObject('Object Repository/button_Tienda'))

WebUI.click(findTestObject('Object Repository/span_MIRAFLORES - AV. PROGRESO 631 - MIRAFL_fda3fa'))

WebUI.setText(findTestObject('Object Repository/input_MIRAFLORES - AV. MANUEL MUOZ NAJAR 41_6bcbfe'), '1111')

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/a_DNI'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres'), 'JENNIFER RIOS')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (1)'))


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

WebUI.navigateToUrl('https://registro.olvacourier.com/registrar_envios_excel_dev/')

WebUI.click(findTestObject('Object Repository/button_Cerrar (10)'))

WebUI.click(findTestObject('Object Repository/img_Envo de documentoscon un peso mximo de__37b5aa'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark (10)'))

WebUI.scrollToElement(findTestObject(null), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (22)'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (8)'))

WebUI.click(findTestObject('Object Repository/a_DNI (Boleta) (2)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT. (Boleta)_txt_documento_cliente (7)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_El apellido ingresado debe ser igual _544e76 (8)'), 'rios')

WebUI.click(findTestObject('Object Repository/button_Validar (6)'))

WebUI.click(findTestObject('Object Repository/span_ (2)'))

WebUI.click(findTestObject('Object Repository/button_descargar formato'))

WebUI.click(findTestObject('Object Repository/div_Seleccione o arrastre su archivo aqu   _b5ea7a'))

WebUI.click(findTestObject('Object Repository/div_Seleccione o arrastre su archivo aqu   _b5ea7a'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (23)'))


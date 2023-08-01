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

WebUI.callTestCase(findTestCase('IEPLUS/ATC/Inicio de Registro-ATC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (3)'), '120508371901')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password (3)'), '8kIfpnHAK5XGf3XAsZ+fNQ==')

WebUI.click(findTestObject('Object Repository/button_Entrar (7)'))

WebUI.click(findTestObject('Object Repository/a_Programacin de RecojosPrograma tus recojo_6f32de (6)'))

WebUI.click(findTestObject('Object Repository/input_Centro de Costo_search'))

WebUI.click(findTestObject('Object Repository/div_Olva - CA LOS NENUFARES NRO 520 URB VIPOL'))

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-1 (3)'), 'pruebas')

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-99 (3)'), 'prue@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-2 (3)'), '963852741')

WebUI.click(findTestObject('Object Repository/li_09 (1)'))

WebUI.click(findTestObject('Object Repository/li_00 (1)'))

WebUI.click(findTestObject('Object Repository/span_HH091011121314mm0030 (1)'))

WebUI.click(findTestObject('Object Repository/li_14 (1)'))

WebUI.click(findTestObject('Object Repository/li_00 (1)'))

WebUI.click(findTestObject('Object Repository/path (2)'))

WebUI.click(findTestObject('Object Repository/span_17 (1)'))

WebUI.setText(findTestObject('Object Repository/input_Qu dia se har el recojo_input-area-recojo (1)'), 'pruebaas')

WebUI.click(findTestObject('Object Repository/i_Fragil_dropdown icon (1)'))

WebUI.click(findTestObject('Object Repository/div_SOBRE (2)'))

WebUI.click(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__36 (2)'))

WebUI.click(findTestObject('Object Repository/div_SOBRE        SOBRE          PAQUETE    _f3c85e'))

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__36 (2)'), 'docuementos')

WebUI.click(findTestObject('Object Repository/div_SOBRE        SOBRE          PAQUETE    _f3c85e_1'))

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__38 (3)'), '1')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__40'), '20')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (4)'))

WebUI.click(findTestObject('Object Repository/button_OK (6)'))


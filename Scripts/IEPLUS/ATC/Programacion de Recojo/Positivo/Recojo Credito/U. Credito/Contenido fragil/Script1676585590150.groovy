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

WebUI.navigateToUrl('https://dev-pimcore.olvaexpress.pe/atc/user/login')

WebUI.click(findTestObject('Object Repository/input_ZONA CLIENTES__username (2)'))

WebUI.rightClick(findTestObject('Object Repository/input_ZONA CLIENTES__username (2)'))

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (2)'), '120508371901')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password (2)'), '8kIfpnHAK5XGf3XAsZ+fNQ==')

WebUI.click(findTestObject('Object Repository/button_Entrar (6)'))

WebUI.click(findTestObject('Object Repository/a_Programacin de RecojosPrograma tus recojo_6f32de (5)'))

WebUI.click(findTestObject('Object Repository/label_Agregar nueva direccion'))

WebUI.click(findTestObject('Object Repository/i_Agregar Direccin Nueva_dropdown icon'))

WebUI.click(findTestObject('Object Repository/div_CALLAO CALLAO CALLAO'))

WebUI.click(findTestObject('Object Repository/input_Distrito Departamento Provincia_search (1)'))

WebUI.click(findTestObject('Object Repository/div_AVENIDA (2)'))

WebUI.setText(findTestObject('Object Repository/input_QUINTA___BVID__48'), 'argentina')

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__54'), '145')

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__60'), 'pruebas')

WebUI.click(findTestObject('Object Repository/a_Buscar direccin del recojo'))

WebUI.setText(findTestObject('Object Repository/input_Guardar Direccin_input-1'), 'pruebas')

WebUI.setText(findTestObject('Object Repository/input_Guardar Direccin_input-99'), 'prueba@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Guardar Direccin_input-2'), '957378086')

WebUI.click(findTestObject('Object Repository/li_09'))

WebUI.click(findTestObject('Object Repository/li_00'))

WebUI.click(findTestObject('Object Repository/span_HH091011121314mm0030'))

WebUI.click(findTestObject('Object Repository/li_14'))

WebUI.click(findTestObject('Object Repository/li_00'))

WebUI.click(findTestObject('Object Repository/path (1)'))

WebUI.click(findTestObject('Object Repository/span_17'))

WebUI.click(findTestObject('Object Repository/label_Guardar direccin como favorita'))

WebUI.click(findTestObject('Object Repository/label_Contenido Fragil'))

WebUI.setText(findTestObject('Object Repository/input_Qu dia se har el recojo_input-area-recojo'), 'caseta')

WebUI.click(findTestObject('Object Repository/i_Fragil_dropdown icon'))

WebUI.click(findTestObject('Object Repository/div_SOBRE (1)'))

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__36 (1)'), 'documentos')

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__38 (1)'), '5')

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__40'), '50')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (3)'))

WebUI.click(findTestObject('Object Repository/button_OK (5)'))


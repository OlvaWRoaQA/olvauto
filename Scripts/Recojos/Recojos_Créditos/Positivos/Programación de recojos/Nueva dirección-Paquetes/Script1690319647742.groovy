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

WebUI.callTestCase(findTestCase('Recojos/Recojos_Créditos/Login-ClienteCrédito'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/small_Servicios (2)'))

WebUI.click(findTestObject('Object Repository/small_panorama_fish_eyeProgramacin de Recojos (1)'))

WebUI.click(findTestObject('Object Repository/label_Agregar nueva direccion (2)'))

WebUI.click(findTestObject('Object Repository/i_Agregar Direccin Nueva_dropdown icon (1)'))

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_search (1)'), 'san bor')

WebUI.sendKeys(findTestObject('Object Repository/input_Agregar Direccin Nueva_search (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/i_Distrito Departamento Provincia_dropdown icon (3)'))

WebUI.click(findTestObject('Object Repository/div_AVENIDA (4)'))

WebUI.setText(findTestObject('Object Repository/input_QUINTA___BVID__48 (1)'), 'Arqueología')

WebUI.click(findTestObject('Object Repository/i_QUINTA_dropdown icon (1)'))

WebUI.click(findTestObject('Object Repository/div_CASERIO (1)'))

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__52'), 'torres de san borja')

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__54 (1)'), '122')

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__56'), 'h')

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__58 (4)'), '7')

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__60 (2)'), 'frente al banco de la nacipon')

WebUI.click(findTestObject('Object Repository/a_Buscar direccin del recojo (2)'))

WebUI.setText(findTestObject('Object Repository/input_Guardar Direccin_input-1 (2)'), 'Gabriel')

WebUI.setText(findTestObject('Object Repository/input_Guardar Direccin_input-99 (2)'), 'Gabofronto@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Guardar Direccin_input-2 (2)'), '987654321')

WebUI.click(findTestObject('Object Repository/span_HH091011121314mm0030 (3)'))

WebUI.click(findTestObject('Object Repository/li_09 (3)'))

WebUI.click(findTestObject('Object Repository/li_00 (3)'))

WebUI.click(findTestObject('Object Repository/span_HH091011121314mm0030 (3)'))

WebUI.click(findTestObject('Object Repository/li_12 (1)'))

WebUI.click(findTestObject('Object Repository/li_00 (3)'))

WebUI.click(findTestObject('Object Repository/label_Fecha del recojo (3)'))

WebUI.click(findTestObject('Object Repository/span_31'))

WebUI.click(findTestObject('Object Repository/i_Fragil_dropdown icon (3)'))

WebUI.click(findTestObject('Object Repository/div_PAQUETE (5)'))

WebUI.click(findTestObject('Object Repository/input_PAQUETE_input-18 (3)'))

WebUI.click(findTestObject('Object Repository/div_ACCESORIOS Y EQUIPOS ELECTRONICOS (2)'))

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__36 (5)'), 'compu y cpu')

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__66'), '17')

WebUI.setText(findTestObject('Object Repository/input_Mximo 20Kg___BVID__68'), '15')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__70'), '15')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__72 (3)'), '16')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__38 (5)'), '2')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__40 (2)'), '250')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (7)'))

WebUI.verifyElementText(findTestObject('Object Repository/div_Proceso completado'), '¡Proceso completado!')

WebUI.click(findTestObject('Object Repository/button_OK (9)'))


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

WebUI.click(findTestObject('Object Repository/i_arrow_drop_down (5)'))

WebUI.click(findTestObject('Object Repository/small_panorama_fish_eyeProgramacin de Recojos'))

WebUI.click(findTestObject('Object Repository/input_Datos de Recojo - () Campo obligatori_2d3c4a (3)'))

WebUI.click(findTestObject('Object Repository/div_Leaflet   OpenStreetMap,  CARTO'))

WebUI.click(findTestObject('Object Repository/i_Centro de Costo_dropdown icon'))

WebUI.click(findTestObject('Object Repository/div_Olva - AV LOS DOMINICOS NRO 445 URBANIZ_d7c8c0'))

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-1 (4)'), 'Zafiro')

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-99 (4)'), 'Zafitorres@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-2 (4)'), '987654321')

WebUI.click(findTestObject('Object Repository/span_HH091011121314mm0030 (2)'))

WebUI.click(findTestObject('Object Repository/li_09 (2)'))

WebUI.click(findTestObject('Object Repository/li_00 (2)'))

WebUI.click(findTestObject('Object Repository/span_HH091011121314mm0030 (2)'))

WebUI.click(findTestObject('Object Repository/li_12'))

WebUI.click(findTestObject('Object Repository/li_00 (2)'))

WebUI.click(findTestObject('Object Repository/label_Fecha del recojo (2)'))

WebUI.click(findTestObject('Object Repository/span_27 (1)'))

WebUI.click(findTestObject('Object Repository/i_Fragil_dropdown icon (2)'))

WebUI.click(findTestObject('Object Repository/div_SOBRE (3)'))

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__36 (4)'), 'doc')

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__38 (2)'), '2')

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__40 (1)'), '70')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (6)'))

WebUI.click(findTestObject('Object Repository/form_Datos de Recojo - () Campo obligatorio_6a3249'))


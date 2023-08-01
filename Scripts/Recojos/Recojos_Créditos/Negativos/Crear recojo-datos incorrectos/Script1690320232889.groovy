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

WebUI.click(findTestObject('Object Repository/small_Servicios (3)'))

WebUI.click(findTestObject('Object Repository/small_panorama_fish_eyeProgramacin de Recojos (2)'))

WebUI.click(findTestObject('Object Repository/div_Direcciones Guardadas'))

WebUI.click(findTestObject('Object Repository/div_Olva - AV LOS DOMINICOS NRO 445 URBANIZ_d7c8c0 (1)'))

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-1 (5)'), '1234')

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-99 (5)'), 'juana')

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-2 (5)'), '87654321')

WebUI.click(findTestObject('Object Repository/span_HH091011121314mm0030 (4)'))

WebUI.click(findTestObject('Object Repository/li_14 (2)'))

WebUI.click(findTestObject('Object Repository/li_30'))

WebUI.click(findTestObject('Object Repository/span_HH091011121314mm0030 (4)'))

WebUI.click(findTestObject('Object Repository/li_09 (4)'))

WebUI.click(findTestObject('Object Repository/li_00 (4)'))

WebUI.click(findTestObject('Object Repository/label_Fecha del recojo (4)'))

WebUI.click(findTestObject('Object Repository/span_26'))

WebUI.click(findTestObject('Object Repository/input_Qu dia se har el recojo_input-area-recojo (2)'))

WebUI.click(findTestObject('Object Repository/i_Fragil_dropdown icon (4)'))

WebUI.click(findTestObject('Object Repository/div_SOBRE (4)'))

WebUI.click(findTestObject('Object Repository/div_DOCUMENTOS        ACCESORIOS PARA FIEST_e49815 (1)'))

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__36 (6)'), 'asdfgh')

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__38 (3)'), '10000')

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__40 (2)'), '500000000')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (8)'))

WebUI.click(findTestObject('Object Repository/div_Formato 909808707  16113000_time-picker_851608'))

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (8)'))

WebUI.rightClick(findTestObject('Object Repository/span_ (3)'))

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-99 (5)'), 'juana@')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (8)'))

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-99 (5)'), 'juana@gmail.com')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (8)'))

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__38 (3)'), '100')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (8)'))

WebUI.rightClick(findTestObject('Object Repository/div_Proceso completado (1)'))

WebUI.click(findTestObject('Object Repository/div_Proceso completadoSe program correctame_0108ac'))

WebUI.click(findTestObject('Object Repository/button_OK (10)'))


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

WebUI.click(findTestObject('Object Repository/i_arrow_drop_down (8)'))

WebUI.click(findTestObject('Object Repository/small_panorama_fish_eyeSeguimiento de envos (1)'))

WebUI.click(findTestObject('Object Repository/input_Ok_from (8)'))

WebUI.click(findTestObject('Object Repository/svg (4)'))

WebUI.click(findTestObject('Object Repository/svg_1 (3)'))

WebUI.click(findTestObject('Object Repository/button_1 (8)'))

WebUI.setText(findTestObject('Object Repository/input_Ok_from (8)'), '01/05/2023')

WebUI.setText(findTestObject('Object Repository/input_Ok_to (8)'), '')

WebUI.click(findTestObject('Object Repository/input_Ok_to (8)'))

WebUI.click(findTestObject('Object Repository/button_1 (8)'))

WebUI.setText(findTestObject('Object Repository/input_Ok_from (8)'), '01/05/2023')

WebUI.setText(findTestObject('Object Repository/input_Ok_to (8)'), '01/07/2023')

WebUI.click(findTestObject('Object Repository/a_Listar (8)'))

WebUI.setText(findTestObject('Object Repository/input_Buscar_form-control input-sm (5)'), '1959')

WebUI.verifyElementPresent(findTestObject('Object Repository/td_1 - VENTAS DE PRODUCTOS'), 0)

WebUI.setText(findTestObject('Object Repository/input_Buscar_form-control input-sm (5)'), '')

WebUI.click(findTestObject('Object Repository/span_CSV (3)'))

WebUI.click(findTestObject('Object Repository/span_EXCEL (6)'))

WebUI.click(findTestObject('Object Repository/button_PDF'))

WebUI.click(findTestObject('Object Repository/span_Ver Mapa (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/canvas_arrow_drop_down_leaflet-heatmap-laye_a625d8 (1)'), 0)


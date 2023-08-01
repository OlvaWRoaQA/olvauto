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

WebUI.click(findTestObject('Object Repository/i_arrow_drop_down (4)'))

WebUI.click(findTestObject('Object Repository/a_EECC y Facturacin (2)'))

WebUI.click(findTestObject('Object Repository/span_ESTADO DE CUENTA (3)'))

WebUI.click(findTestObject('Object Repository/input_Ok_from (5)'))

WebUI.click(findTestObject('Object Repository/input_Mar, Jul 25_select-dropdown dropdown-trigger (3)'))

WebUI.click(findTestObject('Object Repository/span_Abril (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_EneroFebreroMarzoAbrilMayoJunioJulio_dc5537 (3)'), '3', 
    true)

WebUI.click(findTestObject('Object Repository/button_1 (5)'))

WebUI.setText(findTestObject('Object Repository/input_Ok_from (5)'), '01/04/2023')

WebUI.setText(findTestObject('Object Repository/input_Ok_to (5)'), '')

WebUI.click(findTestObject('Object Repository/label_date_range                            Hasta (1)'))

WebUI.click(findTestObject('Object Repository/input_Mar, Jul 25_select-dropdown dropdown-trigger (3)'))

WebUI.click(findTestObject('Object Repository/span_Junio (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_EneroFebreroMarzoAbrilMayoJunioJulio_dc5537 (3)'), '5', 
    true)

WebUI.click(findTestObject('Object Repository/button_1 (5)'))

WebUI.setText(findTestObject('Object Repository/input_Ok_from (5)'), '01/04/2023')

WebUI.setText(findTestObject('Object Repository/input_Ok_to (5)'), '01/06/2023')

WebUI.click(findTestObject('Object Repository/a_Listar (5)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/td_004-4326917'), 0)

WebUI.click(findTestObject('Object Repository/span_CSV (2)'))

WebUI.click(findTestObject('Object Repository/span_EXCEL (4)'))

WebUI.click(findTestObject('Object Repository/img (3)'))

WebUI.setText(findTestObject('Object Repository/input_Buscar_form-control input-sm (3)'), '6973')

WebUI.sendKeys(findTestObject('Object Repository/input_Buscar_form-control input-sm (3)'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/td_004-4326973'), 0)

WebUI.setText(findTestObject('Object Repository/input_Buscar_form-control input-sm (3)'), '')

WebUI.click(findTestObject('Object Repository/div_Buscar      CSV  EXCEL  PDF  Columnas M_c97487'))


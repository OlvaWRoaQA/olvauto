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

WebUI.click(findTestObject('Object Repository/i_arrow_drop_down (9)'))

WebUI.click(findTestObject('Object Repository/small_EECC y Facturacin'))

WebUI.click(findTestObject('Object Repository/span_ESTADO DE CUENTA (4)'))

WebUI.click(findTestObject('Object Repository/input_Ok_from (9)'))

WebUI.click(findTestObject('Object Repository/button_Mar, Jul 25_month-prev'))

WebUI.click(findTestObject('Object Repository/button_Mar, Jul 25_month-prev'))

WebUI.click(findTestObject('Object Repository/button_1 (9)'))

WebUI.setText(findTestObject('Object Repository/input_Ok_from (9)'), '01/05/2023')

WebUI.setText(findTestObject('Object Repository/input_Ok_to (9)'), '')

WebUI.click(findTestObject('Object Repository/label_date_range                            Hasta (2)'))

WebUI.click(findTestObject('Object Repository/button_1 (9)'))

WebUI.setText(findTestObject('Object Repository/input_Ok_from (9)'), '01/05/2023')

WebUI.setText(findTestObject('Object Repository/input_Ok_to (9)'), '01/07/2023')

WebUI.click(findTestObject('Object Repository/a_Listar (9)'))

WebUI.click(findTestObject('Object Repository/span_CSV (4)'))

WebUI.click(findTestObject('Object Repository/span_EXCEL (7)'))

WebUI.click(findTestObject('Object Repository/span_PDF (6)'))

WebUI.setText(findTestObject('Object Repository/input_Buscar_form-control input-sm (6)'), '3720')

WebUI.sendKeys(findTestObject('Object Repository/input_Buscar_form-control input-sm (6)'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Object Repository/td_004-4333720'), 0)

WebUI.click(findTestObject('Object Repository/div_Buscar      CSV  EXCEL  PDF  Columnas M_85bb3f'))

WebUI.setText(findTestObject('Object Repository/input_Buscar_form-control input-sm (6)'), '')

WebUI.click(findTestObject('Object Repository/span_FACTURACIN (3)'))

WebUI.click(findTestObject('Object Repository/a_Listar (9)'))


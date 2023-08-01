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

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (1)'), '1')

WebUI.click(findTestObject('Object Repository/form_Aqu, podrs programar tus recojos, real_f65ed9'))

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (1)'), '120508371901')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password (1)'), '8kIfpnHAK5XGf3XAsZ+fNQ==')

WebUI.click(findTestObject('Object Repository/button_Entrar (5)'))

WebUI.click(findTestObject('Object Repository/a_Estado de cuenta y FacturacinRevisa tus e_763c09'))

WebUI.click(findTestObject('Object Repository/span_ESTADO DE CUENTA'))

WebUI.click(findTestObject('Object Repository/label_date_rangeDesde'))

WebUI.click(findTestObject('Object Repository/svg'))

WebUI.click(findTestObject('Object Repository/svg_1'))

WebUI.click(findTestObject('Object Repository/button_1'))

WebUI.setText(findTestObject('Object Repository/input_Ok_from'), '01/12/2022')

WebUI.setText(findTestObject('Object Repository/input_Ok_to'), '')

WebUI.click(findTestObject('Object Repository/input_Ok_to'))

WebUI.click(findTestObject('Object Repository/button_1'))

WebUI.setText(findTestObject('Object Repository/input_Ok_from'), '01/12/2022')

WebUI.setText(findTestObject('Object Repository/input_Ok_to'), '01/02/2023')

WebUI.click(findTestObject('Object Repository/a_Listar'))

WebUI.click(findTestObject('Object Repository/span_CSV'))

WebUI.click(findTestObject('Object Repository/span_EXCEL'))

WebUI.click(findTestObject('Object Repository/span_PDF'))


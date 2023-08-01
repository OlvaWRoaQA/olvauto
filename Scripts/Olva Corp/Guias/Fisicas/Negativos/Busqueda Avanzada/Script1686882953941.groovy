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

WebUI.navigateToUrl('https://dev-registrodeenvios.olvacourier.com:8080/OlvaERP-web/login.xhtml')

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (10)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (10)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/span_Despacho'))

WebUI.click(findTestObject('Object Repository/span_Guia de Despacho'))

WebUI.click(findTestObject('Object Repository/input_Desde_frmListGuiasTransdtDesdeList_input'))

WebUI.click(findTestObject('Object Repository/a_11'))

WebUI.click(findTestObject('Object Repository/span_Buscar (1)'))

WebUI.click(findTestObject('Object Repository/label_Seleccione tipo'))

WebUI.click(findTestObject('Object Repository/li_GUIA DE REMISION REMITENTE'))

WebUI.click(findTestObject('Object Repository/span_Buscar (1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/span_Est.Sunat_ui-button-icon-left ui-icon _835249'), 0)

WebUI.click(findTestObject('Object Repository/input_Emisin_frmListGuiasTransp_emision'))

WebUI.setText(findTestObject('Object Repository/input_Emisin_frmListGuiasTransp_emision'), '23')

WebUI.click(findTestObject('Object Repository/button_Buscar'))

WebUI.setText(findTestObject('Object Repository/input_Nmero_frmListGuiasTransp_numero'), '125695')

WebUI.click(findTestObject('Object Repository/span_Buscar (1)'))

WebUI.rightClick(findTestObject('Object Repository/div_OpcionesEmisinNmeroOrigenDestino pzasPe_eac323'))

WebUI.verifyElementText(findTestObject('Object Repository/td_No se encontraron registros'), 'No se encontraron registros')

WebUI.setText(findTestObject('Object Repository/input_Nmero_frmListGuiasTransp_numero'), '')

WebUI.setText(findTestObject('Object Repository/input_Emisin_frmListGuiasTransp_emision'), '')

WebUI.click(findTestObject('Object Repository/span_Buscar (1)'))

WebUI.setText(findTestObject('Object Repository/input_Emisin_frmListGuiasTransp_emision'), '567')

WebUI.click(findTestObject('Object Repository/input_Nmero_frmListGuiasTransp_numero'))

WebUI.click(findTestObject('Object Repository/span_Buscar (1)'))

WebUI.setText(findTestObject('Object Repository/input_Nmero_frmListGuiasTransp_numero'), '1')

WebUI.click(findTestObject('Object Repository/span_Buscar (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/td_567'), '567')


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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (12)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (12)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (9)'))

WebUI.click(findTestObject('Object Repository/span_Despacho (2)'))

WebUI.click(findTestObject('Object Repository/span_Guia de Despacho (2)'))

WebUI.click(findTestObject('Object Repository/span_re-imprimir_ui-button-icon-left ui-icon ui-c fa fa-eye'))

WebUI.verifyElementPresent(findTestObject('Object Repository/legend_Guia emisin  199 nmero  1'), 0)

WebUI.click(findTestObject('Object Repository/span_Informacin de Guia de Despacho_ui-icon_0a92a9'))

WebUI.click(findTestObject('Object Repository/span_Est.Sunat_ui-button-icon-left ui-icon _835249'))

WebUI.verifyElementText(findTestObject('Object Repository/p_Se imprimio satisfactoriamente la guia de_364367'), 'Se imprimio satisfactoriamente la guia de despacho.')

WebUI.click(findTestObject('Object Repository/span_Visualizar Guia_ui-button-icon-left ui_6abc82'))

WebUI.click(findTestObject('Object Repository/span_Yes'))

WebUI.verifyElementText(findTestObject('Object Repository/label_ANULADO'), 'ANULADO')


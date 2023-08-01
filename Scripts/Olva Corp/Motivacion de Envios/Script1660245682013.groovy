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

WebUI.navigateToUrl('http://desa.olva.com.pe:8080/OlvaERP-web/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/input_Acceder para continuar a Olva_frmLogi_1df1ac (1)'), 
    'garce')

WebUI.setEncryptedText(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/input_Acceder para continuar a Olva_frmLogi_dbfc6f (1)'), 
    'n6MrA7ftZ0I=')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/input_Acceder para continuar a Olva_frmLogi_81423f (1)'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/span_Distribucion (1)'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/span_Liquidacin'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador'), 
    'WMY')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/input_OPERADOR_frmLiquidacionEnviotxtCodigoOperador'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3'), 
    '02230860103')

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/li_Direccin Incorrecta'))

WebUI.setText(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/textarea_NO VISITADO_frmLiquidacionEnvioglosa'), 
    'calle no existe')

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/input_CODIGO DE BARRAS_frmAsignaciontxtCodi_2f39f3'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_ACEPTAR'))


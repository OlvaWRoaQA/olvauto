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

WebUI.navigateToUrl('http://desa.olva.com.pe:8080/OlvaERP-web/login.xhtml')

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (7)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (7)'), 'XbqNmg2rXss=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (6)'))

WebUI.click(findTestObject('Object Repository/span_Clientes (4)'))

WebUI.click(findTestObject('Object Repository/span_Solicitar (3)'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/input_DOC. IDENTIDAD_frmSolicitarPaqueteTarifariotxtNumeroDeDocumento'), 
    '71735786')

WebUI.click(findTestObject('Object Repository/a_Centro de costos'))

WebUI.click(findTestObject('Object Repository/span_Agregar nuevo'))

WebUI.setText(findTestObject('Object Repository/input_CODIGO_frmPersAreasNewtabPerAreasj_idt174'), 'a')

WebUI.setText(findTestObject('Object Repository/input_NOMBRE REA_frmPersAreasNewtabPerAreas_bd74b9'), 'pruebas')

WebUI.setText(findTestObject('Object Repository/input_Das de custodia para devolucin_frmPer_7b57fe'), '1')

WebUI.setText(findTestObject('Object Repository/input_Das para la entrega a cliente origen__999b91'), '11')

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.click(findTestObject('Object Repository/span_Direccin_ui-button-icon-left ui-icon u_5d279f'))

WebUI.verifyElementPresent(findTestObject('Object Repository/input_Das de custodia para devolucin_frmPer_961fdc'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/input_Das para la entrega a cliente origen__9665a7'), 0)

WebUI.click(findTestObject('Object Repository/span_Editar rea_ui-icon ui-icon-closethick'))


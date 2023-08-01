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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (8)'), 'ern')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (8)'), 'XbqNmg2rXss=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (7)'))

WebUI.click(findTestObject('Object Repository/a_Clientes'))

WebUI.click(findTestObject('Object Repository/span_Solicitar (4)'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/input_DOC. IDENTIDAD_frmSolicitarPaqueteTarifariotxtNumeroDeDocumento'), 
    '72097202')

WebUI.click(findTestObject('Object Repository/a_Centro de costos'))

WebUI.setText(findTestObject('Object Repository/input_DOC. IDENTIDAD_frmSolicitarPaqueteTarifariotxtNumeroDeDocumento'), 
    '71735786')

WebUI.click(findTestObject('Object Repository/a_Centro de costos'))

WebUI.click(findTestObject('Object Repository/span_editar rea'))

WebUI.click(findTestObject('Object Repository/input_Das de custodia para devolucin_frmPer_961fdc'))

WebUI.doubleClick(findTestObject('Object Repository/input_Das para la entrega a cliente origen__9665a7'))

WebUI.click(findTestObject('Object Repository/input_Das de custodia para devolucin_frmPer_961fdc'))

WebUI.doubleClick(findTestObject('Object Repository/input_Das de custodia para devolucin_frmPer_961fdc'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/input_Das de custodia para devolucin_frmPer_961fdc'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/input_Das para la entrega a cliente origen__9665a7'))


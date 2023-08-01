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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (6)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (6)'), 'XbqNmg2rXss=')

WebUI.click(findTestObject('Object Repository/span_Atencin Cliente (4)'))

WebUI.click(findTestObject('Object Repository/span_Venta (6)'))

WebUI.setText(findTestObject('Object Repository/input_DNIRUC_frmVentaContadodocIdCliente'), '71735785')

WebUI.click(findTestObject('Object Repository/span_FECHA_ui-button-icon-left ui-icon ui-i_b30c75'))

WebUI.click(findTestObject('Object Repository/a_13'))

WebUI.click(findTestObject('Object Repository/label_0555555'))

WebUI.click(findTestObject('Object Repository/td_21'))

WebUI.click(findTestObject('Object Repository/span_Estado_ui-button-icon-left ui-icon ui-_1e930c'))

WebUI.setText(findTestObject('Object Repository/input_Email F.E_frmVentaContadoemailFactE'), 'pruebas111@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/span_Email F.E_ui-button-icon-left ui-icon _0de539'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Direccin de Email editado correctamente'), 'Dirección de Email editado correctamente!')


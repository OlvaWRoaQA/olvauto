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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (2)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (2)'), 'XbqNmg2rXss=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (2)'))

WebUI.click(findTestObject('Object Repository/span_Atencin Cliente (2)'))

WebUI.click(findTestObject('Object Repository/span_Venta (2)'))

WebUI.delay(0)

WebUI.setText(findTestObject('Object Repository/input_DNIRUC_frmVentaContadodocIdCliente'), '71735786')

WebUI.sendKeys(findTestObject(null), '')

WebUI.setText(findTestObject('Object Repository/input_TELF_frmVentaContadotelf'), '957378087')

WebUI.click(findTestObject('Object Repository/span_TELF_ui-button-icon-left ui-icon ui-c _c39230'))

WebUI.setText(findTestObject('Object Repository/input_Email F.E_frmVentaContadoemailFactE'), 'RIOS@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/span_Email F.E_ui-button-icon-left ui-icon _0de539'))

WebUI.click(findTestObject('Object Repository/span_DIREC_ui-button-icon-left ui-icon ui-c_11ad4f'))

WebUI.setText(findTestObject('Object Repository/input_DESTINO_frmUbigeofltDestino'), 'CALLAo')

WebUI.sendKeys(findTestObject(null), '')

WebUI.click(findTestObject('Object Repository/td_070101'))

WebUI.click(findTestObject('Object Repository/span_PERU_ui-button-icon-left ui-icon ui-c _fff4bb'))

WebUI.setText(findTestObject('Object Repository/input_Nombre Va_frmDirecciondirecComplete'), 'TOMAS VALLE ')

WebUI.click(findTestObject('Object Repository/td_AVENIDA'))

WebUI.click(findTestObject('Object Repository/td_AVENIDA'))

WebUI.click(findTestObject('Object Repository/td_TOMAS VALLE'))

WebUI.click(findTestObject('Object Repository/td_TOMAS VALLE'))

WebUI.click(findTestObject('Object Repository/td'))

WebUI.click(findTestObject('Object Repository/span_Distrito_ui-button-icon-left ui-icon u_7bfcd5'))

WebUI.click(findTestObject('Object Repository/span_Clientes (1)'))

WebUI.click(findTestObject('Object Repository/span_Solicitar (1)'))

WebUI.setText(findTestObject('Object Repository/input_DOC. IDENTIDAD_frmSolicitarPaqueteTarifariotxtNumeroDeDocumento'), 
    '71735786')

WebUI.click(findTestObject('Object Repository/span_Editar_ui-button-icon-left ui-icon ui-_933a2a'))

WebUI.verifyElementText(findTestObject('Object Repository/input_Telfono_frmDialogUpdatetelefono'), '')

WebUI.verifyElementText(findTestObject('Object Repository/input_Email_frmDialogUpdateemail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/textarea_Direccin_frmDialogUpdatedireccionEdit'), '')


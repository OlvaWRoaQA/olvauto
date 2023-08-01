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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (3)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (3)'), 'XbqNmg2rXss=')

WebUI.click(findTestObject('Object Repository/span_Maestros (1)'))

WebUI.click(findTestObject('Object Repository/li_Host'))

WebUI.click(findTestObject('Object Repository/span_Host (1)'))

WebUI.click(findTestObject('Object Repository/span_Configurar'))

WebUI.setText(findTestObject('Object Repository/input_Host_frmConfHosthostComplete_input'), 'opt')

WebUI.click(findTestObject('Object Repository/li_OPTIPLEX3090'))

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.click(findTestObject('Object Repository/a_Jennifer Rios Alejos (1)'))

WebUI.click(findTestObject('Object Repository/a_Cerrar sesin (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (3)'), 'XbqNmg2rXss=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (3)'))

WebUI.click(findTestObject('Object Repository/span_Atencin Cliente (3)'))

WebUI.click(findTestObject('Object Repository/span_Venta (3)'))

WebUI.setText(findTestObject('Object Repository/input_DNIRUC_frmVentaContadodocIdCliente'), '71735785')

WebUI.click(findTestObject('Object Repository/span_FECHA_ui-button-icon-left ui-icon ui-i_b30c75'))

WebUI.click(findTestObject('Object Repository/a_13'))

WebUI.click(findTestObject('Object Repository/td_21'))

WebUI.click(findTestObject('Object Repository/span_Estado_ui-button-icon-left ui-icon ui-_1e930c'))

WebUI.click(findTestObject('Object Repository/span_Agregar nuevo'))

WebUI.setText(findTestObject('Object Repository/input_QUIN RECIBE_frmNewEnviotxtConsignado'), 'pruebas')

WebUI.setText(findTestObject('Object Repository/input_TELF_frmNewEnvioconsignadoDni'), '96385214')

WebUI.setText(findTestObject('Object Repository/input_TELF_frmNewEnvioconsignadoTelf'), '963852741')

WebUI.click(findTestObject('Object Repository/input_Destino_frmNewEnviodestino'))

WebUI.setText(findTestObject('Object Repository/input_DESTINO_frmUbigeoDestinofltDestino'), 'bagua')

WebUI.click(findTestObject('Object Repository/td_010201'))

WebUI.setText(findTestObject('Object Repository/input_Direccin_frmNewEnviodirEntrega'), 'pruebas')

WebUI.setText(findTestObject('Object Repository/input_SERVICIOS_frmNewEnviocodeServicio'), 'reg')

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.click(findTestObject('Object Repository/span_Salir'))

WebUI.setText(findTestObject('Object Repository/input_TELF_frmVentaContadotelf'), '111111113')

WebUI.setText(findTestObject('Object Repository/input_DIREC_frmVentaContadodirec'), 'AV BELAUNDE  S/N AH EL CARMEN pruebas3')

WebUI.setText(findTestObject('Object Repository/input_Email F.E_frmVentaContadoemailFactE'), 'pruebas3@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.setText(findTestObject('Object Repository/input_EFECTIVO_frmTipoComprobanteefectivo'), '15')

WebUI.click(findTestObject('Object Repository/span_GRABAR E IMPRMIR'))


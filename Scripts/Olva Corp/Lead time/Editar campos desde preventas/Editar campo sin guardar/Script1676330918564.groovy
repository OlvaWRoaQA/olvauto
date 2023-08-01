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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (5)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (5)'), 'XbqNmg2rXss=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (5)'))

WebUI.click(findTestObject('Object Repository/a_Atencin Cliente (1)'))

WebUI.click(findTestObject('Object Repository/span_Venta (5)'))

WebUI.click(findTestObject('Object Repository/span_Buscar Preventa'))

WebUI.setText(findTestObject('Object Repository/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), '202302672118')

WebUI.click(findTestObject('Object Repository/td_1'))

WebUI.click(findTestObject('Object Repository/span_Seleccionar'))

WebUI.setText(findTestObject('Object Repository/input_TELF_frmVentaContadotelf'), '111111117')

WebUI.click(findTestObject('Object Repository/span_TELF_ui-button-icon-left ui-icon ui-c _c39230'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Telfono editado correctamente'), 'Teléfono editado correctamente!')

WebUI.setText(findTestObject('Object Repository/input_DIREC_frmVentaContadodirec'), 'AV BELAUNDE  S/N AH EL CARMEN pruebas7')

WebUI.click(findTestObject('Object Repository/span_Distrito_ui-button-icon-left ui-icon u_7bfcd5'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Area editada correctamente'), 'Area editada correctamente.')

WebUI.setText(findTestObject('Object Repository/input_Email F.E_frmVentaContadoemailFactE'), 'pruebas7@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/div_Cancelar_ui-growl-icon-close ui-icon ui_36e2fd_1'))

WebUI.click(findTestObject('Object Repository/span_Email F.E_ui-button-icon-left ui-icon _0de539'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Direccin de Email editado correctamente'), 'Dirección de Email editado correctamente!')

WebUI.setText(findTestObject('Object Repository/input_TELF_frmVentaContadotelf'), '111111110')

WebUI.setText(findTestObject('Object Repository/input_DIREC_frmVentaContadodirec'), 'AV BELAUNDE  S/N AH EL CARMEN pruebas0')

WebUI.setText(findTestObject('Object Repository/input_Email F.E_frmVentaContadoemailFactE'), 'pruebas0@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.click(findTestObject('Object Repository/span_Clientes (3)'))

WebUI.click(findTestObject('Object Repository/span_Solicitar (2)'))

WebUI.setText(findTestObject('Object Repository/input_DOC. IDENTIDAD_frmSolicitarPaqueteTarifariotxtNumeroDeDocumento'), 
    '71735785')

WebUI.click(findTestObject('Object Repository/span_Editar_ui-button-icon-left ui-icon ui-_933a2a'))

WebUI.click(findTestObject('Object Repository/span_Email'))

WebUI.click(findTestObject('Object Repository/span_concat(Email, , s - persona)_ui-icon u_00245c'))

WebUI.click(findTestObject('Object Repository/span_Editar persona_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/a_Centro de costos'))

WebUI.click(findTestObject('Object Repository/span_Direccin_ui-button-icon-left ui-icon u_5d279f'))

WebUI.click(findTestObject('Object Repository/span_Editar rea_ui-icon ui-icon-closethick'))


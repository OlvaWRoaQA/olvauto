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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (12)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (12)'), 'GEfCEzddAuU=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (11)'))

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (12)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (11)'))

WebUI.click(findTestObject('Object Repository/span_Maestros (2)'))

WebUI.click(findTestObject('Object Repository/span_Oficinas'))

WebUI.setText(findTestObject('Object Repository/input_Filter by Nombre_frmOficinatblOficinaj_idt40filter'), 'OLVA ALMACEN')

WebUI.click(findTestObject('Object Repository/input_OFICINA OPERACIONES_frmOficinatblOfic_6a4555'))

WebUI.click(findTestObject('Object Repository/div_OFICINA OPERACIONES_ui-selectonemenu-tr_19f400'))

WebUI.click(findTestObject('Object Repository/li_OFICINA IN HOUSE'))

WebUI.click(findTestObject('Object Repository/span_Editar'))

WebUI.click(findTestObject('Object Repository/span_Clientes (8)'))

WebUI.click(findTestObject('Object Repository/span_Solicitar (8)'))

WebUI.setText(findTestObject('Object Repository/input_DOC. IDENTIDAD_frmSolicitarPaqueteTarifariotxtNumeroDeDocumento'), 
    '71735785')

WebUI.click(findTestObject('Object Repository/a_Centro de costos'))

WebUI.click(findTestObject('Object Repository/span_Direccin_ui-button-icon-left ui-icon u_5d279f'))

WebUI.click(findTestObject('Object Repository/a_Datos Devolucion'))

WebUI.click(findTestObject('Object Repository/span_Usar Direccin Recojo_ui-chkbox-icon ui_713826'))

WebUI.click(findTestObject('Object Repository/span_Editar'))

WebUI.click(findTestObject('Object Repository/span_Distribucion (2)'))

WebUI.click(findTestObject('Object Repository/span_Devolucin (2)'))

WebUI.setText(findTestObject('Object Repository/input_CODIGO DE BARRAS_frmDevolucioncodigoBarras'), '02300002411')


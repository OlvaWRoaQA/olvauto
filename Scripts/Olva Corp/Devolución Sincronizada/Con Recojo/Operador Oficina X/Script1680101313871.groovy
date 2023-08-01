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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (13)'), 'JSRIOS')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (13)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (12)'))

WebUI.click(findTestObject('Object Repository/span_Maestros (3)'))

WebUI.click(findTestObject('Object Repository/span_Oficinas (1)'))

WebUI.setText(findTestObject('Object Repository/input_Filter by Nombre_frmOficinatblOficinaj_idt40filter'), 'OLVA ALMACEN')

WebUI.click(findTestObject('Object Repository/input_OFICINA OPERACIONES_frmOficinatblOfic_6a4555'))

WebUI.click(findTestObject('Object Repository/span_OFICINA IN HOUSE_ui-icon ui-icon-trian_f28aee'))

WebUI.click(findTestObject('Object Repository/li_AGENTE'))

WebUI.click(findTestObject('Object Repository/span_Editar'))

WebUI.click(findTestObject('Object Repository/span_Editar Oficina_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/input_OFICINA OPERACIONES_frmOficinatblOfic_6a4555'))

WebUI.click(findTestObject('Object Repository/span_Editar'))

WebUI.setText(findTestObject('Object Repository/input_Encargado_frmEditOficinaidNumDoc'), '71735785')

WebUI.click(findTestObject('Object Repository/span_Seleccionar Distrito_ui-icon ui-icon-c_193703'))

WebUI.click(findTestObject('Object Repository/span_Editar'))

WebUI.click(findTestObject('Object Repository/span_Encargado_ui-button-icon-left ui-icon _df3ecf'))

WebUI.click(findTestObject('Object Repository/span_Editar'))

WebUI.click(findTestObject('Object Repository/span_Distribucion (3)'))

WebUI.click(findTestObject('Object Repository/span_Devolucin (3)'))

WebUI.setText(findTestObject('Object Repository/input_CODIGO DE BARRAS_frmDevolucioncodigoBarras'), '02300002413')


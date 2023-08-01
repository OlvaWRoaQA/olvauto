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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (13)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (13)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (10)'))

WebUI.click(findTestObject('Object Repository/span_Despacho (3)'))

WebUI.click(findTestObject('Object Repository/span_Guia de Despacho (3)'))

WebUI.click(findTestObject('Object Repository/span_Nuevo'))

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Por favor, debe elegir el transportista'), 'Por favor, debe elegir el transportista')

WebUI.click(findTestObject('Object Repository/input_Transportista_frmGuiaRemisiontxtProve_56dd6f'))

WebUI.click(findTestObject('Object Repository/span_ui-button'))

WebUI.doubleClick(findTestObject('Object Repository/td_EMPRESA DE TRANSPORTES AMERICA DEL SUR S.A.C'))

WebUI.click(findTestObject('Object Repository/input_Transportista_frmGuiaRemisiontxtProve_56dd6f'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Por favor, debe seleccionar Domicilio _b9c048'), 'Por favor, debe seleccionar Domicilio de llegada.')

WebUI.click(findTestObject('Object Repository/div_Registro de guia de despacho'))

WebUI.click(findTestObject('Object Repository/div_Registro de guia de despachoif(window.P_d6023d'))

WebUI.click(findTestObject('Object Repository/input_Sede Destino_frmGuiaRemisiontxtSedeInp'))

WebUI.click(findTestObject('Object Repository/span_Sede Destino_ui-button-icon-left ui-ic_dcc7dd'))

WebUI.click(findTestObject('Object Repository/a_10'))

WebUI.doubleClick(findTestObject('Object Repository/td_CHARCANA'))

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Por favor, debe agregar envios a la gu_917fa4'), 'Por favor, debe agregar envios a la guia de despacho.')

WebUI.click(findTestObject('Object Repository/span_Seleccione_ui-icon ui-icon-triangle-1-s ui-c'))

WebUI.click(findTestObject('Object Repository/li_Q42068780 - ALVARADO CANTU PABLO'))

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.click(findTestObject('Object Repository/div_Seleccione_ui-selectonemenu-trigger ui-_7db369'))

WebUI.click(findTestObject('Object Repository/li_AYQ732 - HYUNDAI - 151544758'))

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Por favor, debe agregar envios a la gu_917fa4'), 'Por favor, debe agregar envios a la guia de despacho.')

WebUI.click(findTestObject('Object Repository/span_Bsqueda inalambrica (F2)'))

WebUI.click(findTestObject('Object Repository/div_Listado de envos pistoleadosDestino Des_0e012e'))

WebUI.click(findTestObject('Object Repository/span_Buscar'))

WebUI.click(findTestObject('Object Repository/span_Listado de envos pistoleados_ui-icon u_260c33'))


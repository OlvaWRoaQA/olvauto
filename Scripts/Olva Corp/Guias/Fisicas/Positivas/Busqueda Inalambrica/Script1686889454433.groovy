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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (15)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (15)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (12)'))

WebUI.click(findTestObject('Object Repository/span_Despacho (4)'))

WebUI.click(findTestObject('Object Repository/span_Guia de Despacho (4)'))

WebUI.click(findTestObject('Object Repository/span_Guia de Despacho_ui-button-icon-left ui-icon ui-c ui-icon-disk'))

WebUI.click(findTestObject('Object Repository/span_ui-button'))

WebUI.doubleClick(findTestObject('Object Repository/td_WARI EXPRESS SOCIEDAD ANONIMA CERRADA - _22e706'))

WebUI.click(findTestObject('Object Repository/input_Transportista_frmGuiaRemisiontxtProve_56dd6f'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/button_ui-button'))

WebUI.setText(findTestObject('Object Repository/input_Filter by Nombre Sede_frmSeleccionado_35d1f5'), 'JAEN')

WebUI.click(findTestObject('Object Repository/span_Sede_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/span_Bsqueda inalambrica (F2)'))

WebUI.click(findTestObject('Object Repository/input_Sede Destino_frmGuiaRemisiontxtSedeInp'))

WebUI.doubleClick(findTestObject('Object Repository/td_JAE'))

WebUI.click(findTestObject('Object Repository/span_Bsqueda inalambrica (F2)'))

WebUI.click(findTestObject('Object Repository/div_Listado de envos pistoleadosDestino Des_0e012e'))

WebUI.click(findTestObject('Object Repository/span_Buscar'))

WebUI.verifyElementText(findTestObject('Object Repository/td_23-40421747'), '23-40421747')

WebUI.click(findTestObject('Object Repository/td_JAEN'))

WebUI.doubleClick(findTestObject('Object Repository/td_JAEN'))

WebUI.click(findTestObject('Object Repository/span_Aceptar todos(F2)'))

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.setText(findTestObject('Object Repository/input_Nmero de emisin_formConfirmarGuiatxtEmision'), '200')

WebUI.setText(findTestObject('Object Repository/input_Nmero de guia_formConfirmarGuiatxtNumeroGuia'), '2')

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.verifyElementText(findTestObject('Object Repository/p_Se imprimio satisfactoriamente la guia de_364367'), 'Se imprimio satisfactoriamente la guia de despacho.')


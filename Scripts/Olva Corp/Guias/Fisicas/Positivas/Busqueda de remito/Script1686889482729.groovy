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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (11)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (11)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/span_Despacho (1)'))

WebUI.click(findTestObject('Object Repository/span_Guia de Despacho (1)'))

WebUI.click(findTestObject('Object Repository/span_Nuevo'))

WebUI.click(findTestObject('Object Repository/div_Registro de guia de despachoif(window.P_d6023d'))

WebUI.click(findTestObject('Object Repository/span_Transportista_ui-button-icon-left ui-i_2d54c6'))

WebUI.click(findTestObject('Object Repository/span_E'))

WebUI.click(findTestObject('Object Repository/td_EMPRESA DE TRANSPORTES AMERICA DEL SUR S.A.C'))

WebUI.doubleClick(findTestObject('Object Repository/td_EMPRESA DE TRANSPORTES AMERICA DEL SUR S.A.C'))

WebUI.click(findTestObject('Object Repository/input_ui-button_frmGuiaRemisiontxtProveedorNombre'))

WebUI.click(findTestObject('Object Repository/input_Transportista_frmGuiaRemisiontxtProve_56dd6f'))

WebUI.click(findTestObject('Object Repository/div_Registro de guia de despachoif(window.P_d6023d'))

WebUI.click(findTestObject('Object Repository/div_Registro de guia de despacho'))

WebUI.click(findTestObject('Object Repository/span_Sede Destino_ui-button-icon-left ui-ic_dcc7dd'))

WebUI.click(findTestObject('Object Repository/div_Sede'))

WebUI.setText(findTestObject('Object Repository/input_Filter by Nombre Sede_frmSeleccionado_35d1f5'), 'TACNA')

WebUI.acceptAlert()

WebUI.doubleClick(findTestObject('Object Repository/td_TACNA'))

WebUI.click(findTestObject('Object Repository/label_TRASLADO OFICINAS PROVINCIAS'))

WebUI.click(findTestObject('Object Repository/li_TRASLADO OFICINAS PROVINCIAS'))

WebUI.click(findTestObject('Object Repository/span_Seleccione_ui-icon ui-icon-triangle-1-s ui-c'))

WebUI.click(findTestObject('Object Repository/li_Q46117247 - ALVARADO CHALQUE JOEL DENNIS'))

WebUI.click(findTestObject('Object Repository/span_Seleccione_ui-icon ui-icon-triangle-1-s ui-c_1'))

WebUI.click(findTestObject('Object Repository/li_AYQ732 - HYUNDAI - 151544758'))

WebUI.click(findTestObject('Object Repository/span_Bsqueda remito (F3)'))

WebUI.setText(findTestObject('Object Repository/input_Remitos_codigoBarras'), '02340421746001')

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/input_Remitos_codigoBarras'), '02340421746001')

WebUI.click(findTestObject('Object Repository/span_Remitos_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/span_Crear nueva guia'))

WebUI.click(findTestObject('Object Repository/span_Bsqueda remito (F3)'))

WebUI.click(findTestObject('Object Repository/div_Registro de guia de despachoif(window.P_d6023d_1_2'))

WebUI.doubleClick(findTestObject('Object Repository/td_TACNA'))

WebUI.click(findTestObject('Object Repository/label_Seleccione'))

WebUI.click(findTestObject('Object Repository/li_Q42068780 - ALVARADO CANTU PABLO'))

WebUI.click(findTestObject('Object Repository/label_Seleccione_1'))

WebUI.click(findTestObject('Object Repository/li_AYP901 - HYUNDAI -'))

WebUI.click(findTestObject('Object Repository/span_Bsqueda remito (F3)'))

WebUI.setText(findTestObject('Object Repository/input_Remitos_codigoBarras'), '02340421746001')

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/input_Remitos_codigoBarras'), '02340421746001')

WebUI.click(findTestObject('Object Repository/span_Remitos_ui-icon ui-icon-closethick'))

WebUI.click(findTestObject('Object Repository/span_Piezas Total_ui-chkbox-icon ui-icon ui_6b0be3'))

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.click(findTestObject('Object Repository/span_Piezas Total_ui-chkbox-icon ui-icon ui_dcaac1'))

WebUI.doubleClick(findTestObject('Object Repository/td_EMPRESA DE TRANSPORTES AMERICA DEL SUR S.A.C'))

WebUI.click(findTestObject('Object Repository/input_Transportista_frmGuiaRemisiontxtProve_56dd6f'))

WebUI.setText(findTestObject('Object Repository/input_Remitos_codigoBarras'), '')

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.setText(findTestObject('Object Repository/input_Nmero de emisin_formConfirmarGuiatxtEmision'), '199')

WebUI.setText(findTestObject('Object Repository/input_Nmero de guia_formConfirmarGuiatxtNumeroGuia'), '1')

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.rightClick(findTestObject('Object Repository/span_INFO'))

WebUI.click(findTestObject('Object Repository/p_Se imprimio satisfactoriamente la guia de_364367'))

WebUI.verifyElementText(findTestObject('Object Repository/p_Se imprimio satisfactoriamente la guia de_364367'), 'Se imprimio satisfactoriamente la guia de despacho.')

WebUI.click(findTestObject('Object Repository/span_Re-imprimir'))

WebUI.verifyElementText(findTestObject('Object Repository/p_Se imprimio satisfactoriamente la guia de_364367'), 'Se imprimio satisfactoriamente la guia de despacho.')


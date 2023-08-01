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

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (16)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (16)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/a_Maestros'))

WebUI.click(findTestObject('Object Repository/span_Host (2)'))

WebUI.click(findTestObject('Object Repository/span_Configurar (1)'))

WebUI.setText(findTestObject('Object Repository/input_Host_frmConfHosthostComplete_input (1)'), 'LD0011')

WebUI.click(findTestObject('Object Repository/li_LD0011'))

WebUI.click(findTestObject('Object Repository/span_Host_ui-button-icon-left ui-icon ui-c _116f86'))

WebUI.click(findTestObject('Object Repository/a_Jennifer Rios Alejos (2)'))

WebUI.click(findTestObject('Object Repository/a_Cerrar sesin (2)'))

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (16)'), 'NaU576f6q1U=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (13)'))

WebUI.click(findTestObject('Object Repository/span_Despacho (5)'))

WebUI.click(findTestObject('Object Repository/span_Guia de Despacho (5)'))

WebUI.click(findTestObject('Object Repository/span_Guia de Despacho_ui-button-icon-left ui-icon ui-c ui-icon-disk'))

WebUI.click(findTestObject('Object Repository/span_Transportista_ui-button-icon-left ui-i_2d54c6'))

WebUI.doubleClick(findTestObject('Object Repository/td_POPEYE CARGOS S.A.C'))

WebUI.click(findTestObject('Object Repository/input_Transportista_frmGuiaRemisiontxtProve_56dd6f'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/tr_ui-button'))

WebUI.click(findTestObject('Object Repository/span_ui-button'))

WebUI.setText(findTestObject('Object Repository/input_Filter by Nombre Sede_frmSeleccionado_35d1f5'), 'HUANUCO')

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/td_HCO'))

WebUI.doubleClick(findTestObject('Object Repository/td_HCO'))

WebUI.click(findTestObject('Object Repository/label_Seleccione'))

WebUI.click(findTestObject('Object Repository/li_Q10863538 - BARDALES SANCHEZ WILDER'))

WebUI.click(findTestObject('Object Repository/label_Seleccione_1'))

WebUI.click(findTestObject('Object Repository/li_AZW941 - HYUNDAI - 151909676'))

WebUI.click(findTestObject('Object Repository/input_Sede Destino_frmGuiaRemisiontxtSedeInp'))

WebUI.click(findTestObject('Object Repository/span_ui-button'))

WebUI.setText(findTestObject('Object Repository/input_Filter by Nombre Sede_frmSeleccionado_35d1f5'), 'HUACHO')

WebUI.click(findTestObject('Object Repository/td_HUACHO'))

WebUI.doubleClick(findTestObject('Object Repository/td_HUACHO'))

WebUI.click(findTestObject('Object Repository/span_Bsqueda remito (F3)'))

WebUI.setText(findTestObject('Object Repository/input_Remitos_codigoBarras'), '02340421755001')

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/a_Remitos_ui-dialog-titlebar-icon ui-dialog_fa7f42'))

WebUI.verifyElementText(findTestObject('Object Repository/td_HUACHO'), 'HUACHO')

WebUI.click(findTestObject('Object Repository/span_Grabar Guia (Ctrl  Y)'))

WebUI.click(findTestObject('Object Repository/span_Ingresar nmero de guia_ui-icon ui-icon_d6e561'))


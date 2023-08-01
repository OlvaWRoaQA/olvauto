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

WebUI.callTestCase(findTestCase('Olva Corp/Inicio de corp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_1df1ac (1)'), 'jsrios')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_dbfc6f (1)'), 'XbqNmg2rXss=')

WebUI.click(findTestObject('Object Repository/input_Acceder para continuar a Olva_frmLogi_81423f (1)'))

WebUI.click(findTestObject('Object Repository/span_Atencin Cliente (1)'))

WebUI.click(findTestObject('Object Repository/span_Venta (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_DNIRUC'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_DNIRUC'), '71735785')

WebUI.sendKeys(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_DNIRUC'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Olva Corp/Page_Principal - Olva Courier/td_orden'))

WebUI.click(findTestObject('Object Repository/span_Seleccionar'))

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/span_Agregar nuevo01'))

WebUI.setText(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_QUIN RECIBE_frmNewEnviotxtConsignado (1)'), 
    'pruebas')

WebUI.setText(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_TELF_frmNewEnvioconsignadoDni (1)'), '96356985')

WebUI.setText(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_TELF_frmNewEnvioconsignadoTelf1 - Copy'), '9638527415')

WebUI.click(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_Destino_frmNewEnviodestino - Copy'))

WebUI.setText(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_DESTINO_frmUbigeoDestinofltDestino - Copy'), 
    'arequipa')

WebUI.sendKeys(findTestObject('Olva Corp/Page_Principal - Olva Courier/input_DESTINO_frmUbigeoDestinofltDestino - Copy'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/td_040101'))

WebUI.click(findTestObject('Object Repository/span_Seleccionar'))

WebUI.setText(findTestObject('Object Repository/input_Direccin_frmNewEnviodirEntrega'), 'pruebas 001')

WebUI.setText(findTestObject('Object Repository/input_SERVICIOS_frmNewEnviocodeServicio'), 'reg')

WebUI.sendKeys(findTestObject('Object Repository/input_SERVICIOS_frmNewEnviocodeServicio'), 'reg')

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.click(findTestObject('Object Repository/span_Salir'))

WebUI.setText(findTestObject('Object Repository/input_TELF_frmVentaContadotelf'), '888888888')

WebUI.setText(findTestObject('Object Repository/input_DIREC_frmVentaContadodirec'), 'pruebas002')

WebUI.click(findTestObject('Object Repository/td_DNIRUC btnSearchDocClient  function() Pr_b83962'))

WebUI.setText(findTestObject('Object Repository/input_Email F.E_frmVentaContadoemailFactE'), 'pruebas002@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/span_Grabar'))

WebUI.setText(findTestObject('Object Repository/input_EFECTIVO_frmTipoComprobanteefectivo'), '20')

WebUI.click(findTestObject('Object Repository/span_GRABAR E IMPRMIR'))

WebUI.click(findTestObject('Object Repository/span_Tipo de Comprobante de Pago_ui-icon ui_1dd5f6'))

WebUI.click(findTestObject('Object Repository/span_Clientes'))

WebUI.click(findTestObject('Object Repository/span_Solicitar'))

WebUI.setText(findTestObject('Object Repository/input_DOC. IDENTIDAD_frmSolicitarPaqueteTarifariotxtNumeroDeDocumento'), 
    '71735785')

WebUI.click(findTestObject('Object Repository/span_ui-button'))

WebUI.verifyElementText(findTestObject('Object Repository/input_Telfono_frmDialogUpdatetelefono'), '')

telefono = WebUI.getText(findTestObject('Object Repository/input_Telfono_frmDialogUpdatetelefono'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyNotEqual(telefono, '888888888')

WebUI.verifyElementText(findTestObject('Object Repository/input_Email_frmDialogUpdateemail'), '')

email = WebUI.getText(findTestObject('Object Repository/input_Email_frmDialogUpdateemail'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(email, 'pruebas002@GMAIL.COM')

WebUI.verifyElementText(findTestObject('Object Repository/textarea_AVENIDA ARGENTINA 4050'), 'AVENIDA ARGENTINA 4050')

dirección = WebUI.getText(findTestObject('Object Repository/textarea_AVENIDA ARGENTINA 4050'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(dirección, 'pruebas002')


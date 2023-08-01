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

WebUI.openBrowser('http://desa.olva.com.pe:8080/OlvaERP-web/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_1df1ac'), 
    'garce')

WebUI.setEncryptedText(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_dbfc6f'), 
    'n6MrA7ftZ0I=')

WebUI.click(findTestObject('Object Repository/Olva Corp/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_81423f'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Atencin Cliente (1)'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Page_Principal - Olva Courier/span_Venta (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/span_Buscar Preventa'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), 
    Rotulo)

WebUI.sendKeys(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/input_NUMERO DE PEDIDO_frmPreventaBusctxtNroPedido'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Olva Corp/Page_Principal - Olva Courier/td_01'))

WebUI.click(findTestObject('Object Repository/Olva Corp/Distribucion/Distribucion/Page_Principal - Olva Courier/span_Seleccionar'))

WebUI.delay(5)

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Meet - pvd-uiyo-xob/Page_Principal - Olva Courier/Page_Principal - Olva Courier/input_editar_'))

WebUI.sendKeys(findTestObject('Negativo/Page_Principal - Olva Courier/input_LECTORA_frmNewEnvioremManual'), Keys.chord(Keys.ENTER))

monto_base1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/monto_base'), 
    FailureHandling.STOP_ON_FAILURE)

monto_exceso1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/monto_exceso'), 
    FailureHandling.STOP_ON_FAILURE)

monto_otros1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Principal - Olva Courier/monto_otros'), 
    FailureHandling.STOP_ON_FAILURE)

monto_IGV1 = WebUI.getText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Meet - pvd-uiyo-xob/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/span_IGV_olvacorp'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyNotEqual(monto_base1, 'S/.0.00')

WebUI.verifyNotEqual(monto_exceso1, 'S/.0.00')

WebUI.verifyNotEqual(monto_base1, 'S/.' + Base_new)

WebUI.verifyNotEqual(monto_exceso1, 'S/.' + Exceso_new)

WebUI.verifyEqual(monto_base1, 'S/.' + Base_old)

WebUI.verifyEqual(monto_exceso1, 'S/.' + Exceso_old)


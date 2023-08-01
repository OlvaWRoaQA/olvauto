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

WebUI.callTestCase(findTestCase('Registro de Envio/Inicio de Registro'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro de Envio/Enviar un Sobre'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.switchToWindowTitle('Olva Courier | Datos Personales')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (2)'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Datos Personales/span_RUC'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_RUC_txt_documento_cliente'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_RUC_txt_documento_cliente'), 
    findTestData('Nuevo Cliente/RUC clientes nuevos').getValue(1, nro_fila))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Seleccione'))

WebUI.click(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Datos Personales/span_JURIDICO'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/select_SeleccioneDNIRUCCARNET DE EXTRANJERIA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/select_SeleccioneDNIRUCCARNET DE EXTRANJERIA'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/select_SeleccioneDNIRUCCARNET DE EXTRANJERIA'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_Num. Doc_txt_numero_documento_nuevo'), 
    findTestData('Nuevo Cliente/RUC clientes nuevos').getValue(1, nro_fila))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_Email_txt_email_nuevo'), 
    findTestData('Nuevo Cliente/RUC clientes nuevos').getValue(3, nro_fila))

WebUI.setText(findTestObject('Object Repository/Registro de Envio/Page_Olva Courier  Datos Personales/input_Razn Social_txt_razon_social'), 
    findTestData('Nuevo Cliente/RUC clientes nuevos').getValue(2, nro_fila))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/button_Registrar (1)'))


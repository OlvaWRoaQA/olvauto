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

WebUI.delay(1)

WebUI.click(findTestObject('Inicio/Page_Olva Courier  Confirma tus datos/img_sobre'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/label_He ledo y acepto los trminos de uso y_adab65'))

WebUI.scrollToPosition(0, 150)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.switchToWindowTitle('Olva Courier | Datos Personales')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_DNI'), '07')

WebUI.verifyElementPresent(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/div_El DNI debe tener 8 dgitos'), 
    0)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '00')

WebUI.verifyElementPresent(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/div_El CE debe tener 9 dgitos'), 
    0)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_RUC'))

WebUI.setText(findTestObject('Inicio/Page_Olva Courier  Datos Personales/input_RUC'), '20')

WebUI.verifyElementPresent(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/div_El RUC debe tener 11 dgitos (1)'), 
    0)


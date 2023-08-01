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

WebUI.navigateToUrl('https://dev-registrodeenvios.olvacourier.com/registrar_envios_girley/')

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_Cerrar'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/img_Qu deseas realizar hoy_img_paquete'))

WebUI.scrollToPosition(0, 200)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/span_He ledo y acepto los_checkmark'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/a_CARN EXT. (Boleta)'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_documento_cliente'), 
    '002691903')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_telefono_cliente'), 
    '987654321')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/button_Seleccionar artculo'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/button_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_ACCESORIOS Y EQUIPOS ELECTRONICOS'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_paquete_articulo'), 'FGHj')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_paquete_valor'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_paquete_largo'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_ancho'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_altura'), '14')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_cm_txt_paquete_peso'), '10')

WebUI.scrollToElement(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Tipo de entrega'), 0)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/span_Departamento - Provincia - Distrito'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_Departamento - Provincia - Distrito_f_f56910'), 
    'san borj')

WebUI.sendKeys(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/a_LIMA - LIMA - SAN BORJA'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_No se encuentra tu direccin_address'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_No se encuentra tu direccin_address'), 
    'av arqueologia con calle de las bellas artes 122')

WebUI.sendKeys(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_No se encuentra tu direccin_address'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_Direccin de Entrega_direccion_new'), 
    'av arqueologia con calle de las bellas artes 122')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_Referencia_reference_new'), 'banco de la nacion')

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/button_Guardar Direccin'))

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_documento_receptor'), '12345678')

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_documento_receptor'))

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_telefono_receptor'), '987654321')

WebUI.setText(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/input_nombres_receptor'), 'ASDFGHJkl')

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 20.80'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 20.80'))

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/div_Pago en agencias y banca por internet'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/button_PAGAR'), 0)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Medios de pago/button_PAGAR'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Olva Courier  Confirma tus datos/button_Cerrar'))


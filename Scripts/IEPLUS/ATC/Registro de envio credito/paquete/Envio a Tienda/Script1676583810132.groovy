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

WebUI.callTestCase(findTestCase('IEPLUS/ATC/Inicio de Registro-ATC'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (3)'), '147190321')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password (3)'), 'axwnCfCtcmIXWBk3wew4bA==')

WebUI.click(findTestObject('Object Repository/button_Entrar (7)'))

WebUI.scrollToElement(findTestObject('Object Repository/input_Telefono_phoneProfile (3)'), 0)

WebUI.setText(findTestObject('Object Repository/input_Telefono_phoneProfile (3)'), '963852741')

WebUI.click(findTestObject('Object Repository/button_Guardar (5)'))

WebUI.click(findTestObject('Object Repository/button_OK (7)'))

WebUI.click(findTestObject('Object Repository/a_Registro de Envos Crdito (3)'))

WebUI.switchToWindowTitle('Olva Courier | Confirma tus datos')

WebUI.click(findTestObject('Object Repository/img_Qu deseas realizar hoy_img_paquete (3)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (11)'))

WebUI.scrollToElement(findTestObject('Object Repository/span_Seleccionar artculo_caret (1)'), 0)

WebUI.click(findTestObject('Object Repository/span_Seleccionar artculo_caret (1)'))

WebUI.click(findTestObject('Object Repository/span_ACCESORIOS Y EQUIPOS  ELECTRONICOS (3)'))

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_articulo (3)'), 'IMPRESORA')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_valor (3)'), '200')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_largo (3)'), '14')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_ancho (3)'), '11')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_altura (3)'), '11')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_peso (3)'), '2')

WebUI.scrollToElement(findTestObject('Object Repository/span_Tipo de entrega'), 0)

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda (2)'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (2)'))

WebUI.setText(findTestObject('Object Repository/input_Provincia - Departamento - Distrito_f_0bcffb (3)'), 'ica - ica - ica')

WebUI.click(findTestObject('Object Repository/span_ICA - ICA - ICA'))

WebUI.click(findTestObject('Object Repository/span_Tienda'))

WebUI.click(findTestObject('Object Repository/span_TIENDA OFICINA ICA - ICA - CA GUATEMAL_aa6e85'))

WebUI.setText(findTestObject('Object Repository/input_ICA - ICA - CA GUATEMALA NRO 161 URBA_e1fe3c'), '1111')

WebUI.scrollToElement(findTestObject('Object Repository/span_Tipo De Documento (2)'), 0)

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (2)'))

WebUI.click(findTestObject('Object Repository/a_RUC'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (4)'), '20507381901')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (4)'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (4)'), 'PRUEBAS 001')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (12)'))

WebUI.click(findTestObject('Object Repository/button_GUARDAR (6)'))

WebUI.verifyElementVisible(findTestObject('b_RegistroOK'), FailureHandling.STOP_ON_FAILURE)


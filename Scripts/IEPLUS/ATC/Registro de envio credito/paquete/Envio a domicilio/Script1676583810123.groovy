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

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (2)'), '147190321')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password (2)'), 'axwnCfCtcmIXWBk3wew4bA==')

WebUI.click(findTestObject('Object Repository/button_Entrar (6)'))

WebUI.scrollToElement(findTestObject('Object Repository/input_Telefono_phoneProfile (2)'), 0)

WebUI.setText(findTestObject('Object Repository/input_Telefono_phoneProfile (2)'), '963852741')

WebUI.click(findTestObject('Object Repository/button_Guardar (3)'))

WebUI.click(findTestObject('Object Repository/button_OK (6)'))

WebUI.click(findTestObject('Object Repository/a_Registro de Envos Crdito (3)'))

WebUI.switchToWindowTitle('Olva Courier | Confirma tus datos')

WebUI.click(findTestObject('Object Repository/img_Qu deseas realizar hoy_img_paquete (3)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (9)'))

WebUI.scrollToElement(findTestObject('Object Repository/button_Seleccionar artculo (1)'), 0)

WebUI.click(findTestObject('Object Repository/button_Seleccionar artculo (1)'))

WebUI.click(findTestObject('Object Repository/span_ACCESORIOS Y EQUIPOS  ELECTRONICOS (2)'))

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_articulo (2)'), 'IMPRESAORA')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_valor (2)'), '300')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_largo (2)'), '14')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_ancho (2)'), '10')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_altura (2)'), '10')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_peso (2)'), '2')

WebUI.scrollToElement(findTestObject('Object Repository/span_Tipo de entrega_caret (1)'), 0)

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega_caret (1)'))

WebUI.click(findTestObject('Object Repository/a_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (1)'))

WebUI.setText(findTestObject('Object Repository/input_Provincia - Departamento - Distrito_f_0bcffb (2)'), 'ica - ica - ica')

WebUI.click(findTestObject('Object Repository/a_ICA - ICA - ICA'))

WebUI.setText(findTestObject('Object Repository/input_UCAYALI - PURUS - PURUS_txt_direccion_99fa8f (2)'), 'AV 28 DE JULIO 156')

WebUI.setText(findTestObject('Object Repository/input_UCAYALI - PURUS - PURUS_txt_direccion_114a42 (2)'), 'PRUEBAS 001')

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (1)'))

WebUI.click(findTestObject('Object Repository/a_DNI (4)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (3)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (3)'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (3)'), 'JENNIFER PRUEBAS01')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (10)'))

WebUI.click(findTestObject('Object Repository/button_GUARDAR (4)'))


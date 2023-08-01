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

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (6)'), '147190321')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password (6)'), 'axwnCfCtcmIXWBk3wew4bA==')

WebUI.click(findTestObject('Object Repository/button_Entrar (10)'))

WebUI.scrollToElement(findTestObject('Object Repository/input_Telefono_phoneProfile (6)'), 0)

WebUI.setText(findTestObject('Object Repository/input_Telefono_phoneProfile (6)'), '963852741')

WebUI.click(findTestObject('Object Repository/button_Guardar (10)'))

WebUI.click(findTestObject('Object Repository/button_OK (10)'))

WebUI.switchToWindowTitle('Atención al Cliente')

WebUI.click(findTestObject('Object Repository/img_Qu deseas realizar hoy_img_paquete (6)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (17)'))

WebUI.scrollToElement(findTestObject('Object Repository/span_Seleccionar artculo'), 0)

WebUI.click(findTestObject('Object Repository/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/span_ACCESORIOS Y EQUIPOS  ELECTRONICOS (6)'))

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_articulo (6)'), 'IMPRESORA')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_valor (6)'), '200')

WebUI.setText(findTestObject('Object Repository/input_UTILES DE OFICINA_txt_paquete_largo (6)'), '14')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_ancho (6)'), '11')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_altura (6)'), '11')

WebUI.setText(findTestObject('Object Repository/input_cm_txt_paquete_peso (6)'), '2')

WebUI.scrollToElement(findTestObject('Object Repository/button_Tipo de entrega (3)'), 0)

WebUI.click(findTestObject('Object Repository/button_Tipo de entrega (3)'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda (4)'))

WebUI.click(findTestObject('Object Repository/span_Provincia - Departamento - Distrito (3)'))

WebUI.click(findTestObject('Object Repository/span_ANCASH - CARLOS FERMIN FITZCARRALD - SAN LUIS'))

WebUI.click(findTestObject('Object Repository/span_Tienda (1)'))

WebUI.click(findTestObject('Object Repository/span_SAN LUIS (HUARAZ) - SAN LUIS - AV FITZ_4b8cc3'))

WebUI.setText(findTestObject('Object Repository/input_SAN LUIS (HUARAZ) - SAN LUIS - AV FIT_df4896'), '2020')

WebUI.click(findTestObject('Object Repository/button_Tipo De Documento (4)'))

WebUI.click(findTestObject('Object Repository/a_DNI (6)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (7)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (7)'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (7)'), 'PRUEBAS 001')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (18)'))

WebUI.click(findTestObject('Object Repository/input_Resumen de Envos registrados_btn'))

WebUI.click(findTestObject('Object Repository/img_Envo de cajas o paquetescon un peso mxi_37770f (3)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (17)'))

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega (1)'))

WebUI.click(findTestObject('Object Repository/a_Entrega a domicilio (2)'))

WebUI.click(findTestObject('Object Repository/span_Provincia - Departamento - Distrito (3)'))

WebUI.click(findTestObject('Object Repository/a_AREQUIPA - AREQUIPA - CAYMA'))

WebUI.setText(findTestObject('Object Repository/input_UCAYALI - PURUS - PURUS_txt_direccion_99fa8f (5)'), 'PRUEBAS OLVATI')

WebUI.setText(findTestObject('Object Repository/input_UCAYALI - PURUS - PURUS_txt_direccion_114a42 (5)'), 'PRUEBAS001')

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (3)'))

WebUI.click(findTestObject('Object Repository/a_RUC (1)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (7)'), '20507381901')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (7)'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (7)'), 'PRUEBAS 001')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (18)'))

WebUI.click(findTestObject('Object Repository/input_Resumen de Envos registrados_btn'))

WebUI.click(findTestObject('Object Repository/img_Envo de cajas o paquetescon un peso mxi_37770f (3)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (17)'))

WebUI.click(findTestObject('Object Repository/button_Tipo de entrega (3)'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda (4)'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (4)'))

WebUI.click(findTestObject('Object Repository/a_ANCASH - HUARAZ - HUARAZ (1)'))

WebUI.click(findTestObject('Object Repository/span_Tienda (1)'))

WebUI.click(findTestObject('Object Repository/span_HUARAZ - HUARAZ - JR SAN MARTIN NRO 673'))

WebUI.setText(findTestObject('Object Repository/input_SAN LUIS (HUARAZ) - SAN LUIS - AV FIT_df4896'), '8080')

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (3)'))

WebUI.click(findTestObject('Object Repository/a_DNI (6)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (7)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (7)'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (7)'), 'PRUEBAS 001')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (18)'))

WebUI.click(findTestObject('Object Repository/button_GUARDAR (11)'))

WebUI.verifyElementVisible(findTestObject('b_RegistroOK'), FailureHandling.STOP_ON_FAILURE)


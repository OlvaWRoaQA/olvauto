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

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username (7)'), '147190321')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password (7)'), 'axwnCfCtcmIXWBk3wew4bA==')

WebUI.click(findTestObject('Object Repository/button_Entrar (11)'))

WebUI.scrollToElement(findTestObject('Object Repository/input_Telefono_phoneProfile (7)'), 0)

WebUI.setText(findTestObject('Object Repository/input_Telefono_phoneProfile (7)'), '963852741')

WebUI.click(findTestObject('Object Repository/button_Guardar (12)'))

WebUI.click(findTestObject('Object Repository/button_OK (11)'))

WebUI.switchToWindowTitle('Atención al Cliente')

WebUI.click(findTestObject('Object Repository/a_Registro de Envos Crdito (7)'))

WebUI.click(findTestObject('Object Repository/img_Envo de cajas o paquetescon un peso mxi_37770f (4)'))

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (19)'))

WebUI.scrollToElement(findTestObject('Object Repository/span_Tipo de entrega_caret (2)'), 0)

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega_caret (2)'))

WebUI.click(findTestObject('Object Repository/span_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/span_Departamento - Provincia - Distrito (5)'))

WebUI.click(findTestObject('Object Repository/span_ANCASH - HUARAZ - HUARAZ'))

WebUI.click(findTestObject('Object Repository/span_Tienda (2)'))

WebUI.click(findTestObject('Object Repository/span_HUARAZ - HUARAZ - JR SAN MARTIN NRO 673 (1)'))

WebUI.setText(findTestObject('Object Repository/input_HUARAZ - HUARAZ - JR SAN MARTIN NRO 6_ff92d1'), '5555')

WebUI.scrollToElement(findTestObject('Object Repository/span_Tipo De Documento (4)'), 0)

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento (4)'))

WebUI.click(findTestObject('Object Repository/a_DNI (7)'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni (8)'), '71735785')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_telefono (8)'), '963852741')

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_nombres (8)'), 'PRUEBAS OLVATI')

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (20)'))

WebUI.click(findTestObject('Object Repository/button_GUARDAR (13)'))

WebUI.verifyElementVisible(findTestObject('b_RegistroOK'), FailureHandling.STOP_ON_FAILURE)


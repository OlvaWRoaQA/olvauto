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

WebUI.setText(findTestObject('Object Repository/input_visualiza el reporte de los envos rea_257aad (1)'), 'U71735785')

WebUI.setEncryptedText(findTestObject('Object Repository/input_visualiza el reporte de los envos rea_152830 (1)'), 'dWcm90gC3qL28OJDuV/DAg==')

WebUI.click(findTestObject('Object Repository/button_Entrar (1)'))

WebUI.click(findTestObject('Object Repository/a_Programacin de RecojosPrograma tus recojo_6f32de (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/label_Acepto los Trminos de uso y polticas _c209bf (2)'), 0)

WebUI.click(findTestObject('Object Repository/label_Acepto los Trminos de uso y polticas _c209bf (2)'))

WebUI.click(findTestObject('Object Repository/button_Aceptar (1)'))

WebUI.click(findTestObject('Object Repository/input_Datos de Recojo - () Campo obligatori_2d3c4a (1)'))

WebUI.click(findTestObject('Object Repository/div_Olva - AV ARGENTINA NRO 4050 (1)'))

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-1 (1)'), 'pruebas')

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-99 (1)'), 'pru@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Agregar Direccin Nueva_input-2 (1)'), '963852741')

WebUI.click(findTestObject('Object Repository/label_Fecha del recojo'))

WebUI.click(findTestObject('Object Repository/span_14 (2)'))

WebUI.setText(findTestObject('Object Repository/input_Formulario_input-14 (1)'), 'Pruebas01')

WebUI.setText(findTestObject('Object Repository/input_Formulario_input-15 (1)'), '963852741')

WebUI.click(findTestObject('Object Repository/i_Entrega en Tienda_dropdown icon (1)'))

WebUI.click(findTestObject('Object Repository/div_ABANCAY ABANCAY APURIMAC'))

WebUI.click(findTestObject('Object Repository/i_Distrito Departamento Provincia_dropdown icon (1)'))

WebUI.click(findTestObject('Object Repository/div_AVENIDA'))

WebUI.setText(findTestObject('Object Repository/input_QUINTA___BVID__52'), '28 de julio')

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__58'), '152')

WebUI.setText(findTestObject('Object Repository/input_ZONA INDUSTRIAL___BVID__64'), 'pruebas')

WebUI.click(findTestObject('Object Repository/a_Buscar direccin de entrega'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/div_PAQUETE (2)'), 0)

WebUI.click(findTestObject('Object Repository/div_PAQUETE (2)'))

WebUI.click(findTestObject('Object Repository/input_PAQUETE_input-18 (2)'))

WebUI.click(findTestObject('div_ACCESORIOS'))

WebUI.click(findTestObject('Object Repository/div_ACCESORIOS Y EQUIPOS ELECTRONICOS'))

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__34 (1)'), 'impresora')

WebUI.setText(findTestObject('Object Repository/input_VALIJA-DOCUMENTOS___BVID__68'), '1')

WebUI.setText(findTestObject('Object Repository/input_Mximo 20Kg___BVID__70'), '10')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__72'), '10')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__74'), '10')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__36'), '1')

WebUI.setText(findTestObject('Object Repository/input_Mximo 40cm___BVID__38'), '100')

WebUI.click(findTestObject('Object Repository/button_Programa tu recojo (1)'))

WebUI.click(findTestObject('Object Repository/button_Aceptar_1'))

WebUI.click(findTestObject('Object Repository/button_OK'))


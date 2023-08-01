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

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Datos Personales/span_domiclio o tienda'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/a_Entrega a domicilio'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley'))

WebUI.setText(findTestObject('Object Repository/Negativo/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley (text)'), 
    'lima - lima - ate')

WebUI.sendKeys(findTestObject('Object Repository/Negativo/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/span_Provincia - Dpto - Distrito - Girley (text)'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_Direccin de Entrega_address'), 
    'aaaaa')

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/small_Fija la direccin en el mapa'))

WebUI.dragAndDropByOffset(findTestObject('Page_Olva Courier  Datos Personales/Map_local'), -50, 0)

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/zoom_in_map'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/zoom_in_map'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/zoom_in_map'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/zoom_in_map'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/zoom_in_map'))

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/img__leaflet-marker-icon leaflet-zoom-hide _97142d'))

WebUI.dragAndDropByOffset(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/img__leaflet-marker-icon leaflet-zoom-hide _97142d'), 
    -100, 60)

WebUI.setText(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/input_Mz, Lote o Referencia_reference'), 
    'cerca estacion de metropolitano')

WebUI.click(findTestObject('Inicio/Page_Atencin al Cliente/Page_Olva Courier  Datos Personales/button_Guardar Direccin'))


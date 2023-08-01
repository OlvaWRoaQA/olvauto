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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.regex.Matcher as Matcher
import java.util.regex.Pattern as Pattern
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Registro de Envio/Comprar Empaques/Positivas/Comprar Empaques - Olvacorp'), [:], FailureHandling.STOP_ON_FAILURE)

nro_tracking1 = WebUI.getText(findTestObject('Object Repository/Comprar Empaques/Page_Olva Courier  Resultado/button_23 - 00005177'))

String nro_tracking2 = nro_tracking1

Pattern p = Pattern.compile('23 =([^;]+)')

Matcher m = p.matcher(nro_tracking2)

while (m.find()) {
    def splitted = m.group().split('-')

    System.out.println(splitted[1])
}

WebUI.openBrowser('')

WebUI.navigateToUrl(' http://desa.olva.com.pe:8080/OlvaERP-web/login.xhtml')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_1df1ac (2)'), 
    'garce')

WebUI.setEncryptedText(findTestObject('Object Repository/Comprar Empaques/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_dbfc6f (2)'), 
    'n6MrA7ftZ0I=')

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Login  Olva Courier/input_Acceder para continuar a Olva_frmLogi_81423f (2)'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/span_Atencin Cliente'))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/span_Anular  Modificar (1)'))

WebUI.click(findTestObject('Comprar Empaques/Object Repository/Page_Principal - Olva Courier/span_OLVA ALMACEN INTERNO -AV. ARGENTINA 4458 CALLAO_ui-icon ui-icon-triangle-1-s ui-c'))

WebUI.click(findTestObject('Comprar Empaques/Object Repository/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/li_OLVA LINCE - AV. ARENALES 1775'))

WebUI.click(findTestObject('Comprar Empaques/Object Repository/Page_Principal - Olva Courier/span_Buscar'))

WebUI.click(findTestObject('Comprar Empaques/Object Repository/Page_Olva Courier  Datos Personales/Page_Principal - Olva Courier/New Folder/Page_Principal - Olva Courier/span_-eye-slash'))

WebUI.verifyTextPresent('20100686814', true)

WebUI.verifyTextPresent('$', true)

WebUI.verifyTextPresent('477', true)

//WebUI.verifyElementText(findTestObject('Comprar Empaques/Object Repository/Page_Olva Courier  Datos Personales/td_total detalle'), 
//'6.28')
WebUI.scrollToElement(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/b_Consulta Envio'), 
    0)

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/span_Consulta Envio_ui-button-icon-left ui-_851a57'))

WebUI.doubleClick(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/input_N Tracking_frmConsultaEnviotxtRemito'))

WebUI.setText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/input_N Tracking_frmConsultaEnviotxtRemito'), 
    splitted)

WebUI.sendKeys(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/input_N Tracking_frmConsultaEnviotxtRemito'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/legend_Montos'))

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/monto_base'), '0,00')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/monto_exceso'), 
    '0,00')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/monto_embalaje'), 
    '0,00')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/monto_otros'), 
    '0,00')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/monto_valor_venta'), 
    '0,00')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/monto_imponible'), 
    '0,00')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/monto_IGV'), '0,00')

WebUI.verifyElementText(findTestObject('Object Repository/Comprar Empaques/Page_Principal - Olva Courier/monto_precio_venta'), 
    '0,00')


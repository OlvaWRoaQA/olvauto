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

WebUI.openBrowser('https://registro.olvacourier.com/registrar_envios/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/button_Cerrar'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_trminos de uso y polticas de privacidad'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Productos considerados Mercanca Peligr_52d63c/h1_Productos considerados Mercanca Peligrosa'))

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpsbit.lyTiemposDeEntrega'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpsbit.ly3121hxy'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpswww.olvacourier.comprotocolo-tiendas'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Medidas de prevencin sanitaria para el_a1e7e6/img_Atencin al Cliente_vc_single_image-img _376e31'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_www.olvacourier.com'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpswww.olvacourier.comcalculadora-de-envios'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Calculadora de Envos  Olva Courier/h2_Calculadora de Envos'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_ver manual'))

WebUI.delay(2)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/button_Aceptar'))


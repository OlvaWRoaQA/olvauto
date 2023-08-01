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

WebUI.openBrowser('http://aws-web.olvacourier.com/registrar_envios')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/b_Estimado cliente'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/b_Tomar en cuenta las siguientes consideraciones'))

WebUI.switchToWindowTitle('Olva Courier | Confirma tus datos')

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpswww.olvacourier.comtiendas-lima'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Tiendas Lima  Olva Courier/a_Ver tiendas - Provincias (1)'))

WebUI.switchToWindowTitle('Olva Courier | Confirma tus datos')

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpswww.olvacourier.comtiendas-provincia'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Tiendas Lima  Olva Courier/a_Ver tiendas - Provincias (1)'))

WebUI.switchToWindowTitle('Olva Courier | Confirma tus datos')

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpscutt.lyTiempos-de-Entrega'))

WebUI.click(findTestObject('Object Repository/Negativo/Page_Tiempos de entrega  Olva Courier/a_Ver tiempos de entrega'))

WebUI.switchToWindowTitle('Olva Courier | Confirma tus datos')

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpsatc.olvaexpress.peatcuserlogout'))

WebUI.switchToWindowTitle('Olva Courier | Confirma tus datos')

WebUI.click(findTestObject('Object Repository/Negativo/Page_Olva Courier  Confirma tus datos/a_httpswww.olvacourier.comrestricciones-mer_42ec18'))

WebUI.verifyElementText(findTestObject('Object Repository/Negativo/Page_Productos considerados Mercanca Prohib_ed5711/h1_Productos considerados Mercanca Prohibida'), 
    'Productos considerados «Mercancía Prohibida»')

WebUI.click(findTestObject('Object Repository/Inicio/Page_Olva Courier  Confirma tus datos/button_Cerrar'))


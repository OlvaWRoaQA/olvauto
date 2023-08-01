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

WebUI.navigateToUrl('https://www.olva.pe/intranet/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/reportes olva/Page_Intranet OLVA/input_Nombre de usuario Clave_usuario'), 
    'usci')

WebUI.setEncryptedText(findTestObject('Object Repository/reportes olva/Page_Intranet OLVA/input_Nombre de usuario Clave_clave'), 
    'ke/ZwB3ZEch1mRB89oq9ew==')

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Intranet OLVA/input_Nombre de usuario Clave_submit'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Intranet OLVA  Principal/a_051 Indicadores por dia de entrega (salida) -'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/input_Fecha Conf. Inicio_fecha_inicio'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/td_15 (INICIO)'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/input_Fecha Conf. Final_fecha_final'))

WebUI.click(findTestObject('reportes olva/Page_Reporte 51 Lima - Prov/td_15 (FINAL)'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/input_Estatal_estatal'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/input_Juridico_juridico'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/input_Con Licitacion_licitacion'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/button_Procesar'))

WebUI.verifyElementText(findTestObject('Object Repository/reportes olva/Page_Reporte 51 Lima - Prov/th_TOTALES'), 'TOTALES')


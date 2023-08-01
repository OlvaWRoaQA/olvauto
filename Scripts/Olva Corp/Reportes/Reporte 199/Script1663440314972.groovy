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

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Intranet OLVA  Principal/a_199 Recepcion Envios Todos Clientes -'))

WebUI.navigateToUrl('https://www.olva.pe/intranet/Recepcion_linio/index_recepcion.php?codUsuario=usci')

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Recepcin de Linio/input_Fecha Inicio_fecha_inicio (2)'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Recepcin de Linio/a_1'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Recepcin de Linio/input_Fecha Fin_fecha_fin (2)'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Recepcin de Linio/a_14'))

WebUI.click(findTestObject('Object Repository/reportes olva/Page_Recepcin de Linio/button_Buscar (2)'))


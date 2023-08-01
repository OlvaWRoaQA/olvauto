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

WebUI.callTestCase(findTestCase('Recojos/Envios Creditos Masivos/Login-EnviosMasivos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/span_Seleccione o arrastre su archivo aqu'))

WebUI.uploadFile(findTestObject('Creditos Masivos/CargarExcel'), 'C:\\Users\\Administrador\\Documents\\Casos de prueba - Recojos masivos\\Negativos\\Sobres-CaracteresIncorrectos.xlsx', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/button_CONTINUAR (24)'), 0)

WebUI.click(findTestObject('Object Repository/button_CONTINUAR (24)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/button_Ver Errores'), 0)

WebUI.click(findTestObject('Object Repository/button_Ver Errores'))

WebUI.verifyElementText(findTestObject('Object Repository/div_Lista de Error'), 'Lista de Error')

WebUI.scrollToElement(findTestObject('Object Repository/button_Cerrar (11)'), 0)

WebUI.click(findTestObject('Object Repository/button_Cerrar (11)'))


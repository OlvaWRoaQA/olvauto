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

WebUI.navigateToUrl('https://dev-pimcore.olvaexpress.pe/user/login')

WebUI.setText(findTestObject('Object Repository/input_visualiza el reporte de los envos rea_257aad (3)'), '171735785')

WebUI.setEncryptedText(findTestObject('Object Repository/input_visualiza el reporte de los envos rea_152830 (3)'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/button_Entrar (3)'))

WebUI.click(findTestObject('Object Repository/a_Programacin de RecojosPrograma tus recojo_6f32de (4)'))

WebUI.click(findTestObject('Object Repository/label_Acepto los (1)'))

WebUI.click(findTestObject('Object Repository/button_Aceptar (4)'))

WebUI.click(findTestObject('Object Repository/i_Formato 909808707  16113000_dropdown icon (1)'))

WebUI.click(findTestObject('Object Repository/div_Entrega en Domicilio (1)'))

WebUI.click(findTestObject('Object Repository/i_Entrega en Tienda_dropdown icon (3)'))

WebUI.setText(findTestObject('Object Repository/input_Entrega en Tienda_search'), 'ABANCAY ABANCAY APURIMAC')

WebUI.click(findTestObject('Object Repository/div_ABANCAY ABANCAY APURIMAC (3)'))

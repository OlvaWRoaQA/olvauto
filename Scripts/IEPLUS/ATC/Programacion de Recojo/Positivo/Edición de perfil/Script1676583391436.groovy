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

WebUI.setText(findTestObject('Object Repository/input_ZONA CLIENTES__username'), '171735785')

WebUI.setEncryptedText(findTestObject('Object Repository/input_ZONA CLIENTES__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/button_Entrar (4)'))

WebUI.click(findTestObject('Object Repository/a_JENNIFERRIOSALEJOS'))

WebUI.setText(findTestObject('Object Repository/input_Email_emailProfile'), 'RIOSALEJOSJS@GMAIL.COM')

WebUI.setText(findTestObject('Object Repository/input_Razn Social  Nombre_nameProfile'), 'JENNIFERRIOS')

WebUI.click(findTestObject('Object Repository/td'))

WebUI.setText(findTestObject('Object Repository/input_Telefono_phoneProfile'), '957378086')

WebUI.click(findTestObject('Object Repository/button_Guardar'))

WebUI.verifyElementText(findTestObject('Object Repository/h2_Informacin actualizada correctamente'), 'Información actualizada correctamente.')

WebUI.click(findTestObject('Object Repository/button_OK (4)'))


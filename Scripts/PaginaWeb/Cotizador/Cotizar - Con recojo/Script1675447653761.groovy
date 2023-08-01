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

WebUI.callTestCase(findTestCase('PaginaWeb/Cotizador/Inicio de pagina'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Departamento Amazonas ncash Apurmac _a5a3d1'), '15', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_ProvinciaBarranca Cajatambo Caete Ca_3d97e3'), '1501', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_DistritoAncnAteBarrancoBreaCarabayll_73def8'), '150101', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Departamento Amazonas ncash Apurmac _a5a3d1_1'), '11', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_ProvinciaChincha Ica Nasca Palpa Pisco'), '1101', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_DistritoIcaLa TinguiaLos AquijesOcuc_54656c'), '110101', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Sin recojo Con recojo'), 'REC', true)

WebUI.click(findTestObject('Object Repository/mark'))

WebUI.click(findTestObject('Object Repository/div_Cunto pesa          Kilogramos (kg)'))

WebUI.setText(findTestObject('Object Repository/input_Cunto pesa_pesa'), '2')

WebUI.setText(findTestObject('Object Repository/input_cunto mide_ancho'), '10')

WebUI.setText(findTestObject('Object Repository/input_Ancho (cm)_largo'), '10')

WebUI.setText(findTestObject('Object Repository/input_Largo (cm)_alto'), '10')

WebUI.click(findTestObject('Object Repository/strong_Cotizar'))

WebUI.verifyElementText(findTestObject('Object Repository/div_calculoTarifa'), 'S/ 17.00')


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

WebUI.navigateToUrl('https://registro.olvacourier.com/nueva_web/')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Departamento                        _951d87'), '15', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_ProvinciaBarranca Cajatambo Caete Ca_3d97e3 (2)'), '1501', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_DistritoAncnAteBarrancoBreaCarabayll_73def8 (2)'), '150101', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Departamento                        _f9ac88'), '11', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_ProvinciaChincha Ica Nasca Palpa Pisco (2)'), '1101', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_DistritoIcaLa TinguiaLos AquijesOcuc_54656c (2)'), '110101', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Sin recojo                          _b249e0'), 'REC', 
    true)

WebUI.click(findTestObject('Object Repository/mark (1)'))

WebUI.setText(findTestObject('Object Repository/input_Cunto pesa_pesa (1)'), '2')

WebUI.setText(findTestObject('Object Repository/input_cunto mide_ancho (1)'), '10')

WebUI.setText(findTestObject('Object Repository/input_Ancho (cm)_largo (1)'), '15')

WebUI.setText(findTestObject('Object Repository/input_Largo (cm)_alto (1)'), '15')

WebUI.click(findTestObject('Object Repository/strong_Cotizar (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/span_Precio estimado'), 'Precio estimado:')

WebUI.verifyElementText(findTestObject('Object Repository/b_S 17.50 (1)'), 'S/ 17.50')


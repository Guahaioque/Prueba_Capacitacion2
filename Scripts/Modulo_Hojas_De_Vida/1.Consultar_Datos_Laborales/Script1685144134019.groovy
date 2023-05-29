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

WebUI.navigateToUrl(GlobalVariable.Despliegue)

WebUI.setText(findTestObject('Object Repository/Modulo_Hojas_De_Vida/1.Consulta_Datos_Laborales/Page_Sistema de Recursos Humanos y Nmina/input_Usuario_usuario'), 
    GlobalVariable.null)

WebUI.setEncryptedText(findTestObject('Object Repository/Modulo_Hojas_De_Vida/1.Consulta_Datos_Laborales/Page_Sistema de Recursos Humanos y Nmina/input_Clave_clave'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Modulo_Hojas_De_Vida/1.Consulta_Datos_Laborales/Page_Sistema de Recursos Humanos y Nmina/input_Tiene el Reconocimiento de Pensin Com_9af72f'))

WebUI.click(findTestObject('Object Repository/Modulo_Hojas_De_Vida/1.Consulta_Datos_Laborales/Page_Sistema de Recursos Humanos y Nmina/img_Sistemas De Apoyo_moduloMiniatura'))

WebUI.click(findTestObject('Object Repository/Modulo_Hojas_De_Vida/1.Consulta_Datos_Laborales/Page_Sistema de Recursos Humanos y Nmina/a_EMPLEADOS'))

WebUI.click(findTestObject('Object Repository/Modulo_Hojas_De_Vida/1.Consulta_Datos_Laborales/Page_Sistema de Recursos Humanos y Nmina/a_Datos Laborales'))

WebUI.click(findTestObject('Object Repository/Modulo_Hojas_De_Vida/1.Consulta_Datos_Laborales/Page_Sistema de Recursos Humanos y Nmina/b_Salir'))

WebUI.closeBrowser()


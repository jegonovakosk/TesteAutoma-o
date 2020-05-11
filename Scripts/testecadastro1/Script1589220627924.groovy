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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'nada1@nada.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mrs_id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'adssdaexcdcdvrfeg')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'ecddsffsdcds')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20202019201820172016201520142013201_ed0939'), 
    '2003', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'dasdsdsadasa')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'djkddjsakldjlkfjlkfj')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'colombo')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '00000')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '99999999999999')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/i_Register_icon-chevron-right right'))

WebUI.closeBrowser()


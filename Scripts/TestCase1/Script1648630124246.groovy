import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
//import org.testng.Assert
//import org.testng.asserts.SoftAssert;

//SoftAssert softAssertion=new SoftAssert();

// To specify the path to data files
String path = RunConfiguration.getProjectDir() + '/Data Files/'

// Pour récupérer le nombre de pages d'un pdf :
int numberOfPages = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.getPageNumber'(path + 'test_text1.pdf')
System.out.println(numberOfPages)

//softAssertion.assertEquals(7, 10)

assert numberOfPages == 7

// Pour récupérer le texte d'un PDF à partir d'une page :
String pdfTextFromAPage = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.getTextFromPage'(path + 'test_text1.pdf', 6)
System.out.println(pdfTextFromAPage)

// Pour récupérer le texte d'un PDF entre 2 pages :
//String pdfTextBetweenTwoPages = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.getTextInPageRange'(path + 'test_text1.pdf', 2, 3)
//System.out.println(pdfTextBetweenTwoPages)

// Pour récupérer tout le texte d'un PDF :
//String allPdfText = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.getAllText'(path + 'test_text1.pdf')
//System.out.println(allPdfText)

// Pour comparer tout le texte d'un PDF, à partir d'une page donnée :
//Boolean resultOfComparison = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.compareFromPage'(path + 'test_text1.pdf', path + 'test_text2.pdf', 3, null)
//System.out.println(resultOfComparison)
//assert resultOfComparison == true

// Pour comparer tout le texte d'un PDF, à partir d'une page donnée, en excluant des valeurs :
//Boolean resultOfComparisonWithExclusion = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.compareFromPage'(path + 'test_text1.pdf', path + 'test_text2.pdf', 1, ['1998', '1999'])
//System.out.println(resultOfComparisonWithExclusion)
//assert resultOfComparisonWithExclusion == true

// Pour comparer le texte d'un PDF, entre 2 pages données :
//Boolean resultOfComparisonBetweenTwoPages = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.compareInPageRange'(path + 'test_text1.pdf', path + 'test_text2.pdf', 1, 3, null)
//System.out.println(resultOfComparisonBetweenTwoPages)

// Pour comparer le texte d'un PDF, entre 2 pages données, en excluant des valeurs :
//Boolean resultOfComparisonBetweenTwoPagesWithExclusion = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.compareInPageRange'(path + 'test_text1.pdf', path + 'test_text2.pdf', 1, 3, ['1998', '1999'])
//System.out.println(resultOfComparisonBetweenTwoPagesWithExclusion)

// Pour comparer le texte d'un PDF sur toutes les pages :
//Boolean resultOfComparisonAllText = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.compareAllPages'(path + 'test_text1.pdf', path + 'test_text2.pdf', null)
//System.out.println(resultOfComparisonAllText)

// Pour comparer le texte d'un PDF sur toutes les pages, en excluant des valeurs :
//Boolean resultOfComparisonAllTextWithExclusion = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.compareAllPages'(path + 'test_text1.pdf', path + 'test_text2.pdf', ['1998', '1999'])
//System.out.println(resultOfComparisonAllTextWithExclusion)

// Pour comparer 2 PDF pixel par pixel :
//Boolean resultOfComparisonPixelByPixel = CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.compareByPixel'(path + 'test_image1_diff.pdf', path + 'test_image2_diff.pdf', -1, -1, true, true)
//System.out.println(resultOfComparisonPixelByPixel)
//assert resultOfComparisonPixelByPixel == true

// Pour sauvegarder à partir d'une page (ici la page 3) du PDF en images :
//CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.savePageAsImage'(path + 'test_text1.pdf', 3)

// Pour sauvegarder une plage de pages (ici de la page 3 à la page 4) du PDF en images :
//CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.savePageRangeAsImages'(path + 'test_text1.pdf', 3, 4)

// Pour sauvegarder toutes les pages du PDF en images :
//CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.saveAllPagesAsImages'(path + 'test_text1.pdf')

// Pour extraire les images d'un PDF à partir d'une page (ici la page 3) :
//CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.extractImagesFromPage'(path + 'test_text1.pdf', 3)

// Pour extraire les images d'une plage de pages d'un PDF (ici de la page 5 à la page 6)
//CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.extractImagesInPageRange'(path + 'test_text1.pdf', 5, 6)

// Pour sauvegarder toutes les images d'un PDF :
//CustomKeywords.'com.kms.katalon.keyword.pdf.PDF.extractAllImages'(path + 'test_text1.pdf')



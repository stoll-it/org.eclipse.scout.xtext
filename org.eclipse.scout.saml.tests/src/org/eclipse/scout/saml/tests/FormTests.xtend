package org.eclipse.scout.saml.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.scout.saml.SamlInjectorProvider
import org.eclipse.scout.saml.saml.Model
import org.eclipse.scout.saml.saml.SamlPackage
import org.eclipse.scout.saml.validation.SamlJavaValidator
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.diagnostics.Severity
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SamlInjectorProvider))
class FormTests {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Inject private Provider<XtextResourceSet> resourceSetProvider;
	
	static val BIGDECIMAL_CONVERSION_ERROR_MESSAGE = 'Could not convert empty string to BigDecimal'
	static val LONG_CONVERSION_ERROR_MESSAGE = 'Could not convert empty string to Long'

	@Test
	def void testFormFieldUniqueness() {
		'''
		module a.b
		
		form MyForm width_pixels=1000 {
			sequence MyBox {
				string my
			}
			sequence MyBox2 {
				string my
			}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.formElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE_FIELD)
		
		'''
		module a.b
		
		form MyForm {
			date d1
			date d2
			date d1
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.formElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE_FIELD)
		
		'''
		module a.b
		
		form MyForm {
			sequence MyBox {
				string my
			}
			sequence MyBox2 {
				string my2
			}
		}
		
		form MyForm2 {
			string my
			string my2
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testSimpleForm() {
		'''
		module a.b
		
		form MyForm {
			sequence MyBox {
				string myString
				long mylong {
					logic event=changed placement=server { "" }
				}
				sequence asdf {
					
				}
			}
		}
		'''.parse.assertNoErrors
	}

	@Test
	def void testMasterAttribute() {
		'''
		module a.b
		
		form MyForm {
			string test1
			
			sequence MyBox3 {
				string string1
			}
			
			sequence MyBox {
				string my master=test1
				string my2 master=string1
			}
		}
		
		form MyForm2 {
			string test1
			string string1 master=test1
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testFormUniquencessOverFiles() {
		val rs = resourceSetProvider.get()
		'''
		module a.b
		form FormA {
			
		}
		'''.parse(rs).assertNoErrors
		
		'''
		module a.b
		form FormA {
			
		}
		'''.parse(rs).assertError(SamlPackage::eINSTANCE.formElement, SamlJavaValidator::DUPLICATE, SamlJavaValidator::MSG_DUPLICATE)
		
		
		val rs2 = resourceSetProvider.get()
		'''
		module a.b
		translation T1 en="en"
		form FormA title=T1 {
			string StringA
		}
		'''.parse(rs2).assertNoErrors
		
		'''
		module a.b
		form FormB title=T1 {
			string StringA
		}
		'''.parse(rs2).assertNoErrors
	}
	
	@Test
	def void testTabs() {
		'''
		module a.b
		
		
		form TabTest02 {
			tab MyTab {
					string MyString
				}
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.tabElement, SamlJavaValidator::TAB_ONLY_IN_TABBOX, SamlJavaValidator::MSG_TAB_ONLY_IN_TABBOX)
	}
	
	@Test
	def void testDiscardEvent() {
		'''
		module a.b
		form FormA {
			logic event=modify_discard placement=server {
				"java logic"
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testTabBox() {
		'''
		module a.b
		
		translation Tab01Text de="Tab 1"
		translation Tab02Text de="Tab 2"
		translation ListText de="ListBox"
		
		code MyCode id="Integer.valueOf(100)"
		
		form TabTest01 columns=1 {
			group Grp01 columns=1 width=1 {
				tabbox MyTab {
					tab Detail text=Tab01Text {
						long TestLong
						string TestString
					}
					tab Documents text=Tab02Text {
						date TestDate
						bigdecimal TestDecimal
					}
				}
			}
			group Grp02 columns=1 width=1 {
				list MyList text=ListText code=MyCode height=4
			}
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testCheckbox() {
		'''
		module a.b
		
		translation texts.chkbox01 de="aa"
		
		form TabTest01 columns=1 {
			check MyTestCheckbox text=texts.chkbox01 enabled=false visible=false width=3 width_pixels=100 label_visible=false mandatory=true 
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testFileChooserMode() {
		'''
		module a.b
		form FileChooserTest {
			filechooser TestFileChooser1 mode=directory show_filename=true
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.fileChooserElement, SamlJavaValidator::ONLY_FOR_MODE_FILE, SamlJavaValidator::MSG_ONLY_FOR_MODE_FILE)
		
		'''
		module a.b
		form FileChooserTest {
			filechooser TestFileChooser2 mode=directory show_extension=true
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.fileChooserElement, SamlJavaValidator::ONLY_FOR_MODE_FILE, SamlJavaValidator::MSG_ONLY_FOR_MODE_FILE)
		
		'''
		module a.b
		form FileChooserTest {
			filechooser TestFileChooser3 mode=directory extensions="png jpg"
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.fileChooserElement, SamlJavaValidator::ONLY_FOR_MODE_FILE, SamlJavaValidator::MSG_ONLY_FOR_MODE_FILE)
	}
	
	@Test
	def void testOkButton() {
		'''
		module a.b
		
		translation texts.okbutt de="Ok"
		
		form TabTest01 columns=1 {
			button TestOkButton text=texts.okbutt process_button=true type=ok
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testBigDecimalFormats() {
		'''
		module a.b
		
		form TabTest01 {
			bigdecimal TestOk format="0000"
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		form TabTest01 {
			bigdecimal TestOk grouping=false fraction_digits=2
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		form TabTest01 {
			bigdecimal TestOk format="0000" grouping=false
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.bigDecimalElement, SamlJavaValidator::FORMAT_CONFLICTING, SamlJavaValidator::MSG_FORMAT_CONFLICTING)
		
		'''
		module a.b
		
		form TabTest01 {
			bigdecimal TestOk format="0000" fraction_digits=2
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.bigDecimalElement, SamlJavaValidator::FORMAT_CONFLICTING, SamlJavaValidator::MSG_FORMAT_CONFLICTING)
		
		'''
		module a.b
		
		form TabTest01 {
			bigdecimal TestOk format="0000" grouping=false  fraction_digits=2
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.bigDecimalElement, SamlJavaValidator::FORMAT_CONFLICTING, SamlJavaValidator::MSG_FORMAT_CONFLICTING)
	}
	
	@Test
	def void testStringFieldRegexValidation() {
		'''
		module a.b
		
		form RegexValidationTest {
			string ValidRegex regex_validation="[0-9]{1}"
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		form RegexValidationTest {
			string InvalidRegex regex_validation="[0-9]{A}"
		}
		'''.parse.assertError(SamlPackage::eINSTANCE.stringElement, SamlJavaValidator::INVALID_REGEX, String::format(SamlJavaValidator::MSG_INVALID_REGEX, "[0-9]{A}"))
	}
	
	@Test
	def void testLabel() {
		'''
		module a.b
		
		translation texts.label01 de="aa"
		
		form LabelTest columns=1 {
			label MyLabel text=texts.label01 enabled=true visible=true width=3 width_pixels=100 label_visible=false wrap_text=true
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testBigDecimalMinMaxValue() {
		'''
		module a.b
		
		form BigDecimalTestOk {
			bigdecimal BigDecimalTest min=-10000.0123 max=20000.456
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		form BigDecimalTestMissingMaxValue {
			bigdecimal BigDecimalTest min=-10000.13 max=
		}
		'''.parse.assertIssue(SamlPackage::eINSTANCE.bigDecimalElement, Diagnostic::SYNTAX_DIAGNOSTIC, Severity::ERROR, BIGDECIMAL_CONVERSION_ERROR_MESSAGE)
		
		'''
		module a.b
		
		form BigDecimalTestMissingMinValue {
			bigdecimal BigDecimalTest max=0.89 min=
		}
		'''.parse.assertIssue(SamlPackage::eINSTANCE.bigDecimalElement, Diagnostic::SYNTAX_DIAGNOSTIC, Severity::ERROR, BIGDECIMAL_CONVERSION_ERROR_MESSAGE)
		
				'''
		module a.b
		
		form BigDecimalTestMissingMinMaxValues {
			bigdecimal BigDecimalTest max= min=
		}
		'''.parse.assertIssue(SamlPackage::eINSTANCE.bigDecimalElement, Diagnostic::SYNTAX_DIAGNOSTIC, Severity::ERROR, BIGDECIMAL_CONVERSION_ERROR_MESSAGE)
	}
	
	@Test
	def void testLongMinMaxValue() {
		'''
		module a.b
		
		form LongTestOk {
			long LongTest min=-10000 max=20000
		}
		'''.parse.assertNoErrors
		
		'''
		module a.b
		
		form LongTestMissingMaxValue {
			long LongTest min=-10000 max=
		}
		'''.parse.assertIssue(SamlPackage::eINSTANCE.longElement, Diagnostic::SYNTAX_DIAGNOSTIC, Severity::ERROR, LONG_CONVERSION_ERROR_MESSAGE)
		
		'''
		module a.b
		
		form LongTestMissingMinValue {
			long LongTest max=10000 min=
		}
		'''.parse.assertIssue(SamlPackage::eINSTANCE.longElement, Diagnostic::SYNTAX_DIAGNOSTIC, Severity::ERROR, LONG_CONVERSION_ERROR_MESSAGE)
		
		'''
		module a.b
		
		form LongTestMissingMinMaxValues {
			long LongTest max= min=
		}
		'''.parse.assertIssue(SamlPackage::eINSTANCE.longElement, Diagnostic::SYNTAX_DIAGNOSTIC, Severity::ERROR, LONG_CONVERSION_ERROR_MESSAGE)
	}	
}
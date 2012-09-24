/*
* generated by Xtext
*/
package org.eclipse.scout.saml.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.scout.saml.services.SamlGrammarAccess;

public class SamlParser extends AbstractContentAssistParser {
	
	@Inject
	private SamlGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.scout.saml.ui.contentassist.antlr.internal.InternalSamlParser createParser() {
		org.eclipse.scout.saml.ui.contentassist.antlr.internal.InternalSamlParser result = new org.eclipse.scout.saml.ui.contentassist.antlr.internal.InternalSamlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRootElementAccess().getAlternatives(), "rule__RootElement__Alternatives");
					put(grammarAccess.getAbstractScoutTypeAccess().getAlternatives(), "rule__AbstractScoutType__Alternatives");
					put(grammarAccess.getAbstractFieldElementAccess().getAlternatives(), "rule__AbstractFieldElement__Alternatives");
					put(grammarAccess.getAbstractFieldPropertiesAccess().getAlternatives(), "rule__AbstractFieldProperties__Alternatives");
					put(grammarAccess.getAbstractValueFieldElementAccess().getAlternatives(), "rule__AbstractValueFieldElement__Alternatives");
					put(grammarAccess.getAbstractValueFieldPropertiesAccess().getAlternatives(), "rule__AbstractValueFieldProperties__Alternatives");
					put(grammarAccess.getLogicOptionalPropertiesAccess().getAlternatives(), "rule__LogicOptionalProperties__Alternatives");
					put(grammarAccess.getLookupElementAccess().getServicelogicAlternatives_3_0(), "rule__LookupElement__ServicelogicAlternatives_3_0");
					put(grammarAccess.getFormElementAccess().getElementsAlternatives_6_0(), "rule__FormElement__ElementsAlternatives_6_0");
					put(grammarAccess.getSequenceBoxElementAccess().getChildrenAlternatives_3_1_0(), "rule__SequenceBoxElement__ChildrenAlternatives_3_1_0");
					put(grammarAccess.getStringElementPropertiesAccess().getAlternatives(), "rule__StringElementProperties__Alternatives");
					put(grammarAccess.getSmartFieldElementPropertiesAccess().getAlternatives(), "rule__SmartFieldElementProperties__Alternatives");
					put(grammarAccess.getBooleanTypeAccess().getAlternatives(), "rule__BooleanType__Alternatives");
					put(grammarAccess.getJavaRunAtAttributeListAccess().getAlternatives(), "rule__JavaRunAtAttributeList__Alternatives");
					put(grammarAccess.getLogicTypeAttributeListAccess().getAlternatives(), "rule__LogicTypeAttributeList__Alternatives");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getTextAttributeAccess().getGroup(), "rule__TextAttribute__Group__0");
					put(grammarAccess.getEnabledAttribueAccess().getGroup(), "rule__EnabledAttribue__Group__0");
					put(grammarAccess.getVisibleAttribueAccess().getGroup(), "rule__VisibleAttribue__Group__0");
					put(grammarAccess.getMasterAttributeAccess().getGroup(), "rule__MasterAttribute__Group__0");
					put(grammarAccess.getMandatoryAttribueAccess().getGroup(), "rule__MandatoryAttribue__Group__0");
					put(grammarAccess.getModuleElementAccess().getGroup(), "rule__ModuleElement__Group__0");
					put(grammarAccess.getTranslationElementAccess().getGroup(), "rule__TranslationElement__Group__0");
					put(grammarAccess.getTranslationAttributeAccess().getGroup(), "rule__TranslationAttribute__Group__0");
					put(grammarAccess.getJavaElementAccess().getGroup(), "rule__JavaElement__Group__0");
					put(grammarAccess.getRunAtAttributeAccess().getGroup(), "rule__RunAtAttribute__Group__0");
					put(grammarAccess.getCodeElementAccess().getGroup(), "rule__CodeElement__Group__0");
					put(grammarAccess.getCodeIdAttributeAccess().getGroup(), "rule__CodeIdAttribute__Group__0");
					put(grammarAccess.getLogicElementAccess().getGroup(), "rule__LogicElement__Group__0");
					put(grammarAccess.getLogicElementAccess().getGroup_3(), "rule__LogicElement__Group_3__0");
					put(grammarAccess.getLogicTypeAttributeAccess().getGroup(), "rule__LogicTypeAttribute__Group__0");
					put(grammarAccess.getLogicExecAttributeAccess().getGroup(), "rule__LogicExecAttribute__Group__0");
					put(grammarAccess.getLookupElementAccess().getGroup(), "rule__LookupElement__Group__0");
					put(grammarAccess.getTemplateElementAccess().getGroup(), "rule__TemplateElement__Group__0");
					put(grammarAccess.getTemplateElementClassAttributeAccess().getGroup(), "rule__TemplateElementClassAttribute__Group__0");
					put(grammarAccess.getTemplateElementReplacesAttributeAccess().getGroup(), "rule__TemplateElementReplacesAttribute__Group__0");
					put(grammarAccess.getFormElementAccess().getGroup(), "rule__FormElement__Group__0");
					put(grammarAccess.getFormElementModalAttributeAccess().getGroup(), "rule__FormElementModalAttribute__Group__0");
					put(grammarAccess.getFormElementColumnsAttributeAccess().getGroup(), "rule__FormElementColumnsAttribute__Group__0");
					put(grammarAccess.getSequenceBoxElementAccess().getGroup(), "rule__SequenceBoxElement__Group__0");
					put(grammarAccess.getSequenceBoxElementAccess().getGroup_3(), "rule__SequenceBoxElement__Group_3__0");
					put(grammarAccess.getStringElementAccess().getGroup(), "rule__StringElement__Group__0");
					put(grammarAccess.getStringElementAccess().getGroup_3(), "rule__StringElement__Group_3__0");
					put(grammarAccess.getStringElementMaxlenAttributeAccess().getGroup(), "rule__StringElementMaxlenAttribute__Group__0");
					put(grammarAccess.getDoubleElementAccess().getGroup(), "rule__DoubleElement__Group__0");
					put(grammarAccess.getDoubleElementAccess().getGroup_3(), "rule__DoubleElement__Group_3__0");
					put(grammarAccess.getLongElementAccess().getGroup(), "rule__LongElement__Group__0");
					put(grammarAccess.getLongElementAccess().getGroup_3(), "rule__LongElement__Group_3__0");
					put(grammarAccess.getDateElementAccess().getGroup(), "rule__DateElement__Group__0");
					put(grammarAccess.getDateElementAccess().getGroup_3(), "rule__DateElement__Group_3__0");
					put(grammarAccess.getSmartfieldElementAccess().getGroup(), "rule__SmartfieldElement__Group__0");
					put(grammarAccess.getSmartfieldElementAccess().getGroup_3(), "rule__SmartfieldElement__Group_3__0");
					put(grammarAccess.getSmartfieldElementCodeAttributeAccess().getGroup(), "rule__SmartfieldElementCodeAttribute__Group__0");
					put(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getGroup(), "rule__SmartfieldElementValueTypeAttribute__Group__0");
					put(grammarAccess.getSmartfieldElementLookupAttributeAccess().getGroup(), "rule__SmartfieldElementLookupAttribute__Group__0");
					put(grammarAccess.getZregBoxElementAccess().getGroup(), "rule__ZregBoxElement__Group__0");
					put(grammarAccess.getZregBoxElementAccess().getGroup_3(), "rule__ZregBoxElement__Group_3__0");
					put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
					put(grammarAccess.getAbstractFieldPropertiesAccess().getTextAssignment_0(), "rule__AbstractFieldProperties__TextAssignment_0");
					put(grammarAccess.getAbstractFieldPropertiesAccess().getVisibleAssignment_1(), "rule__AbstractFieldProperties__VisibleAssignment_1");
					put(grammarAccess.getAbstractFieldPropertiesAccess().getMasterAssignment_2(), "rule__AbstractFieldProperties__MasterAssignment_2");
					put(grammarAccess.getAbstractFieldPropertiesAccess().getEnabledAssignment_3(), "rule__AbstractFieldProperties__EnabledAssignment_3");
					put(grammarAccess.getTextAttributeAccess().getValueAssignment_1(), "rule__TextAttribute__ValueAssignment_1");
					put(grammarAccess.getEnabledAttribueAccess().getValueAssignment_1(), "rule__EnabledAttribue__ValueAssignment_1");
					put(grammarAccess.getVisibleAttribueAccess().getValueAssignment_1(), "rule__VisibleAttribue__ValueAssignment_1");
					put(grammarAccess.getMasterAttributeAccess().getValueAssignment_1(), "rule__MasterAttribute__ValueAssignment_1");
					put(grammarAccess.getAbstractValueFieldPropertiesAccess().getMandatoryAssignment_1(), "rule__AbstractValueFieldProperties__MandatoryAssignment_1");
					put(grammarAccess.getMandatoryAttribueAccess().getValueAssignment_1(), "rule__MandatoryAttribue__ValueAssignment_1");
					put(grammarAccess.getModuleElementAccess().getNameAssignment_1(), "rule__ModuleElement__NameAssignment_1");
					put(grammarAccess.getTranslationElementAccess().getNameAssignment_1(), "rule__TranslationElement__NameAssignment_1");
					put(grammarAccess.getTranslationElementAccess().getTranslationsAssignment_2(), "rule__TranslationElement__TranslationsAssignment_2");
					put(grammarAccess.getTranslationAttributeAccess().getLangAssignment_0(), "rule__TranslationAttribute__LangAssignment_0");
					put(grammarAccess.getTranslationAttributeAccess().getTypeAssignment_2(), "rule__TranslationAttribute__TypeAssignment_2");
					put(grammarAccess.getJavaElementAccess().getNameAssignment_1(), "rule__JavaElement__NameAssignment_1");
					put(grammarAccess.getJavaElementAccess().getRunatAssignment_2(), "rule__JavaElement__RunatAssignment_2");
					put(grammarAccess.getJavaElementAccess().getSourceAssignment_4(), "rule__JavaElement__SourceAssignment_4");
					put(grammarAccess.getRunAtAttributeAccess().getValueAssignment_1(), "rule__RunAtAttribute__ValueAssignment_1");
					put(grammarAccess.getCodeElementAccess().getNameAssignment_1(), "rule__CodeElement__NameAssignment_1");
					put(grammarAccess.getCodeElementAccess().getIdAssignment_2(), "rule__CodeElement__IdAssignment_2");
					put(grammarAccess.getCodeIdAttributeAccess().getValueAssignment_1(), "rule__CodeIdAttribute__ValueAssignment_1");
					put(grammarAccess.getLogicElementAccess().getTypeAssignment_1(), "rule__LogicElement__TypeAssignment_1");
					put(grammarAccess.getLogicElementAccess().getPropertiesAssignment_2(), "rule__LogicElement__PropertiesAssignment_2");
					put(grammarAccess.getLogicElementAccess().getSourceAssignment_3_1(), "rule__LogicElement__SourceAssignment_3_1");
					put(grammarAccess.getLogicOptionalPropertiesAccess().getRunatAssignment_0(), "rule__LogicOptionalProperties__RunatAssignment_0");
					put(grammarAccess.getLogicOptionalPropertiesAccess().getExecAssignment_1(), "rule__LogicOptionalProperties__ExecAssignment_1");
					put(grammarAccess.getLogicTypeAttributeAccess().getValueAssignment_1(), "rule__LogicTypeAttribute__ValueAssignment_1");
					put(grammarAccess.getLogicExecAttributeAccess().getValueAssignment_1(), "rule__LogicExecAttribute__ValueAssignment_1");
					put(grammarAccess.getLookupElementAccess().getNameAssignment_1(), "rule__LookupElement__NameAssignment_1");
					put(grammarAccess.getLookupElementAccess().getServicelogicAssignment_3(), "rule__LookupElement__ServicelogicAssignment_3");
					put(grammarAccess.getTemplateElementAccess().getNameAssignment_1(), "rule__TemplateElement__NameAssignment_1");
					put(grammarAccess.getTemplateElementAccess().getClassAssignment_2(), "rule__TemplateElement__ClassAssignment_2");
					put(grammarAccess.getTemplateElementAccess().getReplacesAssignment_3(), "rule__TemplateElement__ReplacesAssignment_3");
					put(grammarAccess.getTemplateElementClassAttributeAccess().getValueAssignment_1(), "rule__TemplateElementClassAttribute__ValueAssignment_1");
					put(grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAssignment_1(), "rule__TemplateElementReplacesAttribute__ValueAssignment_1");
					put(grammarAccess.getFormElementAccess().getNameAssignment_1(), "rule__FormElement__NameAssignment_1");
					put(grammarAccess.getFormElementAccess().getModalAssignment_2(), "rule__FormElement__ModalAssignment_2");
					put(grammarAccess.getFormElementAccess().getTextAssignment_3(), "rule__FormElement__TextAssignment_3");
					put(grammarAccess.getFormElementAccess().getColumnsAssignment_4(), "rule__FormElement__ColumnsAssignment_4");
					put(grammarAccess.getFormElementAccess().getElementsAssignment_6(), "rule__FormElement__ElementsAssignment_6");
					put(grammarAccess.getFormElementModalAttributeAccess().getValueAssignment_1(), "rule__FormElementModalAttribute__ValueAssignment_1");
					put(grammarAccess.getFormElementColumnsAttributeAccess().getValueAssignment_1(), "rule__FormElementColumnsAttribute__ValueAssignment_1");
					put(grammarAccess.getSequenceBoxElementAccess().getNameAssignment_1(), "rule__SequenceBoxElement__NameAssignment_1");
					put(grammarAccess.getSequenceBoxElementAccess().getPropertiesAssignment_2(), "rule__SequenceBoxElement__PropertiesAssignment_2");
					put(grammarAccess.getSequenceBoxElementAccess().getChildrenAssignment_3_1(), "rule__SequenceBoxElement__ChildrenAssignment_3_1");
					put(grammarAccess.getStringElementAccess().getNameAssignment_1(), "rule__StringElement__NameAssignment_1");
					put(grammarAccess.getStringElementAccess().getPropertiesAssignment_2(), "rule__StringElement__PropertiesAssignment_2");
					put(grammarAccess.getStringElementAccess().getLogicAssignment_3_1(), "rule__StringElement__LogicAssignment_3_1");
					put(grammarAccess.getStringElementPropertiesAccess().getMaxlenAssignment_1(), "rule__StringElementProperties__MaxlenAssignment_1");
					put(grammarAccess.getStringElementMaxlenAttributeAccess().getValueAssignment_1(), "rule__StringElementMaxlenAttribute__ValueAssignment_1");
					put(grammarAccess.getDoubleElementAccess().getNameAssignment_1(), "rule__DoubleElement__NameAssignment_1");
					put(grammarAccess.getDoubleElementAccess().getPropertiesAssignment_2(), "rule__DoubleElement__PropertiesAssignment_2");
					put(grammarAccess.getDoubleElementAccess().getChildrenAssignment_3_1(), "rule__DoubleElement__ChildrenAssignment_3_1");
					put(grammarAccess.getLongElementAccess().getNameAssignment_1(), "rule__LongElement__NameAssignment_1");
					put(grammarAccess.getLongElementAccess().getPropertiesAssignment_2(), "rule__LongElement__PropertiesAssignment_2");
					put(grammarAccess.getLongElementAccess().getChildrenAssignment_3_1(), "rule__LongElement__ChildrenAssignment_3_1");
					put(grammarAccess.getDateElementAccess().getNameAssignment_1(), "rule__DateElement__NameAssignment_1");
					put(grammarAccess.getDateElementAccess().getPropertiesAssignment_2(), "rule__DateElement__PropertiesAssignment_2");
					put(grammarAccess.getDateElementAccess().getChildrenAssignment_3_1(), "rule__DateElement__ChildrenAssignment_3_1");
					put(grammarAccess.getSmartfieldElementAccess().getNameAssignment_1(), "rule__SmartfieldElement__NameAssignment_1");
					put(grammarAccess.getSmartfieldElementAccess().getPropertiesAssignment_2(), "rule__SmartfieldElement__PropertiesAssignment_2");
					put(grammarAccess.getSmartfieldElementAccess().getLogicAssignment_3_1(), "rule__SmartfieldElement__LogicAssignment_3_1");
					put(grammarAccess.getSmartFieldElementPropertiesAccess().getCodeAssignment_1(), "rule__SmartFieldElementProperties__CodeAssignment_1");
					put(grammarAccess.getSmartFieldElementPropertiesAccess().getValue_typeAssignment_2(), "rule__SmartFieldElementProperties__Value_typeAssignment_2");
					put(grammarAccess.getSmartFieldElementPropertiesAccess().getLookupAssignment_3(), "rule__SmartFieldElementProperties__LookupAssignment_3");
					put(grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueAssignment_1(), "rule__SmartfieldElementCodeAttribute__ValueAssignment_1");
					put(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueAssignment_1(), "rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1");
					put(grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueAssignment_1(), "rule__SmartfieldElementLookupAttribute__ValueAssignment_1");
					put(grammarAccess.getZregBoxElementAccess().getNameAssignment_1(), "rule__ZregBoxElement__NameAssignment_1");
					put(grammarAccess.getZregBoxElementAccess().getPropertiesAssignment_2(), "rule__ZregBoxElement__PropertiesAssignment_2");
					put(grammarAccess.getZregBoxElementAccess().getChildrenAssignment_3_1(), "rule__ZregBoxElement__ChildrenAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.scout.saml.ui.contentassist.antlr.internal.InternalSamlParser typedParser = (org.eclipse.scout.saml.ui.contentassist.antlr.internal.InternalSamlParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SamlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SamlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

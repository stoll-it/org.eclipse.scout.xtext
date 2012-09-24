/*
* generated by Xtext
*/
package org.eclipse.scout.saml.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.scout.saml.services.SamlGrammarAccess;

public class SamlParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SamlGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.scout.saml.parser.antlr.internal.InternalSamlParser createParser(XtextTokenStream stream) {
		return new org.eclipse.scout.saml.parser.antlr.internal.InternalSamlParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public SamlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SamlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}

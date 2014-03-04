/*
* generated by Xtext
*/
package be.kuleuven.learning.simplefsm.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import be.kuleuven.learning.simplefsm.services.SfsmGrammarAccess;

public class SfsmParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SfsmGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected be.kuleuven.learning.simplefsm.parser.antlr.internal.InternalSfsmParser createParser(XtextTokenStream stream) {
		return new be.kuleuven.learning.simplefsm.parser.antlr.internal.InternalSfsmParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SimpleFiniteStateMachine";
	}
	
	public SfsmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SfsmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
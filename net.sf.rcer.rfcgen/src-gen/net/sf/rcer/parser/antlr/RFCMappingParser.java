/*
* generated by Xtext
*/
package net.sf.rcer.parser.antlr;

import org.antlr.runtime.ANTLRInputStream;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.ParseException;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

import com.google.inject.Inject;

import net.sf.rcer.services.RFCMappingGrammarAccess;

public class RFCMappingParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject 
    protected ITokenDefProvider antlrTokenDefProvider;
	
	@Inject
	private RFCMappingGrammarAccess grammarAccess;
	
	@Override
	protected IParseResult parse(String ruleName, ANTLRInputStream in) {
		net.sf.rcer.parser.antlr.internal.InternalRFCMappingLexer lexer = new net.sf.rcer.parser.antlr.internal.InternalRFCMappingLexer(in);
		XtextTokenStream stream = new XtextTokenStream(lexer, antlrTokenDefProvider);
		stream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		net.sf.rcer.parser.antlr.internal.InternalRFCMappingParser parser = new net.sf.rcer.parser.antlr.internal.InternalRFCMappingParser(
				stream, getElementFactory(), grammarAccess);
		parser.setTokenTypeMap(antlrTokenDefProvider.getTokenDefMap());
		try {
			if(ruleName != null)
				return parser.parse(ruleName);
			return parser.parse();
		} catch (Exception re) {
			throw new ParseException(re.getMessage(),re);
		}
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public RFCMappingGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RFCMappingGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

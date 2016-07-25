package edu.tx.utep.ltlgenerator.factories; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.LTLCharacters;
import edu.tx.utep.ltlgenerator.LTLGenerator;
import edu.tx.utep.ltlgenerator.LTLPatternType;
import edu.tx.utep.ltlgenerator.LTLScopeType;
import edu.tx.utep.ltlgenerator.exceptions.LTLScopeTypeNotFoundException;

//Abstract Factory
public abstract class LTLGeneratorFactory {

	protected LTLGenerator ltlGenerator = new LTLGenerator();

	public static LTLGeneratorFactory getLTLGeneratorFactory(LTLScopeType ltlScopeType) throws LTLScopeTypeNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","START","14");

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","14","16");		switch (ltlScopeType) {
		case Global:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","16","18");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","18","EXIT");			return new GlobalFactory();

		case BeforeR:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","16","21");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","21","EXIT");			return new BeforeRFactory();

		case AfterL:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","16","24");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","24","EXIT");			return new AfterLFactory();

		case BetweenLAndR:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","16","27");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","27","EXIT");			return new BetweenLAndRFactory();

		case AfterLUntilR:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","16","30");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","30","EXIT");			return new AfterLUntilRFactory();

		default:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","16","33");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getLTLGeneratorFactory(edu.tx.utep.ltlgenerator.LTLScopeType).xml","33","EXIT");			throw new LTLScopeTypeNotFoundException(ltlScopeType.toString());
		}
	}

	public abstract String getLTLFormula(LTLPatternType ltlPatternType, String p, String q, String r, String l);

	protected static boolean isCompositePropositionOfTypeC(String cp) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeC(java.lang.String).xml","START","39");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeC(java.lang.String).xml","39","40");		int cpTypeLetterIndicatorIndex = getCPTypeLetterIndicatorIndex(cp);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeC(java.lang.String).xml","40","41");		if (cp.charAt(cpTypeLetterIndicatorIndex) == 'C') {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeC(java.lang.String).xml","41","42");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeC(java.lang.String).xml","42","EXIT");			return true;
		} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeC(java.lang.String).xml","41","44");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeC(java.lang.String).xml","44","EXIT");			return false;
		}
	}

	protected static boolean isCompositePropositionOfTypeE(String cp) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeE(java.lang.String).xml","START","48");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeE(java.lang.String).xml","48","49");		int cpTypeLetterIndicatorIndex = getCPTypeLetterIndicatorIndex(cp);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeE(java.lang.String).xml","49","50");		if (cp.charAt(cpTypeLetterIndicatorIndex) == 'E') {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeE(java.lang.String).xml","50","51");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeE(java.lang.String).xml","51","EXIT");			return true;
		} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeE(java.lang.String).xml","50","53");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","isCompositePropositionOfTypeE(java.lang.String).xml","53","EXIT");			return false;
		}
	}

	private static int getCPTypeLetterIndicatorIndex(String cp) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getCPTypeLetterIndicatorIndex(java.lang.String).xml","START","57");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getCPTypeLetterIndicatorIndex(java.lang.String).xml","57","58");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\LTLGeneratorFactory\\","getCPTypeLetterIndicatorIndex(java.lang.String).xml","58","EXIT");		return cp.lastIndexOf(LTLCharacters.CP_SEPARATOR) - 1;
	}
}

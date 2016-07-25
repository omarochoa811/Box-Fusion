package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public abstract class CompositeProposition {

	protected static final String CPT_AND = "and";
	protected static final String CPT_OR = "or";
	protected static final String CPT_NOT_AND = "notAnd";
	protected static final String CPT_NOT_OR = "notOr";

	// Template Method Pattern
	public List<String> generateLTLFormulaArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateLTLFormulaArray(java.lang.String,I).xml","START","15");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateLTLFormulaArray(java.lang.String,I).xml","15","16");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateLTLFormulaArray(java.lang.String,I).xml","16","EXIT");		return generateLTLArray(letter, count);
	}

	protected abstract List<String> generateLTLArray(String letter, int count);

	protected String generateProposition(String cpType, String letter, int firstProposition, int lastProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I).xml","START","21");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I).xml","21","22");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I).xml","22","EXIT");		return generateProposition(cpType, letter, firstProposition, lastProposition, true);
	}

	protected String generateProposition(String cpType, String letter, int firstProposition, int lastProposition, boolean addNotToTheFirstOne) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","START","25");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","25","26");		switch (cpType) {
		case CPT_AND:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","26","28");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","28","EXIT");			return generateProposition(letter, firstProposition, lastProposition, OutputCharacters.AND, "", addNotToTheFirstOne);
		case CPT_NOT_AND:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","26","30");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","30","EXIT");			return generateProposition(letter, firstProposition, lastProposition, OutputCharacters.AND, OutputCharacters.NOT, addNotToTheFirstOne);
		case CPT_OR:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","26","32");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","32","EXIT");			return generateProposition(letter, firstProposition, lastProposition, OutputCharacters.OR, "", addNotToTheFirstOne);
		case CPT_NOT_OR:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","26","34");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","34","EXIT");			return generateProposition(letter, firstProposition, lastProposition, OutputCharacters.OR, OutputCharacters.NOT, addNotToTheFirstOne);
		default:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","26","36");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,Ljava.lang.String,I,I,Z).xml","36","EXIT");			return "ERROR No CPType of " + cpType;
		}
	}

	private String generateProposition(String letter, int firstProposition, int lastProposition, String andOr, String not, boolean addNotToTheFirstOne) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","START","40");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","40","41");		StringBuilder output = new StringBuilder();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","50","42");		for (int i = firstProposition; i <= lastProposition; i++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","42","43");			if (addNotToTheFirstOne && i == firstProposition) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","43","44");				output.append(not);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","44","45");			} else if (i > firstProposition) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","45","46");				output.append(not);
			}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","46","48");			output.append(letter).append(i);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","48","49");			if (i < lastProposition)
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","49","50");				output.append(andOr);
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","42","52");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\CompositeProposition\\","generateProposition(java.lang.String,I,I,Ljava.lang.String,Ljava.lang.String,Z).xml","52","EXIT");		return output.toString();
	}

}

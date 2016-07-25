package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class ConsecutiveH extends CompositeProposition {

	// private static String cpFormula = "(p1 ^ !p2 ^ !p3 ^ !p4 ^ X(p2 ^ !p3 ^ !p4 ^ X(p3 ^ !p4 ^ Xp4)))";

	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","13","14");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","14","15");		String closingParentheses = "";

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","25","17");		for (int n = 1; n < count; n++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","17","18");			output.add(OutputCharacters.OPEN_P + generateProposition(CPT_NOT_AND, letter, n, count, false));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","18","19");			output.add(OutputCharacters.AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","19","20");			output.add(OutputCharacters.NEXT);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","20","22");			if (n + 1 == count) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","22","23");				output.add(OutputCharacters.OPEN_P + letter + ++n);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","23","24");				closingParentheses += OutputCharacters.CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","24","25");				n--;
			}
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","30","29");		for (int n = 1; n < count; n++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","29","30");			closingParentheses += OutputCharacters.CLOSE_P;
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","29","33");		output.add(closingParentheses);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","33","35");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveH\\","generateLTLArray(java.lang.String,I).xml","35","EXIT");		return output;
	}
}

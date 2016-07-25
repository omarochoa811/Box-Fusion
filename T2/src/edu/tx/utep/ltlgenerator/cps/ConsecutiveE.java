package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class ConsecutiveE extends CompositeProposition {

	// private static String cpFormula = "(!l1 ^ !l2 ^ !l3 ^ !l4) ^ ((!l1 ^ !l2 ^ !l3 ^ !l4) U (l1 ^ !l2 ^ !l3 ^ !l4 ^ X(l2 ^ !l3 ^ !l4 ^ X(l3 ^ !l4 ^ Xl4))))";
	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","START","12");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","12","13");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","13","14");		StringBuilder intermediateString = new StringBuilder();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","14","15");		String closingParens = "";

		// Initial String (Not Repetitive)
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","15","18");		output.add(OutputCharacters.OPEN_P + generateProposition(CPT_NOT_AND, letter, 1, count) + OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","18","19");		output.add(OutputCharacters.AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","19","20");		output.add(OutputCharacters.OPEN_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","20","21");		output.add(OutputCharacters.OPEN_P + generateProposition(CPT_NOT_AND, letter, 1, count) + OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","21","22");		output.add(OutputCharacters.UNTIL);

		// Repetitive Pattern
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","38","25");		for (int i = 1; i < count; i++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","25","26");			intermediateString.setLength(0);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","26","27");			intermediateString.append(OutputCharacters.OPEN_P).append(generateProposition(CPT_NOT_AND, letter, i, count, false));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","27","28");			output.add(intermediateString.toString());

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","28","30");			output.add(OutputCharacters.AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","30","31");			output.add(OutputCharacters.NEXT);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","31","32");			if (i + 1 == count) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","32","33");				intermediateString.setLength(0);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","33","34");				intermediateString.append(OutputCharacters.OPEN_P).append(letter).append(i + 1).append(OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","34","35");				output.add(intermediateString.toString());
			}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","35","38");			closingParens = closingParens + OutputCharacters.CLOSE_P;
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","25","41");		output.add(closingParens + OutputCharacters.CLOSE_P);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","41","43");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveE\\","generateLTLArray(java.lang.String,I).xml","43","EXIT");		return output;
	}
}

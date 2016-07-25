package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class EventualC extends CompositeProposition {

	// private static String cpFormula = "(q1 ^ X(!q2 U (q2 ^ X(!q3 U (q3 ^ X(!q4 U q4))))))";

	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","13","14");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","14","15");		String closingParentheses = "";

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","30","17");		for (int n = 1; n <= count; n++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","17","18");			if (n == count) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","18","19");				output.add(OutputCharacters.OPEN_P + letter + n);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","19","20");				closingParentheses += OutputCharacters.CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","22","21");				for (int i = 1; i < count; i++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","21","22");					closingParentheses += (OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P);
				}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","21","24");			} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","18","25");				output.add(OutputCharacters.OPEN_P + letter + n);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","25","26");				output.add(OutputCharacters.AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","26","27");				output.add(OutputCharacters.NEXT);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","27","28");				output.add(OutputCharacters.OPEN_P + OutputCharacters.NOT + letter + ++n);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","28","29");				n--;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","29","30");				output.add(OutputCharacters.UNTIL);
			}
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","17","33");		output.add(closingParentheses);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","33","35");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualC\\","generateLTLArray(java.lang.String,I).xml","35","EXIT");		return output;
	}
}

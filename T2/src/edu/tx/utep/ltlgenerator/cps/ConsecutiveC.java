package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class ConsecutiveC extends CompositeProposition {

	// "(p1 ^ X(p2 ^ X(p3)))";

	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","13","14");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","14","15");		StringBuilder intermediateString = new StringBuilder();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","15","16");		String closingParens = "";

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","28","18");		for (int i = 1; i <= count; i++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","18","19");			intermediateString.setLength(0);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","19","20");			intermediateString.append(OutputCharacters.OPEN_P).append(letter).append(i);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","20","21");			output.add(intermediateString.toString());

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","21","23");			if (i < count) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","23","24");				output.add(OutputCharacters.AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","24","25");				output.add(OutputCharacters.NEXT);
			}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","25","28");			closingParens = closingParens + OutputCharacters.CLOSE_P;
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","18","31");		output.add(closingParens);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","31","33");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ConsecutiveC\\","generateLTLArray(java.lang.String,I).xml","33","EXIT");		return output;
	}

}

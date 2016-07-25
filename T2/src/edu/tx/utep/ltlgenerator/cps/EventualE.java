package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class EventualE extends CompositeProposition {

	// (!p1 ^ !p2 ^ !p3 ^ !p4 ^ !p5) ^ ((!p1 ^ !p2 ^ !p3 ^ !p4 ^ !p5) U (p1 ^ !p2 ^ !p3 ^ !p4 ^ !p5 ^ ((!p2 ^ !p3 ^ !p4 ^ !p5) U (p2 ^ !p3 ^ !p4 ^ !p5 ^ ((!p3 ^ !p4 ^ !p5) U (p3 ^ !p4 ^ !p5 ^ ((!p4 ^ !p5) U (p4 ^ !p5 ^ (!p5 U p5)))))))))

	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","13","14");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","14","15");		String closingParentheses = "";

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","15","17");		output.add(OutputCharacters.OPEN_P + generateProposition(CPT_NOT_AND, letter, 1, count) + OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","17","18");		output.add(OutputCharacters.AND);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","33","20");		for (int n = 1; n < count; n++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","20","21");			output.add(OutputCharacters.OPEN_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","21","22");			output.add(OutputCharacters.OPEN_P + generateProposition(CPT_NOT_AND, letter, n, count) + OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","22","23");			output.add(OutputCharacters.UNTIL);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","23","24");			output.add(OutputCharacters.OPEN_P + letter + n + OutputCharacters.AND + generateProposition(CPT_NOT_AND, letter, n + 1, count));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","24","25");			output.add(OutputCharacters.AND);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","25","27");			if (n + 1 >= count) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","27","28");				output.add(OutputCharacters.OPEN_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","28","29");				output.add(OutputCharacters.OPEN_P + OutputCharacters.NOT + letter + ++n + OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","29","30");				output.add(OutputCharacters.UNTIL);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","30","31");				output.add(OutputCharacters.OPEN_P + letter + n);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","31","32");				closingParentheses += (OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","32","33");				n--;
			}
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","38","37");		for (int i = 1; i < count; i++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","37","38");			closingParentheses += (OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P);
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","37","41");		output.add(closingParentheses);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","41","43");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualE\\","generateLTLArray(java.lang.String,I).xml","43","EXIT");		return output;
	}
}

package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class EventualH extends CompositeProposition {

	// (p1 ^ !p2 ^ !p3 ^ !p4 ^ ((!p2 ^ !p3 ^ !p4) U (p2 ^ !p3 ^ !p4 ^ ((!p3 ^ !p4) U (p3 ^ !p4 ^ (!p4 U p4))))))
	// (p1 ^ !p2 ^ !p3 ^ !p4 ^ !p5 ^ ((!p2 ^ !p3 ^ !p4 ^ !p5) U (p2 ^ !p3 ^ !p4 ^ !p5 ^ ((!p3 ^ !p4 ^ !p5) U (p3 ^ !p4 ^ !p5) ^ ((!p4 ^ !p5) U (p4 ^ !p5 ^ (!p5 U p5)))))))

	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","START","14");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","14","15");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","15","16");		String closingParentheses = "";

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","30","18");		for (int n = 1; n < count; n++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","18","19");			output.add(OutputCharacters.OPEN_P + letter + n + OutputCharacters.AND + generateProposition(CPT_NOT_AND, letter, n + 1, count));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","19","20");			output.add(OutputCharacters.AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","20","21");			output.add(OutputCharacters.OPEN_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","21","22");			output.add(OutputCharacters.OPEN_P + generateProposition(CPT_NOT_AND, letter, n + 1, count) + OutputCharacters.CLOSE_P);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","22","24");			if (n + 1 < count) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","24","25");				output.add(OutputCharacters.UNTIL);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","25","26");			} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","24","27");				output.add(OutputCharacters.UNTIL);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","27","28");				output.add(OutputCharacters.OPEN_P + letter + ++n);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","28","29");				closingParentheses += OutputCharacters.CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","31","30");				for (int i = 1; i < count; i++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","30","31");					closingParentheses += (OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P);
				}
			}
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","18","36");		output.add(closingParentheses);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","36","38");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\EventualH\\","generateLTLArray(java.lang.String,I).xml","38","EXIT");		return output;
	}
}

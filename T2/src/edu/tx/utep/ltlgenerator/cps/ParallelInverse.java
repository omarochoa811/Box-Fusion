package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class ParallelInverse extends CompositeProposition {

	// private static String cpFormula = OPEN_P + CPT_NOT_AND + CLOSE_P;

	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelInverse\\","generateLTLArray(java.lang.String,I).xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelInverse\\","generateLTLArray(java.lang.String,I).xml","13","14");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelInverse\\","generateLTLArray(java.lang.String,I).xml","14","15");		String and = generateProposition(CPT_NOT_AND, letter, 1, count);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelInverse\\","generateLTLArray(java.lang.String,I).xml","15","17");		output.add(OutputCharacters.OPEN_P + and + OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelInverse\\","generateLTLArray(java.lang.String,I).xml","17","18");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelInverse\\","generateLTLArray(java.lang.String,I).xml","18","EXIT");		return output;
	}

}

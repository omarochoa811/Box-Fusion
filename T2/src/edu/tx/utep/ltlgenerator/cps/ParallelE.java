package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class ParallelE extends CompositeProposition {

	// private static String cpFormula = OPEN_P + CPT_NOT_AND + CLOSE_P + AND + OPEN_P + OPEN_P + CPT_NOT_AND + CLOSE_P + UNTIL + OPEN_P + CPT_AND + CLOSE_P + CLOSE_P;

	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","13","14");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","14","15");		String notAnd = OutputCharacters.OPEN_P + generateProposition(CPT_NOT_AND, letter, 1, count) + OutputCharacters.CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","15","16");		String or = OutputCharacters.OPEN_P + generateProposition(CPT_AND, letter, 1, count) + OutputCharacters.CLOSE_P;

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","16","18");		output.add(notAnd);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","18","19");		output.add(OutputCharacters.AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","19","20");		output.add(OutputCharacters.OPEN_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","20","21");		output.add(notAnd);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","21","22");		output.add(OutputCharacters.UNTIL);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","22","23");		output.add(or);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","23","24");		output.add(OutputCharacters.CLOSE_P);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","24","26");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\ParallelE\\","generateLTLArray(java.lang.String,I).xml","26","EXIT");		return output;
	}

}

package edu.tx.utep.ltlgenerator.cps; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class AtLeastOneE extends CompositeProposition {

	@Override
	public List<String> generateLTLArray(String letter, int count) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","START","11");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","11","12");		List<String> output = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","12","13");		String notAnd = OutputCharacters.OPEN_P + generateProposition(CPT_NOT_AND, letter, 1, count) + OutputCharacters.CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","13","14");		String or = OutputCharacters.OPEN_P + generateProposition(CPT_OR, letter, 1, count) + OutputCharacters.CLOSE_P;

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","14","16");		output.add(notAnd);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","16","18");		output.add(OutputCharacters.AND);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","18","20");		output.add(OutputCharacters.OPEN_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","20","21");		output.add(notAnd);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","21","22");		output.add(OutputCharacters.UNTIL);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","22","23");		output.add(or);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","23","24");		output.add(OutputCharacters.CLOSE_P);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","24","26");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\cps\\AtLeastOneE\\","generateLTLArray(java.lang.String,I).xml","26","EXIT");		return output;
	}

}

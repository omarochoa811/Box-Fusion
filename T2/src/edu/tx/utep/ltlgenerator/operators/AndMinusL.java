package edu.tx.utep.ltlgenerator.operators; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class AndMinusL implements Operator {

	@Override
	public String andCPs(List<String> leftSides, String rightSide) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","START","10");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","10","11");		List<String> newLeftSides = leftSides;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","11","12");		String cpPart = "";
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","12","13");		String newCpPart = "";
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","13","14");		int endIndex = leftSides.size() == 1 ? 1 : leftSides.size() - 2;

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","25","16");		for (int i = 0; i < endIndex; i++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","16","17");			cpPart = leftSides.get(i);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","17","18");			if (cpPart.indexOf(OutputCharacters.OPEN_P) == 0 && cpPart.length() > 1) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","18","19");				if (cpPart.indexOf(OutputCharacters.CLOSE_P) == -1) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","19","20");					cpPart = cpPart.substring(0, 1) + OutputCharacters.O_OPEN_P + cpPart.substring(1, cpPart.length());
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","20","21");					newCpPart = cpPart + OutputCharacters.O_AND + rightSide + OutputCharacters.O_CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","21","22");				} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","19","23");					newCpPart = OutputCharacters.O_OPEN_P + cpPart + OutputCharacters.O_AND + rightSide + OutputCharacters.O_CLOSE_P;
				}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","23","25");				newLeftSides.set(i, newCpPart);
			}
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","16","29");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndMinusL\\","andCPs(java.util.List,Ljava.lang.String).xml","29","EXIT");		return String.join("", newLeftSides);
	}

}

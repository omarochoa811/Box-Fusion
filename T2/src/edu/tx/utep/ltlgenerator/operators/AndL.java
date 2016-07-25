package edu.tx.utep.ltlgenerator.operators; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class AndL implements Operator {

	@Override
	public String andCPs(List<String> leftSides, String rightSide) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","START","10");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","10","11");		List<String> newLeftSides = leftSides;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","11","12");		int indexOfLastCP = leftSides.size() > 2 ? leftSides.size() - 2 : 0;

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","12","14");		String lastCp = leftSides.get(indexOfLastCP);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","14","15");		String newLast = "";

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","15","17");		if (lastCp.indexOf(OutputCharacters.OPEN_P) == 0) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","17","18");			if (lastCp.indexOf(OutputCharacters.CLOSE_P) == -1) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","18","19");				newLast = getNewLastCP(lastCp, true, rightSide);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","19","20");			} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","18","21");				newLast = getNewLastCP(lastCp, false, rightSide);
			}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","21","23");		} 
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","17","26");			if (lastCp.indexOf("l") == 0 || lastCp.indexOf("p") == 0 || lastCp.indexOf("q") == 0 || lastCp.indexOf("r") == 0) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","26","27");				newLast = getNewLastCP(lastCp, false, rightSide);
			}
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","27","31");		newLeftSides.set(indexOfLastCP, newLast);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","31","32");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","andCPs(java.util.List,Ljava.lang.String).xml","32","EXIT");		return String.join("", newLeftSides);
	}

	private String getNewLastCP(String lastCp, boolean hasOpenParen, String rightSide) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","getNewLastCP(java.lang.String,ZLjava.lang.String).xml","START","35");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","getNewLastCP(java.lang.String,ZLjava.lang.String).xml","35","36");		String newLastCp = lastCp;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","getNewLastCP(java.lang.String,ZLjava.lang.String).xml","36","37");		if (hasOpenParen) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","getNewLastCP(java.lang.String,ZLjava.lang.String).xml","37","38");			newLastCp = lastCp.substring(0, 1) + OutputCharacters.O_OPEN_P + lastCp.substring(1, lastCp.length());
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","getNewLastCP(java.lang.String,ZLjava.lang.String).xml","38","39");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","getNewLastCP(java.lang.String,ZLjava.lang.String).xml","39","EXIT");			return newLastCp + OutputCharacters.O_AND + rightSide + OutputCharacters.O_CLOSE_P;
		} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","getNewLastCP(java.lang.String,ZLjava.lang.String).xml","37","41");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndL\\","getNewLastCP(java.lang.String,ZLjava.lang.String).xml","41","EXIT");			return OutputCharacters.O_OPEN_P + lastCp + OutputCharacters.O_AND + rightSide + OutputCharacters.O_CLOSE_P;
		}
	}
}

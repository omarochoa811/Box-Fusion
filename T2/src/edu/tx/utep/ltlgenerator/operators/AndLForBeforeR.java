package edu.tx.utep.ltlgenerator.operators; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.OutputCharacters;

public class AndLForBeforeR {

	public String getAndLForBeforeR(String leftSide, String rightSide) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","START","7");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","7","8");		boolean sidesAreInitialized = ((leftSide != null) && (rightSide != null));
		int lastElementStartIndex;
		int firstClosingParenthesisIndex;
		int leftSideLength;
		int IntroduceRightSideIndex;
		String lastElementString;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","8","14");		StringBuilder leftSideAndLRightSide = new StringBuilder();

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","14","16");		leftSideLength = leftSide.length();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","16","17");		if (sidesAreInitialized) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","17","18");			lastElementStartIndex = leftSide.lastIndexOf(OutputCharacters.O_AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","18","19");			if (lastElementStartIndex != -1) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","19","20");				lastElementStartIndex++;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","20","21");				if (leftSide.indexOf(OutputCharacters.UNTIL, lastElementStartIndex) != -1) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","21","22");					lastElementStartIndex = leftSide.lastIndexOf(OutputCharacters.UNTIL, leftSideLength) + 1;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","22","23");				} 
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","21","26");					if (leftSide.indexOf(OutputCharacters.NEXT, lastElementStartIndex) != -1) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","26","27");						lastElementStartIndex = leftSide.lastIndexOf(OutputCharacters.NEXT, leftSideLength) + 1;
					}
				}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","27","31");				lastElementString = leftSide.substring(lastElementStartIndex);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","31","32");				firstClosingParenthesisIndex = lastElementString.indexOf(OutputCharacters.CLOSE_P);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","32","34");				if (firstClosingParenthesisIndex != -1) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","34","35");					IntroduceRightSideIndex = lastElementStartIndex + firstClosingParenthesisIndex + 1;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","35","36");					leftSideAndLRightSide.append(leftSide.substring(0, IntroduceRightSideIndex));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","36","37");					leftSideAndLRightSide.append(OutputCharacters.O_AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","37","38");					leftSideAndLRightSide.append(OutputCharacters.O_OPEN_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","38","39");					leftSideAndLRightSide.append(rightSide);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","39","40");					leftSideAndLRightSide.append(OutputCharacters.O_CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","40","41");					leftSideAndLRightSide.append(leftSide.substring(IntroduceRightSideIndex, leftSideLength));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","41","42");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","42","EXIT");					return leftSideAndLRightSide.toString();
				} else {
					// error
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","34","45");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","45","EXIT");					return null;
				}

			} else {
				// This is only for strings resulting from the andR operation. Further Error Handling might need to be implemented. Roberto Fierro
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","19","50");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","50","EXIT");				return null;
			}
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","17","53");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\operators\\AndLForBeforeR\\","getAndLForBeforeR(java.lang.String,Ljava.lang.String).xml","53","EXIT");		return null;
	}

}

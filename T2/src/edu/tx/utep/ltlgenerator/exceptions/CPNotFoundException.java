package edu.tx.utep.ltlgenerator.exceptions; import instrumentor.InstrumentingCode;

public class CPNotFoundException extends Exception {

	private static final long serialVersionUID = 7203926886624941980L;

	public CPNotFoundException() {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\CPNotFoundException\\","CPNotFoundException().xml","START","7");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\CPNotFoundException\\","CPNotFoundException().xml","7","8");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\CPNotFoundException\\","CPNotFoundException().xml","8","EXIT");	}

	public CPNotFoundException(String cpName) {
		super("No Composite Proposition class found for " + cpName);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\CPNotFoundException\\","CPNotFoundException(java.lang.String).xml","11","12");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\CPNotFoundException\\","CPNotFoundException(java.lang.String).xml","12","EXIT");	}

}

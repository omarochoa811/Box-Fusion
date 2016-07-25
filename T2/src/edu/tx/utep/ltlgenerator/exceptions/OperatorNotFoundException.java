package edu.tx.utep.ltlgenerator.exceptions; import instrumentor.InstrumentingCode;

public class OperatorNotFoundException extends Exception {

	private static final long serialVersionUID = -2557991501578287178L;

	public OperatorNotFoundException() {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\OperatorNotFoundException\\","OperatorNotFoundException().xml","START","7");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\OperatorNotFoundException\\","OperatorNotFoundException().xml","7","8");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\OperatorNotFoundException\\","OperatorNotFoundException().xml","8","EXIT");	}

	public OperatorNotFoundException(String operatorName) {
		super("No Operator class found for " + operatorName);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\OperatorNotFoundException\\","OperatorNotFoundException(java.lang.String).xml","11","12");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\OperatorNotFoundException\\","OperatorNotFoundException(java.lang.String).xml","12","EXIT");	}

}

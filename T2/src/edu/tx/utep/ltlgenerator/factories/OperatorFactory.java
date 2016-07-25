package edu.tx.utep.ltlgenerator.factories; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.exceptions.OperatorNotFoundException;
import edu.tx.utep.ltlgenerator.operators.AndL;
import edu.tx.utep.ltlgenerator.operators.AndMinusL;
import edu.tx.utep.ltlgenerator.operators.AndR;
import edu.tx.utep.ltlgenerator.operators.Operator;

// Factory Pattern
public class OperatorFactory {

	public static final String AND_R = "andR";
	public static final String AND_L = "andL";
	public static final String AND_MINUS_L = "andMinusL";

	public Operator getOperatorClass(String andType) throws OperatorNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","START","16");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","16","17");		switch (andType) {
		case AND_R:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","17","19");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","19","EXIT");			return new AndR();
		case AND_L:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","17","21");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","21","EXIT");			return new AndL();
		case AND_MINUS_L:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","17","23");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","23","EXIT");			return new AndMinusL();
		default:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","17","25");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\OperatorFactory\\","getOperatorClass(java.lang.String).xml","25","EXIT");			throw new OperatorNotFoundException(andType);
		}
	}

}

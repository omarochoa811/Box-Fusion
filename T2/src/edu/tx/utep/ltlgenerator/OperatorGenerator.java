package edu.tx.utep.ltlgenerator; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.exceptions.OperatorNotFoundException;
import edu.tx.utep.ltlgenerator.factories.OperatorFactory;
import edu.tx.utep.ltlgenerator.operators.Operator;

public class OperatorGenerator {

	public String getAndedPropositions(String andType, List<String> leftSides, List<String> rightSides) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\OperatorGenerator\\","getAndedPropositions(java.lang.String,Ljava.util.List,Ljava.util.List).xml","START","11");
		
		Operator operator;
		try {
			
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\OperatorGenerator\\","getAndedPropositions(java.lang.String,Ljava.util.List,Ljava.util.List).xml","11","16");			String right = OutputCharacters.O_OPEN_P + String.join("", rightSides) + OutputCharacters.O_CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\OperatorGenerator\\","getAndedPropositions(java.lang.String,Ljava.util.List,Ljava.util.List).xml","16","17");			operator = new OperatorFactory().getOperatorClass(andType);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\OperatorGenerator\\","getAndedPropositions(java.lang.String,Ljava.util.List,Ljava.util.List).xml","17","18");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\OperatorGenerator\\","getAndedPropositions(java.lang.String,Ljava.util.List,Ljava.util.List).xml","18","EXIT");			return operator.andCPs(leftSides, right);
			
		} catch (OperatorNotFoundException e) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\OperatorGenerator\\","getAndedPropositions(java.lang.String,Ljava.util.List,Ljava.util.List).xml","20","21");			e.printStackTrace();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\OperatorGenerator\\","getAndedPropositions(java.lang.String,Ljava.util.List,Ljava.util.List).xml","21","22");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\OperatorGenerator\\","getAndedPropositions(java.lang.String,Ljava.util.List,Ljava.util.List).xml","22","EXIT");			return e.getMessage();
		}
	}

}

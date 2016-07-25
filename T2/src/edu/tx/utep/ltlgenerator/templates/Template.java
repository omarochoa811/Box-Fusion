package edu.tx.utep.ltlgenerator.templates; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.CPGenerator;
import edu.tx.utep.ltlgenerator.OperatorGenerator;
import edu.tx.utep.ltlgenerator.OutputCharacters;
import edu.tx.utep.ltlgenerator.factories.OperatorFactory;
import edu.tx.utep.ltlgenerator.operators.AndLForBeforeR;

public abstract class Template {

	public abstract String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition);
	protected OperatorGenerator operatorGenerator = new OperatorGenerator();
	protected CPGenerator cpGenerator = new CPGenerator();
	protected AndLForBeforeR andLForBeforeR = new  AndLForBeforeR();

	protected static final String AND_L = OperatorFactory.AND_L;
	protected static final String AND_R = OperatorFactory.AND_R;
	protected static final String AND_MINUS_L = OperatorFactory.AND_MINUS_L;

	// Template Factory Method
	public String getLTLFormula(String pProposition, String qProposition, String rProposition, String lProposition){InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","23");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","23","24");		String formula = generateFormula(pProposition, qProposition, rProposition, lProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","24","25");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","25","EXIT");		return replaceOperatorStrings(formula);
	}

	protected List<String> getCompositeProposition(String propositionName) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getCompositeProposition(java.lang.String).xml","START","28");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getCompositeProposition(java.lang.String).xml","28","29");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getCompositeProposition(java.lang.String).xml","29","EXIT");		return cpGenerator.getCompositeProposition(propositionName);
	}

	protected List<String> getParallelInverse(String propositionName) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getParallelInverse(java.lang.String).xml","START","32");
		// Get the letter and number from the proposition name
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getParallelInverse(java.lang.String).xml","32","34");		String[] splitCP = propositionName.split("_");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getParallelInverse(java.lang.String).xml","34","35");		String inverseName = splitCP[0] + "_ParallelInverse_" + splitCP[2]; 
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getParallelInverse(java.lang.String).xml","35","36");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getParallelInverse(java.lang.String).xml","36","EXIT");		return cpGenerator.getCompositeProposition(inverseName);
	}
	
	protected List<String> getHProposition(String propositionName) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getHProposition(java.lang.String).xml","START","39");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getHProposition(java.lang.String).xml","39","40");		StringBuilder hProposition = new StringBuilder(propositionName);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getHProposition(java.lang.String).xml","40","41");		int currentLetterIndex = propositionName.lastIndexOf("_")-1;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getHProposition(java.lang.String).xml","41","42");		hProposition.setCharAt(currentLetterIndex, 'H');
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getHProposition(java.lang.String).xml","42","43");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","getHProposition(java.lang.String).xml","43","EXIT");		return cpGenerator.getCompositeProposition(hProposition.toString());
	}
	
	private String replaceOperatorStrings(String formula) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","replaceOperatorStrings(java.lang.String).xml","START","46");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","replaceOperatorStrings(java.lang.String).xml","46","47");		formula = formula.replace(OutputCharacters.O_AND, OutputCharacters.AND);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","replaceOperatorStrings(java.lang.String).xml","47","48");		formula = formula.replace(OutputCharacters.O_CLOSE_P, OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","replaceOperatorStrings(java.lang.String).xml","48","49");		formula = formula.replace(OutputCharacters.O_OPEN_P, OutputCharacters.OPEN_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","replaceOperatorStrings(java.lang.String).xml","49","50");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\Template\\","replaceOperatorStrings(java.lang.String).xml","50","EXIT");		return formula;
	}

}

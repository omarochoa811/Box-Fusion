package edu.tx.utep.ltlgenerator.templates.global; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;
import edu.tx.utep.ltlgenerator.templates.Template;

public class GlobalQStrictlyPrecedesPE extends Template {

	// (pInverse ^ XPh)
    private static String pInverseOrXPh = OutputCharacters.OPEN_P + "pInverse" + OutputCharacters.AND + OutputCharacters.NEXT + "Ph" + OutputCharacters.CLOSE_P;

	// Q &r !(pInverse ^ XPh)
    private static String qAndNotSomething = "Q &r " + OutputCharacters.NOT + pInverseOrXPh;

    // !((!(Q &r !(pInverse ^ XPh))) U (pInverse ^ XPhH))
    private static String template = OutputCharacters.NOT + OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + OutputCharacters.NOT + OutputCharacters.OPEN_P +
    		qAndNotSomething + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + OutputCharacters.UNTIL + pInverseOrXPh + OutputCharacters.CLOSE_P;

	@Override
	public String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","22");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","22","23");		String formula = template;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","23","24");		List<String> q = getCompositeProposition(qProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","24","25");		List<String> pH = getHProposition(pProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","25","26");		String pInverse = String.join("", getParallelInverse(pProposition));

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","28");		List<String> rightSide = new ArrayList<String>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","29");		rightSide.add(OutputCharacters.NOT);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","29","30");		rightSide.add(pInverseOrXPh);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","30","31");		formula = formula.replace(qAndNotSomething, operatorGenerator.getAndedPropositions(AND_R, q, rightSide));

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","31","33");		formula = formula.replace("pInverse", pInverse);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","33","34");		formula = formula.replace("Ph", String.join("", pH));

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","34","36");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPE\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","36","EXIT");		return formula;
	}

}

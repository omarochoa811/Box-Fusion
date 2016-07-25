package edu.tx.utep.ltlgenerator.templates.beforer; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;
import edu.tx.utep.ltlgenerator.templates.Template;

public class QPrecedesPcBeforeRc extends Template {

	// P &r !R
	private static String pAndNotR = "P &r " + OutputCharacters.NOT + "R";

	// Q &-l !P
	private static String qAndNotP = "Q &-l " + OutputCharacters.NOT + "P";

	// (FR) -> ((!(P &r !R))) U ((Q &-l !P) v R)))
	private static String template = OutputCharacters.OPEN_P + OutputCharacters.EVENTUALLY + "R" + OutputCharacters.CLOSE_P + OutputCharacters.IMPLY +
			OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + OutputCharacters.NOT + OutputCharacters.OPEN_P + pAndNotR + 
			OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + 
			OutputCharacters.UNTIL + OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + qAndNotP + OutputCharacters.CLOSE_P + 
			OutputCharacters.OR + "R" + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P;

	@Override
	public String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","24");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","24","25");		String formula = template;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","25","26");		List<String> r = getCompositeProposition(rProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","27");		List<String> p = getCompositeProposition(pProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","27","28");		List<String> q = getCompositeProposition(qProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","29");		String rString = String.join("", r);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","29","30");		String pString = String.join("", p);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","30","32");		List<String> notR = r;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","32","33");		notR.add(0, OutputCharacters.NOT);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","33","34");		String andedR = operatorGenerator.getAndedPropositions(AND_R, p, notR);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","34","35");		formula = formula.replace(pAndNotR, andedR);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","35","37");		List<String> notP = p;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","37","38");		notP.add(0, OutputCharacters.NOT);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","38","39");		String andedP = operatorGenerator.getAndedPropositions(AND_MINUS_L, q, notP);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","39","40");		formula = formula.replace(qAndNotP, andedP);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","40","42");		formula = formula.replace("R", rString);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","42","43");		formula = formula.replace("P", pString);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","43","45");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QPrecedesPcBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","45","EXIT");		return formula;
	}

}

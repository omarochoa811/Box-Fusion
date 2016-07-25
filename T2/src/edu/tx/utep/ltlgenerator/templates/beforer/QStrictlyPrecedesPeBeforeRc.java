package edu.tx.utep.ltlgenerator.templates.beforer; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;
import edu.tx.utep.ltlgenerator.templates.Template;

public class QStrictlyPrecedesPeBeforeRc extends Template {

	// Ph &r !R
	private static String phAndNotR = "Ph &r " + OutputCharacters.NOT + "R";

	// Q &r !Ph
	private static String qAndNotPh = "Q &r " + OutputCharacters.NOT + "Ph";

	// (FR) -> ((!(Pi ^ !R ^ X(PH &r !R))) U ((Q &r !PH) v R))
	private static String template = OutputCharacters.OPEN_P + OutputCharacters.EVENTUALLY + "R" + OutputCharacters.CLOSE_P + OutputCharacters.IMPLY +
			OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + OutputCharacters.NOT + OutputCharacters.OPEN_P + "Pi" + OutputCharacters.AND + OutputCharacters.NOT + "R" +
			OutputCharacters.AND + OutputCharacters.NEXT + OutputCharacters.OPEN_P + phAndNotR + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + 
			OutputCharacters.UNTIL + OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + qAndNotPh + OutputCharacters.CLOSE_P + OutputCharacters.OR + "R" + 
			OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P;

    @Override
    public String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","24");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","24","25");        String formula = template;

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","25","27");        List<String> r = getCompositeProposition(rProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","27","28");        List<String> q = getCompositeProposition(qProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","29");        List<String> pH = getHProposition(pProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","29","30");        String pInverse = String.join("", getParallelInverse(pProposition));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","30","31");        String rString = String.join("", r);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","31","33");        List<String> notR = r;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","33","34");        notR.add(0, OutputCharacters.NOT);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","34","35");        String notRString = String.join("", notR);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","35","36");        String andedPH = operatorGenerator.getAndedPropositions(AND_R, pH, notR);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","36","37");        formula = formula.replace(phAndNotR, andedPH);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","37","39");        List<String> notpH = pH;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","39","40");        notpH.add(0, OutputCharacters.NOT);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","40","41");        String andedQ = operatorGenerator.getAndedPropositions(AND_R, q, notpH);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","41","42");        formula = formula.replace(qAndNotPh, andedQ);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","42","44");        formula = formula.replace("Pi", pInverse);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","44","45");        formula = formula.replace(OutputCharacters.NOT + "R", notRString);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","45","46");        formula = formula.replace("R", rString);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","46","48");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QStrictlyPrecedesPeBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","48","EXIT");        return formula;
    }
}

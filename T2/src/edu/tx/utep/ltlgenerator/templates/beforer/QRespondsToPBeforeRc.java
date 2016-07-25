package edu.tx.utep.ltlgenerator.templates.beforer; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;
import edu.tx.utep.ltlgenerator.templates.Template;

public class QRespondsToPBeforeRc extends Template {

	// Q &r !R
	private static String qAndNotR = "Q &r " + OutputCharacters.NOT + "R";

	// ((!(Q &r !R)) U R)
	private static String templatePart2 = OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + OutputCharacters.NOT + OutputCharacters.OPEN_P + qAndNotR +
			OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + OutputCharacters.UNTIL + "R" + OutputCharacters.CLOSE_P;

	// (P &r !R) &l templatePart2
	private static String pAndNotRAndStuff = OutputCharacters.OPEN_P + "P &r " + OutputCharacters.NOT + OutputCharacters.CLOSE_P + " &l templatePart2";
			
	// !((!R) U ((P &r !R) &l templatePart2))
	private static String template = OutputCharacters.NOT + OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + OutputCharacters.NOT + "R" + OutputCharacters.CLOSE_P +
			OutputCharacters.UNTIL + OutputCharacters.OPEN_P + pAndNotRAndStuff + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P;

	@Override
	public String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","25");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","25","26");		String formula = template;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","27");		String rightSideTemplatePart2 = templatePart2;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","27","28");		List<String> notR = getCompositeProposition(rProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","29");		List<String> p = getCompositeProposition(pProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","29","30");		List<String> q = getCompositeProposition(qProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","30","31");		String r = String.join("", getCompositeProposition(rProposition));
		String qAndRNotR;
		String pAndRNotR;
		String pAndRNotR_AND_L_RightSideTemplatePart2;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","31","35");		notR.add(0, OutputCharacters.NOT);
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","35","37");		qAndRNotR = operatorGenerator.getAndedPropositions(AND_R, q, notR);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","37","38");		rightSideTemplatePart2 = rightSideTemplatePart2.replace(qAndNotR, qAndRNotR);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","38","39");		rightSideTemplatePart2 = rightSideTemplatePart2.replace("R", r);
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","39","41");		pAndRNotR = operatorGenerator.getAndedPropositions(AND_R, p, notR);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","41","42");		pAndRNotR_AND_L_RightSideTemplatePart2 = andLForBeforeR.getAndLForBeforeR(pAndRNotR, rightSideTemplatePart2);
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","42","44");		formula = formula.replace(pAndNotRAndStuff, pAndRNotR_AND_L_RightSideTemplatePart2);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","44","45");		formula = formula.replace(OutputCharacters.NOT + "R", String.join("", notR));
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","45","47");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\QRespondsToPBeforeRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","47","EXIT");		return formula;
	}

}

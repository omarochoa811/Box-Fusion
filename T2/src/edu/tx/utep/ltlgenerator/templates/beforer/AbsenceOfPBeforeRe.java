package edu.tx.utep.ltlgenerator.templates.beforer; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;
import edu.tx.utep.ltlgenerator.templates.Template;


public class AbsenceOfPBeforeRe extends Template {

	// P &r !Rh
	private static String pAndNotRh = "P &r " + OutputCharacters.NOT + "Rh";

	// (FR) -> !((!((Pi) ^ X(Rh))) U (P &r !Rh))
	private static String template = OutputCharacters.OPEN_P + OutputCharacters.EVENTUALLY + "R" + OutputCharacters.CLOSE_P + OutputCharacters.IMPLY +
			OutputCharacters.NOT + OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + OutputCharacters.NOT + OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + 
			"Pi" + OutputCharacters.CLOSE_P + OutputCharacters.AND + OutputCharacters.NEXT + OutputCharacters.OPEN_P + "Rh" + OutputCharacters.CLOSE_P + 
			OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + OutputCharacters.UNTIL + OutputCharacters.OPEN_P + pAndNotRh + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P;

	@Override
	public String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","21");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","21","22");		String formula = template;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","22","23");		List<String> r = getCompositeProposition(rProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","23","24");		List<String> p = getCompositeProposition(pProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","24","25");		List<String> rh = getHProposition(rProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","25","26");		String pinverse = String.join("", getParallelInverse(pProposition));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","27");		String rString = String.join("", r);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","27","28");		String rhString = String.join("", rh);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","30");		List<String> notRh = rh;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","30","31");		notRh.add(0, OutputCharacters.NOT);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","31","33");		String andedR = operatorGenerator.getAndedPropositions(AND_R, p, notRh);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","33","34");		formula = formula.replace(pAndNotRh, andedR);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","34","36");		formula = formula.replace("Rh", String.join("", rhString));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","36","37");		formula = formula.replace("Pi", pinverse);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","37","38");		formula = formula.replace("R", rString);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","38","40");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\beforer\\AbsenceOfPBeforeRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","40","EXIT");		return formula;
	}

}

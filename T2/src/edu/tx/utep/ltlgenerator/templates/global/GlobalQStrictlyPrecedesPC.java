package edu.tx.utep.ltlgenerator.templates.global; import instrumentor.InstrumentingCode;

import java.util.List;

import edu.tx.utep.ltlgenerator.OutputCharacters;
import edu.tx.utep.ltlgenerator.templates.Template;

public class GlobalQStrictlyPrecedesPC extends Template {

	   // Q &r !P
	   private static String qAndNotP = "Q &r " + OutputCharacters.NOT + "P";
	   
	   // !((!(Q &r !P)) U P)
	   private static String template = OutputCharacters.NOT + OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + OutputCharacters.NOT + OutputCharacters.OPEN_P + 
			   qAndNotP + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + OutputCharacters.UNTIL + "P" + OutputCharacters.CLOSE_P;

    @Override
    public String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","18");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","18","19");        String formula = template;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","19","20");        List<String> p = getCompositeProposition(pProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","20","21");        List<String> q = getCompositeProposition(qProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","21","22");        String pString = String.join("", p);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","22","24");        List<String> notP = p;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","24","25");        notP.add(0, OutputCharacters.NOT);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","25","27");        formula = formula.replace(qAndNotP, operatorGenerator.getAndedPropositions(AND_R, q, notP));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","27","28");        formula = formula.replace("P", pString);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","30");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\global\\GlobalQStrictlyPrecedesPC\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","30","EXIT");        return formula;
    }

}

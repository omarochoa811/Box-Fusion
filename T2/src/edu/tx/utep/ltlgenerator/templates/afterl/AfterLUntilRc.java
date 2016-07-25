package edu.tx.utep.ltlgenerator.templates.afterl; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.OutputCharacters;
import edu.tx.utep.ltlgenerator.templates.Template;

import java.util.ArrayList;
import java.util.List;

public class AfterLUntilRc extends Template {

    // (L &l !R)
    private static String L_AndL_NotR;

    // ((PR ^ (!FR) -> PG))
    private static String rightSide;

    // (L &l rightSide)
    private static String L_AndL_rightSide;

    // G(L_AndL_NotR -> (L &l rightSide))
    private static String template;

    private Template globalTemplate;
    private Template beforeRTemplate;

    public AfterLUntilRc(Template globalTemplate, Template beforeRTemplate){InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","START","26");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","26","27");    	L_AndL_NotR = OutputCharacters.OPEN_P + "L &l " + OutputCharacters.NOT + "R" + OutputCharacters.CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","27","28");    	rightSide = OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + "PR" + OutputCharacters.AND + OutputCharacters.OPEN_P + OutputCharacters.NOT + OutputCharacters.EVENTUALLY + "R" + OutputCharacters.NOT + "R" + OutputCharacters.CLOSE_P + OutputCharacters.IMPLY + "PG" + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","28","29");    	L_AndL_rightSide = OutputCharacters.OPEN_P + "L &l " + rightSide + OutputCharacters.CLOSE_P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","29","30");        template =  OutputCharacters.ALWAYS + OutputCharacters.OPEN_P + L_AndL_NotR + L_AndL_rightSide;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","30","31");    	this.globalTemplate = globalTemplate;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","31","32");        this.beforeRTemplate = beforeRTemplate;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","32","33");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","AfterLUntilRc(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","33","EXIT");    }

    @Override
    public String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","36");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","36","37");        String formula = template;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","37","38");        String PRString = beforeRTemplate.generateFormula(pProposition, qProposition, rProposition, lProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","38","39");        String PGString = globalTemplate.generateFormula(pProposition, qProposition, rProposition, lProposition);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","39","41");        List<String> notR = new ArrayList<>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","41","42");        notR.add(OutputCharacters.NOT + getCompositeProposition(rProposition));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","42","43");        String andedL1 = operatorGenerator.getAndedPropositions(AND_L, getCompositeProposition(lProposition), notR);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","43","44");        formula = formula.replace(L_AndL_NotR, andedL1);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","44","46");        List<String> rSide = new ArrayList<>();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","46","47");        rSide.add(PRString + OutputCharacters.AND + OutputCharacters.OPEN_P + OutputCharacters.OPEN_P + OutputCharacters.NOT + OutputCharacters.EVENTUALLY + getCompositeProposition(rProposition) + OutputCharacters.CLOSE_P + OutputCharacters.IMPLY + PGString + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P + OutputCharacters.CLOSE_P);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","47","48");        String andedL2 = operatorGenerator.getAndedPropositions(AND_L, getCompositeProposition(lProposition), rSide);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","48","49");        formula = formula.replace(L_AndL_rightSide, andedL2);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","49","51");        formula = formula.replace("R", String.join("", getCompositeProposition(rProposition)));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","51","52");        formula = formula.replace("L", String.join("", getCompositeProposition(lProposition)));

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","52","54");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRc\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","54","EXIT");        return formula;
    }
}

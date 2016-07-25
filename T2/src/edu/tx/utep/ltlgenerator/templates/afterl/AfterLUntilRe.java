package edu.tx.utep.ltlgenerator.templates.afterl; import instrumentor.InstrumentingCode;


import java.util.ArrayList;
import java.util.Arrays;

import edu.tx.utep.ltlgenerator.templates.Template;


public class AfterLUntilRe extends Template {

    private String template;
    private Template globalTemplate;
    private Template beforeRTemplate;

    public AfterLUntilRe(Template globalTemplate, Template beforeRTemplate) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","AfterLUntilRe(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","START","16");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","AfterLUntilRe(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","16","17");    	template = "G((L) -> (L &l ((P_BeforeR ^ ((!FR) -> P_Global)))))";
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","AfterLUntilRe(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","17","18");        this.globalTemplate = globalTemplate;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","AfterLUntilRe(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","18","19");        this.beforeRTemplate = beforeRTemplate;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","AfterLUntilRe(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","19","20");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","AfterLUntilRe(edu.tx.utep.ltlgenerator.templates.Template,Ledu.tx.utep.ltlgenerator.templates.Template).xml","20","EXIT");    }

    @Override
    public String generateFormula(String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","23");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","23","24");        String formula = template;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","24","25");        String globalFormula = globalTemplate.generateFormula(pProposition, qProposition, rProposition, lProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","25","26");        String beforeRFormula = beforeRTemplate.generateFormula(pProposition, qProposition, rProposition, lProposition);


        // solve for anded formula
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","30");        formula = formula.replace("L &l ((P_BeforeR ^ ((!FR) -> P_Global)))", operatorGenerator.getAndedPropositions( AND_L, getCompositeProposition(lProposition), new ArrayList<String>(Arrays.asList("((P_BeforeR ^ ((!FR) -> P_Global)))".split(",")))));

        //replace L
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","30","33");        formula = formula.replace("(L)", String.join("", getCompositeProposition(lProposition)));

        // replace R
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","33","36");        formula = formula.replace("FR", "F(" + String.join("", getCompositeProposition(rProposition)) + ")");

        // replace P_Global
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","36","39");        formula = formula.replace("P_Global", globalFormula);

        // replace P_BeforeR
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","39","42");        formula = formula.replace("P_BeforeR", beforeRFormula);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","42","44");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","generateFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","44","EXIT");        return formula;
    }


//    public static void main(String[] args) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","saveFiles().xml","START","48");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\templates\\afterl\\AfterLUntilRe\\","setFiles(java.lang.String,Ljava.lang.String).xml","START","48");
//        AfterLUntilRe cons = new AfterLUntilRe(new GlobalAbsenceOfP(),new ExistenceOfPBeforeRe());
//        String output = cons.generateFormula(
//                "P_ParallelE_2",
//                "Q_EventualC_3",
//                "R_ConsecutiveE_2",
//                "L_AtLeastOneC_3"
//        );
//
//        System.out.println(output);
//    }
}




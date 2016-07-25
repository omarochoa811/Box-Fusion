package edu.tx.utep.ltlgenerator; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.exceptions.TemplateNotFoundException;
import edu.tx.utep.ltlgenerator.factories.TemplateFactory;
import edu.tx.utep.ltlgenerator.templates.Template;

public class LTLGenerator {

	public String generateLTLFormula(String templateName, String pProposition, String qProposition, String rProposition, String lProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\LTLGenerator\\","generateLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","9");

		try {

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\LTLGenerator\\","generateLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","13");			Template template = new TemplateFactory().getTemplate(templateName, qProposition);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\LTLGenerator\\","generateLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","13","14");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\LTLGenerator\\","generateLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","14","EXIT");			return template.getLTLFormula(pProposition, qProposition, rProposition, lProposition);

		} catch (TemplateNotFoundException e) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\LTLGenerator\\","generateLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","16","17");			e.printStackTrace();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\LTLGenerator\\","generateLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","17","18");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\LTLGenerator\\","generateLTLFormula(java.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","18","EXIT");			return e.getMessage();
		}
	}

}

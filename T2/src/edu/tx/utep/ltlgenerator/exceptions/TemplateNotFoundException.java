package edu.tx.utep.ltlgenerator.exceptions; import instrumentor.InstrumentingCode;

public class TemplateNotFoundException extends Exception {

	private static final long serialVersionUID = 2279919734523310533L;

	public TemplateNotFoundException() {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\TemplateNotFoundException\\","TemplateNotFoundException().xml","START","7");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\TemplateNotFoundException\\","TemplateNotFoundException().xml","7","8");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\TemplateNotFoundException\\","TemplateNotFoundException().xml","8","EXIT");	}

	public TemplateNotFoundException(String templateName) {
		super("No Template class found for " + templateName);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\TemplateNotFoundException\\","TemplateNotFoundException(java.lang.String).xml","11","12");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\exceptions\\TemplateNotFoundException\\","TemplateNotFoundException(java.lang.String).xml","12","EXIT");	}

}

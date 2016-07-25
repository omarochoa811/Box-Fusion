package edu.tx.utep.ltlgenerator.factories; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.LTLPatternType;


public class GlobalFactory extends LTLGeneratorFactory {
	
	@Override
	public String getLTLFormula(LTLPatternType ltlPatternType, String p, String q, String r, String l){InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","9");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","10");		switch (ltlPatternType){
			case Absence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","10","12");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","12","EXIT");				return ltlGenerator.generateLTLFormula("GlobalAbsenceOfP", p, q, r, l);
			
			case Existence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","10","15");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","15","EXIT");				return ltlGenerator.generateLTLFormula("GlobalExistenceOfP", p, q, r, l);
			
			case Response:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","10","18");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","18","EXIT");				return ltlGenerator.generateLTLFormula("GlobalQRespondsToP", p, q, r, l);
				
			case StricPrecedence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","10","21");				if ( isCompositePropositionOfTypeC(p) ){
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","21","22");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","22","EXIT");					return ltlGenerator.generateLTLFormula("GlobalQStrictlyPrecedesPC", p, q, r, l);
				} 
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","21","26");					if (isCompositePropositionOfTypeE(p)) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","27");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","27","EXIT");						return ltlGenerator.generateLTLFormula("GlobalQStrictlyPrecedesPE", p, q, r, l);
					} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","29");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","29","EXIT");						return null;
					}
				}
				
			case Precedence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","10","34");				if ( isCompositePropositionOfTypeC(p) ){
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","34","35");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","35","EXIT");					return ltlGenerator.generateLTLFormula("GlobalQPrecedesPC", p, q, r, l);
				} 
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","34","39");					if (isCompositePropositionOfTypeE(p)) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","39","40");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","40","EXIT");						return ltlGenerator.generateLTLFormula("GlobalQPrecedesPE", p, q, r, l);
					} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","39","42");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","42","EXIT");						return null;
					}
				}
				
			default: 
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","10","47");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\GlobalFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","47","EXIT");				return null;
				
		}
	}
	
}

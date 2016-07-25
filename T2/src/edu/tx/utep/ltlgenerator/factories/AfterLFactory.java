package edu.tx.utep.ltlgenerator.factories; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.LTLPatternType;

public class AfterLFactory extends LTLGeneratorFactory {

	@Override
	public String getLTLFormula(LTLPatternType ltlPatternType, String p, String q, String r, String l) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","8");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","8","9");		switch (ltlPatternType){
			case Absence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","11");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","11","EXIT");				return ltlGenerator.generateLTLFormula("AbsenceOfPAfterL", p, q, r, l);
				
			case Existence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","14");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","14","EXIT");				return ltlGenerator.generateLTLFormula("ExistenceOfPAfterL", p, q, r, l);
				
			case Response:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","17");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","17","EXIT");				return ltlGenerator.generateLTLFormula("QRespondsToPAfterL", p, q, r, l);
				
			case StricPrecedence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","20");				if ( isCompositePropositionOfTypeC(p) )
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","20","22");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","22","EXIT");					return ltlGenerator.generateLTLFormula("QStrictlyPrecedesPcAfterL", p, q, r, l);
				} 
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","20","26");					if (isCompositePropositionOfTypeE(p)) 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","28");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","EXIT");						return ltlGenerator.generateLTLFormula("QStrictlyPrecedesPeAfterL", p, q, r, l);
					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","26","32");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","32","EXIT");						return null;
					}
				}
				
			case Precedence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","37");				if ( isCompositePropositionOfTypeC(p) )
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","37","39");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","39","EXIT");					return ltlGenerator.generateLTLFormula("QPrecedesPcAfterL", p, q, r, l);
				} 
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","37","43");					if (isCompositePropositionOfTypeE(p)) 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","43","45");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","45","EXIT");						return ltlGenerator.generateLTLFormula("QPrecedesPeAfterL", p, q, r, l);
					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","43","49");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","49","EXIT");						return null;
					}
				}
				
			default: 
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","54");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\AfterLFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","54","EXIT");				return null;
		}
	}

}

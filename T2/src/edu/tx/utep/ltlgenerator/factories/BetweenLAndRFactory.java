package edu.tx.utep.ltlgenerator.factories; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.LTLPatternType;

public class BetweenLAndRFactory extends LTLGeneratorFactory {

	@Override
	public String getLTLFormula(LTLPatternType ltlPatternType, String p, String q, String r, String l) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","8");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","8","9");		switch (ltlPatternType){
			case Absence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","11");				if ( isCompositePropositionOfTypeC(r) )
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","11","13");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","13","EXIT");					return ltlGenerator.generateLTLFormula("AbsenceOfPBetweenLAndRc", p, q, r, l);
				} 
				else 
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","11","17");					if (isCompositePropositionOfTypeE(r)) 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","17","19");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","19","EXIT");						return ltlGenerator.generateLTLFormula("AbsenceOfPBetweenLAndRe", p, q, r, l);
					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","17","23");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","23","EXIT");						return null;
					}
				}
				
			case Existence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","28");				if ( isCompositePropositionOfTypeC(r) )
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","30");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","30","EXIT");					return ltlGenerator.generateLTLFormula("ExistenceOfPBetweenLAndRc", p, q, r, l);
				} 
				else 
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","28","34");					if (isCompositePropositionOfTypeE(r)) 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","34","36");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","36","EXIT");						return ltlGenerator.generateLTLFormula("ExistenceOfPBetweenLAndRe", p, q, r, l);
					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","34","40");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","40","EXIT");						return null;
					}
				}
				
			case Response:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","45");				if ( isCompositePropositionOfTypeC(r) )
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","45","47");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","47","EXIT");					return ltlGenerator.generateLTLFormula("QRespondsToPBetweenLAndRc", p, q, r, l);
				} 
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","45","51");					if (isCompositePropositionOfTypeE(r)) 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","51","53");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","53","EXIT");						return ltlGenerator.generateLTLFormula("QRespondsToPBetweenLAndRe", p, q, r, l);
					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","51","57");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","57","EXIT");						return null;
					}
				}
				
			case StricPrecedence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","62");				if ( isCompositePropositionOfTypeC(r) )
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","62","64");					if ( isCompositePropositionOfTypeC(p) )
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","64","66");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","66","EXIT");						return ltlGenerator.generateLTLFormula("QStrictlyPrecedesPcBetweenLAndRc", p, q, r, l);
					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","64","70");						if (isCompositePropositionOfTypeE(p)) 
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","70","72");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","72","EXIT");							return ltlGenerator.generateLTLFormula("QStrictlyPrecedesPeBetweenLAndRc", p, q, r, l);
						} 
						else 
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","70","76");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","76","EXIT");							return null;
						}
					}
				} 
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","62","82");					if (isCompositePropositionOfTypeE(r)) 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","82","84");						if ( isCompositePropositionOfTypeC(p) )
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","84","86");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","86","EXIT");							return ltlGenerator.generateLTLFormula("QStrictlyPrecedesPcBetweenLAndRe", p, q, r, l);
						} 
						else 
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","84","90");							if (isCompositePropositionOfTypeE(p)) 
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","90","92");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","92","EXIT");								return ltlGenerator.generateLTLFormula("QStrictlyPrecedesPeBetweenLAndRe", p, q, r, l);
							} 
							else 
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","90","96");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","96","EXIT");								return null;
							}
						}
					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","82","102");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","102","EXIT");						return null;
					}
				}
				
			case Precedence:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","107");				if ( isCompositePropositionOfTypeC(r) )
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","107","109");					if ( isCompositePropositionOfTypeC(p) )
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","109","111");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","111","EXIT");						return ltlGenerator.generateLTLFormula("QPrecedesPcBetweenLAndRc", p, q, r, l);
					} 
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","109","115");						if (isCompositePropositionOfTypeE(p)) 
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","115","117");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","117","EXIT");							return ltlGenerator.generateLTLFormula("QPrecedesPeBetweenLAndRc", p, q, r, l);
						} 
						else 
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","115","121");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","121","EXIT");							return null;
						}
					}
				} 
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","107","127");					if (isCompositePropositionOfTypeE(r)) 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","127","129");						if ( isCompositePropositionOfTypeC(p) )
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","129","131");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","131","EXIT");							return ltlGenerator.generateLTLFormula("QPrecedesPcBetweenLAndRe", p, q, r, l);
						} 
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","129","135");							if (isCompositePropositionOfTypeE(p)) 
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","135","137");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","137","EXIT");								return ltlGenerator.generateLTLFormula("QPrecedesPeBetweenLAndRe", p, q, r, l);
							} 
							else 
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","135","141");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","141","EXIT");								return null;
							}
						}
					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","127","147");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","147","EXIT");						return null;
					}
				}
				
			default: 
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","9","152");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\BetweenLAndRFactory\\","getLTLFormula(edu.tx.utep.ltlgenerator.LTLPatternType,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String,Ljava.lang.String).xml","152","EXIT");				return null;
		}
	}

}

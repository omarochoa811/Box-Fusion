package edu.tx.utep.ltlgenerator.inputoutput; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.LTLPatternType;
import edu.tx.utep.ltlgenerator.LTLScopeType;

public class ProcessInput extends LTLInputOutput {

	protected static String getInputType(String lineInput){InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","START","8");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","8","9");		String inputType = "";
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","9","10");		String lineInputUpperCase = lineInput.toUpperCase();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","10","11");		if (lineInputUpperCase.contains(PATTERN + SEPARATOR))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","11","13");			inputType = PATTERN;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","13","14");		} 
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","11","17");			if (lineInputUpperCase.contains(SCOPE + SEPARATOR))
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","17","19");				inputType = SCOPE;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","19","20");			} 
			else 
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","17","23");				if (lineInputUpperCase.contains(ATLEASTONEC.toUpperCase()))
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","23","25");					inputType = ATLEASTONEC;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","25","26");				} 
				else 
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","23","29");					if (lineInputUpperCase.contains(ATLEASTONEH.toUpperCase()))
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","29","31");						inputType = ATLEASTONEH;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","31","32");					} 
					else 
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","29","35");						if (lineInputUpperCase.contains(ATLEASTONEE.toUpperCase()))
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","35","37");							inputType = ATLEASTONEE;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","37","38");						} 
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","35","41");							if (lineInputUpperCase.contains(PARALLELC.toUpperCase()))
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","41","43");								inputType = PARALLELC;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","43","44");							} 
							else 
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","41","47");								if (lineInputUpperCase.contains(PARALLELH.toUpperCase()))
								{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","47","49");									inputType = PARALLELH;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","49","50");								} 
								else 
								{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","47","53");									if (lineInputUpperCase.contains(PARALLELE.toUpperCase()))
									{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","53","55");										inputType = PARALLELE;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","55","56");									} 
									else 
									{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","53","59");										if (lineInputUpperCase.contains(CONSECUTIVEC.toUpperCase()))
										{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","59","61");											inputType = CONSECUTIVEC;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","61","62");										} 
										else 
										{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","59","65");											if (lineInputUpperCase.contains(CONSECUTIVEH.toUpperCase()))
											{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","65","67");												inputType = CONSECUTIVEH;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","67","68");											} 
											else 
											{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","65","71");												if (lineInputUpperCase.contains(CONSECUTIVEE.toUpperCase()))
												{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","71","73");													inputType = CONSECUTIVEE;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","73","74");												} 
												else
												{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","71","77");													if (lineInputUpperCase.contains(EVENTUALC.toUpperCase()))
													{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","77","79");														inputType = EVENTUALC;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","79","80");													} 
													else 
													{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","77","83");														if (lineInputUpperCase.contains(EVENTUALH.toUpperCase()))
														{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","83","85");															inputType = EVENTUALH;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","85","86");														} 
														else 
														{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","83","89");															if (lineInputUpperCase.contains(EVENTUALE.toUpperCase()))
															{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","89","91");																inputType = EVENTUALE;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","91","92");															} 
															else 
															{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","89","95");																if (lineInputUpperCase.contains(EMPTY_CP_INDICATOR.toUpperCase()))
																{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","95","97");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","97","EXIT");																	return EMPTY_CP_INDICATOR;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","95","113");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getInputType(java.lang.String).xml","113","EXIT");		return inputType;
	}
	
	protected static int getFirstSeparatorIndex(String lineInput){InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getFirstSeparatorIndex(java.lang.String).xml","START","116");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getFirstSeparatorIndex(java.lang.String).xml","116","117");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getFirstSeparatorIndex(java.lang.String).xml","117","EXIT");		return lineInput.indexOf(SEPARATOR);
	}
		
	protected static LTLScopeType getScope(String lineInput){InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","START","120");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","120","121");		String scopeString = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","121","122");		int startScopeIndex = getFirstSeparatorIndex(lineInput) + 1;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","122","123");		scopeString = lineInput.substring(startScopeIndex);
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","123","125");		switch (scopeString.toUpperCase()){
		case "AFTERL":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","125","127");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","127","EXIT");			return LTLScopeType.AfterL;
		case "AFTERLUNTILR":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","125","129");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","129","EXIT");			return LTLScopeType.AfterLUntilR;
		case "BEFORER":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","125","131");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","131","EXIT");			return LTLScopeType.BeforeR;
		case "BETWEENLANDR":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","125","133");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","133","EXIT");			return LTLScopeType.BetweenLAndR;
		case "GLOBAL":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","125","135");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","135","EXIT");			return LTLScopeType.Global;
		default:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","125","137");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getScope(java.lang.String).xml","137","EXIT");			return null;
		}
		
	}
	
	protected static LTLPatternType getPattern(String lineInput){InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","START","142");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","142","143");		String patternString = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","143","144");		int startPatternIndex = getFirstSeparatorIndex(lineInput) + 1;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","144","145");		patternString = lineInput.substring(startPatternIndex);
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","145","147");		switch (patternString.toUpperCase()){
			case "ABSENCE":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","147","149");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","149","EXIT");				return LTLPatternType.Absence;
			case "EXISTENCE":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","147","151");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","151","EXIT");				return LTLPatternType.Existence;
			case "PRECEDENCE":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","147","153");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","153","EXIT");				return LTLPatternType.Precedence;
			case "RESPONSE":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","147","155");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","155","EXIT");				return LTLPatternType.Response;
			case "STRICTPRECEDENCE":
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","147","157");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","157","EXIT");				return LTLPatternType.StricPrecedence;
			default:
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","147","159");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\ProcessInput\\","getPattern(java.lang.String).xml","159","EXIT");				return null;
		}
	}
}

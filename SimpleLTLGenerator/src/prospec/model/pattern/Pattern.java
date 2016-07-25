package prospec.model.pattern; import instrumentor.InstrumentingCode;

import prospec.model.proposition.Proposition;

public class Pattern 
{	
	protected Proposition P;
	
	public String getPatternType()
	{InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","START","10");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","10","11");		if (this instanceof Absence)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","11","13");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","13","EXIT");return "Absence";
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","11","17");			if (this instanceof Existence)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","17","19");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","19","EXIT");return "Existence";
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","17","23");				if (this instanceof Precedence)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","23","25");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","25","EXIT");return "Precedence";
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","23","29");					if (this instanceof Response)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","29","31");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","31","EXIT");return "Response";
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","29","35");						if (this instanceof StrictPrecedence)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","35","37");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","37","EXIT");return "StrictPrecedence";
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","35","41");							if (this instanceof Universality)
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","41","43");								InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","43","EXIT");return "Universality";
							}	
							else
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","41","47");								InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getPatternType().xml","47","EXIT");return "Undefined";
							}
						}
					}
				}
			}
		}
	}

	public Proposition getP() 
	{InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getP().xml","START","57");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getP().xml","57","58");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","getP().xml","58","EXIT");return P;
	}
	
	public void setP(Proposition P)
	{InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","setP(prospec.model.proposition.Proposition).xml","START","62");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","setP(prospec.model.proposition.Proposition).xml","62","63");		this.P=P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","setP(prospec.model.proposition.Proposition).xml","63","64");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Pattern\\","setP(prospec.model.proposition.Proposition).xml","64","EXIT");}
}

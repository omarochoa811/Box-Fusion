package prospec.model.proposition; import instrumentor.InstrumentingCode;

public class Proposition {
	
	protected String name;
	protected String description;
		
	public Proposition(String name, String description) 
	{InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","Proposition(java.lang.String,Ljava.lang.String).xml","START","8");InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","Proposition(java.lang.String,Ljava.lang.String).xml","8","9");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","Proposition(java.lang.String,Ljava.lang.String).xml","9","10");		this.name = name;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","Proposition(java.lang.String,Ljava.lang.String).xml","10","11");		this.description = description;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","Proposition(java.lang.String,Ljava.lang.String).xml","11","12");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","Proposition(java.lang.String,Ljava.lang.String).xml","12","EXIT");}
	public String getName() {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getName().xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getName().xml","13","14");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getName().xml","14","EXIT");return name;
	}
	public void setName(String name) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","setName(java.lang.String).xml","START","16");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","setName(java.lang.String).xml","16","17");		this.name = name;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","setName(java.lang.String).xml","17","18");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","setName(java.lang.String).xml","18","EXIT");}
	public String getDescription() {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getDescription().xml","START","19");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getDescription().xml","19","20");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getDescription().xml","20","EXIT");return description;
	}
	public void setDescription(String description) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","setDescription(java.lang.String).xml","START","23");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","setDescription(java.lang.String).xml","22","23");		this.description = description;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","setDescription(java.lang.String).xml","23","24");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","setDescription(java.lang.String).xml","24","EXIT");}

	public String getPropositionType()
	{InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","START","27");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","27","28");		if (this instanceof AtLeastOneC)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","28","30");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","30","EXIT");return "AtLeastOneC";
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","28","34");			if (this instanceof AtLeastOneE)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","34","36");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","36","EXIT");return "AtLeastOneE";
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","34","40");				if (this instanceof Atomic)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","40","42");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","42","EXIT");return "Atomic";
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","40","46");					if (this instanceof ConsecutiveC)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","46","48");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","48","EXIT");return "ConsecutiveC";
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","46","52");						if (this instanceof ConsecutiveE)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","52","54");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","54","EXIT");return "ConsecutiveE";
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","52","58");							if (this instanceof EventualC)
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","58","60");								InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","60","EXIT");return "EventualC";
							}	
							else								
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","58","64");								if (this instanceof EventualE)
								{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","64","66");									InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","66","EXIT");return "EventualE";
								}	
								else
								{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","64","70");									if (this instanceof ParallelC)
									{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","70","72");										InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","72","EXIT");return "ParallelC";
									}
									else
									{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","70","76");										if (this instanceof ParallelE)
										{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","76","78");											InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","78","EXIT");return "ParallelE";
										}
										else
										{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","76","82");											if (this instanceof Incomplete)
											{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","82","84");												InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","84","EXIT");return "Incomplete";
											}	
											else
											{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","82","88");												if (this instanceof CompositePropositions)
												{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","88","90");													InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","90","EXIT");return "CompositePropositions";
												}
												else
												{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","88","94");													if (this instanceof Proposition)
													{InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","94","95");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","95","96");														InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","96","EXIT");return "Proposition";
													}
													else 
													{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","94","100");														InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Proposition\\","getPropositionType().xml","100","EXIT");return "Undefined";
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

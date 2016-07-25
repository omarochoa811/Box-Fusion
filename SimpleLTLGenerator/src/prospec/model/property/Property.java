package prospec.model.property; import instrumentor.InstrumentingCode;
import prospec.model.pattern.Pattern;
import prospec.model.proposition.Proposition;
import prospec.model.scope.Scope;


public class Property extends Object {

	String Name;
	String Description;
	String Assumptions;	
	Scope scope;
	Pattern pattern;
	
	Proposition[] associatedPropositions;

	public Property(String name, String description, String assumptions) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","17");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","17","18");		Name = name;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","18","19");		Description = description;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","19","20");		Assumptions = assumptions;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","20","21");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","21","EXIT");}
	public Property(Scope scope, Pattern pattern) 
	{InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(prospec.model.scope.Scope,Lprospec.model.pattern.Pattern).xml","START","22");InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(prospec.model.scope.Scope,Lprospec.model.pattern.Pattern).xml","22","23");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(prospec.model.scope.Scope,Lprospec.model.pattern.Pattern).xml","23","24");		this.scope = scope;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(prospec.model.scope.Scope,Lprospec.model.pattern.Pattern).xml","24","25");		this.pattern = pattern;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(prospec.model.scope.Scope,Lprospec.model.pattern.Pattern).xml","25","26");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","Property(prospec.model.scope.Scope,Lprospec.model.pattern.Pattern).xml","26","EXIT");}

	public String getName() {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getName().xml","START","28");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getName().xml","28","29");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getName().xml","29","EXIT");return Name;
	}

	public void setName(String name) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setName(java.lang.String).xml","START","32");	
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setName(java.lang.String).xml","32","33");		Name = name;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setName(java.lang.String).xml","33","34");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setName(java.lang.String).xml","34","EXIT");}

	public String getDescription() {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDescription().xml","START","36");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDescription().xml","36","37");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDescription().xml","37","EXIT");return Description;
	}

	public void setDescription(String description) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setDescription(java.lang.String).xml","START","40");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setDescription(java.lang.String).xml","40","41");		Description = description;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setDescription(java.lang.String).xml","41","42");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setDescription(java.lang.String).xml","42","EXIT");}

	public String getAssumptions() {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getAssumptions().xml","START","44");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getAssumptions().xml","44","45");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getAssumptions().xml","45","EXIT");return Assumptions;
	}

	public void setAssumptions(String assumptions) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setAssumptions(java.lang.String).xml","START","48");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setAssumptions(java.lang.String).xml","48","49");		Assumptions = assumptions;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setAssumptions(java.lang.String).xml","49","50");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setAssumptions(java.lang.String).xml","50","EXIT");}

	public Scope getScope() {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getScope().xml","START","52");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getScope().xml","52","53");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getScope().xml","53","EXIT");return scope;
	}
	
	public void setScope(Scope scope) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setScope(prospec.model.scope.Scope).xml","START","56");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setScope(prospec.model.scope.Scope).xml","56","57");		this.scope = scope;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setScope(prospec.model.scope.Scope).xml","57","58");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setScope(prospec.model.scope.Scope).xml","58","EXIT");}

	public Pattern getPattern() {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getPattern().xml","START","60");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getPattern().xml","60","61");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getPattern().xml","61","EXIT");return pattern;
	}

	public void setPattern(Pattern pattern) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setPattern(prospec.model.pattern.Pattern).xml","START","64");	
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setPattern(prospec.model.pattern.Pattern).xml","64","65");		this.pattern = pattern;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setPattern(prospec.model.pattern.Pattern).xml","65","66");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setPattern(prospec.model.pattern.Pattern).xml","66","EXIT");}

	public Proposition[] getAssociatedPropositions() {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getAssociatedPropositions().xml","START","68");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getAssociatedPropositions().xml","68","69");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getAssociatedPropositions().xml","69","EXIT");return associatedPropositions;
	}

	public void setAssociatedPropositions(Proposition[] associatedPropositions) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setAssociatedPropositions([Lprospec.model.proposition.Proposition).xml","START","72");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setAssociatedPropositions([Lprospec.model.proposition.Proposition).xml","72","73");		this.associatedPropositions = associatedPropositions;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setAssociatedPropositions([Lprospec.model.proposition.Proposition).xml","73","74");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","setAssociatedPropositions([Lprospec.model.proposition.Proposition).xml","74","EXIT");}
	
	public Property getDeepCopy(){InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","START","76");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","76","77");		String copyName = getName();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","77","78");		String copyDescription = getDescription();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","78","79");		String copyAssumption = getAssumptions();
		Property copy;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","79","81");		copy = new Property(copyName, copyDescription, copyAssumption);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","81","82");		copy.setPattern(getPattern());
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","82","83");		copy.setScope(getScope());
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","83","84");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\property\\Property\\","getDeepCopy().xml","84","EXIT");return copy;
	}
}

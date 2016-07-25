package prospec.model.proposition; import instrumentor.InstrumentingCode;


public class AtLeastOneC extends CompositePropositions {

	public AtLeastOneC(String name, String description, Proposition[] propositions) 
	{
		super(name, description);InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\AtLeastOneC\\","AtLeastOneC(java.lang.String,Ljava.lang.String,[Lprospec.model.proposition.Proposition).xml","START","8");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\AtLeastOneC\\","AtLeastOneC(java.lang.String,Ljava.lang.String,[Lprospec.model.proposition.Proposition).xml","8","9");		this.propositions = propositions;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\AtLeastOneC\\","AtLeastOneC(java.lang.String,Ljava.lang.String,[Lprospec.model.proposition.Proposition).xml","9","10");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\AtLeastOneC\\","AtLeastOneC(java.lang.String,Ljava.lang.String,[Lprospec.model.proposition.Proposition).xml","10","EXIT");}
	
	public Proposition[] getAtomicPropositions() {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\AtLeastOneC\\","getAtomicPropositions().xml","START","12");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\AtLeastOneC\\","getAtomicPropositions().xml","12","13");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\AtLeastOneC\\","getAtomicPropositions().xml","13","EXIT");return propositions;
	}
}

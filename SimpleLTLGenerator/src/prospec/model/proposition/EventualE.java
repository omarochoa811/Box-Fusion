package prospec.model.proposition; import instrumentor.InstrumentingCode;


public class EventualE extends CompositePropositions {

	public EventualE(String name, String description, Proposition[] propositions) {
		super(name, description);InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\EventualE\\","EventualE(java.lang.String,Ljava.lang.String,[Lprospec.model.proposition.Proposition).xml","START","7");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\EventualE\\","EventualE(java.lang.String,Ljava.lang.String,[Lprospec.model.proposition.Proposition).xml","7","8");		this.propositions = propositions;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\EventualE\\","EventualE(java.lang.String,Ljava.lang.String,[Lprospec.model.proposition.Proposition).xml","8","9");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\EventualE\\","EventualE(java.lang.String,Ljava.lang.String,[Lprospec.model.proposition.Proposition).xml","9","EXIT");}

	public Proposition[] getAtomicPropositions() {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\EventualE\\","getAtomicPropositions().xml","START","11");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\EventualE\\","getAtomicPropositions().xml","11","12");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\EventualE\\","getAtomicPropositions().xml","12","EXIT");return propositions;
	}
}

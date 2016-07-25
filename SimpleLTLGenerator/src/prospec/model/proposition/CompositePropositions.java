package prospec.model.proposition; import instrumentor.InstrumentingCode;

public class CompositePropositions extends Proposition {

	protected Proposition[] propositions;

	public void setPropositions(Proposition[] propositions) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","setPropositions([Lprospec.model.proposition.Proposition).xml","START","7");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","setPropositions([Lprospec.model.proposition.Proposition).xml","7","8");		this.propositions = propositions;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","setPropositions([Lprospec.model.proposition.Proposition).xml","8","9");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","setPropositions([Lprospec.model.proposition.Proposition).xml","9","EXIT");}

	public CompositePropositions(String name, String description) {
		super(name, description);InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","CompositePropositions(java.lang.String,Ljava.lang.String).xml","START","12");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","CompositePropositions(java.lang.String,Ljava.lang.String).xml","12","13");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","CompositePropositions(java.lang.String,Ljava.lang.String).xml","13","EXIT");}

	public Proposition[] getAtomicPropositions() {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","getAtomicPropositions().xml","START","15");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","getAtomicPropositions().xml","15","16");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\CompositePropositions\\","getAtomicPropositions().xml","16","EXIT");return propositions;
	}
}

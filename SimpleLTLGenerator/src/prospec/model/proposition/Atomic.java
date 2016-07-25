package prospec.model.proposition; import instrumentor.InstrumentingCode;


public class Atomic extends Proposition {
	
	protected boolean polarity;
	
	public Atomic(String name, String description, Boolean polarity) {
		super(name, description);InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","Atomic(java.lang.String,Ljava.lang.String,Ljava.lang.Boolean).xml","START","9");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","Atomic(java.lang.String,Ljava.lang.String,Ljava.lang.Boolean).xml","9","10");		this.polarity=polarity;
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","Atomic(java.lang.String,Ljava.lang.String,Ljava.lang.Boolean).xml","10","12");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","Atomic(java.lang.String,Ljava.lang.String,Ljava.lang.Boolean).xml","12","EXIT");}
	public void setPolarity(boolean value){InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","setPolarity(Z).xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","setPolarity(Z).xml","13","14");		this.polarity = value;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","setPolarity(Z).xml","14","15");	InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","setPolarity(Z).xml","15","EXIT");}
	public boolean getPolarity(){InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","getPolarity().xml","START","16");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","getPolarity().xml","16","17");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\proposition\\Atomic\\","getPolarity().xml","17","EXIT");return this.polarity;
	}
}

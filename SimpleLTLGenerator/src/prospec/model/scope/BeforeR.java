package prospec.model.scope; import instrumentor.InstrumentingCode;
import prospec.model.proposition.Proposition;


public class BeforeR extends Scope {

	private Proposition R;	
     
    public BeforeR(Proposition R) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","BeforeR(prospec.model.proposition.Proposition).xml","START","9");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","BeforeR(prospec.model.proposition.Proposition).xml","9","10");        this.R = R;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","BeforeR(prospec.model.proposition.Proposition).xml","10","11");    InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","BeforeR(prospec.model.proposition.Proposition).xml","11","EXIT");}
    
    public Proposition getR() {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","getR().xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","getR().xml","13","14");        InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","getR().xml","14","EXIT");return R;
    }
    
    public void setR(Proposition R)
    {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","setR(prospec.model.proposition.Proposition).xml","START","18");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","setR(prospec.model.proposition.Proposition).xml","18","19");    	this.R=R;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","setR(prospec.model.proposition.Proposition).xml","19","20");    InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\BeforeR\\","setR(prospec.model.proposition.Proposition).xml","20","EXIT");}
	   
}

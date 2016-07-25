package prospec.model.pattern; import instrumentor.InstrumentingCode;
import prospec.model.proposition.Proposition;

public class Response extends Pattern 
{

	Proposition Q;
	
	public Response(Proposition P, Proposition Q) 
	{InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","Response(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","START","9");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","Response(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","9","10");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","Response(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","10","11");        this.P = P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","Response(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","11","12");        this.Q = Q;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","Response(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","12","13");    InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","Response(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","13","EXIT");}
    
    public Proposition getQ() 
    {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","getQ().xml","START","16");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","getQ().xml","16","17");        InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","getQ().xml","17","EXIT");return Q;
    }  
    
    public void setQ(Proposition Q)
    {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","setQ(prospec.model.proposition.Proposition).xml","START","21");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","setQ(prospec.model.proposition.Proposition).xml","21","22");    	this.Q = Q;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","setQ(prospec.model.proposition.Proposition).xml","22","23");    InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\Response\\","setQ(prospec.model.proposition.Proposition).xml","23","EXIT");}
}

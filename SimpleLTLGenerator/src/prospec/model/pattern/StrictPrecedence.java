package prospec.model.pattern; import instrumentor.InstrumentingCode;
import prospec.model.proposition.Proposition;

public class StrictPrecedence extends Pattern {

	Proposition Q;
	
    public StrictPrecedence(Proposition P, Proposition Q) 
    {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","StrictPrecedence(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","START","8");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","StrictPrecedence(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","8","9");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","StrictPrecedence(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","9","10");this.P = P;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","StrictPrecedence(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","10","11");this.Q = Q;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","StrictPrecedence(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","11","12");    InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","StrictPrecedence(prospec.model.proposition.Proposition,Lprospec.model.proposition.Proposition).xml","12","EXIT");}
    
    public Proposition getQ() 
    {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","getQ().xml","START","15");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","getQ().xml","15","16");        InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","getQ().xml","16","EXIT");return Q;
    }
    
    public void setQ(Proposition Q)
    {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","setQ(prospec.model.proposition.Proposition).xml","START","20");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","setQ(prospec.model.proposition.Proposition).xml","20","21");    	this.Q = Q;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\pattern\\StrictPrecedence\\","setQ(prospec.model.proposition.Proposition).xml","22","EXIT");	}
}


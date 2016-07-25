package prospec.model.scope; import instrumentor.InstrumentingCode;

import prospec.model.scope.AfterL;
import prospec.model.scope.AfterLuntilR;
import prospec.model.scope.BeforeR;
import prospec.model.scope.BetweenLandR;
import prospec.model.scope.Global;

abstract public class Scope {
	
	public String getScopeType()
	{InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","START","12"); 
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","12","13");		if (this instanceof AfterL)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","13","15");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","15","EXIT");return "After L";
		}
		else 
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","13","19");			if (this instanceof AfterLuntilR)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","19","21");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","21","EXIT");return "After L until R";
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","19","25");				if (this instanceof BeforeR)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","27","EXIT");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","25","27");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","27","EXIT");return "Before R";
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","25","31");					if (this instanceof BetweenLandR)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","31","33");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","33","EXIT");return "Between L and R";
					}
					
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","31","38");						if (this instanceof Global)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","38","40");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","40","EXIT");return "Global";
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","38","44");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\model\\scope\\Scope\\","getScopeType().xml","44","EXIT");return "Undefined";
						}
					}
				}
			}
		}
	}
}

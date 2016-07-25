package edu.tx.utep.ltlgenerator.factories; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.cps.AtLeastOneC;
import edu.tx.utep.ltlgenerator.cps.AtLeastOneE;
import edu.tx.utep.ltlgenerator.cps.AtLeastOneH;
import edu.tx.utep.ltlgenerator.cps.CompositeProposition;
import edu.tx.utep.ltlgenerator.cps.ConsecutiveC;
import edu.tx.utep.ltlgenerator.cps.ConsecutiveE;
import edu.tx.utep.ltlgenerator.cps.ConsecutiveH;
import edu.tx.utep.ltlgenerator.cps.EventualC;
import edu.tx.utep.ltlgenerator.cps.EventualE;
import edu.tx.utep.ltlgenerator.cps.EventualH;
import edu.tx.utep.ltlgenerator.cps.ParallelC;
import edu.tx.utep.ltlgenerator.cps.ParallelE;
import edu.tx.utep.ltlgenerator.cps.ParallelH;
import edu.tx.utep.ltlgenerator.cps.ParallelInverse;
import edu.tx.utep.ltlgenerator.exceptions.CPNotFoundException;

// Factory Pattern
public class CPFactory {

	public CompositeProposition getCPClass(String cpName) throws CPNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","START","22");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","22","23");		if (cpName.equals("AtLeastOneC"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","23","25");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","25","EXIT");			return new AtLeastOneC();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","23","27");		if (cpName.equals("AtLeastOneH"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","27","29");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","29","EXIT");			return new AtLeastOneH();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","27","31");		if (cpName.equals("AtLeastOneE"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","31","33");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","33","EXIT");			return new AtLeastOneE();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","31","35");		if (cpName.equals("ParallelC"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","35","37");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","37","EXIT");			return new ParallelC();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","35","39");		if (cpName.equals("ParallelH"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","39","41");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","41","EXIT");			return new ParallelH();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","39","43");		if (cpName.equals("ParallelE"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","43","45");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","45","EXIT");			return new ParallelE();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","43","47");		if (cpName.equals("ConsecutiveC"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","47","49");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","49","EXIT");			return new ConsecutiveC();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","47","51");		if (cpName.equals("ConsecutiveH"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","51","53");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","53","EXIT");			return new ConsecutiveH();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","51","55");		if (cpName.equals("ConsecutiveE"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","55","57");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","57","EXIT");			return new ConsecutiveE();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","55","59");		if (cpName.equals("EventualC"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","59","61");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","61","EXIT");			return new EventualC();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","59","63");		if (cpName.equals("EventualH"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","63","65");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","65","EXIT");			return new EventualH();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","63","67");		if (cpName.equals("EventualE"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","67","69");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","69","EXIT");			return new EventualE();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","67","71");		if (cpName.equals("ParallelInverse"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","71","73");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","73","EXIT");			return new ParallelInverse();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","71","75");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\CPFactory\\","getCPClass(java.lang.String).xml","75","EXIT");		throw new CPNotFoundException(cpName);
	}


}

package edu.tx.utep.ltlgenerator; import instrumentor.InstrumentingCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.tx.utep.ltlgenerator.cps.CompositeProposition;
import edu.tx.utep.ltlgenerator.exceptions.CPNotFoundException;
import edu.tx.utep.ltlgenerator.factories.CPFactory;

public class CPGenerator {

	public List<String> getCompositeProposition(String cp) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","START","13");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","13","14");		if(cp == null || cp.length() == 0)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","14","16");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","16","EXIT");			return null;
		}
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","14","19");		String[] splitCP = cp.split("_");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","19","20");		String letter = splitCP[0].toLowerCase();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","20","21");		String cpName = splitCP[1];
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","21","22");		String countS = splitCP[2];
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","22","23");		int count = Integer.parseInt(countS);

		CompositeProposition cpClass;
		try {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","23","27");			cpClass = new CPFactory().getCPClass(cpName);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","27","28");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","28","EXIT");			return cpClass.generateLTLFormulaArray(letter, count);

		} catch (CPNotFoundException e) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","30","31");			e.printStackTrace();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","31","32");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\CPGenerator\\","getCompositeProposition(java.lang.String).xml","32","EXIT");			return new ArrayList<String>(Arrays.asList(e.getMessage()));
		}
	}

}

package edu.tx.utep.ltlgenerator.factories; import instrumentor.InstrumentingCode;

import edu.tx.utep.ltlgenerator.exceptions.TemplateNotFoundException;
import edu.tx.utep.ltlgenerator.templates.Template;
import edu.tx.utep.ltlgenerator.templates.afterl.AfterL;
import edu.tx.utep.ltlgenerator.templates.afterl.AfterLUntilRc;
import edu.tx.utep.ltlgenerator.templates.afterl.AfterLUntilRe;
import edu.tx.utep.ltlgenerator.templates.beforer.AbsenceOfPBeforeRc;
import edu.tx.utep.ltlgenerator.templates.beforer.AbsenceOfPBeforeRe;
import edu.tx.utep.ltlgenerator.templates.beforer.ExistenceOfPBeforeRc;
import edu.tx.utep.ltlgenerator.templates.beforer.ExistenceOfPBeforeRe;
import edu.tx.utep.ltlgenerator.templates.beforer.QPrecedesPcBeforeRc;
import edu.tx.utep.ltlgenerator.templates.beforer.QPrecedesPcBeforeRe;
import edu.tx.utep.ltlgenerator.templates.beforer.QPrecedesPeBeforeRc;
import edu.tx.utep.ltlgenerator.templates.beforer.QPrecedesPeBeforeRe;
import edu.tx.utep.ltlgenerator.templates.beforer.QRespondsToPBeforeRc;
import edu.tx.utep.ltlgenerator.templates.beforer.QRespondsToPBeforeRe;
import edu.tx.utep.ltlgenerator.templates.beforer.QStrictlyPrecedesPcBeforeRc;
import edu.tx.utep.ltlgenerator.templates.beforer.QStrictlyPrecedesPcBeforeRe;
import edu.tx.utep.ltlgenerator.templates.beforer.QStrictlyPrecedesPeBeforeRc;
import edu.tx.utep.ltlgenerator.templates.beforer.QStrictlyPrecedesPeBeforeRe;
import edu.tx.utep.ltlgenerator.templates.between.BetweenLAndRc;
import edu.tx.utep.ltlgenerator.templates.between.BetweenLAndRe;
import edu.tx.utep.ltlgenerator.templates.global.GlobalAbsenceOfP;
import edu.tx.utep.ltlgenerator.templates.global.GlobalExistenceOfP;
import edu.tx.utep.ltlgenerator.templates.global.GlobalQPrecedesPCPlus;
import edu.tx.utep.ltlgenerator.templates.global.GlobalQPrecedesPCStar;
import edu.tx.utep.ltlgenerator.templates.global.GlobalQPrecedesPEPlus;
import edu.tx.utep.ltlgenerator.templates.global.GlobalQPrecedesPEStar;
import edu.tx.utep.ltlgenerator.templates.global.GlobalQRespondsToP;
import edu.tx.utep.ltlgenerator.templates.global.GlobalQStrictlyPrecedesPC;
import edu.tx.utep.ltlgenerator.templates.global.GlobalQStrictlyPrecedesPE;

// Factory Pattern
public class TemplateFactory {

	public Template getTemplate(String templateName, String qProposition) throws TemplateNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","START","37");

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","37","39");		if (templateName.contains("Global"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","39","41");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","41","EXIT");			return getGlobalTemplate(templateName, qProposition);
		}
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","39","44");		if (templateName.contains("BeforeR"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","44","46");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","46","EXIT");			return getBeforeRTemplate(templateName);
		}
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","44","49");		if (templateName.contains("BetweenLAndRc"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","49","51");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","51","EXIT");			return getBetweenLandRcTemplate(templateName);
		}
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","49","54");		if (templateName.contains("BetweenLAndRe"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","54","56");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","56","EXIT");			return getBetweenLAndRe(templateName);
		}
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","54","59");		if (templateName.contains("AfterLUntilRc"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","59","61");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","61","EXIT");			return getAfterLUntilRc(templateName, qProposition);
		}
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","59","64");		if (templateName.contains("AfterLUntilRe"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","64","66");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","66","EXIT");			return getAfterLUntilRe(templateName, qProposition);
		}
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","64","69");		if (templateName.contains("AfterL"))
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","69","71");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","71","EXIT");			return getAfterLTemplate(templateName, qProposition);
		}
		
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","69","74");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getTemplate(java.lang.String,Ljava.lang.String).xml","74","EXIT");		throw new TemplateNotFoundException(templateName);
	}

	private Template getAfterLUntilRe(String templateName, String qProposition) throws TemplateNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","START","77");
		// 1. Absence Of P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","77","79");		if (templateName.equals("AbsenceOfPAfterLUntilRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","79","80");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","80","EXIT");			return new AfterLUntilRe(new GlobalAbsenceOfP(), new AbsenceOfPBeforeRe());
		}

		// 2. Existence Of P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","79","84");		if (templateName.equals("ExistenceOfPAfterLUntilRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","84","85");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","85","EXIT");			return new AfterLUntilRe(new GlobalExistenceOfP(), new ExistenceOfPBeforeRe());
		}

		// 3. Q Precedes Pc Before Re
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","84","89");		if (templateName.equals("QPrecedesPcAfterLUntilRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","89","90");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","90","EXIT");			return new AfterLUntilRe(getGlobalQPrecedesPE(qProposition), new QPrecedesPcBeforeRe());
		}

		// 4. Q Precedes Pe Before Re
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","89","94");		if (templateName.equals("QPrecedesPeAfterLUntilRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","94","95");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","95","EXIT");			return new AfterLUntilRe(getGlobalQPrecedesPE(qProposition), new QPrecedesPeBeforeRe());
		}

		// 5. Q Strictly Precedes Pc Before Re
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","94","99");		if (templateName.equals("QStrictlyPrecedesPcAfterLUntilRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","99","100");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","100","EXIT");			return new AfterLUntilRe(new GlobalQStrictlyPrecedesPC(), new QStrictlyPrecedesPcBeforeRe());
		}

		// 6. Q Strictly Precedes Pe Before Re
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","99","104");		if (templateName.equals("QStrictlyPrecedesPeAfterLUntilRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","104","105");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","105","EXIT");			return new AfterLUntilRe(new GlobalQStrictlyPrecedesPE(), new QStrictlyPrecedesPeBeforeRe());
		}

		// 7. Q Responds to P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","104","109");		if (templateName.equals("QRespondsToPAfterLUntilRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","109","110");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","110","EXIT");			return new AfterLUntilRe(new GlobalQRespondsToP(), new QRespondsToPBeforeRe());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","109","113");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRe(java.lang.String,Ljava.lang.String).xml","113","EXIT");		throw new TemplateNotFoundException(templateName);
	}

	private Template getAfterLUntilRc(String templateName, String qProposition) throws TemplateNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","START","116");
		// 1. Absence Of P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","116","118");		if (templateName.equals("AbsenceOfPAfterLUntilRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","118","119");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","119","EXIT");			return new AfterLUntilRc(new GlobalAbsenceOfP(), new AbsenceOfPBeforeRc());
		}

		// 2. Existence Of P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","118","123");		if (templateName.equals("ExistenceOfPAfterLUntilRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","123","124");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","124","EXIT");			return new AfterLUntilRc(new GlobalExistenceOfP(), new ExistenceOfPBeforeRc());
		}

		// 3. Q Precedes Pc Before Rc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","123","128");		if (templateName.equals("QPrecedesPcAfterLUntilRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","128","129");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","129","EXIT");			return new AfterLUntilRc(getGlobalQPrecedesPC(qProposition), new QPrecedesPcBeforeRc());
		}

		// 4. Q Precedes Pe Before Rc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","128","133");		if (templateName.equals("QPrecedesPeAfterLUntilRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","133","134");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","134","EXIT");			return new AfterLUntilRc(getGlobalQPrecedesPE(qProposition), new QPrecedesPeBeforeRc());
		}

		// 5. Q Strictly Precedes Pc Before Rc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","133","138");		if (templateName.equals("QStrictlyPrecedesPcAfterLUntilRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","138","139");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","139","EXIT");			return new AfterLUntilRc(new GlobalQStrictlyPrecedesPC(), new QStrictlyPrecedesPcBeforeRc());
		}

		// 6. Q Strictly Precedes Pe Before Rc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","138","143");		if (templateName.equals("QStrictlyPrecedesPeAfterLUntilRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","143","144");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","144","EXIT");			return new AfterLUntilRc(new GlobalQStrictlyPrecedesPE(), new QStrictlyPrecedesPeBeforeRc());
		}

		// 7. Q Responds to P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","143","148");		if (templateName.equals("QRespondsToPAfterLUntilRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","148","149");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","149","EXIT");			return new AfterLUntilRc(new GlobalQRespondsToP(), new QRespondsToPBeforeRc());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","148","152");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLUntilRc(java.lang.String,Ljava.lang.String).xml","152","EXIT");		throw new TemplateNotFoundException(templateName);
	}

	private Template getBetweenLAndRe(String templateName) throws TemplateNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","START","155");
		// 1. Absence Of P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","155","157");		if (templateName.equals("AbsenceOfPBetweenLAndRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","157","158");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","158","EXIT");			return new BetweenLAndRe(new AbsenceOfPBeforeRe());
		}

		// 2. Existence Of P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","157","162");		if (templateName.equals("ExistenceOfPBetweenLAndRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","162","163");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","163","EXIT");			return new BetweenLAndRe(new ExistenceOfPBeforeRe());
		}

		// 3. Q Precedes Pc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","162","167");		if (templateName.equals("QPrecedesPcBetweenLAndRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","167","168");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","168","EXIT");			return new BetweenLAndRe(new QPrecedesPcBeforeRe());
		}

		// 4. Q Precedes Pe
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","167","172");		if (templateName.equals("QPrecedesPeBetweenLAndRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","172","173");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","173","EXIT");			return new BetweenLAndRe(new QPrecedesPeBeforeRe());
		}

		// 5. Q Strictly Precedes Pc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","172","177");		if (templateName.equals("QStrictlyPrecedesPcBetweenLAndRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","177","178");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","178","EXIT");			return new BetweenLAndRe(new QStrictlyPrecedesPcBeforeRe());
		}

		// 6. Q Strictly Precedes Pe
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","177","182");		if (templateName.equals("QStrictlyPrecedesPeBetweenLAndRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","182","183");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","183","EXIT");			return new BetweenLAndRe(new QStrictlyPrecedesPeBeforeRe());
		}

		// 7. Q Responds to P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","182","187");		if (templateName.equals("QRespondsToPBetweenLAndRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","187","188");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","188","EXIT");			return new BetweenLAndRe(new QRespondsToPBeforeRe());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","187","191");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLAndRe(java.lang.String).xml","191","EXIT");		throw new TemplateNotFoundException(templateName);
	}

	private Template getBetweenLandRcTemplate(String templateName) throws TemplateNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","START","194");
		// 1. Absence Of P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","194","196");		if (templateName.equals("AbsenceOfPBetweenLAndRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","196","197");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","197","EXIT");			return new BetweenLAndRc(new AbsenceOfPBeforeRc());
		}

		// 2. Existence Of P
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","196","201");		if (templateName.equals("ExistenceOfPBetweenLAndRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","201","202");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","202","EXIT");			return new BetweenLAndRc(new ExistenceOfPBeforeRc());
		}

		// 3. Q Precedes Pc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","201","206");		if (templateName.equals("QPrecedesPcBetweenLAndRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","206","207");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","207","EXIT");			return new BetweenLAndRc(new QPrecedesPcBeforeRc());
		}

		// 4. Q Precedes Pe
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","206","211");		if (templateName.equals("QPrecedesPeBetweenLAndRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","211","212");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","212","EXIT");			return new BetweenLAndRc(new QPrecedesPeBeforeRc());
		}

		// 5. Q Strictly Precedes Pc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","211","216");		if (templateName.equals("QStrictlyPrecedesPcBetweenLAndRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","216","217");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","217","EXIT");			return new BetweenLAndRc(new QStrictlyPrecedesPcBeforeRc());
		}

		// 6. Q Strictly Precedes Pe
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","216","221");		if (templateName.equals("QStrictlyPrecedesPeBetweenLAndRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","221","222");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","222","EXIT");			return new BetweenLAndRc(new QStrictlyPrecedesPeBeforeRc());
		}

		// 7. Q Responds to P Between L And Rc
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","221","226");		if (templateName.equals("QRespondsToPBetweenLAndRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","226","227");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","227","EXIT");			return new BetweenLAndRc(new QRespondsToPBeforeRc());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","226","230");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBetweenLandRcTemplate(java.lang.String).xml","230","EXIT");		throw new TemplateNotFoundException(templateName);
	}

	private Template getAfterLTemplate(String templateName, String qProposition) throws TemplateNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","START","233");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","233","234");		if (templateName.equals("AbsenceOfPAfterL")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","234","235");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","235","EXIT");			return new AfterL(new GlobalAbsenceOfP());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","234","238");		if (templateName.equals("ExistenceOfPAfterL")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","238","239");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","239","EXIT");			return new AfterL(new GlobalExistenceOfP());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","238","242");		if (templateName.equals("QRespondsToPAfterL")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","242","243");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","243","EXIT");			return new AfterL(new GlobalQRespondsToP());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","242","246");		if (templateName.equals("QStrictlyPrecedesPcAfterL")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","246","247");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","247","EXIT");			return new AfterL(new GlobalQStrictlyPrecedesPC());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","246","250");		if (templateName.equals("QStrictlyPrecedesPeAfterL")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","250","251");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","251","EXIT");			return new AfterL(new GlobalQStrictlyPrecedesPE());
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","250","254");		if (templateName.equals("QPrecedesPcAfterL")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","254","255");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","255","EXIT");			return new AfterL(getGlobalQPrecedesPC(qProposition));
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","254","258");		if (templateName.equals("QPrecedesPeAfterL")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","258","259");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","259","EXIT");			return new AfterL(getGlobalQPrecedesPE(qProposition));
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","258","262");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getAfterLTemplate(java.lang.String,Ljava.lang.String).xml","262","EXIT");		throw new TemplateNotFoundException(templateName);
	}

	private Template getBeforeRTemplate(String templateName) throws TemplateNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","START","265");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","265","266");		if (templateName.equals("AbsenceOfPBeforeRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","266","267");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","267","EXIT");			return new AbsenceOfPBeforeRc();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","266","270");		if (templateName.equals("AbsenceOfPBeforeRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","270","271");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","271","EXIT");			return new AbsenceOfPBeforeRe();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","270","274");		if (templateName.equals("ExistenceOfPBeforeRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","274","275");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","275","EXIT");			return new ExistenceOfPBeforeRc();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","274","278");		if (templateName.equals("ExistenceOfPBeforeRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","278","279");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","279","EXIT");			return new ExistenceOfPBeforeRe();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","278","282");		if (templateName.equals("QPrecedesPcBeforeRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","282","283");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","283","EXIT");			return new QPrecedesPcBeforeRc();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","282","286");		if (templateName.equals("QPrecedesPcBeforeRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","286","287");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","287","EXIT");			return new QPrecedesPcBeforeRe();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","286","290");		if (templateName.equals("QPrecedesPeBeforeRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","290","291");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","291","EXIT");			return new QPrecedesPeBeforeRc();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","290","294");		if (templateName.equals("QPrecedesPeBeforeRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","294","295");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","295","EXIT");			return new QPrecedesPeBeforeRe();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","294","298");		if (templateName.equals("QRespondsToPBeforeRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","298","299");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","299","EXIT");			return new QRespondsToPBeforeRc();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","298","302");		if (templateName.equals("QRespondsToPBeforeRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","302","303");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","303","EXIT");			return new QRespondsToPBeforeRe();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","302","306");		if (templateName.equals("QStrictlyPrecedesPcBeforeRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","306","307");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","307","EXIT");			return new QStrictlyPrecedesPcBeforeRc();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","306","310");		if (templateName.equals("QStrictlyPrecedesPeBeforeRc")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","310","311");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","311","EXIT");			return new QStrictlyPrecedesPeBeforeRc();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","310","314");		if (templateName.equals("QStrictlyPrecedesPcBeforeRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","314","315");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","315","EXIT");			return new QStrictlyPrecedesPcBeforeRe();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","314","318");		if (templateName.equals("QStrictlyPrecedesPeBeforeRe")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","318","319");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","319","EXIT");			return new QStrictlyPrecedesPeBeforeRe();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","318","322");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getBeforeRTemplate(java.lang.String).xml","322","EXIT");		throw new TemplateNotFoundException(templateName);
	}

	private Template getGlobalTemplate(String templateName, String qProposition) throws TemplateNotFoundException {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","START","325");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","325","326");		if (templateName.equals("GlobalAbsenceOfP")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","326","327");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","327","EXIT");			return new GlobalAbsenceOfP();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","326","330");		if (templateName.equals("GlobalExistenceOfP")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","330","331");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","331","EXIT");			return new GlobalExistenceOfP();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","330","334");		if (templateName.equals("GlobalQPrecedesPE")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","334","335");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","335","EXIT");			return getGlobalQPrecedesPE(qProposition);
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","334","338");		if (templateName.equals("GlobalQPrecedesPC")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","338","339");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","339","EXIT");			return getGlobalQPrecedesPC(qProposition);
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","338","342");		if (templateName.equals("GlobalQPrecedesPCPlus")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","342","343");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","343","EXIT");			return new GlobalQPrecedesPCPlus();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","342","346");		if (templateName.equals("GlobalQPrecedesPCStar")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","346","347");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","347","EXIT");			return new GlobalQPrecedesPCStar();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","346","350");		if (templateName.equals("GlobalQPrecedesPEPlus")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","350","351");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","351","EXIT");			return new GlobalQPrecedesPEPlus();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","350","354");		if (templateName.equals("GlobalQPrecedesPEStar")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","354","355");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","355","EXIT");			return new GlobalQPrecedesPEStar();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","354","358");		if (templateName.equals("GlobalQRespondsToP")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","358","359");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","359","EXIT");			return new GlobalQRespondsToP();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","358","362");		if (templateName.equals("GlobalQStrictlyPrecedesPC")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","362","363");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","363","EXIT");			return new GlobalQStrictlyPrecedesPC();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","362","366");		if (templateName.equals("GlobalQStrictlyPrecedesPE")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","366","367");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","367","EXIT");			return new GlobalQStrictlyPrecedesPE();
		}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","366","370");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalTemplate(java.lang.String,Ljava.lang.String).xml","370","EXIT");		throw new TemplateNotFoundException(templateName);
	}

	private Template getGlobalQPrecedesPE(String qProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPE(java.lang.String).xml","START","373");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPE(java.lang.String).xml","373","374");		boolean isOfTypeStar = (qProposition.contains("Q_AtLeastOneC") || qProposition.contains("Q_ParallelC"));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPE(java.lang.String).xml","374","375");		if (isOfTypeStar)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPE(java.lang.String).xml","375","377");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPE(java.lang.String).xml","377","EXIT");			return new GlobalQPrecedesPEStar();
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPE(java.lang.String).xml","375","381");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPE(java.lang.String).xml","381","EXIT");			return new GlobalQPrecedesPEPlus();
		}
	}

	private Template getGlobalQPrecedesPC(String qProposition) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPC(java.lang.String).xml","START","385");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPC(java.lang.String).xml","385","386");		boolean isOfTypeStar = (qProposition.contains("Q_AtLeastOneC") || qProposition.contains("Q_ParallelC"));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPC(java.lang.String).xml","386","387");		if (isOfTypeStar)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPC(java.lang.String).xml","387","389");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPC(java.lang.String).xml","389","EXIT");			return new GlobalQPrecedesPCStar();
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPC(java.lang.String).xml","387","393");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\factories\\TemplateFactory\\","getGlobalQPrecedesPC(java.lang.String).xml","393","EXIT");			return new GlobalQPrecedesPCPlus();
		}
	}

}

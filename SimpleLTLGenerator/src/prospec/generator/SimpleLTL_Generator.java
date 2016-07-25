package prospec.generator; import instrumentor.InstrumentingCode;
import prospec.model.pattern.Absence;
import prospec.model.pattern.Existence;
import prospec.model.pattern.Precedence;
import prospec.model.pattern.Response;
import prospec.model.pattern.StrictPrecedence;
import prospec.model.pattern.Universality;
import prospec.model.property.Property;
import prospec.model.scope.AfterL;
import prospec.model.scope.AfterLuntilR;
import prospec.model.scope.BeforeR;
import prospec.model.scope.BetweenLandR;
import prospec.model.scope.Global;

public class SimpleLTL_Generator extends Generator{

	private String generateUniversalityAfterLuntilR(Property P) {	InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityAfterLuntilR(prospec.model.property.Property).xml","START","17");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityAfterLuntilR(prospec.model.property.Property).xml","17","19");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityAfterLuntilR(prospec.model.property.Property).xml","19","EXIT");return "[]((" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")->(¬((" + ((Universality)P.getPattern()).getP().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U ((¬" + ((Universality)P.getPattern()).getP().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + "))))";
	}
	
	private String generateUniversalityAfterL(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityAfterL(prospec.model.property.Property).xml","START","22");
		     
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityAfterL(prospec.model.property.Property).xml","22","24");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityAfterL(prospec.model.property.Property).xml","24","EXIT");return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND <>¬" + ((Universality)P.getPattern()).getP().getName() + "))";
	}
	
	private String generateAbsenceAfterL(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceAfterL(prospec.model.property.Property).xml","START","27");
		   
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceAfterL(prospec.model.property.Property).xml","27","29");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceAfterL(prospec.model.property.Property).xml","29","EXIT");return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND <>" + ((Absence)P.getPattern()).getP().getName() + "))";
	}
	
	private String generateAbsenceAfterLuntilR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceAfterLuntilR(prospec.model.property.Property).xml","START","32");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceAfterLuntilR(prospec.model.property.Property).xml","32","34");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceAfterLuntilR(prospec.model.property.Property).xml","34","EXIT");return "[](" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + ")->¬(¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U " + ((Absence)P.getPattern()).getP().getName() + "))";
	}
	
	private String generateExistenceAfterL(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceAfterL(prospec.model.property.Property).xml","START","37");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceAfterL(prospec.model.property.Property).xml","37","39");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceAfterL(prospec.model.property.Property).xml","39","EXIT");return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND ¬<>" + ((Existence)P.getPattern()).getP().getName() + "))";
	}
	
	private String generatePrecedenceAfterL(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceAfterL(prospec.model.property.Property).xml","START","42");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceAfterL(prospec.model.property.Property).xml","42","44");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceAfterL(prospec.model.property.Property).xml","44","EXIT");return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" +  ((AfterL)P.getScope()).getL().getName() + " AND ((¬" + ((Precedence)P.getPattern()).getQ().getName() + ") U (" + ((Precedence)P.getPattern()).getP().getName() + " AND ¬" + ((Precedence)P.getPattern()).getQ().getName() + "))))";
	}
	
	private String generatePrecedenceAfterLuntilR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceAfterLuntilR(prospec.model.property.Property).xml","START","47");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceAfterLuntilR(prospec.model.property.Property).xml","47","49");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceAfterLuntilR(prospec.model.property.Property).xml","49","EXIT");return "[]((" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")->(¬(((¬" + ((Precedence)P.getPattern()).getQ().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U (" + ((Precedence)P.getPattern()).getP().getName() + " AND (¬" + ((Precedence)P.getPattern()).getQ().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateResponseAfterL(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseAfterL(prospec.model.property.Property).xml","START","52");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseAfterL(prospec.model.property.Property).xml","52","54");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseAfterL(prospec.model.property.Property).xml","54","EXIT");return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND (¬[](" + ((Response)P.getPattern()).getP().getName() + "-><>" + ((Response)P.getPattern()).getQ().getName() + "))))";
	}
	
	private String generateResponseAfterLuntilR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseAfterLuntilR(prospec.model.property.Property).xml","START","57");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseAfterLuntilR(prospec.model.property.Property).xml","57","59");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseAfterLuntilR(prospec.model.property.Property).xml","59","EXIT");return "[]((" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")->¬((¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U (" + ((Response)P.getPattern()).getP().getName() + " AND (¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") AND (([]((¬" + ((Response)P.getPattern()).getQ().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")) OR ((¬" + ((Response)P.getPattern()).getQ().getName() + ") U " + ((AfterLuntilR)P.getScope()).getR().getName() + "))))))";
	}
	
	private String generateStrictPrecedenceAfterL(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceAfterL(prospec.model.property.Property).xml","START","62");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceAfterL(prospec.model.property.Property).xml","62","64");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceAfterL(prospec.model.property.Property).xml","64","EXIT");return "¬((¬" + ((AfterL)P.getScope()).getL().getName() + ") U (" + ((AfterL)P.getScope()).getL().getName() + " AND ((¬(" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬" + ((StrictPrecedence)P.getPattern()).getP().getName() + ")) U " + ((StrictPrecedence)P.getPattern()).getP().getName() + ")))";
	}
	
	private String generateStrictPrecedenceAfterLuntilR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceAfterLuntilR(prospec.model.property.Property).xml","START","67");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceAfterLuntilR(prospec.model.property.Property).xml","67","69");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceAfterLuntilR(prospec.model.property.Property).xml","69","EXIT");return "¬<>(" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND (¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") AND (((¬" + ((StrictPrecedence)P.getPattern()).getQ().getName() + ") AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U (" +((StrictPrecedence)P.getPattern()).getP().getName() + " AND ¬" + ((AfterLuntilR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateExistenceBeforeR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceBeforeR(prospec.model.property.Property).xml","START","72");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceBeforeR(prospec.model.property.Property).xml","72","74");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceBeforeR(prospec.model.property.Property).xml","74","EXIT");return "¬((¬" + ((Existence)P.getPattern()).getP().getName() + ") U " + ((BeforeR)P.getScope()).getR().getName() + ")";
	}
	
	private String generateExistenceBetweenLandR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceBetweenLandR(prospec.model.property.Property).xml","START","77");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceBetweenLandR(prospec.model.property.Property).xml","77","79");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceBetweenLandR(prospec.model.property.Property).xml","79","EXIT");return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬" + ((BetweenLandR)P.getScope()).getR().getName() + ")->(¬((¬" +	((Existence)P.getPattern()).getP().getName() + ") U " + ((BetweenLandR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateResponseBeforeR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseBeforeR(prospec.model.property.Property).xml","START","82");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseBeforeR(prospec.model.property.Property).xml","82","84");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseBeforeR(prospec.model.property.Property).xml","84","EXIT");return "¬((¬" + ((BeforeR)P.getScope()).getR().getName() + ") U (" + ((Response)P.getPattern()).getP().getName() + " AND (¬" + ((BeforeR)P.getScope()).getR().getName() + ") AND ((¬" + ((Response)P.getPattern()).getQ().getName() + ") U " + ((BeforeR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateResponseBetweenLandR(Property P) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseBetweenLandR(prospec.model.property.Property).xml","START","87");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseBetweenLandR(prospec.model.property.Property).xml","87","89");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseBetweenLandR(prospec.model.property.Property).xml","89","EXIT");return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬" + ((BetweenLandR)P.getScope()).getR().getName() + ")->¬((¬" + ((BetweenLandR)P.getScope()).getR().getName() + ") U (" + ((Response)P.getPattern()).getP().getName() + " AND (¬" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND ((¬" + ((Response)P.getPattern()).getQ().getName() + ") U " +	((BetweenLandR)P.getScope()).getR().getName() + "))))";
	}
	
	private String generateStrictPrecedenceBetweenLandR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceBetweenLandR(prospec.model.property.Property).xml","START","92");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceBetweenLandR(prospec.model.property.Property).xml","92","94");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceBetweenLandR(prospec.model.property.Property).xml","94","EXIT");return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬" + ((BetweenLandR)P.getScope()).getR().getName() + ")->(¬(((¬(" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬" + ((StrictPrecedence)P.getPattern()).getP().getName() + ")) AND ¬" + ((BetweenLandR)P.getScope()).getR().getName() + ") U (" + ((StrictPrecedence)P.getPattern()).getP().getName() + " AND (¬(" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬" + ((StrictPrecedence)P.getPattern()).getP().getName() + ")) AND (¬" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND <>" + ((BetweenLandR)P.getScope()).getR().getName() + "))))";
	}
	
	private String generatePrecedenceGlobal(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceGlobal(prospec.model.property.Property).xml","START","97");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceGlobal(prospec.model.property.Property).xml","97","99");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceGlobal(prospec.model.property.Property).xml","99","EXIT");return "¬((¬" + ((Precedence)P.getPattern()).getQ().getName() + ") U (" + ((Precedence)P.getPattern()).getP().getName() + " AND ¬" + ((Precedence)P.getPattern()).getQ().getName() + "))";
	}
	
	private String generateStrictPrecedenceGlobal(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceGlobal(prospec.model.property.Property).xml","START","102");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceGlobal(prospec.model.property.Property).xml","102","104");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceGlobal(prospec.model.property.Property).xml","104","EXIT");return "¬((¬" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬" + ((StrictPrecedence)P.getPattern()).getP().getName() + ") U " + ((StrictPrecedence)P.getPattern()).getP().getName() + ")";
	}
	
	private String generateAbsenceGlobal(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceGlobal(prospec.model.property.Property).xml","START","107");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceGlobal(prospec.model.property.Property).xml","107","109");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceGlobal(prospec.model.property.Property).xml","109","EXIT");return "¬(<>" + ((Absence)P.getPattern()).getP().getName() + ")";
	}
	
	private String generateAbsenceBeforeR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceBeforeR(prospec.model.property.Property).xml","START","112");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceBeforeR(prospec.model.property.Property).xml","112","114");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceBeforeR(prospec.model.property.Property).xml","114","EXIT");return "<>" + ((BeforeR)P.getScope()).getR().getName() + "->¬(¬(" + ((BeforeR)P.getScope()).getR().getName() + ") U " + ((Absence)P.getPattern()).getP().getName() + ")";
	}
	
	private String generateAbsenceBetweenLandR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceBetweenLandR(prospec.model.property.Property).xml","START","117");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceBetweenLandR(prospec.model.property.Property).xml","117","119");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceBetweenLandR(prospec.model.property.Property).xml","119","EXIT");return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬(" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND <>" + ((BetweenLandR)P.getScope()).getR().getName() + ")->¬(¬(" + ((BetweenLandR)P.getScope()).getR().getName() + ") U " + ((Absence)P.getPattern()).getP().getName() +"))";
	}
	
	private String generateExistenceGlobal(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceGlobal(prospec.model.property.Property).xml","START","122");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceGlobal(prospec.model.property.Property).xml","122","124");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceGlobal(prospec.model.property.Property).xml","124","EXIT");return "(<>" + ((Existence)P.getPattern()).getP().getName() + ")";
	}
	
	private String generateExistenceAfterLuntilR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceAfterLuntilR(prospec.model.property.Property).xml","START","127");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceAfterLuntilR(prospec.model.property.Property).xml","127","129");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceAfterLuntilR(prospec.model.property.Property).xml","129","EXIT");return "[]((" + ((AfterLuntilR)P.getScope()).getL().getName() + " AND ¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + "))->(¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + ") U (" + ((Existence)P.getPattern()).getP().getName() + " AND ¬(" + ((AfterLuntilR)P.getScope()).getR().getName() + "))))";
	}
	
	private String generateUniversalityGlobal(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityGlobal(prospec.model.property.Property).xml","START","132");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityGlobal(prospec.model.property.Property).xml","132","134");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityGlobal(prospec.model.property.Property).xml","134","EXIT");return "[]" + ((Universality)P.getPattern()).getP().getName();
	}
	
	private String generateUniversalityBeforeR(Property P) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityBeforeR(prospec.model.property.Property).xml","START","137");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityBeforeR(prospec.model.property.Property).xml","137","139");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityBeforeR(prospec.model.property.Property).xml","139","EXIT");return "<>" + ((BeforeR)P.getScope()).getR().getName() + "->(" + ((Universality)P.getPattern()).getP().getName() + " U " + ((BeforeR)P.getScope()).getR().getName() + ")";
	}
	
	private String generateUniversalityBetweenLandR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityBetweenLandR(prospec.model.property.Property).xml","START","142");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityBetweenLandR(prospec.model.property.Property).xml","142","144");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityBetweenLandR(prospec.model.property.Property).xml","144","EXIT");return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬(" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND <>" + ((BetweenLandR)P.getScope()).getR().getName() + ")->(" + ((Universality)P.getPattern()).getP().getName() + " U " + ((BetweenLandR)P.getScope()).getR().getName() +"))";
	}
	
	private String generatePrecedenceBeforeR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceBeforeR(prospec.model.property.Property).xml","START","147");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceBeforeR(prospec.model.property.Property).xml","147","149");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceBeforeR(prospec.model.property.Property).xml","149","EXIT");return "<>" + ((BeforeR)P.getScope()).getR().getName() + "->(¬(" + ((Precedence)P.getPattern()).getP().getName() + ") U (" + ((Precedence)P.getPattern()).getQ().getName() + " OR " + ((BeforeR)P.getScope()).getR().getName() + "))";
	}
	
	private String generatePrecedenceBetweenLandR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceBetweenLandR(prospec.model.property.Property).xml","START","152");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceBetweenLandR(prospec.model.property.Property).xml","152","154");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceBetweenLandR(prospec.model.property.Property).xml","154","EXIT");return "[]((" + ((BetweenLandR)P.getScope()).getL().getName() + " AND ¬(" + ((BetweenLandR)P.getScope()).getR().getName() + ") AND <>" + ((BetweenLandR)P.getScope()).getR().getName() + ")->(¬(" + ((Precedence)P.getPattern()).getP().getName() + ") U ((" + ((Precedence)P.getPattern()).getQ().getName() +" OR " + ((BetweenLandR)P.getScope()).getR().getName() + ")))";
	}
	
	private String generateStrictPrecedenceBeforeR(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceBeforeR(prospec.model.property.Property).xml","START","157");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceBeforeR(prospec.model.property.Property).xml","157","159");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceBeforeR(prospec.model.property.Property).xml","159","EXIT");return "<>" + ((BeforeR)P.getScope()).getR().getName() + "->(¬(" + ((StrictPrecedence)P.getPattern()).getP().getName() + ") U ((" + ((StrictPrecedence)P.getPattern()).getQ().getName() + " AND ¬(" + ((StrictPrecedence)P.getPattern()).getP().getName() + ")) OR " + ((BeforeR)P.getScope()).getR().getName() + "))";
	}
	
	private String generateResponseGlobal(Property P) {InstrumentingCode.saveOrigin(); InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseGlobal(prospec.model.property.Property).xml","START","162");
	       
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseGlobal(prospec.model.property.Property).xml","162","164");		InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseGlobal(prospec.model.property.Property).xml","164","EXIT");return "[](" + ((Response)P.getPattern()).getP().getName() + " -> <>" + ((Response)P.getPattern()).getQ().getName() + ")";
	}	
	
	public String getStringRepresentation(Property P)
	{InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","START","168");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","168","169");		if (P.getPattern() instanceof Universality)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","169","171");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","171","EXIT");return generateUniversalityScope(P);
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","169","175");			if (P.getPattern() instanceof StrictPrecedence)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","175","177");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","177","EXIT");return generateStrictPrecedenceScope(P);
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","175","181");				if (P.getPattern() instanceof Response)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","181","183");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","183","EXIT");return generateResponseScope(P);
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","181","187");					if (P.getPattern() instanceof Precedence)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","187","189");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","189","EXIT");return generatePrecedenceScope(P);
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","187","193");						if (P.getPattern() instanceof Existence)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","193","195");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","195","EXIT");return generateExistenceScope(P);
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","193","199");							if (P.getPattern() instanceof Absence)
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","199","201");								InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","201","EXIT");return generateAbsenceScope(P);
							}
							else
							{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","199","205");								InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","getStringRepresentation(prospec.model.property.Property).xml","205","EXIT");return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
							}
						}
					}
				}
			}
		}
	}

	private String generateUniversalityScope(Property P) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","START","214");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","214","215");		if (P.getScope() instanceof Global)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","215","217");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","217","EXIT");return generateUniversalityGlobal(P);
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","215","221");			if (P.getScope() instanceof BetweenLandR)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","221","223");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","223","EXIT");return generateUniversalityBetweenLandR(P);
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","221","227");				if (P.getScope() instanceof BeforeR)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","227","229");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","229","EXIT");return generateUniversalityBeforeR(P);
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","227","233");					if (P.getScope() instanceof AfterLuntilR)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","233","235");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","235","EXIT");return generateUniversalityAfterLuntilR(P);
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","233","239");						if (P.getScope() instanceof AfterL)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","239","241");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","241","EXIT");return generateUniversalityAfterL(P);
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","239","245");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateUniversalityScope(prospec.model.property.Property).xml","245","EXIT");return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generateStrictPrecedenceScope(Property P) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","START","253");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","253","254");		if (P.getScope() instanceof Global)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","254","256");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","256","EXIT");return generateStrictPrecedenceGlobal(P);
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","254","260");			if (P.getScope() instanceof BetweenLandR)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","260","262");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","262","EXIT");return generateStrictPrecedenceBetweenLandR(P);
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","260","266");				if (P.getScope() instanceof BeforeR)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","266","268");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","268","EXIT");return generateStrictPrecedenceBeforeR(P);
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","266","272");					if (P.getScope() instanceof AfterLuntilR)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","272","274");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","274","EXIT");return generateStrictPrecedenceAfterLuntilR(P);
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","272","278");						if (P.getScope() instanceof AfterL)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","278","280");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","280","EXIT");return generateStrictPrecedenceAfterL(P);
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","278","284");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateStrictPrecedenceScope(prospec.model.property.Property).xml","284","EXIT");return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generateResponseScope(Property P) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","START","292");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","292","293");		if (P.getScope() instanceof Global)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","293","295");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","295","EXIT");return generateResponseGlobal(P);
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","293","299");			if (P.getScope() instanceof BetweenLandR)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","299","301");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","301","EXIT");return generateResponseBetweenLandR(P);
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","299","305");				if (P.getScope() instanceof BeforeR)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","305","307");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","307","EXIT");return generateResponseBeforeR(P);
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","305","311");					if (P.getScope() instanceof AfterLuntilR)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","311","313");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","313","EXIT");return generateResponseAfterLuntilR(P);
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","311","317");						if (P.getScope() instanceof AfterL)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","317","319");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","319","EXIT");return generateResponseAfterL(P);
						}
						else
						{	
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","317","323");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateResponseScope(prospec.model.property.Property).xml","323","EXIT");return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generatePrecedenceScope(Property P) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","START","331");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","331","332");		if (P.getScope() instanceof Global)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","332","334");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","334","EXIT");return generatePrecedenceGlobal(P);
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","332","338");			if (P.getScope() instanceof BetweenLandR)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","338","340");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","340","EXIT");return generatePrecedenceBetweenLandR(P);
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","338","344");				if (P.getScope() instanceof BeforeR)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","344","346");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","346","EXIT");return generatePrecedenceBeforeR(P);
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","344","350");					if (P.getScope() instanceof AfterLuntilR)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","350","352");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","352","EXIT");return generatePrecedenceAfterLuntilR(P);
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","350","356");						if (P.getScope() instanceof AfterL)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","356","358");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","358","EXIT");return generatePrecedenceAfterL(P);
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","356","362");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generatePrecedenceScope(prospec.model.property.Property).xml","362","EXIT");return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generateExistenceScope(Property P) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","START","370");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","370","371");		if (P.getScope() instanceof Global)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","371","373");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","373","EXIT");return generateExistenceGlobal(P);
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","371","377");			if (P.getScope() instanceof BetweenLandR)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","377","379");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","379","EXIT");return generateExistenceBetweenLandR(P);
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","377","383");				if (P.getScope() instanceof BeforeR)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","383","385");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","385","EXIT");return generateExistenceBeforeR(P);
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","383","389");					if (P.getScope() instanceof AfterLuntilR)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","389","391");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","391","EXIT");return generateExistenceAfterLuntilR(P);
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","389","395");						if (P.getScope() instanceof AfterL)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","395","397");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","397","EXIT");return generateExistenceAfterL(P);
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","395","401");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateExistenceScope(prospec.model.property.Property).xml","401","EXIT");return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}

	private String generateAbsenceScope(Property P) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","START","409");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","409","410");		if (P.getScope() instanceof Global)
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","410","412");			InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","412","EXIT");return generateAbsenceGlobal(P);
		}
		else
		{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","410","416");			if (P.getScope() instanceof BetweenLandR)
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","416","418");				InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","418","EXIT");return generateAbsenceBetweenLandR(P);
			}
			else
			{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","416","422");				if (P.getScope() instanceof BeforeR)
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","422","424");					InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","424","EXIT");return generateAbsenceBeforeR(P);
				}
				else
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","422","428");					if (P.getScope() instanceof AfterLuntilR)
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","428","430");						InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","430","EXIT");return generateAbsenceAfterLuntilR(P);
					}
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","428","434");						if (P.getScope() instanceof AfterL)
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","434","436");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","436","EXIT");return generateAbsenceAfterL(P);
						}
						else
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","434","440");							InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML\\prospec\\generator\\SimpleLTL_Generator\\","generateAbsenceScope(prospec.model.property.Property).xml","440","EXIT");return "Error, invalid pattern or scope combination defined, did you extend scope and patterns?";
						}
					}
				}
			}
		}
	}
}

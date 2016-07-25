package edu.tx.utep.ltlgenerator.inputoutput; import instrumentor.InstrumentingCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.tx.utep.ltlgenerator.LTLCharacters;
import edu.tx.utep.ltlgenerator.LTLPatternType;
import edu.tx.utep.ltlgenerator.LTLScopeType;
import edu.tx.utep.ltlgenerator.exceptions.LTLScopeTypeNotFoundException;
import edu.tx.utep.ltlgenerator.factories.LTLGeneratorFactory;

public class LTLInputOutput {

	protected static final int inputLinesToRead = 7;

	protected static final String PATTERN = LTLCharacters.PATTERN;
	protected static final String SCOPE = LTLCharacters.SCOPE;
	protected static final String SEPARATOR = LTLCharacters.SEPARATOR;
	protected static final String ATLEASTONEC = LTLCharacters.ATLEASTONEC;
	protected static final String ATLEASTONEH = LTLCharacters.ATLEASTONEH;
	protected static final String ATLEASTONEE = LTLCharacters.ATLEASTONEE;
	protected static final String PARALLELC = LTLCharacters.PARALLELC;
	protected static final String PARALLELH = LTLCharacters.PARALLELH;
	protected static final String PARALLELE = LTLCharacters.PARALLELE;
	protected static final String CONSECUTIVEC = LTLCharacters.CONSECUTIVEC;
	protected static final String CONSECUTIVEH = LTLCharacters.CONSECUTIVEH;
	protected static final String CONSECUTIVEE = LTLCharacters.CONSECUTIVEE;
	protected static final String EVENTUALC = LTLCharacters.EVENTUALC;
	protected static final String EVENTUALH = LTLCharacters.EVENTUALH;
	protected static final String EVENTUALE = LTLCharacters.EVENTUALE;
	protected static final String CP_SEPARATOR = LTLCharacters.CP_SEPARATOR;
	protected static final String EMPTY_CP_INDICATOR = LTLCharacters.EMPTY_CP_INDICATOR;

	protected static String getNumberOfCPs(String lineInput) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getNumberOfCPs(java.lang.String).xml","START","36");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getNumberOfCPs(java.lang.String).xml","36","37");		int firstIndexOfNumberOfCPs = lineInput.lastIndexOf(CP_SEPARATOR) + 1;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getNumberOfCPs(java.lang.String).xml","37","38");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getNumberOfCPs(java.lang.String).xml","38","EXIT");		return lineInput.substring(firstIndexOfNumberOfCPs);
	}

	protected static String getFormattedCompositeProposition(String cpLetter, String cpType, String numberOfCPs) {InstrumentingCode.saveOrigin();InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getFormattedCompositeProposition(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","START","41");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getFormattedCompositeProposition(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","41","42");		if (!cpType.equals(EMPTY_CP_INDICATOR)) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getFormattedCompositeProposition(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","42","43");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getFormattedCompositeProposition(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","43","EXIT");			return cpLetter + CP_SEPARATOR + cpType + CP_SEPARATOR + numberOfCPs;
		} else {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getFormattedCompositeProposition(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","42","45");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","getFormattedCompositeProposition(java.lang.String,Ljava.lang.String,Ljava.lang.String).xml","45","EXIT");			return "";
		}
	}

	public static void processInput(String inputFile, String outputFile) {InstrumentingCode.saveOrigin();// String inputFile, String outputFile){InstrumentingCode.saveOrigin();
		String lineReadFromInputFile = null;InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","START","50");
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","50","51");		String inputType = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","51","52");		String ltlFormula = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","52","53");		LTLScopeType scope = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","53","54");		LTLPatternType pattern = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","54","55");		String L = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","55","56");		String P = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","56","57");		String Q = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","57","58");		String R = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","58","59");		boolean isOkToCallLTLGenerator = false;

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","59","61");		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","61","62");			int readingLineNumber = 1;

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","62","64");			OutputToFile.outputInitialMessage(outputFile);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","64","66");			lineReadFromInputFile = bufferedReader.readLine();

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","149","68");			while (lineReadFromInputFile != null) {

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","68","70");				inputType = ProcessInput.getInputType(lineReadFromInputFile);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","70","72");				if (readingLineNumber < inputLinesToRead) 
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","72","74");					if (inputType.equals(SCOPE)) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","74","75");						scope = ProcessInput.getScope(lineReadFromInputFile);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","75","76");					} 
					else
					{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","74","79");						if (inputType.equals(PATTERN)) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","79","80");							pattern = ProcessInput.getPattern(lineReadFromInputFile);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","80","81");						} 
						else 
						{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","79","84");							if (!inputType.isEmpty()) {
								// input type must be a CP in this case
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","84","86");								String numberOfCPs = getNumberOfCPs(lineReadFromInputFile);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","86","87");								if (lineReadFromInputFile.substring(0, 1).toUpperCase().equals("L")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","87","88");									L = getFormattedCompositeProposition("L", inputType, numberOfCPs);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","88","89");								} 
								else 
								{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","87","92");									if (lineReadFromInputFile.substring(0, 1).toUpperCase().equals("P")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","92","93");										P = getFormattedCompositeProposition("P", inputType, numberOfCPs);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","93","94");									} 
									else
									{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","92","97");										if (lineReadFromInputFile.substring(0, 1).toUpperCase().equals("Q")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","97","98");											Q = getFormattedCompositeProposition("Q", inputType, numberOfCPs);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","98","99");										} 
										else
										{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","97","102");											if (lineReadFromInputFile.substring(0, 1).toUpperCase().equals("R")) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","102","103");												R = getFormattedCompositeProposition("R", inputType, numberOfCPs);
											}
										}
									}
								}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","103","108");							} 
							else 
							{
								// Something went wrong for this Input Set, go to the next one
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","114","112");								for (int i = readingLineNumber; i < inputLinesToRead; i++) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","112","113");									lineReadFromInputFile = bufferedReader.readLine();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","113","114");									readingLineNumber++;
								}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","112","116");								readingLineNumber = 0;

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","116","118");								OutputToFile.outputInputErrorMessage(outputFile);
							}
						}
					} 
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","118","122");				}
				else 
				{
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","72","125");					isOkToCallLTLGenerator = ((scope != null) && (pattern != null) && (L != null) && (P != null) && (Q != null) && (R != null));
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","125","126");					if (isOkToCallLTLGenerator) {

						try {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","126","129");							LTLGeneratorFactory ltlGeneratorFactory = LTLGeneratorFactory.getLTLGeneratorFactory(scope);
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","129","130");							ltlFormula = ltlGeneratorFactory.getLTLFormula(pattern, P, Q, R, L);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","130","132");							OutputToFile.outputLTLFormulaResultSet(outputFile, scope.toString(), pattern.toString(), P, Q, R, L, ltlFormula);

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","132","134");							readingLineNumber = 0;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","134","135");							scope = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","135","136");							pattern = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","136","137");							ltlFormula = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","137","138");							L = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","138","139");							P = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","139","140");							Q = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","140","141");							R = null;
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","141","142");						} catch (LTLScopeTypeNotFoundException e) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","142","143");							e.printStackTrace();
						}
					}
				}

InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","143","148");				lineReadFromInputFile = bufferedReader.readLine();
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","148","149");				readingLineNumber++;
			}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","68","151");		} catch (FileNotFoundException e) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","151","152");			e.printStackTrace();
		} catch (IOException e) {
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","153","154");			e.printStackTrace();
		}
InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","154","156");InstrumentingCode.mark("C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML\\edu\\tx\\utep\\ltlgenerator\\inputoutput\\LTLInputOutput\\","processInput(java.lang.String,Ljava.lang.String).xml","156","EXIT");	}
}

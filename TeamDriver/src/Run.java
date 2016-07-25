import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Run {

	private static int numberOfProps = 3;
	public static void main(String[] args) {
		try {
			CGF2BF.main(args);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<String> input = readTestPlan();
		
		args = new String[2];
		args[0] = "T2-IO/input.txt";
		args[1] = "T2-IO/output.txt";
		for (String testCase : input )
		{	
			if (testCase.replace(",", "").equals(""))
				continue;
			String inputFile ="";
			//Tests \ Parameters,Pattern,Scope,P,Q,L,R
			//1,AbsenceP,AfterL,5,0,7,0
			
			//Scope:Global
			//Pattern:Precedence
			//P_ConsecutiveE_2
			//Q_ConsecutiveE_2
			//R_Empty
			//L_Empty
			
			String[] params = testCase.split(",");

			String tcID = params[0];
			String tcPattern = mapPatternTeam2(params[1]);
			String tcScope = mapScopeTeam2(params[2]);
			String tcP = "P_"+mapCPTeam2(params[3])+"_"+numberOfProps;
			String tcQ = "Q_"+mapCPTeam2(params[4])+"_"+numberOfProps;
			String tcR = "L_"+mapCPTeam2(params[5])+"_"+numberOfProps;
			String tcL = "R_"+mapCPTeam2(params[6])+"_"+numberOfProps;
			
			if (params[0].startsWith("Tests"))
				continue;
			
			if(tcScope != null && !tcScope.isEmpty())
				inputFile +=tcScope +System.getProperty("line.separator");
			if(tcPattern != null && !tcPattern.isEmpty())
				inputFile +=tcPattern +System.getProperty("line.separator");
			if(tcP != null && !tcP.isEmpty())
				inputFile +=tcP +System.getProperty("line.separator");
			if(tcQ != null && !tcQ.isEmpty())
				inputFile +=tcQ + System.getProperty("line.separator");
			if(tcR != null && !tcR.isEmpty())
				inputFile +=tcR + System.getProperty("line.separator");
			if(tcL != null && !tcL.isEmpty())
				inputFile +=tcL + System.getProperty("line.separator");
			inputFile+="---------------------------------------------------------------";
			try 
			{
				File file = new File(args[0]);
				FileWriter fileWriter = new FileWriter(file);
				fileWriter.write(inputFile);
				fileWriter.flush();
				fileWriter.close();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println("Test ID:"+tcID);
			System.out.println(inputFile);
			edu.tx.utep.ltlgenerator.RunInputOutput.setFiles(tcID, "C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\T2-XML");
			edu.tx.utep.ltlgenerator.RunInputOutput.main(args);
			edu.tx.utep.ltlgenerator.RunInputOutput.saveFiles();
		}
		
	}

	private static String getPatternGlobal(String tcPattern, String tcP, String tcR) {
		boolean Pc = isC(tcP);
		boolean Rc = isC(tcR);
		boolean Pe = isE(tcP);
		boolean Re = isE(tcR);
		if (tcPattern.equals("3 4"))
		{
			tcPattern ="2";
		}
		else if (tcPattern.equals("1 2"))
		{
			tcPattern ="1";
		}
		else if (tcPattern.equals("13 14"))
		{
			tcPattern ="3";
		}
		else if (tcPattern.equals("5 6 7 8"))
		{	
			boolean PcStar= tcP.equals("1") || tcP.equals("4");
			boolean PcPlus= !PcStar;
			boolean PeStar= tcP.equals("1") || tcP.equals("4");
			boolean PePlus= !PcPlus;
			
			if (PcStar)
			{
				tcPattern ="6";
			}
			else if (PcPlus)
			{
				tcPattern ="7";
			}
			else if (PeStar)
			{
				tcPattern ="8";
			}
			else if (PePlus)
			{
				tcPattern ="9";
			}
		}
		else if (tcPattern.equals("9 10 11 12"))
		{
			if (Pc)
			{
				tcPattern ="4";
			}
			else if (Pe)
			{
				tcPattern ="5";
			}
		}
		return tcPattern;
	}

	private static boolean isC(String tcP) {
		return tcP.equals("1") || tcP.equals("4") || tcP.equals("7") || tcP.equals("10");
	}

	private static boolean isE(String tcP) {
		return tcP.equals("3") || tcP.equals("6") || tcP.equals("9") || tcP.equals("12");
	}

	private static String getPatternNonGlobal(String tcPattern, String tcP, String tcR) {
		boolean Pc = isC(tcP);
		boolean Rc = isC(tcR);
		boolean Pe = isE(tcP);
		boolean Re = isE(tcR);
		
		if (tcPattern.equals("1 2"))
		{
			if (Rc)
				tcPattern ="1";
			else if (Re)
				tcPattern ="2";
		}
		else if (tcPattern.equals("3 4"))
		{
			if (Rc)
				tcPattern ="3";
			else if (Re)
				tcPattern ="4";
		}
		else if (tcPattern.equals("5 6 7 8"))
		{
			if (Pc && Rc)
				tcPattern ="5";
			else if (Pe && Rc)
				tcPattern ="6";
			else if (Pc && Re)
				tcPattern ="7";
			else if (Pe && Re)
				tcPattern ="8";
		}
		else if (tcPattern.equals("9 10 11 12"))
		{
			if (Pc && Rc)
				tcPattern ="9";
			else if (Pe && Rc)
				tcPattern ="10";
			else if (Pc && Re)
				tcPattern ="11";
			else if (Pe && Re)
				tcPattern ="12";
		}
		else if (tcPattern.equals("13 14"))
		{
			if (Rc)
				tcPattern ="13";
			else if (Re)
				tcPattern ="14";
		}
		return tcPattern;
	}

	private static void clearFile(String outputFile) {
		try 
		{
			File output = new File(outputFile);
			FileWriter fileWriter = new FileWriter(output);
			fileWriter.write("");
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	private static ArrayList<String> readTestPlan() {
		ArrayList<String> input = new ArrayList<String>();
		File file = new File("LTL Gen.csv");
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(file));
			String text = null;

			while ((text = reader.readLine()) != null) {
				input.add(text);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
			}
		}
		return input;
	}

	private static String mapCPTeam1(String number)
	{
		String CPName="";
		if (number.equalsIgnoreCase("0"))
		{
			CPName = "Atomic";
		}
		else if (number.equalsIgnoreCase("1"))
		{
			CPName = "AtLeastOneC";
		}
		else if (number.equalsIgnoreCase("2"))
		{
			CPName = "AtLeastOneE";
		}
		else if (number.equalsIgnoreCase("3"))
		{
			CPName = "ParallelC";
		}
		else if (number.equalsIgnoreCase("4"))
		{
			CPName = "ParallelE";
		}
		else if (number.equalsIgnoreCase("5"))
		{
			CPName = "ConsecutiveC";
		}
		else if (number.equalsIgnoreCase("6"))
		{
			CPName = "ConsecutiveE";
		}
		else if (number.equalsIgnoreCase("7"))
		{
			CPName = "EventualC";
		}
		else if (number.equalsIgnoreCase("8"))
		{
			CPName = "EventualE";
		}
		return CPName;
	}

	private static String mapPatternTeam1(String pattern)
	{
		String patternName="";
		if (pattern.equalsIgnoreCase("ExistenceP"))
		{
			patternName = "Existence";
		}
		else if (pattern.equalsIgnoreCase("AbsenceP"))
		{
			patternName = "Absence";
		}
		else if (pattern.equalsIgnoreCase("QRespondsP"))
		{
			patternName = "Response";
		}
		else if (pattern.equalsIgnoreCase("QPrecedesP"))
		{
			patternName = "Precedence";
		}
		else if (pattern.equalsIgnoreCase("QStrictlyPrecedesP"))
		{
			patternName = "StrictPrecedence";
		}
		return patternName;
	}

	private static String mapScopeTeam1(String scope)
	{
		String scopeName="";
		if (scope.equalsIgnoreCase("Global"))
		{
			scopeName = "Global";
		}
		else if (scope.equalsIgnoreCase("AfterL"))
		{
			scopeName = "AfterL";
		}
		else if (scope.equalsIgnoreCase("BeforeR"))
		{
			scopeName = "BeforeR";
		}
		else if (scope.equalsIgnoreCase("AfterLuntilR"))
		{
			scopeName = "AfterLuntilR";
		}
		else if (scope.equalsIgnoreCase("BetweenLandR"))
		{
			scopeName = "BetweenLandR";
		}
		return scopeName;
	}
	
	private static String mapCPTeam2(String number)
	{
		String CPName="";
		if (number.equalsIgnoreCase("0"))
		{
			CPName = "Empty";
		}
		else if (number.equalsIgnoreCase("1"))
		{
			CPName = "AtLeastOneC";
		}
		else if (number.equalsIgnoreCase("2"))
		{
			CPName = "AtLeastOneE";
		}
		else if (number.equalsIgnoreCase("3"))
		{
			CPName = "ParallelC";
		}
		else if (number.equalsIgnoreCase("4"))
		{
			CPName = "ParallelE";
		}
		else if (number.equalsIgnoreCase("5"))
		{
			CPName = "ConsecutiveC";
		}
		else if (number.equalsIgnoreCase("6"))
		{
			CPName = "ConsecutiveE";
		}
		else if (number.equalsIgnoreCase("7"))
		{
			CPName = "EventualC";
		}
		else if (number.equalsIgnoreCase("8"))
		{
			CPName = "EventualE";
		}
		return CPName;
	}

	private static String mapPatternTeam2(String pattern)
	{
		String patternName="";
		if (pattern.equalsIgnoreCase("ExistenceP"))
		{
			patternName = "Existence";
		}
		else if (pattern.equalsIgnoreCase("AbsenceP"))
		{
			patternName = "Absence";
		}
		else if (pattern.equalsIgnoreCase("QRespondsP"))
		{
			patternName = "Response";
		}
		else if (pattern.equalsIgnoreCase("QPrecedesP"))
		{
			patternName = "Precedence";
		}
		else if (pattern.equalsIgnoreCase("QStrictlyPrecedesP"))
		{
			patternName = "StrictPrecedence";
		}
		return "Pattern:"+patternName;
	}

	private static String mapScopeTeam2(String scope)
	{
		String scopeName="";
		if (scope.equalsIgnoreCase("Global"))
		{
			scopeName = "Global";
		}
		else if (scope.equalsIgnoreCase("AfterL"))
		{
			scopeName = "AfterL";
		}
		else if (scope.equalsIgnoreCase("BeforeR"))
		{
			scopeName = "BeforeR";
		}
		else if (scope.equalsIgnoreCase("AfterLuntilR"))
		{
			scopeName = "AfterLUntilR";
		}
		else if (scope.equalsIgnoreCase("BetweenLandR"))
		{
			scopeName = "BetweenLAndR";
		}
		return "Scope:"+scopeName;
	}
	
	private static String mapCPTeam3(String number)
	{
		
		String CPName="";
		if (number.equalsIgnoreCase("0"))
		{
			CPName = "1";
		}
		else if (number.equalsIgnoreCase("1"))
		{
			CPName = "1";
		}
		else if (number.equalsIgnoreCase("2"))
		{
			CPName = "3";
		}
		else if (number.equalsIgnoreCase("3"))
		{
			CPName = "4";
		}
		else if (number.equalsIgnoreCase("4"))
		{
			CPName = "6";
		}
		else if (number.equalsIgnoreCase("5"))
		{
			CPName = "7";
		}
		else if (number.equalsIgnoreCase("6"))
		{
			CPName = "9";
		}
		else if (number.equalsIgnoreCase("7"))
		{
			CPName = "10";
		}
		else if (number.equalsIgnoreCase("8"))
		{
			CPName = "12";
		}
		return CPName;
	}

	private static String mapPatternTeam3(String pattern)
	{
	
		String patternName="";
		if (pattern.equalsIgnoreCase("ExistenceP"))
		{
			patternName = "3 4";
		}
		else if (pattern.equalsIgnoreCase("AbsenceP"))
		{
			patternName = "1 2";
		}
		else if (pattern.equalsIgnoreCase("QRespondsP"))
		{
			patternName = "13 14";
		}
		else if (pattern.equalsIgnoreCase("QPrecedesP"))
		{
			patternName = "5 6 7 8";
		}
		else if (pattern.equalsIgnoreCase("QStrictlyPrecedesP"))
		{
			patternName = "9 10 11 12";
		}
		return patternName;
	}

	private static String mapScopeTeam3(String scope)
	{
		String scopeName="";
				
		
		if (scope.equalsIgnoreCase("Global"))
		{
			scopeName = "0";
		}
		else if (scope.equalsIgnoreCase("AfterL"))
		{
			scopeName = "1";
		}
		else if (scope.equalsIgnoreCase("BeforeR"))
		{
			scopeName = "00";
		}
		else if (scope.equalsIgnoreCase("AfterLuntilR"))
		{
			scopeName = "4 5";
		}
		else if (scope.equalsIgnoreCase("BetweenLandR"))
		{
			scopeName = "2 3";
		}
		return scopeName;
	}
	
	private static String mapCPTeam4(String number)
	{

		String CPName="";
		if (number.equalsIgnoreCase("0"))
		{
			CPName = "Atomic";
		}
		else if (number.equalsIgnoreCase("1"))
		{
			CPName = "AtLeastOne-c";
		}
		else if (number.equalsIgnoreCase("2"))
		{
			CPName = "AtLeastOne-e";
		}
		else if (number.equalsIgnoreCase("3"))
		{
			CPName = "Parallel-c";
		}
		else if (number.equalsIgnoreCase("4"))
		{
			CPName = "Parallel-e";
		}
		else if (number.equalsIgnoreCase("5"))
		{
			CPName = "Consecutive-c";
		}
		else if (number.equalsIgnoreCase("6"))
		{
			CPName = "Consecutive-e";
		}
		else if (number.equalsIgnoreCase("7"))
		{
			CPName = "Eventual-c";
		}
		else if (number.equalsIgnoreCase("8"))
		{
			CPName = "Eventual-e";
		}
		return CPName;
	}

	private static String mapPatternTeam4(String pattern)
	{
		String patternName="";
		if (pattern.equalsIgnoreCase("ExistenceP"))
		{
			patternName = "Existence";
		}
		else if (pattern.equalsIgnoreCase("AbsenceP"))
		{
			patternName = "Absence";
		}
		else if (pattern.equalsIgnoreCase("QRespondsP"))
		{
			patternName = "Response";
		}
		else if (pattern.equalsIgnoreCase("QPrecedesP"))
		{
			patternName = "Precedence";
		}
		else if (pattern.equalsIgnoreCase("QStrictlyPrecedesP"))
		{
			patternName = "Strict Precedence";
		}
		return patternName;
	}

	private static String mapScopeTeam4(String scope)
	{		
		String scopeName="";
		if (scope.equalsIgnoreCase("Global"))
		{
			scopeName = "Global";
		}
		else if (scope.equalsIgnoreCase("AfterL"))
		{
			scopeName = "After L";
		}
		else if (scope.equalsIgnoreCase("BeforeR"))
		{
			scopeName = "BeforeR";
		}
		else if (scope.equalsIgnoreCase("AfterLuntilR"))
		{
			scopeName = "After L Until R";
		}
		else if (scope.equalsIgnoreCase("BetweenLandR"))
		{
			scopeName = "Between L and R";
		}
		return scopeName;
	}

}

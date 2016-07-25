package prospec.generator.driver;

import prospec.generator.SimpleLTL_Generator;
import prospec.model.property.*;
import prospec.model.pattern.*;
import prospec.model.proposition.Proposition;
import prospec.model.scope.*;
import instrumentor.InstrumentingCode;

public class DriverLTL {
	public static void setFiles(String testID, String teamFolder) {	InstrumentingCode.testID = testID;	InstrumentingCode.teamFolder = teamFolder; 	}
	public static void saveFiles() {	InstrumentingCode.saveToFiles();}
	 
	public static void main(String args[])
	{
		//Proposition
		Proposition P;
		Proposition Q;
		Proposition L;
		Proposition R;
		
		//Scopes
		Scope Global;
		Scope AfterL;
		Scope AfterLuntilR;
		Scope BeforeR;
		Scope BetweenLandR;
				
		//Patterns
		Pattern Absence;
		Pattern Existence;
		Pattern Precedence;
		Pattern Response;
		Pattern StrictPrecedence;
		Pattern Universality;

		setFiles("1","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");		
		P = new Proposition("P","p");
		Global = new Global();
		Absence = new Absence(P);
		Property property1 = new Property(Global, Absence);
		SimpleLTL_Generator gen = new SimpleLTL_Generator();
		System.out.println("1:Global Absence LTL Formula:\t\t\t" + gen.getStringRepresentation(property1).toString());
		saveFiles();
		
		setFiles("2","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Global = new Global();
		Existence = new Existence(P);
		Property property2 = new Property(Global, Existence);
		System.out.println("2:Global Existence LTL Formula:\t\t\t" + gen.getStringRepresentation(property2).toString());
		saveFiles();
		
		setFiles("3","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		Global = new Global();
		Precedence = new Precedence(P, Q);
		Property property3 = new Property(Global, Precedence);
		System.out.println("3:Global Precedence LTL Formula:\t\t\t" + gen.getStringRepresentation(property3).toString());
		saveFiles();
		
		setFiles("4","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		Global = new Global();
		Response = new Response(P, Q);
		Property property4 = new Property(Global, Response);
		System.out.println("4:Global Response LTL Formula:\t\t\t" + gen.getStringRepresentation(property4).toString());
		saveFiles();
		
		setFiles("5","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		Global = new Global();
		StrictPrecedence = new StrictPrecedence(P, Q);
		Property property5 = new Property(Global, StrictPrecedence);
		System.out.println("5:*Global StrictPrecedence LTL Formula:\t\t" + gen.getStringRepresentation(property5).toString());
		saveFiles();
		
		setFiles("6","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Global = new Global();
		Universality = new Universality(P);
		Property property6 = new Property(Global, Universality);
		System.out.println("6:Global Universality LTL Formula:\t\t" + gen.getStringRepresentation(property6).toString());
		saveFiles();
		
		System.out.println();
		
		setFiles("7","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		R = new Proposition("R","r");
		BeforeR = new BeforeR(R);
		Property property7 = new Property(BeforeR, Absence);
		System.out.println("7:BeforeR Absence LTL Formula:\t\t\t" + gen.getStringRepresentation(property7).toString());
		saveFiles();
		
		setFiles("8","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		R = new Proposition("R","r");
		BeforeR = new BeforeR(R);
		Existence = new Existence(P);
		Property property8 = new Property(BeforeR, Existence);
		System.out.println("8:BeforeR Existence LTL Formula:\t\t\t" + gen.getStringRepresentation(property8).toString());
		saveFiles();
		
		setFiles("9","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		R = new Proposition("R","r");
		BeforeR = new BeforeR(R);
		Precedence = new Precedence(P, Q);
		Property property9 = new Property(BeforeR, Precedence);
		System.out.println("9:BeforeR Precedence LTL Formula:\t\t\t" + gen.getStringRepresentation(property9).toString());
		saveFiles();
		
		setFiles("10","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		R = new Proposition("R","r");
		BeforeR = new BeforeR(R);
		Response = new Response(P, Q);
		Property property10 = new Property(BeforeR, Response);
		System.out.println("10:BeforeR Response LTL Formula:\t\t\t" + gen.getStringRepresentation(property10).toString());
		saveFiles();
		
		setFiles("11","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		R = new Proposition("R","r");
		BeforeR = new BeforeR(R);
		StrictPrecedence = new StrictPrecedence(P, Q);
		Property property11 = new Property(BeforeR, StrictPrecedence);
		System.out.println("11:BeforeR StrictPrecedence LTL Formula:\t\t" + gen.getStringRepresentation(property11).toString());
		saveFiles();
		
		setFiles("12","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		R = new Proposition("R","r");
		BeforeR = new BeforeR(R);
		Universality = new Universality(P);
		Property property12 = new Property(BeforeR, Universality);
		System.out.println("12:BeforeR Universality LTL Formula:\t\t" + gen.getStringRepresentation(property12).toString());
		saveFiles();
		
		System.out.println();
		
		setFiles("13","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterL = new AfterL(L);
		Property property13 = new Property(AfterL, Absence);
		System.out.println("13:AfterL Absence LTL Formula:\t\t\t" + gen.getStringRepresentation(property13).toString());
		saveFiles();
		
		setFiles("14","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterL = new AfterL(L);
		Existence = new Existence(P);
		Property property14 = new Property(AfterL, Existence);
		System.out.println("14:AfterL Existence LTL Formula:\t\t\t" + gen.getStringRepresentation(property14).toString());
		saveFiles();
		
		setFiles("15","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterL = new AfterL(L);
		Precedence = new Precedence(P, Q);
		Property property15 = new Property(AfterL, Precedence);
		System.out.println("15:AfterL Precedence LTL Formula:\t\t\t" + gen.getStringRepresentation(property15).toString());
		saveFiles();
		
		setFiles("16","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterL = new AfterL(L);
		Response = new Response(P, Q);
		Property property16 = new Property(AfterL, Response);
		System.out.println("16:AfterL Response LTL Formula:\t\t\t" + gen.getStringRepresentation(property16).toString());
		saveFiles();
		
		setFiles("17","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterL = new AfterL(L);
		StrictPrecedence = new StrictPrecedence(P, Q);
		Property property17 = new Property(AfterL, StrictPrecedence);
		System.out.println("17:AfterL StrictPrecedence LTL Formula:\t\t" + gen.getStringRepresentation(property17).toString());
		saveFiles();
		
		setFiles("18","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterL = new AfterL(L);
		Universality = new Universality(P);
		Property property18 = new Property(AfterL, Universality);
		System.out.println("18:AfterL Universality LTL Formula:\t\t" + gen.getStringRepresentation(property18).toString());
		saveFiles();
		
		System.out.println();
		
		setFiles("19","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterLuntilR = new AfterLuntilR(L, R);
		Property property19 = new Property(AfterLuntilR, Absence);
		System.out.println("19:AfterLuntilR Absence LTL Formula:\t\t" + gen.getStringRepresentation(property19).toString());
		saveFiles();
		
		setFiles("20","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterLuntilR = new AfterLuntilR(L, R);
		Existence = new Existence(P);
		Property property20 = new Property(AfterLuntilR, Existence);
		System.out.println("20:AfterLuntilR Existence LTL Formula:\t\t" + gen.getStringRepresentation(property20).toString());
		saveFiles();
		
		setFiles("21","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterLuntilR = new AfterLuntilR(L, R);
		Precedence = new Precedence(P, Q);
		Property property21 = new Property(AfterLuntilR, Precedence);
		System.out.println("21:AfterLuntilR Precedence LTL Formula:\t\t" + gen.getStringRepresentation(property21).toString());
		saveFiles();
		
		setFiles("22","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterLuntilR = new AfterLuntilR(L, R);
		Response = new Response(P, Q);
		Property property22 = new Property(AfterLuntilR, Response);
		System.out.println("22:AfterLuntilR Response LTL Formula:\t\t" + gen.getStringRepresentation(property22).toString());
		saveFiles();
		
		setFiles("23","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		AfterLuntilR = new AfterLuntilR(L, R);
		StrictPrecedence = new StrictPrecedence(P, Q);
		Property property23 = new Property(AfterLuntilR, StrictPrecedence);
		System.out.println("23:AfterLuntilR StrictPrecedence LTL Formula:\t" + gen.getStringRepresentation(property23).toString());
		saveFiles();
		
		setFiles("24","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");		
		AfterLuntilR = new AfterLuntilR(L, R);	
		Universality = new Universality(P);
		Property property24 = new Property(AfterLuntilR, Universality);
		System.out.println("24:AfterLuntilR Universality LTL Formula:\t\t" + gen.getStringRepresentation(property24).toString());
		saveFiles();
		
		System.out.println();
		
		setFiles("25","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		BetweenLandR = new BetweenLandR(L, R);
		Property property25 = new Property(BetweenLandR, Absence);
		System.out.println("25:BetweenLandR Absence LTL Formula:\t\t" + gen.getStringRepresentation(property25).toString());
		saveFiles();
		
		setFiles("26","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		BetweenLandR = new BetweenLandR(L, R);
		Existence = new Existence(P);
		Property property26 = new Property(BetweenLandR, Existence);
		System.out.println("26:BetweenLandR Existence LTL Formula:\t\t" + gen.getStringRepresentation(property26).toString());
		saveFiles();
		
		setFiles("27","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		BetweenLandR = new BetweenLandR(L, R);
		Precedence = new Precedence(P, Q);
		Property property27 = new Property(BetweenLandR, Precedence);
		System.out.println("27:BetweenLandR Precedence LTL Formula:\t\t" + gen.getStringRepresentation(property27).toString());
		saveFiles();
		
		setFiles("28","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		BetweenLandR = new BetweenLandR(L, R);
		Response = new Response(P, Q);
		Property property28 = new Property(BetweenLandR, Response);
		System.out.println("28:BetweenLandR Response LTL Formula:\t\t" + gen.getStringRepresentation(property28).toString());
		saveFiles();
		
		setFiles("29","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		Q = new Proposition("Q","q");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		BetweenLandR = new BetweenLandR(L, R);
		StrictPrecedence = new StrictPrecedence(P, Q);
		Property property29 = new Property(BetweenLandR, StrictPrecedence);
		System.out.println("29:BetweenLandR StrictPrecedence LTL Formula:\t" + gen.getStringRepresentation(property29).toString());
		saveFiles();
		
		setFiles("30","C:\\Users\\ochoao\\Desktop\\Diss\\FinalWorkspace\\TeamDriver\\SimpleLTLGenerator-XML");
		P = new Proposition("P","p");
		L = new Proposition("L","l");
		R = new Proposition("R","r");
		BetweenLandR = new BetweenLandR(L, R);
		Universality = new Universality(P);
		Property property30 = new Property(BetweenLandR, Universality);
		System.out.println("30:BetweenLandR Universality LTL Formula:\t\t" + gen.getStringRepresentation(property30).toString());
		saveFiles();
		
	}

}

package innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.lang.Math.*;

public class Karakterskala 
{
	public static void main (String[]args)
	{
		//Oppgåve 7: 
		//int poeng = parseInt(showInputDialog("Skriv inn poengsum her: ")); 
		int poeng;
		int g1 = 0;
		int f1 = 39;
		int e1 = 49;
		int d1 = 59;
		int c1 = 79;
		int b1 = 89;
		int a1 = 100;
				
		String a = "A";
		String b = "B";
		String c = "C";
		String d = "D";
		String e = "E";
		String f = "F";
				
		String utskrift = ""; 
				
		for (int student=1; student <=10; student++)
		{
			poeng = parseInt(showInputDialog("Skriv inn poengsum her: "));
		
		
			while (poeng < g1 || poeng > a1)
			{
				String ugyldig = "Dette er ein ugyldig verdi. Skriv inn på nytt";
				showMessageDialog(null, ugyldig); 
				poeng = parseInt(showInputDialog("Skriv inn poengsum her: "));
			}
		
			if (poeng > g1 && poeng <= f1)
			{
				utskrift = f;
			}
			else if (poeng > f1 && poeng <=e1)
			{
				utskrift = e;
			}
			else if (poeng > e1 && poeng <=d1)
			{	
				utskrift = d;
			}
			else if (poeng > d1 && poeng <=c1)
			{
				utskrift = c;
			}
			else if (poeng > c1 && poeng <=b1)
			{
				utskrift = b;
			}
			else if (poeng > b1 && poeng <= a1)
			{
				utskrift = a;
			}
		
			if (poeng >= g1 && poeng <= a1)
			{
				String tlbMld = "Karakteren din blir " + utskrift + ". Gratulerer!";
				showMessageDialog(null, tlbMld);
			}
		}
	}
}

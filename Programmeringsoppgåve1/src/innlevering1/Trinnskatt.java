package innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.lang.Math.*;

public class Trinnskatt 
{
	public static void main(String[]args)
	{
		//Oppgåve 6: Obligatorisk innlevering
		int brInn = parseInt(showInputDialog("Skriv brutto inntekt her: ")); 
		
		int grense = 180800;
		int tr1 = 254500;
		int tr2 = 639750;
		int tr3 = 999550;
		
		double sk1 = 1.9;
		double sk2 = 4.2;
		double sk3 = 13.2;
		double sk4 = 16.2;
		
		double sk = 0.0;
		
		if (brInn < grense)
		{
			String tilbakemelding = "Du betaler ikkje Trinnskatt i år!";
			showMessageDialog(null, tilbakemelding); 
		}
		else if (brInn > grense && brInn <= tr1)
		{
			sk = sk1;
		}
		else if (brInn > tr1 && brInn <= tr2)
		{
			sk = sk2;
		}
		else if (brInn > tr2 && brInn <= tr3)
		{
			sk = sk3;
		}
		else if (brInn > tr3)
		{
			sk = sk4;
		}
		
		double skatt = (brInn/100)*sk;
		String tilbakemelding1  = "Trinnskatt i år er " + sk + "%. Det blir nøyaktig: " 
		+ skatt + " kroner i skatt.";
		showMessageDialog(null, tilbakemelding1);
	}
	
}

package innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import java.lang.Math.*;

public class Fakultet 
{
	public static void main(String[]args)
	{
		//Lag et program som leser inn et heltall n > 0, beregner verdien n! 
		//(n fakultet) og skriver verdien til n! der n! = 1\*2\*3\*…\*(n-1)\*n.
		int n = parseInt(showInputDialog("Skriv inn heltall her"));
		while (n<0)
		{
			n = parseInt(showInputDialog("Skriv heltall her"));
		}
		
		int x = 1;
		
		for (int i = 1; i <= n; i++)
		{
			x = x*i;
		}
		
		String sum = "Fakulteten av " + n + " er " + x;
		showMessageDialog(null, sum);
	}
}

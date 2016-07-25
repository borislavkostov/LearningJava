package GSM;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TestGSM 
{
	public static void main(String args[])throws IOException
	{
		GSM.showNokiaN95();
		GSM gsm[]=new GSM[3];
		Scanner input =new Scanner(new File("gsm.txt"));
		for (int i = 0; i < gsm.length; i++) 
		{
			gsm[i]=new GSM();
			gsm[i].readGSM(input);
		}
		for (int i = 0; i < gsm.length; i++) 
		{
			System.out.print("Phone Model: ");
			gsm[i].showGSM();
		}
	}
}

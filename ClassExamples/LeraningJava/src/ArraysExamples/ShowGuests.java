package ArraysExamples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowGuests 
{
	public static void main (String args[]) throws IOException
	{
		int guest[]=new int[9];
		Scanner diskScanner=new Scanner(new File("Guests.txt"));
		for (int i = 0; i < guest.length; i++) 
		{
			guest[i]=diskScanner.nextInt();
		}
		System.out.println("Room\tGuests");
		for (int i = 0; i < guest.length; i++) 
		{
			System.out.printf("%d\t%d\n",i,guest[i]);
		}
		
	}
}

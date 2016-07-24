package ArraysExamples;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
public class FindVacancy 
{
	public static void main(String args[])throws IOException
	{
		Scanner keyboard=new Scanner(System.in);
		Scanner diskScanner=new Scanner(new File("Guests.txt"));
		int guest[]=new int[9];
		int roomNum;
		for ( roomNum = 0; roomNum < guest.length; roomNum++) 
		{
			guest[roomNum]=diskScanner.nextInt();
		}
		roomNum=0;
		while(roomNum<9 && guest[roomNum]!=0)
		{
			roomNum++;
		}
		if (roomNum==9) 
		{
			System.out.println("Sorry,no vacancy");
		}
		else
		{
			System.out.printf("How many people for room %d\n",roomNum);
			guest[roomNum]=keyboard.nextInt();
			PrintStream listOut=new PrintStream("Guests.txt");
			for (int i = 0; i < guest.length; i++) 
			{
				listOut.print(guest[i]);
				listOut.print(" ");
			}
		}
	}
}

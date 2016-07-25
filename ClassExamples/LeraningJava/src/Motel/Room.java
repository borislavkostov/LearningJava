package Motel;

import java.text.NumberFormat;
import java.util.Scanner;

public class Room 
{
	private int guests;
	private double rate;
	private boolean smoking;
	private static NumberFormat currency=NumberFormat.getCurrencyInstance();
	public void readRoom(Scanner diskScanner)
	{
		guests=diskScanner.nextInt();
		rate=diskScanner.nextDouble();
		smoking=diskScanner.nextBoolean();
	}
	public void writeRoom()
	{
		System.out.print(guests+"\t"+currency.format(rate)+"\t"+(smoking ? "yes" : "no")+"\n");
	}
}

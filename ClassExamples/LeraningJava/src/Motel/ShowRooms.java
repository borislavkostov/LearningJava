package Motel;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowRooms 
{
	public static void main(String args[])throws IOException
	{
		Room room[];
		room=new Room[4];
		Scanner diskScanner=new Scanner(new File("RoomList.txt"));
		for (int i = 0; i < room.length; i++) 
		{
			room[i]=new Room();
			room[i].readRoom(diskScanner);
		}
		System.out.println("Room\tGuests\tRate\tSmoking?");
		for (int i = 0; i < room.length; i++) 
		{
			System.out.print(i);
			System.out.print("\t");
			room[i].writeRoom();
		}
	}
}

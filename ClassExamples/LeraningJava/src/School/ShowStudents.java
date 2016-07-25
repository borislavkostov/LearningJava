package School;

import java.util.Scanner;

public class ShowStudents 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		Student bobi=new Student(University.TU);
		bobi.writeStudent(input);
		bobi.showStudent();
		//Student ivan =new Student("Ivan",University.UNWE);
		//ivan.showStudent();
	}
}

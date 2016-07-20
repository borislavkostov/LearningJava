package Employee;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DoPayroll 
{
	public static void main(String arg[]) throws IOException
	{
		Scanner discScanner=new Scanner(new File("employee.txt"));
		for (int i = 0; i <3; i++) 
		{
			payOneEmployee(discScanner);
		}
	}
	static void payOneEmployee(Scanner aScanner)
	{
		Employee anEmployee=new Employee();
		anEmployee.setName(aScanner.nextLine());
		anEmployee.setJobTitle(aScanner.nextLine());
		anEmployee.cutCheck(aScanner.nextDouble());
		aScanner.nextLine();
	}
}

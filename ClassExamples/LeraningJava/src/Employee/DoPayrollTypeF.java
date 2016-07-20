package Employee;

public class DoPayrollTypeF 
{
	public static void main(String args[])
	{
		FullTimeEmployee bobi =new FullTimeEmployee();
		bobi.setName("Bobi");
		bobi.setJobTitle("CEO");
		bobi.setWeeklySalary(2000.50);
		bobi.setBenefitDeduction(200.00);
		bobi.cutCheck(bobi.findPaymentAmount());
		
		PartTimeEmployee tim = new PartTimeEmployee();
		tim.setName("Tim");
		tim.setJobTitle("DEV");
		tim.setHourlyRate(7.53);
		tim.cutCheck(tim.findPaymentAmount(10));
	}
}

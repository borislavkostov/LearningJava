package Employee;

public class PartTimeWithOver extends PartTimeEmployee
{
	@Override
	public double findPaymentAmount(int hours)
	{
		if (hours<= 40) 
		{
			return this.getHourlyRate() * hours;
		}
		else
		{
			return this.getHourlyRate() * 40 + this.getHourlyRate() * 2 * (hours-40);
		}
	}
}

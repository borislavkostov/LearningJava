package Temperature;

public class UseTemperature 
{
	public static void main(String args[])
	{
		final String format ="%5.2f degrees %s\n";
		Temperature temp=new Temperature();
		temp.setNumber(35.0);
		temp.setScale(TempScale.KELVIN);
		System.out.printf(format,temp.getNumber(),temp.getScale());
		temp=new Temperature(21.3);
		System.out.printf(format,temp.getNumber(),temp.getScale());
		temp=new Temperature(TempScale.LEIDEN);
		System.out.printf(format,temp.getNumber(),temp.getScale());
		temp=new Temperature(25.7,TempScale.FAHRENHEIT);
		System.out.printf(format,temp.getNumber(),temp.getScale());
	}
}

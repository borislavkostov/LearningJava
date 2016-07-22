package Temperature;

public class UseTemperatureNice 
{
	public static void main(String args[])
	{
		TemperatureNice temp =new TemperatureNice();
		temp.setNumber(70.00);
		temp.setScale(TempScale.LEIDEN);
		temp.display();
		temp=new TemperatureNice(TempScale.DELISLE);
		temp.display();
		temp=new TemperatureNice(23.5,TempScale.CELSIUS);
		temp.display();
	}
}

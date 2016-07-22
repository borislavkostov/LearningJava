package Temperature;

public class Temperature 
{
	private double number;
	private TempScale scale;
	public Temperature()
	{
		number=0.0;
		scale=TempScale.CELSIUS;
	}
	public Temperature(double number)
	{
		this.number=number;
		scale=TempScale.CELSIUS;
	}
	public Temperature(TempScale scale)
	{
		number=0.0;
		this.scale=scale;
	}
	public Temperature(double number,TempScale scale)
	{
		this.number=number;
		this.scale=scale;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public TempScale getScale() {
		return scale;
	}
	public void setScale(TempScale scale) {
		this.scale = scale;
	}
	
}

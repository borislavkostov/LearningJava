package GSM;

import java.util.Scanner;

public class GSM 
{
	private static GSM nokiaN95=new GSM();
	static
	{
		nokiaN95.setModel("N95");
		nokiaN95.setProducer("Nokia");
		nokiaN95.setPrice(543.60);
		nokiaN95.setOwner("Ivan");
	}
	private String model;
	private String producer;
	private Double price;
	private String owner;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public static void showNokiaN95()
	{
		System.out.println(nokiaN95.getModel());
		System.out.println(nokiaN95.getProducer());
		System.out.println(nokiaN95.getOwner());
		System.out.println(nokiaN95.getPrice());
	}
	public void readGSM(Scanner diskScanner)
	{
		model=diskScanner.nextLine();
		producer=diskScanner.nextLine();
		price=diskScanner.nextDouble();
		diskScanner.nextLine();//After scanner double from File we need to add this
		owner=diskScanner.nextLine();			
	}
	public  void showGSM()
	{
		System.out.println(this.getModel());
		System.out.println(this.getProducer());
		System.out.println(this.getOwner());
		System.out.println(this.getPrice());
	}
}

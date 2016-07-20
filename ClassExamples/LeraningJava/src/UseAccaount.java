
public class UseAccaount 
{
	public static void main(String arg[])
	{
		Account myAccount=new Account();
		myAccount.setName("Borislav");
		myAccount.setAddress("Sofia");
		myAccount.setBalance(234.5);
		System.out.println(myAccount.getAddress());
		
	}
}

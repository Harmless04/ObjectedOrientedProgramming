import java.util.*;
	class bankdeets
{	
	private int accountno,balance,deposit,withdraw;
	private String type,name;
	public void getdata (string n,int a,string type,int b)
	{
		name=n;
		accountno=a:
		type=typ;
		bal= b;
	}
	
	public void deposit()
	{
		System.out.println("enter the amount:");
		scanner.in = new scanner(system.in);
		dep=in.nextint();
		bal= bal+dep;
	}
	public void withdraw()
	{
		system.out.println("enter money to withdraw");
		scanner.in = new scanner(system.in);
		with = in.next int();
		bal=bal-with;
	}
	public void display()
	{
		System.out.println("Name="+name);
		System.out.println("balance="+bal);
	}
		}
			}
	
	public class bankdeets
	{
		public static
			
			{
				Bank obj= new Bank();
				obj.getdata("Anushka",1200,"balance",1000);
				obj.deposit();
				obj.withdraw();
				obj.display();
			}
		}
}
	

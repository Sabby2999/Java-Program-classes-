import java.util.*;
class Bank
{
	String uname;
	int uac_no;
	int ubalance;
	Bank()
	{
		uname="SSS";
		ubalance=5000;
	}
	void balance()
	{
		System.out.println("\n BALANCE AMOUNT = "+ubalance);
	}
	void withdraw(int wamt)
	{
		if(wamt>ubalance)
			System.out.println("\n INVALID AMOUNT");
		else
		{
			ubalance=ubalance-wamt;
			System.out.print("\n WITHDRAW SUCCESSFULLY");
			balance();
		}	
	}
	void deposit(int damt)
	{
		ubalance=ubalance+damt;
		System.out.print("\n DEPOSIT SUCCESSFULLY");
		balance();
	}
	public static void main(String s[])
	{
		int ch;
		String c;
		Scanner sc = new Scanner(System.in);
		Bank u = new Bank();
		System.out.print("\n Enter user Name : ");
		u.uname=sc.nextLine();
		System.out.print("\n Enter user Account No.  : ");
		u.uac_no=sc.nextInt();
		do
{
		System.out.print("\n MENU\n ~~~~\n1. Withdraw\n2. Deposit\n3. Balance\n4. Exit");
		System.out.print("\n Enter your choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:System.out.print("\n Enter the amount to Withdraw :" );
				int w=sc.nextInt();
				u.withdraw(w);
				break;
			case 2: System.out.print("\n Enter the amount to Deposit : ");
				int d=sc.nextInt();
				u.deposit(d);
				break;
			case 3: u.balance();
				break;
			case 4: System.exit(0);
			default: System.out.print("\n INVALID CHOICE\n");
				break;		
		}
		System.out.print("Do u Want to Continue (y/n): ");
		c=sc.next();	
}while(c.equals("yes")||c.equals("YES"));
	}
}
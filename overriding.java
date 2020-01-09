import java.util.*;
class Bank 
{
	int rate_of_interest()
	{
		return 0;
	}
}
class SBI extends Bank 
{
	int rate_of_interest()
	{
		return 5;
	}
}
class PNB extends Bank 
{
	int rate_of_interest()
	{
		return 8;
	}
}
class HDFC extends Bank 
{
	int rate_of_interest()
	{
		return 15;
	}
}
class overriding
{
	public static void main(String s[])
	{
		SBI S1 = new SBI();
		PNB P1 = new PNB();
		HDFC H1 = new HDFC();
		System.out.print("\nRate = "+ S1.rate_of_interest());	
		System.out.print("\nRate = "+ P1.rate_of_interest());
		System.out.print("\nRate = "+ H1.rate_of_interest());
	}
}





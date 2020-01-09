import java.util.*;
class Add
{
	int x,y;
	int fun(int a,int b)
	{
		return(a+b);	
	}
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		Add a=new Add();
		System.out.print("\n Enter the two numbers  : ");
		a.x=sc.nextInt();
		a.y=sc.nextInt();
		System.out.print("\n Sum is "+(a.fun(a.x,a.y)));
	}
}
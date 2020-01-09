import java.util.*;
class overloading
{
	static float area(float radius)
	{
		return (3.14f*radius*radius);
	}
	static float area(int len , int breadth)
	{
		return (len*breadth);
	}
	static float area(int len)
	{
		return (len*len);
	}
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter the radius of circle : ");
		float radius = sc.nextFloat();
		System.out.print("\n Enter the length and breadth of rectangle : ");
		int len = sc.nextInt();
		int breadth = sc.nextInt();
		System.out.print("\n Enter the length of square : ");
		int lens = sc.nextInt();
		System.out.print("\n Area of circle = "+overloading.area(radius));		
		System.out.print("\n Area of rectangle = "+overloading.area(len,breadth));
		System.out.print("\n Area of square = "+overloading.area(lens));
	}
}
class Bike
{
	void run()
	{
		System.out.println("running");
	}
}
class Splender extends Bike
{
	void run()
	{
		System.out.println("running safely at 60km ");
	}
}
class Wheels extends Splender
{
	void run()
	{
		System.out.println("running wheels");
	}
}
class upcasting 
{
	public static void main(String s[])
	{
		Bike b=new Wheels();
		b.run();
		b=new Splender();
		b.run();
		b=new Bike();
		b.run();
	}
}

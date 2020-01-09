class Finalkeyword
{	
	final int rno;
	Finalkeyword()
	{
		rno = 20;
	}
 	public static void main(String s[])
	{
		Finalkeyword f = new Finalkeyword();
		System.out.println(f.rno);
	//	f.rno*=100;//ERROR
		System.out.println(f.rno);
	}
}
import java.util.*;
class college
{
	String cname;
	college()
	{
		cname="GTBIT";
	}
	void displayc()
	{
		System.out.println("College name = "+cname);
	}
}
class student extends college
{
	String sname;
	student()
	{
		sname="Sahib";
	}
	void displays()
	{
		System.out.println("Student name = "+sname);
	}
}
class multilevel extends student
{
	String add;
	multilevel()
	{
		add="Pitampura";
	}
	public static void main(String s[])
	{
	multilevel a=new multilevel();
	System.out.println("Address = "+a.add);
	a.displayc();
	a.displays();
	}
}
import java.util.*;
class college
{
	private String cname;
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
	private String sname;
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
//	System.out.println("college name  = "+a.cname);
//	System.out.println("student name = "+a.sname);
	}
}
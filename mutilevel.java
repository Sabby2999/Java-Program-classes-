import java.util.*;
class college
{
	String cname;
	college()
	{
		cname="GTBIT";
	}
	displayc()
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
	displays()
	{
		System.out.println("Student name = "+sname);
	}
public class multilevel extends student
{
	String add;
	multilevel()
	{
		add="Pitampura";
	}
	public static void main(String s[])
	{
	multilevel a=new multilevel();
	System.out.println("Address = "+add);
	a.displayc();
	a.displays();
	}
}
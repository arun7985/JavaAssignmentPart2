import java.util.*;
public class LeapYearCheck 
{
public void check()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year to check leap or not");
	int x=sc.nextInt();
	if(x<0)
	{
		System.out.println("Enter the correct year");
	}
	else if(x%4==0)
	{
		System.out.println("Leap Year");
	}
	else 
	{
		System.out.println("Not leap year");
	}
}
	public static void main(String args[])
	{
		LeapYearCheck lp=new LeapYearCheck();
		lp.check();
	}
}


import java.util.*;
 class OopsConcept2
{
	int roll_number=101;
	String name="Aniket";
    public void Encapsulation()
    {
	 System.out.println("Roll Number"+roll_number);
	 System.out.println("Name of student is"+name);
    }
}
public class OopsConceptEncapsulation
{
	public static void main(String args[])
	{
		OopsConcept2 oc=new OopsConcept2();
		oc.Encapsulation();
		System.out.println("Encapsulation example");
		System.out.println(oc.roll_number);
		System.out.println(oc.name);
	}
}

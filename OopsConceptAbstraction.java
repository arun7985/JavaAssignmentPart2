import java.util.*;
public abstract class OopsConceptAbstraction 
{
  abstract void show();
 /* {
	 // System.out.println("hello this is abstract class");
  }*/
  public static void main(String args[])
  {
	OopsConceptAbstraction oa=new OopsConceptAbstractionImplementation();
	oa.show();
  }
}
  class OopsConceptAbstractionImplementation extends OopsConceptAbstraction
{
	public void show()
	{
		  System.out.println("hello this is the extended class");
	}
}

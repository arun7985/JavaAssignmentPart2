public class OopsConceptInheritance
{
	//method available in child class
  public void parentmethod()
  {
	  System.out.println("this method will be available in those class who inherit it");
  }
  public static void main(String args[])
  {
	  OopsConceptInheritanceChild oc=new OopsConceptInheritanceChild();
	  System.out.println("parent method is called from child object");
	  oc.parentmethod();
  }
}
class OopsConceptInheritanceChild extends OopsConceptInheritance
{
	public void childmethod()
	  {
		  System.out.println("this is child class method ");
	  }
	
}

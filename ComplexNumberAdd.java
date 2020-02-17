import java.util.*;
public class ComplexNumberAdd
{
 public void add()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the first  complex number");
	 int x=sc.nextInt();
	 int x1=sc.nextInt();
	 System.out.println("Enter the second  complex number");
	 int y=sc.nextInt();
	 int y1=sc.nextInt();
	 System.out.println("Additon of comple number is -");
	 System.out.println(x+x1+"i" +(y+y1)+"j");
	 sc.close();
}
 public static void main(String args[])
 {
	 ComplexNumberAdd ca=new ComplexNumberAdd();
	 ca.add();
 }
}

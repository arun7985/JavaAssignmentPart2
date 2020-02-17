import java.util.*;
public class OopsConceptPolymorphism 
{
 public void add(int x,int y)
 {
	 System.out.println("via int argument sum is  "+(x+y));
 }
 public void add(double x,double y)
 {
	 System.out.println("via double orgument sum is   "+(x+y));
 }
 public void add(int x,double y)
 {
	 System.out.println("via double orgument sum is  "+(x+y));
 }
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int x=sc.nextInt();
	 int y=sc.nextInt();
	 OopsConceptPolymorphism op =new OopsConceptPolymorphism();
	 op.add(x, y);
	 System.out.println("Enter the number for double addition");
	 double x1=sc.nextDouble();
	 double y1=sc.nextDouble();
	 op.add(x1, y1);
	 sc.close();
 }
}

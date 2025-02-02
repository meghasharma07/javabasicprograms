package Inheritance;
class Calling1
{
	Calling1(int a)
	{
		System.out.println("value of a " +a);
	}
	
}
 class Calling2 extends Calling1
 {
 Calling2(String name) 
	 
 {
	 super (10);
	 System.out.println("my name is " +name);
			} 
	 }
		 
public class SuperCalling extends Calling2
{
 SuperCalling(int c,int b)
 {
	 super("Anvi");
	 System.out.println("value of c " +c);
	 System.out.println("value of b " +b);
 }
 
	public static void main(String[] args)
	{
		new SuperCalling(30,45);
		 
	}

}

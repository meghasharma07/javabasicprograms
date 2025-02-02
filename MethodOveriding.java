package Inheritance;
class Overiding
{
	void mul()
	{
		System.out.println("mul with two no");
	}
}

public class MethodOveriding extends Overiding
{
 void mul()
 {
	 super.mul();
	 System.out.println("mul with three no");
 }
	
	public static void main(String[] args)
	{
		MethodOveriding s1=new MethodOveriding();
		s1.mul();
	}

}

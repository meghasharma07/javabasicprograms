package Inheritance;
abstract class Tesla
{
	abstract void a1();
	abstract void b1();
	 void C1()
	 {
		 System.out.println("Enter c");
	 }
	 static void C4()
	 {
		 System.out.println("Enter d");
	 }
}
public class AmazonLogin3 extends Tesla
{
	

	void C1()
	 { 
		super.C1();
		 System.out.println("Enter A");
	 }
	 static void C2()
	 {
		 System.out.println("Enter B");
	 }

	public static void main(String[] args)
	{
   AmazonLogin3 d1=new  AmazonLogin3();
   d1.C1();
   C2();
    C4();
    
    d1.a1();
    
	}

	@Override
	void a1()
	{
		System.out.println("india");
	}

	@Override
	void b1()
	{
		System.out.println("canada"); 
	}

}

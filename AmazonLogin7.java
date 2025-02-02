package Inheritance;
interface Car
{
	void sum();
	void add1();
}
abstract class Car1 implements Car
{
	 abstract void add();
	 static void div()
	 {
		 System.out.println("my name is megha");  
	 }
}
public class AmazonLogin7 extends Car1
{
	 static void adds()
	 {
		 System.out.println("enter c"); 
	 }

	public static void main(String[] args)
	{
		AmazonLogin7 k1= new AmazonLogin7();
		k1.add();
		k1.sum();
		div();
		adds();
	}

	@Override
	public void sum()
	{
		System.out.println("enter my name");
	}

	@Override
	void add()
	{System.out.println("enter your name");
		
	}

	@Override
	public void add1()
	{
	}

}

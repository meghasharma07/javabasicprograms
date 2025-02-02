package Inheritance;

abstract class TD
{
	void add()
	{
		System.out.println("enter a");
	}
	void sub()
	{
		System.out.println("enter b");
	}
	static void mul()
	{
		System.out.println("enter c"); 
	}
	static void div()
	{
		System.out.println("enter d"); 
	}
	}



public class AmazonLogin4 extends TD
{

	public static void main(String[] args)
	{
		
		 AmazonLogin4 h1=new AmazonLogin4();
		 h1.add();
		 h1.sub();
		 mul();
		 div();
	}

}

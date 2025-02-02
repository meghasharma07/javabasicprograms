package Inheritance;

abstract class Mazda 
{
	abstract void login2();
	abstract void logout2();
	abstract void logout3();
	 void add()
	 {
		System.out.println("enter f");   
	 }
}


public class AmazonLogin2 extends Mazda
{
	

	public static void main(String[] args)
	{
		 AmazonLogin2 a1=new AmazonLogin2();
       a1.add();
       
       
    
	}

	@Override
	void login2()
	{
		System.out.println("enter b");
	}

	@Override
	void logout2()
	{
		System.out.println("enter c"); 
	}

	

	@Override
	void logout3()
	{
		System.out.println("enter c"); 
	}
	}



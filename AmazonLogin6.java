package Inheritance;
interface Tata
{
	void add ();
}

public class AmazonLogin6 implements Tata
{

	public static void main(String[] args)
	{
		AmazonLogin6 a1= new 	AmazonLogin6();
		a1.add();
	}

	@Override
	public void add()
	{
		System.out.println("enter value a");


	}
}

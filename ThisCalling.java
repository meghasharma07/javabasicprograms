package Inheritance;

public class ThisCalling

{
	ThisCalling()
	{ 
		this(900);
		System.out.println("enter a");
	}
	ThisCalling(int a)
	{ 
		this("mkt","lkt");
		System.out.println("enter b");
	}
	ThisCalling(String a ,String b)
	{
		System.out.println("enter c");
	}

	public static void main(String[] args)
	{
    new ThisCalling();
    
	}

}

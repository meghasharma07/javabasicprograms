package Inheritance;

class Class1
{
	static void mul()
	{
		System.out.println("mul");
	}
}

class  Class2 extends Class1
{
	static void sub()
	{
	System.out.println("sub");
}
}

public class MultilevelInheritance extends Class2
{

	static void add()
	{
		System.out.println("add");
	}
	public static void main(String[] args)
	{
     add();
     sub();
     mul();
	}
}


package Inheritance;

interface m1
{
	void add();
}
abstract class m2 implements m1
{
	abstract void mul();
	static void div()
	{
		System.out.println("megha");
	}
}
class m3 extends m2
{
	void sub()
	{
		System.out.println("anvi");
	}

	@Override
	public void add()
	{
		System.out.println("shragvi");
	}

	@Override
	void mul()
	{
		System.out.println("rakshit");
	}
}



class AmazonLogin9 extends m3
{

	public static void main(String[] args)
	{
		 AmazonLogin9 c1=new AmazonLogin9();
		 c1.add();
		 c1.mul();
		 c1.sub();
		 div();
	}

}

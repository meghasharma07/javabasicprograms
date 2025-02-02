package Inheritance;
class Student1
{
	Student1()
	{
		System.out.println("3");
	}
}
class Student2 extends Student1
{
	Student2()
	{
		System.out.println("2");
	}
}
public class Manish extends  Student2
{
	 Manish()
	 {
		 System.out.println("1");
	 }
	public static void main(String[] args)
	{
    Manish m1=new Manish();
	}

}

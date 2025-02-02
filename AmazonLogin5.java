package Inheritance;
interface API 
{
	void abc();//abstract method
}
interface RBC 
{
	void efg();
}


public class AmazonLogin5 implements RBC,API
{

	public static void main(String[] args)
	{
    AmazonLogin5 h1= new  AmazonLogin5 ();
    h1.abc();
    h1.efg();
	}

	@Override
	public void abc()
	{
		System.out.println("logic is present");
	}

	@Override
	public void efg()
	{
		System.out.println("LOgic is not presnt"); 
	}

}

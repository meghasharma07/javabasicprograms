package Inheritance;
 abstract class Facebook  // abstract class
{ 
	abstract void on();// abstract method
	abstract void off();
	}
	
 class Login_Amazon extends Facebook
{

	public static void main(String[] args)
	{
	
		
	}
	void on()
	{
		System.out.println("write a no 10 to 20");
	}
	void off ()
	{
		System.out.println("write a no 20 to 30");
	}
}

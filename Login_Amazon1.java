package Inheritance;
abstract class Fb
{
	abstract void login();
	abstract void logout();
	 static void S(String name)
	 {
		 System.out.println( name);
	 }
	 }


abstract class Google extends Fb
{
	abstract void login1();
	abstract void logout1();


}
public class Login_Amazon1 extends Google
{

	public static void main(String[] args)
	{
   S("megha");
	}

	@Override
	void login1()
	{
	}

	@Override
	void logout1()
	{
	}

	@Override
	void login()
	{
	}

	@Override
	void logout()
	{
	}

}

package Inheritance;

class AmazonLogic
{
	private String username="contact@grotechminds.com";

	public String getUsername()
	{
		return username;
	}
public void setUsername(String username)
{
	this.username=username;
}
}
public class Encapsulationprogram
{
	public static void main(String[] args)
	{
		AmazonLogic m1=new AmazonLogic();
				m1.setUsername("stbymkt@gmail.com");  
				System.out.println(m1.getUsername());
	}

}

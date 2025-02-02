package Inheritance;
 class Anvi
 {
	 void sub(int a)
	 {
		 System.out.println("my name is anvi");
		 System.out.println(a);
	 }
 }
class Shragvi extends Anvi
{
	void sub(String s)
	{ 
		 super.sub(10);
		 System.out.println("my name is shragvi");
		 System.out.println(s);
	}
}

public class Megha extends Shragvi
{
  void sub(int c,int b)
  {
  	super.sub("sireesha");
  	System.out.println("my name is megha");
  	System.out.println("inta,intb:"+c+b);
  	
	}
  
	public static void main(String[] args)
	{
   Megha m1= new Megha();
   m1.sub(12,20);
	}

}

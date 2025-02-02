package Inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Program
{

	public static void main(String[] args)
	{
 Scanner s1=new Scanner(System.in);
  String [] input=new String[3];
  String [] input1=new String[3];
   for( int i=0;i<input.length;i++)
   {
   System.out.println("enter the value index"+i);
  	 input[i]=s1.next();
   }
   System.out.println("enter value at run time"+Arrays.toString(input));
   for( int i=0;i<input1.length;i++)
   {
   System.out.println("enter the value index"+i);
  	 input1[i]=s1.next();
   }
  // System.out.println("enter value at run time"+Arrays.toString(input));
   System.out.println("enter value at run time"+Arrays.toString(input1));
   boolean b1=Arrays.equals(input, input1);
   System.out.println(b1);
	}
	
}


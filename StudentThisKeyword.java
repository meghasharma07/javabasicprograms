package Inheritance;
public class StudentThisKeyword
{
	String Name ;
	double Salary;
	int empid;
	void details(String name,double salary,int empid)/// important program for interview 
	{
		//this.globalVariable=localvariable
		this.Name=name;
		this.Salary=salary;
		this.empid=empid;
		System.out.println("student name is:" +name);
	} 
	void details1(String name1,double number,int id)
	{
		this.Name=name1;
		this.Salary=number;
		this.empid=id; 
		//System.out.println("details1 infirmation"+name1+number+id);
	}
	public static void main(String[] args)
	{
     StudentThisKeyword m1=new StudentThisKeyword();
     m1.details("sita", 63.63,111);
     System.out.println(m1.Name);
     System.out.println(m1.empid);
     System.out.println(m1.Salary);
     m1.details1("ram", 67.5, 223);
     System.out.println(m1.Name);
     System.out.println(m1.empid);
     System.out.println(m1.Salary);
     
	}

}

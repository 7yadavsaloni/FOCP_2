import java.util.*;
class employee
{
	String firstname;
	String lastname;
	double salary;
	employee(String fn,String sn,double d)
	{
	firstname=fn;
	lastname=sn;
	salary=d;
	}
	double yr_sal()
	{
	return salary*12;
	}
	void salRaise()
	{
	salary=salary*0.1;
	}
	void displayEmp()
	{ 
		System.out.println("first name :"+firstname);
	System.out.println("last name :"+lastname);
	System.out.println("enter salary :"+salary);
    }
}
class emp_main
{
   public static void main(String[] args)
   {
    Scanner in=new Scanner(System.in);
	String f,l;
	double s;
	System.out.println("enter first name :");
	f=in.next();
	System.out.println("enter last name :");
	l=in.next();
	System.out.println("enter salary :");
	do{
		s=in.nextDouble();
		if(s<0)
		{
		System.out.println("Salary is +ve quantity , please enter again :");	
		}
	}
		while(s<0);
	employee e1=new employee(f,l,s);
	e1.displayEmp();
   }
}
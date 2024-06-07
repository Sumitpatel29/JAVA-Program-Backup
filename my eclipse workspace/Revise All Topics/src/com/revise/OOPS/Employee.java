package com.revise.OOPS;

public class Employee
{
	String name;
	double sal;
	public Employee(String name,double sal)
	{
		super();
		this.name=name;
		this.sal=sal;
	}
	@Override
	public boolean equals(Object obj)
	{
		Employee e1= (Employee) obj;
		System.out.println(e1.sal+">="+this.sal);
		if(e1.sal>=this.sal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Sumit", 5000.0);
		Employee e2=new Employee("Ayush", 86400.0);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e1));

		
	}

}

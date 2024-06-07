package com.lib.array;

public class Employee
{
	String name;
	int id;
	double sal;
	public Employee(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString()
	{
		return "Employee Details: name"+name+" id="+id+" Salary="+sal;
	}
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee("Sumit", 101, 45000.0);
		Employee e2=new Employee("Ayush", 102, 65000.0);
		Employee e3=new Employee("Rupesh", 103, 25000.0);
		Employee[] emparray= {e1,e2,e3};
		for (int i = 0; i < emparray.length; i++) 
		{
			System.out.println(emparray[i]);
		}

	}

}

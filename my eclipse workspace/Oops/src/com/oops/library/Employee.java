package com.oops.library;

public class Employee {
	
	String name;
	double sal;
	
	public Employee(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
//	@Override
//	public boolean equals(Employee obj)
//	{
//		Employee e1=(Employee) obj;
//		if(obj.sal>=50000.0)
//		{
//			
//		}
//	}
		public static void main(String[] args) {
		Employee e1=new Employee("sumit", 7800.0);
		Employee e2=new Employee("Ayush", 47000.0);
		System.out.println("----Equals()-----");
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e1));

	}

}

package com.oops.inheritance;

class sample
{
 final int v1=0;
 String str;
 public void test()
 {
	 System.out.println("Test of Sample Class");
 }
}
class Demo extends sample  // the Demo class is inheriting the property of SampleClass
{
	double z1;
	public void display()
	{
		System.out.println("display of Demo Class");
	}
}
public class MainSingle //the filename class can only be public(i.e the file name u created is same as the class name that holds your main method)
/* if we try to rename the class name & right click then, 1.go on refactor 2.click on rename */
{
public static void main(String[] args) 
{
 	Demo d1 = new Demo();
 	d1.test();
 	System.out.println(d1.v1); // we can access final variable also
 	System.out.println(d1.str);//we can access variable of 
 	d1.display();
 	System.out.println(d1.z1);
}
}

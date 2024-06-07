package com.oops.collections;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		 
		Vector<Object> v1=new Vector<Object>();
		v1.add(10);
		v1.add(2);
		v1.add('A');
		v1.add(null);
		v1.add(6);
		v1.add(5);
		System.out.println(v1);
		v1.forEach(Obj -> System.out.println(Obj));
		

	}

}

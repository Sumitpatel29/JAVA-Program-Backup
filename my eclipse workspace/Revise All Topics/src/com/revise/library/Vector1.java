package com.revise.library;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<Object> v1=new Vector<Object>();
		v1.add("hello");
		v1.add(4);
		v1.add('A');
		v1.add(4);
		v1.add(null);
		System.out.println(v1);
		
//		HashSet<Object> h1=new HashSet<Object>(v1);
//		System.out.println(h1);
		
		LinkedHashSet<Object> l1=new LinkedHashSet<Object>(v1);
		System.out.println(l1);
	}

}

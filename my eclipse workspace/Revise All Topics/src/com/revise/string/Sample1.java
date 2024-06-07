package com.revise.string;

public class Sample1 {

	public static void main(String[] args) {
		String str1="java";
		System.out.println(str1);
		System.out.println(str1.length());
		System.out.println(str1.charAt(0));
		System.out.println(str1.equals("JAVA"));
		System.out.println(str1.equalsIgnoreCase("JAVA"));
		System.out.println(str1.substring(0,3));
		String str2="ab";
		String str3="bc";
		System.out.println(str2.compareTo(str3));

	}

}

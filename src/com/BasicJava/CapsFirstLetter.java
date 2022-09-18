package com.BasicJava;

public class CapsFirstLetter {
	public static String firstCaps(String str) {
	if(str==null) {
	System.out.println("This is null value");	
	}
	if(str.length()==1) {
	System.out.println(str.toUpperCase());	
	}
	String word[]=	str.split("\\s");
	String result = "";
	for (String w: word) {
	String first = w.substring(0,1).toUpperCase();
	String rest = w.substring(1);
	result = result+first+rest+" ";
		
	}
	return result.trim();
		
	}
public static void main(String[] args) {
	 String caps = firstCaps("hello there");
	 System.out.println(caps);
	 caps = firstCaps("hi");
	 System.out.println(caps);
	 caps = firstCaps("samkir");
	 System.out.println(caps);
	 caps = firstCaps("1234 samir regmi");
	 System.out.println(caps);
}
}

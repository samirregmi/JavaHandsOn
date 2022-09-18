package com.BasicJava.SomeHandsOn;

import java.util.Arrays;

public class Anagram {

	public static  void checkAnagram(String my_string1, String my_string2) {
	System.out.println("The two String  are defined as: "+ my_string1 +" And "+my_string2);	
	my_string1 = my_string1.toLowerCase();
	my_string2 = my_string2.toLowerCase();
	if(my_string1.length()==my_string2.length()) {
		char[]my_array_1 = my_string1.toCharArray();
		char[]my_array_2 = my_string2.toCharArray();
		Arrays.sort(my_array_1);
		Arrays.sort(my_array_2);
		boolean my_result = Arrays.equals(my_array_1, my_array_2);
		if(my_result) {
			System.out.println("The Strings "+my_string1 +" And "+my_string2 + " Are Anagram." );
		}
	
		else {
			System.out.println("The Strings "+my_string1 +" And "+my_string2 + " Are Not Anagram." );
		}
	}
		else {
			System.err.println("The Strings "+my_string1 +" And "+my_string2 + " Are Not equal in lenght." );
		}
	}
	public static void main(String[] args) {
		checkAnagram("Nepali", "Alpen");
	}
}
	

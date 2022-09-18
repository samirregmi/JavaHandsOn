package com.BasicJava;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 System.out.println("Required packages have been imported");
         String my_string_1, my_string_2;
         my_string_1 = "Raceiaz";
         my_string_2 = "CaRelia";
         System.out.println("The two strings are defined as " +my_string_1 +" and " + my_string_2);
         my_string_1 = my_string_1.toLowerCase();
         my_string_2 = my_string_2.toLowerCase();
         if(my_string_1.length() == my_string_2.length()) {
            char[] my_array_1 = my_string_1.toCharArray();
            char[] my_array_2 = my_string_2.toCharArray();
            Arrays.sort(my_array_1);
            Arrays.sort(my_array_2);
            boolean my_result = Arrays.equals(my_array_1, my_array_2);
            if(my_result) {
               System.out.println("The strings "+my_string_1 + " and " + my_string_2 + " are anagram to each other.");
            } else {
               System.out.println("The strings "+my_string_1 + " and " + my_string_2 + " are not anagram.");
            }
         } else {
        System.err.println("The strings "+my_string_1 + " and " + my_string_2 + " Strings should be Equal in Length.");
     }
   }
}
	
		
	
	
	


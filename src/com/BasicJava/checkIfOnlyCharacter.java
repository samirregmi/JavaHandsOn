	package com.BasicJava;

import java.util.Scanner;

public class checkIfOnlyCharacter {
	public   boolean checkCharacters(String str) {
		str = str.toLowerCase();
	      char[] charArray = str.toCharArray();
	      for (int i = 0; i < charArray.length; i++) {
	         char ch = charArray[i];
	         if (!(ch >= 'a' && ch <= 'z')) {
	            return false;
	         }
	      }
	      return true;
	   }
	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//	      System.out.println("Enter a string value: ");
//	      String str = sc.next();
	      checkIfOnlyCharacter chk = new checkIfOnlyCharacter();
	      //checkCharacters ("Asdf");
	      boolean validate = chk.checkCharacters("dmair3322"
	      		+ "");
	      if(!validate) {
	         System.out.println("Given String is invalid");
	      }else{
	         System.out.println("Given String is valid");
	      }	
	     // sc.close();
	}
		
	}

	
	



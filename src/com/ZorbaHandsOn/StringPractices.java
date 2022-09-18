package com.ZorbaHandsOn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringPractices {
	/*
	 * System.out.println("The two String  are defined as: "+ my_string1
	 * +" And "+my_string2); my_string1 = my_string1.toLowerCase(); my_string2 =
	 * my_string2.toLowerCase(); if(my_string1.length()==my_string2.length()) {
	 * char[]my_array_1 = my_string1.toCharArray(); char[]my_array_2 =
	 * my_string2.toCharArray(); Arrays.sort(my_array_1); Arrays.sort(my_array_2);
	 * boolean my_result = Arrays.equals(my_array_1, my_array_2); if(my_result) {
	 * System.out.println("The Strings "+my_string1 +" And "+my_string2 +
	 * " Are Anagram." ); }
	 * 
	 * else { System.out.println("The Strings "+my_string1 +" And "+my_string2 +
	 * " Are Not Anagram." ); } } else {
	 * System.err.println("The Strings "+my_string1 +" And "+my_string2 +
	 * " Are Not equal in lenght." ); } } public static void main(String[] args) {
	 * checkAnagram("Nepali", "Alpen"); } }
	 */
	//1.
	public static void removingGarbageFromString() {
//		String cleanString = a.replaceAll("[^A-Za-z0-9!-*]", "");//
//		System.out.println(cleanString);
		String address = "Ca   stro Va ll   ey  Cal  ifor Nia      ";
		String cleanadd = address.replaceAll(" ", " ");
		
		System.out.println(cleanadd.trim());
		
		}

	//2.
	public static void checkDuplicateElement() {
	String []names = {"samir","Regmi","Samir"};
	for(int i = 0;i<names.length;i++) {
	for (int j = i+1;j<names.length;j++) {	
		if(names[i].equals(names[j])) {
			System.out.println(names[i]);
		}
	}
	}
	
	}
//3.
	public static void anagram(String name, String name1) {
		if (name1.length() == name.length()) {
			name.toLowerCase();
			name1.toLowerCase();
			char[] n = name.toCharArray();
			char[] n1 = name.toCharArray();
			Arrays.sort(n1);
			Arrays.sort(n);
			boolean result = Arrays.equals(n, n1);
			if (result) {
				System.out.println("They are Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		} else {
			System.out.println("They are not equal in length, So They are not anagram");
		}
	}
//4.
	public static String capsString(String str) {
		if (str == null) {
			System.out.println("This is a Null Value");
		}
		if (str.length() == 1) {
			System.out.println(str.toUpperCase());
		}
		String[] word = str.split("\\s");
		String result = "";
		for (String w : word) {
			String firstl = w.substring(0, 1).toUpperCase();
			String remL = w.substring(1);
			result = result + firstl + remL + " ";

		}
		return result.trim();
	}
//5.
	public static void findMax(int a, int b, int c, int d) {
		int max = 0;
		while (a > 0 || b > 0 || c > 0 || d > 0) {
			a--;
			b--;
			c--;
			d--;
			max++;
		}
		System.out.println(max);
	}
//6.
	public static void printDuplicateCharacter(String str1) {
	if(str1==null) {
		System.out.println("Null String");
		return;
	}
	if(str1.isEmpty()) {
		System.out.println("Empty String");
		return;
	}
	if(str1.length()==1) {
		System.out.println("Single Character String");
		return;
	}
	char[]name = str1.toCharArray();
	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	for(Character ch:name) {
		if(charMap.containsKey(ch)) {	
			charMap.put(ch, charMap.get(ch)+1);
		
		}
		else {
			charMap.put(ch, 1);
		}
	}
	Set<Map.Entry<Character,Integer>>entrySet = charMap.entrySet();
for(Map.Entry<Character, Integer> entry:entrySet) {
	if (entry.getValue()>1)	{
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	}
	}

	public static void main(String[] args) {
		removingGarbageFromString();
		checkDuplicateElement();
		printDuplicateCharacter("a");
		printDuplicateCharacter("");
		printDuplicateCharacter(null);
		printDuplicateCharacter("saameer");
		printDuplicateCharacter("areegamee");
		printDuplicateCharacter("asdfgh");
		printDuplicateCharacter("      ");
		
		findMax(784653457, 68574, 4537455, 200);
		anagram("A", "a");
		String Caps = capsString("my name is samir");
		System.out.println(Caps);

		Caps = capsString("my");
		System.out.println(Caps);

		Caps = capsString("m");
		System.out.println(Caps);

		Caps = capsString("123 the 3435e place is e3433");
		System.out.println(Caps);

		Caps = capsString("a s f g h ");
		System.out.println(Caps);

	}

}

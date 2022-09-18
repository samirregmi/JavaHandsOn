package com.BasicJava.SomeHandsOn;

public class CapitalFirstLetter {
public static String firstLetterCapital(String str1){//"i live in castro valley"

String [] words = str1.split("\\s");
String result = "";
for(String w:words) {
String firstL =	w.substring(0,1).toUpperCase();
String remL = w.substring(1);
result =result+firstL+remL+" ";

}
return result.trim();


}

public static void copyDuplicateElement() {//[] = "samir", "regmi", "Samir";
String []names = {"Samir", "Sreejana", "Shreyans","Samir","Sreejana", "Shreyans"};	
for(int i= 0;i<names.length;i++) {
for(int j = i+1;j<names.length;j++) {
	if(names[i].equals(names[j])) {
		
	String duplicates = names[i];
	System.out.println(duplicates);
	String result =  duplicates.replaceAll(duplicates, "");
	System.out.println("Duplicates Removed "+result );
	
	}
}
}
}
	public static void main(String[] args) {
		
		copyDuplicateElement();
//		String caps = firstLetterCapital("hello");
//		System.out.println(caps);
//		
//		caps = firstLetterCapital("i");
//		System.out.println(caps);
//		
//		caps = firstLetterCapital("i love you");
//		System.out.println(caps);
//		
//		caps = firstLetterCapital("123 hello kathmandu 453 nepal");
//		System.out.println(caps);
//		
//		caps = firstLetterCapital("i i i i ");
//		System.out.println(caps);
	}

}

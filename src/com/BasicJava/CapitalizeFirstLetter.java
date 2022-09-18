package com.BasicJava;

public class CapitalizeFirstLetter {
public static String capitalizeString(String str) {
if (str == null) {
System.out.println("Null Value");	
}
if(str.length()==1) {
System.out.println(str.toUpperCase());	
}
String [] word =  str.split("\\s");
String result = "";
for (String w:word) {
String first = w.substring(0,1).toUpperCase();
String restStr = w.substring(1);
result = result+first+restStr+" ";

}
//System.out.println(finresult);	
return result.trim();	

}
public static void main(String[] args) {
String caps = 	capitalizeString("i live in castro valley");
	System.out.println(caps);
	
	caps = 	capitalizeString("samir");
	System.out.println(caps);
	
	caps = 	capitalizeString("samir regmi.");
	System.out.println(caps);
}
}

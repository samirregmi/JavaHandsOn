package com.BasicJava;

public class SplitString {

	public static void main(String[] args) {
		
String address = "CastroValleyCalifornia";
String [] spltAddress = address.split("[^A-Z]");
for(String add:spltAddress) {
System.out.println(add);
}

	}

}

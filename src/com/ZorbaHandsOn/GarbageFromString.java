package com.ZorbaHandsOn;

public class GarbageFromString {
	public static void main(String[] args) {
		String a = "C  a  st roV  %$ a%&#l  l e^%$y";
		String cleanString = a.replaceAll("[^A-Za-z0-9]", "");//
			System.out.println(cleanString);
			String address = "Ca   stro Va ll   ey  Cal  ifor Nia      ";
			String cleanadd = address.replaceAll(" ", "");
			
			System.out.println(cleanadd.trim());
			
			}
	}



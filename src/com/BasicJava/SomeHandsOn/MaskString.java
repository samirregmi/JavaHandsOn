package com.BasicJava.SomeHandsOn;



public class MaskString {

	public static void main(String[] args) throws Exception {
//String ssn = "567568979020";
//        
//        //mask first 4 characters
//        System.out.println( maskString(ssn, 0, 4, '*') );
//        
//        //mask everything but last 4 digits
//        System.out.println( maskString(ssn, 0, ssn.length()-4, '*') );
//        
//        //mask everything
//        System.out.println( maskString(ssn, 0, ssn.length(), '*') );
//        
//        //mask everything but first and last 4 digits
//        System.out.println( maskString(ssn, 4, ssn.length(), '*') );
//
//		} 
//	private static String maskString(String strText, int start, int end, char maskChar) 
//	        throws Exception{
//	        
//	        if(strText == null || strText.equals(""))
//	            return "";
//	        
//	        if(start < 0)
//	            start = 0;
//	        
//	        if( end > strText.length() )
//	            end = strText.length();
//	            
//	        if(start > end)
//	        	//System.out.println("End index cannot be greater than start index");
//	            throw new Exception("End index cannot be greater than start index");
//	        
//	        int maskLength = end - start;
//	        
//	        if(maskLength == 0)
//	            return strText;
//	        
//	        StringBuilder sbMaskString = new StringBuilder(maskLength);
//	        
//	        for(int i = 0; i < maskLength; i++){
//	            sbMaskString.append(maskChar);
//	        }
//	        
//	        return strText.substring(0, start) 
//	            + sbMaskString.toString() 
//	            + strText.substring(start + maskLength);
		
	//	2nd OPTION
		
		
		String name = "Samir Regmi";
		String reversedName = " ";
		for (int i =name.length()-1;i>=0;i-- ) {
			
			reversedName = reversedName+name.charAt(i);
			
			
		
		}
		System.out.println(reversedName);
	    }
	 
	}


	



//Given 3 Strings find the maximum

package com.genericsTest;

public class UC3 {
	
 public static void main(String[] args) {
	 
		String string1 = "Apple";
		String string2 = "Papaya";
		String string3 = "Banana";
		
		findMax(string1, string2, string3);
	}
	public static void findMax(String firstString, String secondString, String thirdString) {
		String maximumString;
		
		if(firstString.compareTo(secondString)>0 && firstString.compareTo(thirdString)>0) {
			maximumString = firstString;
		}
		else if(secondString.compareTo(firstString)>0 && secondString.compareTo(thirdString)>0) {
			maximumString = secondString;
		}
		else {
			maximumString = thirdString;
		}
		
		System.out.println(maximumString + " is maximum out of "+firstString+", "+secondString+" and "+thirdString);
	}
}
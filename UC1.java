// Given 3 Integers find the maximum

package com.genericsTest;

public class UC1 {

	public static void main(String[] args) {
		
		Integer Num1 = 10;
		Integer Num2 = 20;
		Integer Num3 = 30;
		
		findMax(Num1, Num2, Num3);
	}
	
	public static void findMax(Integer Num1, Integer Num2, Integer Num3) {
		Integer maximumNumber;
		
		if(Num1.compareTo(Num2)>0 && Num1.compareTo(Num3)>0) {
			maximumNumber = Num1;
		}
		else if(Num2.compareTo(Num1)>0 && Num2.compareTo(Num3)>0) {
			maximumNumber = Num2;
		}
		else {
			maximumNumber = Num3;
		}
		
		System.out.println(maximumNumber + " is maximum out of "+Num1+", "+Num2+" and "+Num3);
	}
}
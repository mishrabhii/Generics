//Given 3 Floats find the maximum

package com.genericsTest;

public class UC2 {

	public static void main(String[] args) {
	
		Float floatNum1 = 23.2f;
		Float floatNum2 = 11.3f;
		Float floatNum3 = 5.5f;
		
		findMax(floatNum1, floatNum2, floatNum3);
	}
	
	
	public static void findMax(Float Num1, Float Num2, Float Num3) {
		Float maximumNumber;
		
		if(Num1.compareTo(Num3)>0 && Num1.compareTo(Num2)>0) {
			maximumNumber = Num1;
		}
		else if(Num2.compareTo(Num1)>0 && Num2.compareTo(Num3)>0) {
			maximumNumber = Num2;
		}
		else {
			maximumNumber = Num3;
		}
		
		System.out.println(maximumNumber + " is maximum in "+Num1+", "+Num2+" and "+Num3);
	}
}
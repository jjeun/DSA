package com.jjeun;

import java.util.Arrays;

public class reverseArray {
		
	public static void main(String[] args) {
		String [] words = {"Dana", "Jesse", "Bella", "Bentley"};
		
		int i = 1;
		for (String string : words) {
			System.out.println("Word" + i +": " + string);
			System.out.println("Reversed: " + reverseString(string));
			System.out.println("");
			i++;			
		}
		
		int [] integersArray = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println("Integer array entered: " + Arrays.toString(integersArray));		
		System.out.println("Integer array in reverse: " + Arrays.toString(reverseIntArray(integersArray)));
	}
	
	
	public static String reverseString(String string) {
		
		char [] stringArray = string.toCharArray();
		int arrayLength = stringArray.length;
		int halfArrayLength = arrayLength/2;
		
		for(int i = 0; i < halfArrayLength; i++) {
			char temp = stringArray[i];
			stringArray[i] = stringArray[arrayLength - i - 1];
			stringArray[arrayLength - i - 1] = temp;
		}
		
		return new String(stringArray);
	}
	
	public static int[] reverseIntArray(int [] num) {
		
		int arrayLength = num.length;
		int halfArrayLength = arrayLength/2;
		
		for(int i = 0; i < halfArrayLength; i++) {
			int temp = num[i];
			num[i] = num[arrayLength - i - 1];
			num[arrayLength - i - 1] = temp;
		}
		
		return num;
	}
}

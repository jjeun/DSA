package com.jjeun;

import java.util.Arrays;
import java.util.HashMap;

public class bubbleSort {
	
	public static void main(String[] args) {
		
		int[] numbersArray = {1, 2, 3, 15, 6, 9, 8, 10};
		char[] alphabetArray = {'d', 'a', 'b', 'z', 'j', 'c'};
		
		System.out.println("Original Array: " + Arrays.toString(numbersArray));
		System.out.println("Bubble Sort Array: " + Arrays.toString(doBubbleSort(numbersArray)));
		System.out.println("");
		
		System.out.println("Original Alphabet Array: " + Arrays.toString(alphabetArray));
		System.out.println("Bubble Sort Alphabet Array: " + Arrays.toString(doBubbleSortChar(alphabetArray)));
	}
	
	public static int[] doBubbleSort(int [] numbers) {
		int arrayLength = numbers.length;
		
		for(int i = 0; i < arrayLength; i++) {		
			for(int j = 1; j < arrayLength - i; j++) {
				if(numbers[j] < numbers[j-1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temp;
				}
			}
		}				
		return numbers;
	}
	
	public static char[] doBubbleSortChar(char[] alphabet) {
		
		int alphabetLength = alphabet.length;
		HashMap<Character, Integer> alphabetMap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < 26; i++) {
			alphabetMap.put((char)('a' + i), i);		
		}
		
		for(int i = 0; i < alphabetLength; i++) {
			for(int j = 1; j < alphabetLength - i; j++) {
				if(alphabetMap.get(alphabet[j]) < alphabetMap.get(alphabet[j-1])){
					char temp = alphabet[j];
					alphabet[j] = alphabet[j-1];
					alphabet[j-1] = temp;					
				}
			}
		}
		return alphabet;
	}

}


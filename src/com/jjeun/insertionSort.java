package com.jjeun;

import java.util.Arrays;

public class insertionSort {
	
	public static void main(String[] args) {
		int[] numsArray = {23,3,5,6,44,20,13,12,11};
		
		System.out.println("Original Array: " + new String(Arrays.toString(numsArray)));
		System.out.println("Insertion Sort Results: " + doInsertionSort(numsArray));		
	}
	
	public static String doInsertionSort(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j > 0; j--) {
				if(nums[j] < nums[j-1]) {
					int temp = nums[j];
					nums[j] = nums[j-1];
					nums[j-1] = temp;
				}
			}
		}
		return new String(Arrays.toString(nums));
	}
}

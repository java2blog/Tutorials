package org.arpit.java2blog;

import java.util.Arrays;

public class SortArrayString {

	public static void main(String[] args) {
		String arr[]={"Martin","Andy","John","Mary"};
		System.out.println("Before Sorting");
		System.out.println("===============");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		Arrays.sort(arr);
		
		System.out.println();
		System.out.println("===============");
		System.out.println("After Sorting");
		System.out.println("===============");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

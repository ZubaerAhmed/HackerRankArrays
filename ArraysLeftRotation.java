package HackerRankArrays;

import java.util.Random;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		Random rand = new Random();
		int size = 6;
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = rand.nextInt(49);
		}
		myArraysLeftRotation(arr, 7);
		System.out.println("\n-----------------");
		myArraysLeftRotation2(arr, 2);
	}
//============================================
	public static void myArraysLeftRotation(int[] arr, int num) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		for(int j=0; j<num; j++) {
			int a = arr[0];
			for(int i=0; i<arr.length-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[arr.length-1]  = a;
		}
		
		System.out.println();
		for(int i : arr) {
			System.out.print(i + " ");
		}
		//return arr;
	}
//------This is not work if value k is more than n---------
	public static void myArraysLeftRotation2(int[] a, int k) {
		int n = a.length;
		for(int i : a) {
			System.out.print(i + " ");
		}
		//create another array
		int b[] = new int[n];
		for(int i=0; i<n; i++) {
			if((i-k) < 0) {
				b[n+i-k] = a[i];
			}else {
				b[i-k] = a[i];
			}
 		}

		System.out.println();
		for(int i : b) {
			System.out.print(i + " ");
		}
		//return arr;
	}
}

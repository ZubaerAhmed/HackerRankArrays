package HackerRankArrays;

import java.util.Random;

public class MinimumSwaps2 {

	public static void main(String[] args) {
	//Array create-> randomArray();
		int[] arr = {4, 3, 1, 2};
		int[] arr2 = {3, 2, 1};
//		myMinimumSwaps(randomArray());
//		System.out.println("\n==============");
		myMinimumSwaps(arr2);
//		System.out.println("\n-----------------");
//		minimumSwaps(arr); //aproved HackerRank
//		System.out.println("\n-----------------");
//		minimumSwaps(randomArray()); //not woking
//		System.out.println(minimumSwapsGeehye(randomArray()));
	}
//======Not showing minimum but working===========
	public static void myMinimumSwaps(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		//--------------
		int count = 0;
		for(int k=0; k<arr.length; k++) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				count++;				
			}
		}
		}
		//return count;
		//-------------------
		for(int i : arr) {
			System.out.print(i+ " ");
		}
		System.out.println("\n"+count);
	}
//----GOOD but not working with random array------
	public static void minimumSwaps(int[] arr) {
		int swap = 0;
		boolean visited[] = new boolean[arr.length];

		for(int i=0; i<arr.length; i++){
			int cycle=0; 
			while(!visited[i]){
				visited[i] = true;
				i = arr[i]-1;
				cycle++;
			}			
			if(cycle!=0) 
				swap += cycle-1;
		}
		//return swap;
		System.out.println(swap);
	}
//----------------------------------------------
	public static int[] randomArray() {
		Random rand = new Random();
		int size = 6;
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = rand.nextInt(49);
		}
		return arr;
	}
//============================================================
	 static int minimumSwapsGeehye(int[] arr) {
	        int swapCnt = 0, tmp, idx = 0;
	        
	        for(int i = 0; i < arr.length; i++) {
	            if(arr[i] != i + 1) {
	                for(int j = i + 1; j < arr.length; j++) {
	                    if(arr[j] == i + 1) {
	                        idx = j; break;
	                    }
	                }
	                tmp = arr[i];
	                arr[i] = arr[idx];
	                arr[idx] = tmp;
	                swapCnt++;
	            }
	        }
	        return swapCnt;
	    }
}

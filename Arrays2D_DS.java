package HackerRankArrays;

public class Arrays2D_DS {

	public static void main(String[] args) {
		int[][] arr = { {-9, -9, -9,  1, 1, 1 },
						{ 0, -9,  0,  4, 3, 2 },
						{-9, -9, -9,  1, 2, 3 },
						{ 0,  0,  8,  6, 6, 0 },
						{ 0,  0,  0, -2, 0, 0 },
						{ 0,  0,  1,  2, 4, 0 } };
		
		my2dArrays(arr);
	}
//=========================================
	public static void my2dArrays(int[][] arr) {		
		int maxValue = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length-2; i++) {
			for(int j=0; j<arr[0].length-2; j++) {
				int currentSum = arr[i][j]+ arr[i][j+1]+ arr[i][j+2]+ 
						arr[i+1][j+1]+ arr[i+2][j]+ arr[i+2][j+1]+ arr[i+2][j+2];
				maxValue = Math.max(currentSum, maxValue);
			}
		}
		System.out.println(maxValue);
		
	}
}

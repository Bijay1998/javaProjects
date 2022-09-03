package arraySort;

import java.util.Arrays;
import java.util.Collections;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr =new int[]{1,2,3,4,5,65, 23, 8, 100};
		
		Arrays.sort(arr);
		System.out.println("Ascending order: ");
		for(int i =0; i<arr.length ;i++)
		{
			System.out.println((arr[i]));
		}
		System.out.println("Min: " + arr[0]);
		System.out.println("Max: " + arr[arr.length-1]);
		

	}

}

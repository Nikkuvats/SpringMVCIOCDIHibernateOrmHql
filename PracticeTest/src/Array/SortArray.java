package Array;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {
	
		int arr[] = {20,40,30,10,55,43,33};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}
}

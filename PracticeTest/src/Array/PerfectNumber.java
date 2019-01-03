package Array;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
	
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int j = 1; j < n; j++)
		{
			if(n % j == 0) 
			{
			sum = sum + j;	
			}
			System.out.println(sum +" and " +n);
		}
		if(sum == n) {
			System.out.println("perfect number : "+n);
		}
		else {
			System.out.println("no number");
		}
	}
}

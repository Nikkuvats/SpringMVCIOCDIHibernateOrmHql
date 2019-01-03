package Array;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int j = 0 ; j < t; j++)	
		{
		int n1 = 0;
		int n2 = 1; 
		int n3 = 0;
		int N = sc.nextInt();
			for(int i = 1 ; i <= N; i++) {
				n1 = n2;
				n2 = n3;
				n3 = n1+n3;
				System.out.print(n3+" ");
			}
		}
	}
}

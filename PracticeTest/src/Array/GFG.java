package Array;

import java.util.Scanner;

class GFG {
    
    public static void getPairs(int sum,int a[],int n){
        int i=0,j=n-1;
        boolean flag=false;
        while(i<j){
            
            if(a[i]+a[j]>sum){
                j--;
            }else if(a[i]+a[j]<sum){
                i++;
            }else{
                flag = true;
                System.out.println(a[i]+" "+a[j]+" "+sum);
                i++;
                j--;
            }
        }
        if(!flag){
           System.out.println(-1);
        }
    }
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
		    int size = sc.nextInt();
		    int array[] = new int[size];
		    for(int j=0;j<size;j++){
		        array[j] = sc.nextInt();
		    }
		    int sum = sc.nextInt();
		    getPairs(sum,array,size);
		}	}
}
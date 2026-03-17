package day5;

import java.util.Scanner;


public class TwoSum {
	
	public static void findTarget(int[] a,int t) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==t) {
					
					System.out.println("["+i+" , "+j+"]");
					return;
				}
			}
			
		}
		System.out.println("no pair found!!");
		
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		
		System.out.println("enter target");
		int target=sc.nextInt();
		sc.close();
		findTarget(arr,target);
		
	}

}

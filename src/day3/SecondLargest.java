package day3;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
         int max=arr[0];
         for(int i=1;i<arr.length;i++) {
        	 if (arr[i]>max) {
        		 max=arr[i];
        	 }
         }
         int secMax=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++) {
        	 if (arr[i]>secMax && arr[i]!=max) {
        		 secMax=arr[i];
        	 }
         }
         if(secMax==Integer.MIN_VALUE) {
        	 System.out.println("no second max");
         }
         else
        	 System.out.println(secMax);

	}

}

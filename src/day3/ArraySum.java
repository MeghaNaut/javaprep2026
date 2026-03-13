package day3;

import java.util.Scanner;

public class ArraySum{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array length");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("sum is... ");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		sc.close();
		System.out.println(sum);
	}
}
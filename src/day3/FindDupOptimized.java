package day3;

import java.util.Scanner;

public class FindDupOptimized {

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
			if(arr[i]>max) max=arr[i];
		}
		
		
		boolean[] dup=new boolean[max+1];
		boolean[] printed=new boolean[max+1];
		int flag=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(dup[arr[i]]==true && printed[arr[i]]==false) {
				System.out.println(arr[i]);
				printed[arr[i]]=true;
				flag=1;
			}
			else 
			{dup[arr[i]]=true;
			}
			
		}
		
		if(flag==0) {
			System.out.println("No duplicate");
		}

	}

}

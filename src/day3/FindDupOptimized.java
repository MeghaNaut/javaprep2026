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
		
		
		String[] dup=new String[max+1];
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(dup[arr[i]].equals("TRUE")|| dup[arr[i]].equals("ALREADY VISITED"))
				dup[arr[i]]="ALREADY VISITED";
			else
					dup[arr[i]]="TRUE";
				
				
				
			}
		int flag=0;
		for(int i=0;i<dup.length;i++) {
			if(dup[i].equals("ALREADY VISITED")) {
				System.out.print(i+" ");
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("no dup!!");
		} 

	}

}

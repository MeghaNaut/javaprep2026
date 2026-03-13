package day3;

import java.util.Scanner;

public class FindDuplicates {

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
		
		
		int[] dup=new int[n];
		int counter=0,flag=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					flag=0;
					for(int k=0;k<counter;k++) {
						if(arr[i]==dup[k]) flag=1;
					}
					if(flag==0) {
						dup[counter++]=arr[i];
					}
				}
				
				
			}
			
			
		}
		for(int k=0;k<counter;k++) {
			System.out.println(dup[k]);
		}
		
		
		
		}

	}


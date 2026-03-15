package day4;

import java.util.Scanner;

public class Fibonacci {
	
	static int fibonacci(int n) {
		if(n<=1) return n;
		return fibonacci(n-1)+fibonacci(n-2);
		
	}
	static void printFibonacci(int n) {
		for(int i=1;i<=n;i++) {
		System.out.print(fibonacci(i)+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		printFibonacci(x);
		sc.close();

	}

}

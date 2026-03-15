package day4;

import java.util.Scanner;

public class PrimeNumbers {

	static boolean isPrime(int n) { 
		int counter=0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0) counter++;
		}
		if (counter>=1) 
		return false;
		else
			return true;
	}
	
	static void printPrimes(int n) { 
		int flag=0;
		for(int i=2;i<=n;i++) {
		
			if(isPrime(i)) {
				flag=1;
				System.out.print(i+" ");
			}
		}
		if(flag==0)System.out.println("No primes found");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		printPrimes(x);
		sc.close();

	}

}

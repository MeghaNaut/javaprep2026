package day2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Random rand = new Random();
		int x=rand.nextInt(100)+1;
		int in=101;
		int attempt=0;
		System.out.println(x);
		do {
			System.out.println("enter a number");
			in=sc.nextInt();
			attempt++;
			if(in>x) {System.out.println("Too High");}
			else if(in<x) {System.out.println("Too Low");}
			else {System.out.println("Correct!! ATTEMPTS:"+attempt);}
			
		}while(x!=in);
		
		sc.close();

	}

}

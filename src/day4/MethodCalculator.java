package day4;

import java.util.Scanner;

public class MethodCalculator {

	static int add(int a, int b) {
		return a+b;
		
	}
	static int subtract(int a, int b) {
		return a-b;
		
	}
	static int multiply(int a, int b) {
		return a*b;
		
	}
	static double divide(int a, int b) {
		return (double)a/b;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("enter operator");
		String op=sc.next();
		sc.close();
		switch(op) {
		case "+":System.out.println(add(x,y));break;
		case "-":System.out.println(subtract(x,y));;break;
		case "*":System.out.println(multiply(x,y));;break;
		case "/":if(y==0) {System.out.println("cannot divide by 0");break;}
				System.out.println(divide(x,y));;break;
		default:System.out.println("wrong!!");
		
		
		
		}


	}

}

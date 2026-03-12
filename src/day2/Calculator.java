package day2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 no");
		int x=sc.nextInt();
		System.out.println("Enter 2 no");
		int y=sc.nextInt();
		System.out.println("Enter operator(+,-,*,/,%,^)");
		String op=sc.next();
		sc.close();
		switch(op) {
		case "+":System.out.println("result:"+ (x+y));break;
		case "-":System.out.println("result:"+ (x-y));break;
		case "*":System.out.println("result:"+ (x*y));break;
		case "/":if (y==0) {System.out.println("error:division by 0");break;}
		         System.out.println("result:"+ (x+y));break;
		
		case "%":if (y==0) {System.out.println("error:division by 0");break;}
			     System.out.println("result:"+ (x%y));break;
		case "^":System.out.println("result:"+ (Math.pow(x,y)));break;
		default:System.out.println("wrong option!!");break;
		
		}
		
	}

}

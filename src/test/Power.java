package test;

import java.util.Scanner;
public class Power {
	public static double power(int base, int exp) {
		if(exp==0) {
			return 1;
		}
		return base*power(base,exp-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base");
		int base=sc.nextInt();		
		System.out.println("enter exp");
		int exp=sc.nextInt();
		sc.close();
		if(exp<0) {
			System.out.println("RESULT: "+(1/(power(base, exp*-1))));
			return;
		}
		System.out.println("RESULT: "+(power(base, exp)));
	}

}

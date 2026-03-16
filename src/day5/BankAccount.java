package day5;

import java.util.Scanner;

public class BankAccount {

	  String owner;
	    double balance;
	    
	    BankAccount(){
	    	owner="Default";
	    	balance=0.0d;
	    	
	    }
	    BankAccount(String owner, double balance) {
	        this.owner = owner;
	        this.balance = balance;
	    }
	    
	    void deposit(double amount) {
	    	balance=balance+amount;
	    	System.out.println("deposited Successfully!! Your current balance is : "+balance);
	    	
	    }
	    
	    void withdraw(double amount)  {
	    	if(amount>balance) {
	    		System.out.println("Insufficient balance.Current Balance : "+balance);
	    		return;
	    	}
	    	balance=balance-amount;
	    	System.out.println("withdrawal Successfully!! Your current balance is : "+balance);
	    	
	    }
	    void display() {
	    	System.out.println(owner+" current balance is : "+balance);
	    	
	    }
	    
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		BankAccount acc=new BankAccount("megha",3000.0d);
		System.out.println("enter amount to be deposited!!");
		double a=sc.nextDouble();
	    acc.deposit(a);
	    System.out.println("enter amount to be withdraw!!");
		double b=sc.nextDouble();
		sc.close();
	    acc.withdraw(b);
	    
	    acc.display();
		
		

	}

}

package day5;

import java.util.Scanner;

public class Student {
	   String name;
	    int age;
	    double marks;

	    // methods:
	    void display() {
	    	System.out.println();
	    	System.out.print("name: "+name +" ");
	    	System.out.print("age: "+age+" ");
	    	System.out.print("marks: "+marks+" ");	
	    	System.out.print("grade: "+getGrade());
	    }
	    String getGrade() {
	    	String grade;
	    	if(marks >= 90)grade="A";
	    	else if(marks >= 75) grade="B";
	    			else if(marks >= 60) grade="C";
	    			else grade="D";
	    	return grade;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
	 Student[] students=new Student[3];
	 
	 for(int i=0;i<students.length;i++) {
		 students[i]=new Student();
		 System.out.println("enter detail for student "+ (i+1));
		 System.out.println("enter name");
		 students[i].name=sc.next();
		 System.out.println("enter age");
		 students[i].age=sc.nextInt();
		 System.out.println("enter marks");
		 students[i].marks=sc.nextInt();
		 
	 }
	 
	 for(int i=0;i<students.length;i++) {
		 students[i].display();
	 }
	 
		
		
		
		

	}

}

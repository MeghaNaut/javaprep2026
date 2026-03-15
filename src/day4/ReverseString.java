package day4;

import java.util.Scanner;

public class ReverseString {
    static void rev(char[] arr,int start) {
    	int k=arr.length-start-1;
    	if(start>=k) {
    		return;
    	}
    	char temp=arr[start];
    	arr[start]=arr[k];
    	arr[k]=temp;
    	
    	rev(arr,start+1);
    	
    	
    	
    	
    	
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.next();
        sc.close();
        char[] arr=str.toCharArray();
        rev(arr,0);
        System.out.println(new String(arr));
        
    }
}
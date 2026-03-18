package test;

public class SecondLargest {
	public static void getSecLargest(int[] arr) {
		int flag=0;
		int max=Integer.MIN_VALUE;
		int SecondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				if(SecondMax!=max) {
				SecondMax=max;
				flag=1;
				}
				max=arr[i];
				
				
			}
			else if(arr[i]>SecondMax &&arr[i]!=max) {
				 flag=1;
				 SecondMax=arr[i];
			}
			
		}
		if(flag==1) {
			System.out.println("second largest number is: "+SecondMax);
			return;
		}
		
		System.out.println("No second largest number found!!!");
	}

	public static void main(String[] args) {
		
		int[] arr= {9, 9, 9, 9};
		getSecLargest(arr);

	}

}

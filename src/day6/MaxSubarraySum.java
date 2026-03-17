package day6;

public class MaxSubarraySum {
public static void maxSubarraySum(int[] arr) {
	int sum=0,maxsum=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(sum+arr[i]<arr[i])
			sum=arr[i];
		else
			sum+=arr[i];
		
		if(maxsum<sum)maxsum=sum;
	}
	
	System.out.println(maxsum);
}
	public static void main(String[] args) {
		
		
		int[] arr= {-3, -2, -5};
		maxSubarraySum(arr);
		

	}

}

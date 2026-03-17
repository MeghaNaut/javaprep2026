package day6;

public class ArrayPalindrome {

	public static boolean isPalindrome(int[] arr) {
		
		
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			if(arr[left]!=arr[right]) {
				return false;
			}
			left++;right--;
		}

		return true;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {};
		if(arr.length==0) {
			System.out.println("Array is empty!!");
			return;
		}
		System.out.println(isPalindrome(arr));
		
		
	}

}

package day3;

public class FindMax {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,2,2,5,6,42,45,6,7,8,5,4,7};
		int max=arr[0];
		for (int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
	}

}

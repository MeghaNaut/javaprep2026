package day6;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 6;
        
        int[] result = rotate(arr, k);

        for(int x : result) {
            System.out.println(x);
        }
    }

    public static int[] rotate(int[] arr, int k) {
    	k=k%arr.length;
        int start = 0;
        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(arr.length > i + k) {
                temp[i + k] = arr[i];
            } else {
                temp[start] = arr[i];
                start++;
            }
        }

        return temp;
    }
}
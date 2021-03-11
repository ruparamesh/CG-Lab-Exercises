package lab6;

import java.util.Arrays;

public class Exercise7 {
	public static void main(String[] args) {
		int[] arr = {22, 18, 33, 44, 75, 91,5};
		
		System.out.println(Arrays.toString(getSorted(arr)));

	}
	
	public static int[] getSorted(int[] arr) {
		
		for (int i=0; i< arr.length; i++){
            String rev = String.valueOf(arr[i]);
            rev = new StringBuffer(rev).reverse().toString();
            arr[i] = Integer.valueOf(rev);
        }
        
        Arrays.sort(arr);
        
        return arr;

	}
}

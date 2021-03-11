package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
	public static void main(String[] args) {
		int[] numb= {1,2,3,4,5,6,7,8};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map=getSquares(numb);
		
		System.out.println(map.toString());
	}
	public static Map<Integer,Integer> getSquares(int[] nums) {
		Map<Integer,Integer> square = new HashMap<Integer,Integer>();
		
		for(int i:nums) {
			square.put(i,i*i);
		}
		
	        return square;
	        
	    }
}

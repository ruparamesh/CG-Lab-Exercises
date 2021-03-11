package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
	public static void main(String[] args) {
			int[] numb= {1,2,3,4,5,6,7,8};
			
			System.out.print(getSecondSmallest(numb));

		}
		
		public static int getSecondSmallest(int[] numb) {
			List<Integer> smallest = new ArrayList<Integer>();
			
			for(int i=0; i<numb.length; i++) {
				smallest.add(numb[i]);
			}
			
			Collections.sort(smallest);
			
			
			return (int) smallest.get(1);
		}
		
	}

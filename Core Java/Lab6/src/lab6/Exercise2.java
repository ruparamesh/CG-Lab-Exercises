package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	public static void main(String[] args) {
		char[] chrArr = {'A', 'C', 'D','D', 'C', 'Z', 'Z', 'Y', 'R'};
		
		Map<Character,Integer> charCount = new HashMap<Character,Integer>();
		charCount = countChars(chrArr);
		
		System.out.print(charCount.toString());
		
	}
	
	static Map<Character,Integer> countChars(char[] chars){
		Map<Character,Integer> temp = new HashMap<Character,Integer>();
		
		for(char c: chars) {
			// containsKey checks if key is present in map
			if (temp.containsKey(c)) {
				// OverWrites the value of the key 
				temp.put(c, temp.get(c) + 1);
			}
			else {
				// new key value added
				temp.put(c, 1);
			}
		}
		
		return temp;
	}
}

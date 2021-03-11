package lab6;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise6 {
	public static void main(String[] args) {

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(101, 2005);
		map.put(102, 1999);
		map.put(104, 1987);
		map.put(103, 1992);
		map.put(105, 2010);
		
		Exercise6 ex6=new Exercise6();
		System.out.print(ex6.votersList(map).toString());
		
		
	}
	
	public List<Integer> votersList(Map<Integer,Integer> map){
		
		List<Integer> list = new ArrayList<Integer>();
		
		Date date = new Date();
		int year = 1900 + date.getYear();
		
		for(int k: map.keySet()) {
			int age = year - map.get(k);
			
			if (age >= 18) {
				list.add(k);
			}
		}
		return list;
	}
}

package lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {
	
public static void main(String[] args) {
        
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("UK", "London");
        map.put("India", "New Delhi");
        map.put("Russia", "Mascow");
        map.put("US", "Washington");      
        System.out.println(map);
        
        Exercise1 labone=new Exercise1();
        List<String> values =labone.getValues(map);
        System.out.println(values);
    }
    
    //Get the values of a map in sorted order 
     List<String> getValues(HashMap<String,String> map) {
        
    	//get values from map
    	 Collection<String> collection = map.values();
    	// store the values inside list
         List<String> list = new ArrayList<String>(collection);            
         //sort the list
         Collections.sort(list); 
         
        return list;        
    }
}

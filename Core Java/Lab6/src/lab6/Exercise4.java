package lab6;

import java.util.HashMap;
import java.util.Set;

public class Exercise4 {
public static void main(String[] args) {
        
        HashMap<Integer,Integer> marksMap = new HashMap<>();
        marksMap.put(101,70);
        marksMap.put(102,90);
        marksMap.put(103,70);
        marksMap.put(104,50);
        
        Exercise4 labFour = new Exercise4();
        HashMap<Integer,String> medalMap = labFour.getStudents(marksMap);
        
        System.out.println(medalMap);
    }
    
    //Generate the list of students eligible for scholarship 
    HashMap<Integer,String> getStudents(HashMap<Integer,Integer> marksMap) {
        
        HashMap<Integer,String> medalMap = new HashMap<>();
        
        String medalType = "";
    
        Set<Integer> regNums = marksMap.keySet(); // get all registration numbers
        
        for(Integer i : regNums) {    
            
            Integer marks = marksMap.get(i);
            
            if(marks>=90)  
                medalType= "Gold"; 
            if(marks>=80 && marks < 90) 
                medalType= "Silver"; 
            if(marks>=70 && marks < 80) 
                medalType= "Bronze";
            
            medalMap.put(i,medalType);
        }        
        
        return medalMap;  
}
}

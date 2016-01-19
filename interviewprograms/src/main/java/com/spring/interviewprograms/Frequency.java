package com.spring.interviewprograms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Frequency {
	
	static void sortByFreq(int[] arr){
		Map<Integer,Integer> frequencyMap = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(frequencyMap.get(arr[i])==null){
				frequencyMap.put(arr[i],1);
			}else{
				frequencyMap.put(arr[i],frequencyMap.get(arr[i])+1);
			}
		}
		
		
		
		
		
		List list = new ArrayList(frequencyMap.entrySet());
		
		// Sort the list elements based on frequency 
	       Collections.sort(list, new Comparator<Map.Entry<Integer,Integer>>() {
	         
	            public int compare(Map.Entry<Integer,Integer> obj1, Map.Entry<Integer,Integer> obj2) {
	            	
	               return obj2.getValue().compareTo(obj1.getValue());
	            }
	       });
	       
	       
	       
	       
	       int count=0;
	       
	        //Place the elements in to the array based on frequency 
	       for (Iterator it = list.iterator(); it.hasNext();) {
	    	   
	            Map.Entry entry = (Map.Entry) it.next();
	            
	           
	            
	            Integer key = (Integer) entry.getKey();
	            Integer val = (Integer) entry.getValue();
	            
	            
	            for(int i=0; i < val; i++){
	                arr[count] = key;
	                count++;
	            }            
	       } 
		
	}
	
	public static void main(String[] args) {
		int a[] = {2,3,4,2,8,1,1,2};
        
        System.out.println("Before Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
        
        sortByFreq(a);
        
        System.out.println("\nAfter Sorting");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] +" ");
        }
		
		
	}
}

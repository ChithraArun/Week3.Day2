package week3.Day2;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindNumbersOccurenceMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Input array numbers, each occurances
		 * 
		 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
		 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
		 * 
		 * Order: Ascending Order
		 * 
		 */
		
		/*
		 * Psuedcode:
		 * 
		 * 1) Create Map -> TreeMap
		 * 2) For loop -> each number -> add to the map
		 * 3) If it is exist -> update it with + 1
		 * 	  Else -> new entry with 1 as value
		 * 
		 */
		
		int arr[]= {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer,Integer> TMap =new TreeMap<Integer,Integer>();
		Set<Entry<Integer, Integer>> entrySetMap = TMap.entrySet();
		
		for(Integer eachTMap:arr) {
			if(TMap.containsKey(eachTMap)) {
			TMap.put(eachTMap, TMap.get(eachTMap)+1);
			}
			else {
				TMap.put(eachTMap,1);
			}
			}
	System.out.println("The Number Occurences are"+TMap);	
	}

}


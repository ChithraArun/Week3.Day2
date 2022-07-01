package week3.Day2;

import java.util.*;

public class MisingElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};

		// get the array values in list and then sort
		
		List<Integer> list=new ArrayList<Integer>();
		for(int j=0;j<=arr.length;j++) {
			list.add(arr[j]);
			System.out.println(arr[j]);
		}
		
		//List<Integer> sortedList=new ArrayList<Integer>();
		Collections.sort(list);
		for(Integer sortedList:list) {
			System.out.println("SortedList"+sortedList);
		}
		//int i=0;
		// loop through the list (start i from list.get[0] till the length of the list)
		for(int i=0;i<list.size()-1;) {
			if((i+1)!=list.get(i)) {
				System.out.println("The Missing Number is"+i);
				++i;
			}
		break;	
		}
		

	}

}

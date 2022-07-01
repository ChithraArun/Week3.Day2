package week3.Day2;

import java.util.*;

public class FindSecondLargestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		//int[] data = {3,2,11,4,6,7};

		
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		List<Integer> list=new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		int i;
		Collections.sort(list);
		for(i=0;i<=list.size()-1;i++) {
			System.out.println(list.get(i));
			
		}
		System.out.println("The Second largest Number is:"+list.get(list.size()-2));
		
	}

}

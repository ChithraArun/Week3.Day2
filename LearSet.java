package week3.Day2;

import java.util.*;

public class LearSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set = new LinkedHashSet<String>();
set.add("Red");
set.add("Blue");
set.add("Green");
set.add("Brown");

List<String> list=new ArrayList<String>(set);
int size = list.size();
//Collections.reverse(list);
	for (int i=size-1;i>=0;i--) {
		String getList = list.get(i);
		System.out.println(getList);
	}
	}
	

}

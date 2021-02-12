package desh.deepak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager6 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(12);
		list.add(13);
		list.add(14);
		System.out.println(list);
		//Collections.sort(list,new CustomeSorting());
		Collections.sort(list,(o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
		 
	}
}

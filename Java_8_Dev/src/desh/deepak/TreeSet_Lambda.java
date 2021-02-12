package desh.deepak;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class CustomComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class TreeSet_Lambda {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(5);
		ts.add(30);
		ts.add(20);
		ts.add(15);
		System.out.println(ts);
		Collections.sort((List<Integer>) ts, new CustomComparator());
		System.out.println("Now after sorting the list"+ts);
	}
}

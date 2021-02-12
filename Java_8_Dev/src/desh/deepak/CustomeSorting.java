package desh.deepak;

import java.util.Comparator;

public class CustomeSorting implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 > o2) {
			return -1;
		} else if (o1<o2) {
			return -1;
		}
		return 0;
	}
	public void test()
	{
		int i=10;
		int j=20;
		if(i>j)
		{}
	}
}

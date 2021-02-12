package stream.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Dev1 {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(0);
		l.add(10);
		l.add(15);
		l.add(5);
		l.add(20);
		System.out.println(l);
		List<Integer>l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Now the list is----"+l1);

	}
}

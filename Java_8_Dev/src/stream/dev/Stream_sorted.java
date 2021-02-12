package stream.dev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_sorted {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(5);
		al.add(20);
		al.add(15);
		System.out.println(al);
		List<Integer> al1 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(al1);
		/* Now for the default sorting order...... */
		List<Integer> al2 = al.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("The Customized  Shorting order is ---"+al2);
		Integer min =al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("The minimum Values is ---"+min);
	}
}

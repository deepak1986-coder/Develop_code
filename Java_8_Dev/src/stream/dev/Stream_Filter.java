package stream.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_Filter {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Deshdeepak");
		al.add("Dinesh Kumar");
		al.add("Mahesh kumar");
		al.add("Ayush agrwal");
		al.add("Surendra yadav");
		al.add("Ravi");
		al.add("Pawan");
		System.out.println(al);
		List<String> l = al.stream().filter(s -> s.length() >= 9).collect(Collectors.toList());
		List<String> al1 = al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l);
		System.out.println(al1);
		long count = al.stream().filter(s -> s.length() >= 9).count();
		System.out.println("The string whose length greater or equal to 9----" + count);
	}
}

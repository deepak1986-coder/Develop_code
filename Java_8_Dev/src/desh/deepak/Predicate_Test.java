package desh.deepak;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Predicate_Test {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 10;
		System.out.println(p.test(100));
		// System.out.println(p.test("Desh"));
		Predicate<Collection> p1 = c -> c.isEmpty();
		ArrayList<String> al = new ArrayList<String>();
		al.add("deepak");
		System.out.println(p1.test(al));
		ArrayList<String>al2=new ArrayList<String>();
		System.out.println(p1.test(al2));
		System.out.println();
	}
}

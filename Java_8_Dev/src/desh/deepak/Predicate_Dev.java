package desh.deepak;

import java.util.function.Predicate;

public class Predicate_Dev {
	public static void main(String[] args) {
		String[] names = { "Desh", "Kajol", "katreena", "Kajal", "riya" };
		Predicate<String> startWithK = s -> s.charAt(0) == 'K';
		for (String s1 : names) {
			// System.out.println(s1);
			if (startWithK.test(s1)) {
				System.out.println(s1);
			}
		}
	}
}

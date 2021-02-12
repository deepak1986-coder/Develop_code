package desh.deepak;

import java.util.function.Predicate;

public class Predication_Function_Test {
	public static void main(String[] args) {
		int[] x = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println("The number is greater than 10 oe not");
		m1(p1, x);
		System.out.println("The Even number are ");
		m1(p2, x);
		System.out.println("The Numbers not greater than 10 are");
		m1(p1.negate(), x);
		System.out.println("The Number greater than 10 and even number are");
		m1(p1.and(p2), x);
		System.out.println("The number greater than 10 or Even Number");
		m1(p1.or(p2), x);
	}

	public static void m1(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}
	}
}

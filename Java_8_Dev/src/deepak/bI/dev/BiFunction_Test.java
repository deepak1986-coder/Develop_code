package deepak.bI.dev;

import java.util.function.BiPredicate;

public class BiFunction_Test {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bi = (i, j) -> (i + j) % 2 == 0;
		System.out.println(bi.test(10, 20));
		System.out.println(bi.test(10, 15));
	}
}

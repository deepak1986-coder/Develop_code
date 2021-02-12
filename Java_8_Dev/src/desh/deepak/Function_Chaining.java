package desh.deepak;

import java.util.function.Function;

public class Function_Chaining {
	public static void main(String[] args) {
		Function<String, String> f = s -> s.toUpperCase();
		Function<String, String> f1 = s -> s.substring(0, 9);
		System.out.println(f.apply("Deshdeepak Dwivedi"));
		System.out.println(f1.apply("Deshdeepak Dwivedi"));
		System.out.println(f.andThen(f1));
		// .apply("Deshdeepak Dwivedi"));
		System.out.println(f.compose(f1).apply("Deshdeepak Dwivedi"));
		/*
		 * difference between compose and then
		 */
		Function<Integer, Integer> f2 = i -> i + i;
		Function<Integer, Integer> f3 = i -> i * i * i;
		System.out.println(f2.andThen(f3).apply(2));
		System.out.println(f2.compose(f3).apply(2));
	}
}

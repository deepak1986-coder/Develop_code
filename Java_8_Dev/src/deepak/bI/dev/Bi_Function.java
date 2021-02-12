package deepak.bI.dev;

import java.util.function.BiFunction;

public class Bi_Function {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bi = (i, j) -> {
			return i * j;
		};
		System.out.println(bi.apply(10, 20));
		System.out.println(bi.apply(100, 200));
	}
}

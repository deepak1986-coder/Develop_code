package stream.dev;

import java.util.stream.Stream;

public class StreamOF {
	public static void main(String[] args) {
		Stream<Integer> s = Stream.of(99, 999, 9999);
		s.forEach(System.out::println);
		Double[] d = { 10.1, 9.02, 8.03 };
		Stream<Double> d1 = Stream.of(d);
		d1.forEach(System.out::println);
	}
}

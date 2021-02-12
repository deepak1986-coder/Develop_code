package desh.deepak;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_Demo {
	public static void main(String[] args) {
		/*
		 * Supplier<Date> s = () -> new Date(); System.out.println(s.get());
		 */
		/*
		 * Supplier<String> s = () -> { String[] s1 = { "Desh", "Deepak", "Dwivedi",
		 * "Sadhna" }; System.out.println("Random Values is" + Math.random()); int x =
		 * (int) (Math.random() * 4); // System.out.println(s1[x]); return s1[x]; };
		 */
		/*
		 * System.out.println("--" + s.get()); System.out.println("--" + s.get());
		 * System.out.println("--" + s.get());
		 */// System.out.println("--"+s.get());
		/* Generating OTP */
		Supplier<String> opts = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(opts.get());
	}
}

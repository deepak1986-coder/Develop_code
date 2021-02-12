package desh.deepak;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumer_Test {

	public static void main(String[] args) {
		ArrayList<Std_Utility> al = new ArrayList<Std_Utility>();
		Std_Utility.populate(al);
		Predicate<Std_Utility> p = std -> std.marks >= 60;
		Function<Std_Utility, String> f = std -> {
			int marks = std.marks;
			if (marks >= 80) {
				return "A[First Class Student]";
			} else if (marks >= 60) {
				return "B[Second Class Student]";
			} else if (marks >= 50) {
				return "C[third Class Student]";
			} else {
				return "Failed";
			}
		};
		Consumer<Std_Utility> c = std -> {
			System.out.println("Name-:" + std.name);
			System.out.println("Marks-:" + std.marks);
			System.out.println("Grade-:" + f.apply(std));
		};
		for(Std_Utility std:al)
		{
			c.accept(std);
			
		}
	}

}

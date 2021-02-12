package desh.deepak;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class StudentGrade_Test {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		populate(al);
		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[destinction]";
			} else if (marks >= 60) {
				return "B[First class]";
			} else if (marks >= 50) {
				return "C[Second class]";
			} else {
				return "D[Failed]";
			}
		};
		for (Student st : al) {
			System.out.println("Name-" + st.name);
			System.out.println("Marks-" + st.marks);
			System.out.println("Grade-" + f.apply(st));
			System.out.println("-----");
		}
		Predicate<Student> p = s -> s.marks >= 60;
		for (Student std : al) {
			if (p.test(std)) {
				System.out.println("Only above 60 % marks");
				System.out.println("Name-" + std.name);
				System.out.println("Marks-" + std.marks);
				System.out.println("Grade-" + f.apply(std));
				System.out.println("-----");
			}
		}
	}

	public static void populate(ArrayList<Student> al) {
		al.add(new Student("Sunny", 100));
		al.add(new Student("Bunny", 80));
		al.add(new Student("deepak", 60));
		al.add(new Student("deepak", 50));
		al.add(new Student("Sunny", 35));
	}
}

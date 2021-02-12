package deepak.bI.dev;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Student {
	String name;
	int rollno;

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	/*
	 * public String toString() { return name + "----" + rollno; }
	 */

}

public class Student_Obj_Bi {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		BiFunction<String, Integer, Student> bi = (name, rollno) -> new Student(name, rollno);
		al.add(bi.apply("deshdeepak", 11));
		al.add(bi.apply("hemu", 9));
		al.add(bi.apply("shiva", 6));
		al.add(bi.apply("dashish", 20));
		System.out.println(al);
		for(Student s:al)
		{
			System.out.println(s.name+"----"+s.rollno);
		}
	}
}

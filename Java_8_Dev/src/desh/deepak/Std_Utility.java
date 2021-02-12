package desh.deepak;

import java.util.ArrayList;

public class Std_Utility {
	String name;
	int marks;

	public Std_Utility(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public static void populate(ArrayList<Std_Utility> al) {
		al.add(new Std_Utility("DeshDeepak", 100));
		al.add(new Std_Utility("Ram", 80));
		al.add(new Std_Utility("shyam", 60));
		al.add(new Std_Utility("Ram", 50));
		al.add(new Std_Utility("Ram", 30));
	}
}

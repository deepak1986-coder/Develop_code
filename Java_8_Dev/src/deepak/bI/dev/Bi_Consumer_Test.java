package deepak.bI.dev;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee_Incre {
	String ename;
	double salory;

	public Employee_Incre(String ename, double sailory) {
		this.ename = ename;
		this.salory = sailory;
	}
}

public class Bi_Consumer_Test {
	public static void main(String[] args) {
		BiFunction<String, Double, Employee_Incre> bi = (name, sailory) -> new Employee_Incre(name, sailory);
		ArrayList<Employee_Incre> al = new ArrayList<Employee_Incre>();
		al.add(bi.apply("deshdeepak", 700000.00));
		al.add(bi.apply("Mahesh", 900000.00));
		al.add(bi.apply("surendra", 750000.00));
		al.add(bi.apply("Rohit", 970000.00));
		BiConsumer<Employee_Incre, Double> bic = (emplyee_incr, d) -> emplyee_incr.salory = emplyee_incr.salory + d;
		for (Employee_Incre emp : al) {
			bic.accept(emp, 500.00);
		}
		for (Employee_Incre emp1 : al) {
			System.out.println("Emplyee Name :" + emp1.ename);
			System.out.println("Employee Sailory is " + emp1.salory);
			System.out.println();
		}

	}
}

package deepak.bI.dev;

import java.util.function.BiFunction;

class Employee1 {
	int eno;
	String ename;
	double dailwage;

	public Employee1(int eno, String ename, double dailwage) {
		this.eno = eno;
		this.ename = ename;
		this.dailwage = dailwage;
	}
}

class Timesheet {
	int eno;
	int noDays;

	public Timesheet(int eno, int noDays) {
		this.eno = eno;
		this.noDays = noDays;
	}
}

public class EmployeeSail_TEst {
	public static void main(String[] args) {
		BiFunction<Employee1, Timesheet, Double> sailcal = (e, t) -> e.dailwage * t.noDays;
		Employee1 e1 = new Employee1(101, "Deshdeepak", 15000);
		Timesheet t1 = new Timesheet(101, 20);
		System.out.println("calculated sailory for "+e1.ename +" ---"+sailcal.apply(e1, t1));
	}
}

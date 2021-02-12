package desh.deepak;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee_Sort implements Comparator {
	public int compare(Object o1, Object o2) {
		Employee_Lambda emp = (Employee_Lambda) o1;
		Employee_Lambda emp1 = (Employee_Lambda) o2;
		int eno = emp.eno;
		int eno1 = emp1.eno;
		/*
		 * if(eno>eno1) { return -1; } else if(eno<eno1) { return 1; } return 0;
		 */
		return (eno > eno1) ? -1 : (eno < eno1) ? 1 : 0;

	}
}

public class Employee_Lambda {
	int eno;
	String ename;

	public Employee_Lambda(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;// TODO Auto-generated constructor stub
	}

	public String toString() {
		return eno + ":" + ename;
	}

	public static void main(String[] args) {
		// Employee_Lambda e1 =new Employee_Lambda(101, "deepika");
		List<Employee_Lambda> list = new ArrayList<Employee_Lambda>();
		list.add(new Employee_Lambda(100, "deepak"));
		list.add(new Employee_Lambda(500, "sadhana"));
		list.add(new Employee_Lambda(400, "gudiya"));
		list.add(new Employee_Lambda(300, "betu"));
		System.out.println("Befor sorting Employee--" + list);
		System.out.println("After sorting Employee---");
		Collections.sort(list, (e1, e2) -> (e1.eno > e2.eno) ? -1 : (e1.eno < e2.eno) ? 1 : 0);
		System.out.println(list);
	}
}

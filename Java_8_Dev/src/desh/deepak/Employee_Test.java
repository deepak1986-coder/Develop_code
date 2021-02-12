package desh.deepak;

import java.util.ArrayList;

public class Employee_Test {
public static void main(String[] args) {
	ArrayList<Employee_Managment> al= new ArrayList<Employee_Managment>();
	Employee_Managment e1= new Employee_Managment("desh", "ssd", 1000000, "delhi");
	Employee_Managment e2= new Employee_Managment("deepak", "ssd", 2000000, "delhi");
	
	al.add(e1);
	al.add(e2);
	System.out.println(al);
}
}

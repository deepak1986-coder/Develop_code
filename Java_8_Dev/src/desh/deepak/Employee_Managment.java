package desh.deepak;

public class Employee_Managment {
	String ename;
	String designation;
	double sailory;
	String city;

	public Employee_Managment(String ename, String designation, double sailory, String city) {
		this.ename = ename;
		this.designation = designation;
		this.sailory = sailory;
		this.city = city;// TODO Auto-generated constructor stub
	}

	public String toString() {
		String s = String.format("(%s,%s,%.2f,%s)",ename,designation,sailory,city);
		return s;
	}
}

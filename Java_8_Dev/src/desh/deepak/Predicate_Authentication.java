package desh.deepak;

import java.util.Scanner;
import java.util.function.Predicate;

public class Predicate_Authentication {
	String name;
	String pwd;

	public Predicate_Authentication(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;

	}

	public static void main(String[] args) {
		Predicate<Predicate_Authentication> p = predicate -> predicate.name.equals("Desh")
				&& predicate.pwd.equals("Deepak");
		System.out.println("Enter username pls--");
		Scanner sc = new Scanner(System.in);
		String username = sc.next();
		System.out.println("Please enter the password--");
		String pwd = sc.next();
		Predicate_Authentication pa = new Predicate_Authentication(username, pwd);
		if (p.test(pa)) {
			System.out.println("Hi Desh---");
		} else {
			System.out.println("Please try again--");
		}

	}
}

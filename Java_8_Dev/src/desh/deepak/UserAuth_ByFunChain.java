package desh.deepak;

import java.util.Scanner;
import java.util.function.Function;

public class UserAuth_ByFunChain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String username = sc.next();
		System.out.println("Enter Password");
		String pwd = sc.next();
		Function<String, String> f1 = s -> s.toLowerCase();
		Function<String, String> f2 = s -> s.substring(0, 5);
		if(f1.andThen(f2).apply(username).equals("Deshdeepak")&&pwd.equals("dwivedi"))
		{
			System.out.println("Hi Desh");
		}
		else
		{
			System.out.println("invalid user---");
		}

	}
}

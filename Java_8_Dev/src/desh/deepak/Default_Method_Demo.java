package desh.deepak;

interface Left {
	default void m1() {
		System.out.println("---from left default");
	}
}

interface Right {
	default void m1() {
		System.out.println("---from right Default---");
	}
}

public class Default_Method_Demo implements Left, Right {
	public void m1() {
	System.out.println("My Own implemention");
	Left.super.m1();
	
	}
	public static void main(String[] args) {
		Default_Method_Demo dm= new Default_Method_Demo();
		dm.m1();
	}
}

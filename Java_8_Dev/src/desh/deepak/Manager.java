package desh.deepak;

@FunctionalInterface
interface intref {
	public void test();
	
	default void m2() {
	}

	default int m4(int i) {
		return 0;
	}

	public static void m3() {
	}

	public static void m(int j) {
	}
}

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hi Deepak");
	}

}

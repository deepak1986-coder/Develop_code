package deepak.bI.dev;

interface intref {
	public void m1();// i dont want this implemention which is already define functionality in m2()
						// already develop so need to provide again.so we need to use method reference.
}

class MethodRef {
	public static void m2() {
		System.out.println("Method Reference ------");
	}
}

public class Method_Reference_Dev {
	public static void main(String[] args) {
		intref i = MethodRef::m2;
		i.m1();
	}

}

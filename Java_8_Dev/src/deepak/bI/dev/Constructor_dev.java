package deepak.bI.dev;

class Sample {
	public Sample() {
		System.out.println("Object Creation and Initialization------"); // TODO Auto-generated constructor stub
	}
}

interface Test123 {
	public Sample get();
}

public class Constructor_dev {
	public static void main(String[] args) {
		Test123 i = Sample::new;
		Sample s = i.get();
	}
}

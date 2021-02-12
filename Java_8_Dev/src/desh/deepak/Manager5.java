package desh.deepak;

interface interf5 {
	public int squareIt(int i);
}

public class Manager5 {
	public static void main(String[] args) {
		interf5 intr = k -> k * k;
		System.out.println("sqare of ---" + 4 + "is" + intr.squareIt(10));
		System.out.println("sqare of ---" + 5 + "is" + intr.squareIt(115));

	}
}

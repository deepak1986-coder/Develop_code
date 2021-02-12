package desh.deepak;

interface interf6 {
	public void m1(int i);

	//public void m2(int j);
}

public class MutilpleAbstractCall {
public static void main(String[] args) {
	interf6 itr=i->System.out.println("Hello");
	itr.m1(10);
	interf6 itr1=i->System.out.println("SHi");
	itr1.m1(100);
}
}

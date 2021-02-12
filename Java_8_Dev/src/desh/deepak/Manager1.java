package desh.deepak;

interface intref1 {
	public void m1();
}

class Demo implements intref1 {
	public void m1() {
		System.out.println("Normal Implementaion--");
	}
}

public class Manager1 {
public static void main(String[] args) {
	intref1 i=new Demo();
	i.m1();
}
}

package desh.deepak;

interface intref4 {
	public int getLength(String s);
}

public class Manager4 {
	public static void main(String[] args) {
		intref4 itr=s->s.length();
		System.out.println(itr.getLength("hello deepak"));
		System.out.println(itr.getLength("with lembda expression"));
	}

}

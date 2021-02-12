package desh.deepak;

interface intref2 {
	public void m1();
}

public class Manager2 {
	public static void main(String[] args) {
		intref2 i = () -> {
			for(int j=0;j<10;j++)
			{
			System.out.println(" with calling lembda Expression");}
			};
		i.m1();
	}
}

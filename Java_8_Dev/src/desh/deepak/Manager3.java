package desh.deepak;
interface intref3
{
public void m1(int i ,int j);	
}
public class Manager3 {
public static void main(String[] args) {
	intref3 inf=(i,j)->System.out.println("the additon of i and j is "+(i+j));
	inf.m1(100, 200);
}
}

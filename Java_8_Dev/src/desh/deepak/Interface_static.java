package desh.deepak;
interface intref12
{
public static void m1()
{
	System.out.println("hello from static");}
}
public class Interface_static implements intref12{
public static void main(String[] args) {
	Interface_static is= new Interface_static();
	//is.m1();
	//Interface_static.m1();
	intref12.m1();
}

}

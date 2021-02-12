package stream.dev;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class STream_Dev2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer>al1= new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println(al);
		for(int i:al)
		{
			al1.add(i*2);
		}
		System.out.println("Double of Previous Array are -----"+al1);
		List<Integer>al3=al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("By Using Stream ------"+al3);
	}
}

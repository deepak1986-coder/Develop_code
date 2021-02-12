package stream.dev;

import java.util.ArrayList;

public class Stream_ForEach {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Desh");
		al.add("Deepak");
		al.add("Dwivedi");
		al.stream().forEach(s -> System.out.println(s));
		al.stream().forEach(System.out::println);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(0);
		al2.add(10);
		al2.add(20);
		al2.add(15);
		al2.add(25);
		Integer [] arr=al2.stream().toArray(Integer []::new);
		for(Integer i:arr)
		{
			System.out.println(i);
		}

	}
}

package desh.deepak;

import java.util.function.Consumer;

public class Consumer_1 {
public static void main(String[] args) {
	Consumer<String>c=s->System.out.println(s);
	c.accept("Hello");
	c.accept("Dehsdeepak");
}
}

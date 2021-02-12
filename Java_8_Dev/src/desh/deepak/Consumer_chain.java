package desh.deepak;

import java.util.function.Consumer;

class Movie {
	String name;
	String result;
	public Movie(String name,String result) {
	this.name=name;
	this.result=result;
	}
}

public class Consumer_chain {
	public static void main(String[] args) {
		Consumer<String>c1=con->System.out.println("Hiiiiiiiiii"+con);
		c1.accept("Desh");
		Consumer<Movie>c=m->System.out.println("movie"+m.name+"-is redy for release");
		Consumer<Movie>r=m->System.out.println("movie"+m.name+"-"+m.result);
		Consumer<Movie>d=m->System.out.println("movie"+m.name+"-information storing");
		Consumer<Movie>conChain=m->c.andThen(r).andThen(d);
		Movie mo= new Movie("Bahubli", "HIT");
		conChain.accept(mo);
		Movie mo1= new Movie("Dabang", "Flop");
		conChain.accept(mo1);
		
	}
}

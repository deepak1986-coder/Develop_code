package desh.deepak;

import java.util.function.Function;
import java.util.function.Predicate;

public class Funtion_interface {
public static void main(String[] args) {
	Function<String ,Integer>f=s->s.length();
	System.out.println(f.apply("Deepak"));
	System.out.println(f.apply("Deepak"));
	String name="My Name is Desh deepak Dwivedi";
	Function<String, String> str=name1->name1.replaceAll(" ", "");
	System.out.println(str.apply(name));
	Function<String,Integer>sf=name1->name1.length()-name1.replaceAll(" ", "").length();
	System.out.println(f.apply(name));
	
}
}

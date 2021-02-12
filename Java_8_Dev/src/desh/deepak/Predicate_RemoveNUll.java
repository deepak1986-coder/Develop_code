package desh.deepak;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_RemoveNUll {
public static void main(String[] args) {
	ArrayList<String> al= new ArrayList<String>();
	al.add("Desh");
	al.add(null);
	al.add("");
	al.add("Manish");
	ArrayList<String> al1= new ArrayList<String>();
	Predicate<String>p=list->list!=null&&list.length()!=0;
	for(String s:al)
	{
		if(p.test(s))
		{
			al1.add(s);
			}
	}
System.out.println("FInal list are ----");
System.out.println(al1);
}
}

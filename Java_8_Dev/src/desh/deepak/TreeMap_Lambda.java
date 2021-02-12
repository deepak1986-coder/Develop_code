package desh.deepak;

import java.util.TreeMap;

public class TreeMap_Lambda {
public static void main(String[] args) {
	TreeMap<Integer, String> tm= new TreeMap<Integer, String>((i1,i2)->i1>i2?-1:i1<i2?1:0);
	tm.put(101,"desh");
	tm.put(105, "mahesh");
	tm.put(103, "ritesh");
	tm.put(107, "john");
System.out.println(tm);	
			
}
}

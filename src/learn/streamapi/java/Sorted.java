package learn.streamapi.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		List<Integer>value = new ArrayList<Integer>();
		value.add(42);
		value.add(32);
		value.add(12);
		value.add(52);
		value.add(62);
		value.add(45);
		value.add(16);
		value.add(67);
		value.add(132);
		value.add(154);
		value.add(122);
		
		System.out.println("Normal List of value's = "+value);
		
		List<Integer> valshort = value.stream().sorted().collect(Collectors.toList());
		System.out.println(valshort);
	}
}

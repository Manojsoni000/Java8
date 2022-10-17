package learn.streamapi.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLearn {
	public static void main(String[] args) {
		List<String>name = new ArrayList<>();
		name.add("Rohan");
		name.add("Rahul");
		name.add("");
		name.add("Shyam");
		name.add("Sohan");
		
		//For change first latter of any name
		List<String> nmes = name.stream().map(a->a.replaceFirst("S", "M")).collect(Collectors.toList());
		System.out.println(nmes);
		
		//For checking any value is empty
		List<Boolean> total = name.stream().map(a->a.isEmpty()).collect(Collectors.toList());
		System.out.println(total);
		
		//For count empty values
		long tolist = name.stream().filter(a->a.isEmpty()).count();
		System.out.println("Empty String is = "+tolist);
		
		//count string which length is grater than 3
		long coutgr = name.stream().filter(a->a.length()>=3).count();
		System.out.println("String greater than 3 is = "+coutgr);
		
	}
}

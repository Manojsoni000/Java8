package learn.streamapi.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameLengthCheck {
	public static void main(String[] args) {
		List<String>name = new ArrayList<>();
		name.add("Manoj Soni");
		name.add("Rahul Kumar");
		name.add("Mohan ram");
		name.add("Shyam ram");
		name.add("Surander");
		
		System.out.println("All Names");
		System.out.println(name);
		
		List<String> filtername = name.stream().filter(a->a.length()>=10).collect(Collectors.toList());
		System.out.println("After use filter");
		System.out.println(filtername);
		
		
		System.out.println("All Elements in upper case");
		List<String> filtername1 = name.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
		System.out.println(filtername1);
		
		for(int i=1;i<=filtername1.size();++i) {
			System.out.println(filtername1.get(i));
		}
	}
}

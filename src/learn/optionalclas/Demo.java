package learn.optionalclas;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		String abc = null;

		Optional<String> opt = Optional.ofNullable(abc);

		if (opt.isPresent())
			System.out.println(abc.toUpperCase());
		else
			System.out.println("Null Statement");
	}
}

package com.java.lambdaexpression.Helloworld;

@FunctionalInterface
interface Hello {
	String hello();
}

public class SayHello {
	public static void main(String[] args) {
		Hello h1 = () -> {
			return "Hello world";
		};
		System.out.println(h1.hello());
	}

}

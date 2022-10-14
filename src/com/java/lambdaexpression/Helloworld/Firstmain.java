package com.java.lambdaexpression.Helloworld;

public class Firstmain {

	public static void main(String[] args) {
		First a = () -> {
			System.out.println("Hello! How are you");
		};
		a.hello();

	}
}
